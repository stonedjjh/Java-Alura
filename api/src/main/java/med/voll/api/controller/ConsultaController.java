/*Controlador para el enrutamiento de las acciones
para las consultas*/

package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.domain.consulta.DatosDetalleConsulta;
import med.voll.api.domain.consulta.DatosReservaConsulta;
import med.voll.api.domain.consulta.ReservaDeConsultas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//se establece el entrypoint de la url
@RequestMapping("consultas")
public class ConsultaController {

    //inyectamos al IoC la clase reserva
    @Autowired
    private ReservaDeConsultas reserva;


    //creamos el metodo para registrar una reserva
    @PostMapping
    @Transactional
    public ResponseEntity reservar(@RequestBody @Valid DatosReservaConsulta datos) {


        var detalleConsulta =reserva.reservar(datos);
        reserva.reservar(datos);
        //se retorna un codigo 200 con los detalles de la consulta
        //return ResponseEntity.ok(new DatosDetalleConsulta(null, null, null, null));
        return ResponseEntity.ok(detalleConsulta);
    }

}