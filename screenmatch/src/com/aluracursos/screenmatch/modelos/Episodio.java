package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculos.Clasificable;

public class Episodio implements Clasificable {
    private int  numero;
    private String nombre;
    private Serie serie;
    private int totalVisualizaciones;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClasificacion() {
        if (this.totalVisualizaciones > 100){
            return 4;
        }
        return 2;
    }

    public int getTotalVisualizaciones() {
        return totalVisualizaciones;
    }

    public void setTotalVisualizaciones(int totalVisualizaciones) {
        this.totalVisualizaciones = totalVisualizaciones;
    }
}
