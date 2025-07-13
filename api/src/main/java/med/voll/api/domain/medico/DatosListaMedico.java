package med.voll.api.domain.medico;

public record DatosListaMedico(
        Long id,
        String nombre,
        String email,
        String telefono,
        String Documento,
        Especialidad especialidad
) {
    public DatosListaMedico(Medico medico) {
        this( medico.getId(),medico.getNombre(), medico.getEmail(), medico.getTelefono(),medico.getDocumento_identidad(),
                medico.getEspecialidad());

    }
}

