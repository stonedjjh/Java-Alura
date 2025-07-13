package med.voll.api.medico;

public record DatosListaMedico(
        String nombre,
        String email,
        String Documento,
        Especialidad especialidad
) {
    public DatosListaMedico(Medico medico) {
        this(medico.getNombre(), medico.getEmail(),medico.getDocumento_identidad(),
                medico.getEspecialidad());

    }
}
