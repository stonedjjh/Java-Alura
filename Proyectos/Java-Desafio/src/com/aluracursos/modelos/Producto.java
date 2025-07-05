package com.aluracursos.modelos;

public class Producto implements Comparable<Producto>{
    private String nombre;
    private double precio;

    public  Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "El producto: " + getNombre() +" tiene un precio de: "+ getPrecio();
    }


    @Override
    public int compareTo(Producto producto) {
        if (this.getPrecio() < producto.getPrecio())
            return -1;
        if (this.getPrecio() > producto.getPrecio())
            return 1;
        return 0;
    }

}
