package com.aluracurso.swapi.exception;


public class ExceptionHandler extends RuntimeException {


    public ExceptionHandler() {
        super("Pagina no encontrada");
    }

}
