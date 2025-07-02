package com.aluracursos.radioalura.principal;

import com.aluracursos.radioalura.modelos.Cancion;
import com.aluracursos.radioalura.modelos.MisFavoritos;
import com.aluracursos.radioalura.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Forever");
        miCancion.setCantante("Kiss");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Gabriela Aguiar");
        miPodcast.setTitulo("Cafe.Tech");

        for (int i =0; i< 100; i++){
            miCancion.meGusta();
        }

        for (int i = 0; i < 5000; i++) {
            miCancion.reproducir();
        }

        for (int i =0; i< 80; i++){
            miPodcast.meGusta();
        }

        for (int i = 0; i < 6000; i++) {
            miPodcast.reproducir();
        }

        System.out.println("Total reproducciones: " + miCancion.getTotalDeReproducciones());
        System.out.println("Total me gusta: " + miCancion.getTotalDeMeGusta());

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.agregar(miCancion);
        favoritos.agregar(miPodcast);



    }
}
