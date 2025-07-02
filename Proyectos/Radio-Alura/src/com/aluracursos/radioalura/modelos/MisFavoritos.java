package com.aluracursos.radioalura.modelos;

public class MisFavoritos {
   public void agregar(Audio audio){
        if (audio.getClasificaciones() > 8){
            System.out.println(audio.getTitulo() + " Es uno de los favoritos del momento");
        } else {
            System.out.println(audio.getTitulo() + " Es un placer culposo");
        }
    }
}
