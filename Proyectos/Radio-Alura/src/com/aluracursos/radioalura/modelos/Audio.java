package com.aluracursos.radioalura.modelos;

public class Audio {
    private String titulo;

    private int totalDeReproducciones;
    private int totalDeMeGusta;
    private int clasificaciones;

    public void meGusta(){
        this.totalDeMeGusta++;
    }

    public void reproducir(){
        this.totalDeReproducciones++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReproducciones() {
        return totalDeReproducciones;
    }

    public void setTotalDeReproducciones(int totalDeReproducciones) {
        this.totalDeReproducciones = totalDeReproducciones;
    }

    public int getTotalDeMeGusta() {
        return totalDeMeGusta;
    }

    public void setTotalDeMeGusta(int totalDeMeGusta) {
        this.totalDeMeGusta = totalDeMeGusta;
    }

    public int getClasificaciones() {
        return clasificaciones;
    }

    public void setClasificaciones(int clasificaciones) {
        this.clasificaciones = clasificaciones;
    }
}
