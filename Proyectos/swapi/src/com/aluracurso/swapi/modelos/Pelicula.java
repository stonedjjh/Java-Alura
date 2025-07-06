package com.aluracurso.swapi.modelos;

public class Pelicula {

    private String titulo;
    private int numeroEpisodio;
    private String director;
    private String fechaLanzamiento;

    public Pelicula(PeliculaSwapi peliculaSwapi){
        this.titulo = peliculaSwapi.titulo();
        this.numeroEpisodio = peliculaSwapi.numeroEpisodio();
        this.director = peliculaSwapi.director();
        this.fechaLanzamiento = peliculaSwapi.fechaLanzamiento();
    }

    @Override
    public String toString() {
        return "(" +
                "titulo='" + titulo + '\'' +
                ", numeroEpisodio=" + numeroEpisodio +
                ", director='" + director + '\'' +
                ", fechaLanzamiento='" + fechaLanzamiento + '\'' +
                ')';
    }
}


