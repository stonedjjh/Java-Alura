package med.voll.api.direccion;

import jakarta.annotation.Nullable;
import jakarta.persistence.Embeddable;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Direccion {
    private String calle;
    private String numero;    
    private String complemento;
    private String barrio;
    private String ciudad;
    private String codigo_postal;
    private String estado;

    public Direccion(DatosDireccion datosDireccion) {
        this.calle = datosDireccion.calle();
        this.numero = datosDireccion.numero();
        this.complemento = datosDireccion.complemento();
        this.barrio = datosDireccion.barrio();
        this.ciudad = datosDireccion.ciudad();
        this.codigo_postal = datosDireccion.codigo_postal();
        this.estado = datosDireccion.estado();
    }

    public void actualizarDireccion(@Valid DatosDireccion direccion) {
        this.calle = (direccion.calle() != null)?direccion.calle():this.calle;
        this.numero = (direccion.numero() != null) ? direccion.numero() : this.numero;
        this.complemento = (direccion.complemento() != null) ? direccion.complemento() : this.complemento;
        this.barrio = (direccion.barrio() != null) ? direccion.barrio() : this.barrio;
        this.ciudad = (direccion.ciudad() != null) ? direccion.ciudad() : this.ciudad;
        this.codigo_postal = (direccion.codigo_postal() != null) ? direccion.codigo_postal() : this.codigo_postal;
        this.estado = (direccion.estado() != null) ? direccion.estado() : this.estado;
    }
}
