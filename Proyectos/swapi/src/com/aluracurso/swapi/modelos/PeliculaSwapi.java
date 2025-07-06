package com.aluracurso.swapi.modelos;

import com.google.gson.annotations.SerializedName;


public record PeliculaSwapi(@SerializedName("title") String titulo,
                            @SerializedName("episode_id") int numeroEpisodio,
                            String director,
                            @SerializedName("release_date") String  fechaLanzamiento) {

}

