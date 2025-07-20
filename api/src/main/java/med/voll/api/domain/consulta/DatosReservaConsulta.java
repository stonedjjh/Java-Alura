/*
* Registro que engloba la logica de los datos de una reservacion
* como los campos que no pueden ser nulos
* y que si es una reservacion debe ser una fecha a futuro
* */
package med.voll.api.domain.consulta;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.medico.Especialidad;

import java.time.LocalDateTime;

public record DatosReservaConsulta(
        Long idMedico,
        @NotNull
        Long idPaciente,
        @NotNull
        //anotacion para validar que el campo es de tipo date y que debe ser mayor a la fecha actual
        @Future
        LocalDateTime fecha,
        Especialidad especialidad
) {
}