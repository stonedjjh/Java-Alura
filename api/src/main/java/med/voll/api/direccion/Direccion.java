package med.voll.api.direccion;

import jakarta.annotation.Nullable;

public record Direccion(
                        String calle,
                        @Nullable
                        String numero,
                        @Nullable
                        String complemento,
                        String barrio,
                        String ciudad,
                        String código_postal,
                        String estado
) {
}
