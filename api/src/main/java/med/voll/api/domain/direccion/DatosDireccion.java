package med.voll.api.domain.direccion;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DatosDireccion(
        @Nullable String calle,
        @NotBlank String numero,
        @Nullable String complemento,
        @NotBlank String barrio,
        @NotBlank String ciudad,
        @NotBlank @Pattern(regexp = "\\d{4}") String codigo_postal,
        @NotBlank String estado
) {
}
