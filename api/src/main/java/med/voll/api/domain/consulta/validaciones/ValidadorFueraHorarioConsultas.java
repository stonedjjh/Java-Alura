/*
* Clase para validar que la consulta no se agende un domingo
* o fuera del horario de atencion
* */
package med.voll.api.domain.consulta.validaciones;

import med.voll.api.domain.ValidacionException;
import med.voll.api.domain.consulta.DatosReservaConsulta;
import org.springframework.stereotype.Component;

import java.time.DayOfWeek;

@Component
public class ValidadorFueraHorarioConsultas implements ValidadorDeConsultas{

    public void validar(DatosReservaConsulta datos) {
        var fechaConsulta = datos.fecha();
        //se aprovecha las funciones añadidas a la clase date para obtener el dia de la semana de la fecha dada
        var domingo = fechaConsulta.getDayOfWeek().equals(DayOfWeek.SUNDAY);
        //se aprovecha las funciones añadidas a la clase date para obtener la hora de la fecha dada
        var horarioAntesDeAperturaClinica = fechaConsulta.getHour() < 7;
        var horarioDespuesDeCierreClinica = fechaConsulta.getHour() > 18;
        if(domingo || horarioAntesDeAperturaClinica || horarioDespuesDeCierreClinica) {
            throw new ValidacionException("Horario selecionado fuera del horario de atendimiento de la clinica.");
        }
    }
}