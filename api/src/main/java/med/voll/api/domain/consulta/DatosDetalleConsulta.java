/*
* DTO que representa los datos de una Consulta
* */

package med.voll.api.domain.consulta;

import java.time.LocalDateTime;

//Registro que representa los datos de una consulta
public record DatosDetalleConsulta(Long id, Long idMedico, Long idPaciente, LocalDateTime fecha) {
}
