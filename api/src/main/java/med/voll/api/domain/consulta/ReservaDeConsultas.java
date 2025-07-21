/*
* Clase de Servicio que engloba las reglas del negocio para la
* creacion de una reserva
* */
package med.voll.api.domain.consulta;

import med.voll.api.domain.ValidacionException;
import med.voll.api.domain.consulta.validaciones.ValidadorDeConsultas;
import med.voll.api.domain.medico.Medico;
import med.voll.api.domain.medico.MedicoRepository;
import med.voll.api.domain.paciente.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//Se especifica que es un servicio
@Service
public class ReservaDeConsultas {

    /*Se inyecta las dependencias necesaria para una reserva
    *medicoRepository, pacienteRepository, consultaRepository
     */
    @Autowired
    private MedicoRepository medicoRepository;

    @Autowired
    private PacienteRepository pacienteRepository;

    @Autowired
    private ConsultaRepository consultaRepository;


    /*
    * Aqui java va a buscar todas las clases que implementes la interfaz ValidadorDeConsultas y
    * creara una lista con todas las validaciones
    * */

    @Autowired
    private List<ValidadorDeConsultas> validadores;



    //se  cambio el tipo de retorno de void a detalle consulta
    public DatosDetalleConsulta reservar(DatosReservaConsulta datos){
        //se verifica que sea un id de paciente valido sino lanza una excepcion
        if(!pacienteRepository.existsById(datos.idPaciente())){
            throw new ValidacionException("No existe un paciente con el id informado");
        }
        /*Se verifica que si el idMedico es distinto de null que exista en la bd
        sino lanza una excepcion
         */
        if(datos.idMedico() != null && !medicoRepository.existsById(datos.idMedico())){
            throw new ValidacionException("No existe un médico con el id informado");
        }

        //se recorre la lista de validaciones y se llama al metodo validar
        validadores.forEach(v -> v.validar(datos));

        var medico = elegirMedico(datos);
        if(medico == null){
            throw new ValidacionException("No existe un médico disponible en ese horario");
        }
        var paciente = pacienteRepository.findById(datos.idPaciente()).get();
        //se crea una variable de tipo Consulta
        var consulta = new Consulta(null, medico, paciente, datos.fecha());
        //se guarda en base de dato la consulta crear
        consultaRepository.save(consulta);
        return new DatosDetalleConsulta(consulta);
    }

    private Medico elegirMedico(DatosReservaConsulta datos) {
        /*
        Se aplica la regla del negocio que si no se escoge una medico
        busque por especialidad si hay alguno disponible y se selecciona al azar
         */
        if(datos.idMedico() != null){
            return medicoRepository.getReferenceById(datos.idMedico());
        }
        //si no se escogio una especialidad se lanza una excepcion
        if(datos.especialidad() == null){
            throw new ValidacionException("Es necesario elegir una especialidad cuando no se elige un médico");
        }

        return medicoRepository.elegirMedicoAleatorioDisponibleEnLaFecha(datos.especialidad(), datos.fecha());
    }
}