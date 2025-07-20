/*
* Se declara un manejador de Excepciones para la app
* */
package med.voll.api.domain;

public class ValidacionException extends RuntimeException {

    public ValidacionException(String mensaje) {
        super(mensaje);
    }
}