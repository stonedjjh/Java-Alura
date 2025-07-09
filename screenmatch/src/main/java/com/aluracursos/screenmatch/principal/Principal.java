package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.model.DatosEpisodio;
import com.aluracursos.screenmatch.model.DatosSerie;
import com.aluracursos.screenmatch.model.DatosTemporada;
import com.aluracursos.screenmatch.model.Episodio;
import com.aluracursos.screenmatch.service.ConsumoAPI;
import com.aluracursos.screenmatch.service.ConvierteDatos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Principal {
    private Scanner teclado = new Scanner(System.in);
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private final String API_KEY = System.getenv("OMDB_API_KEY");
    private final String URL_BASE = "https://www.omdbapi.com/?t=";
    private ConvierteDatos conversor = new ConvierteDatos();

    public void mostrarMenu(){
        System.out.println("Por favor escribe el nombre de la serie que deseas buscar");
        var nombreSerie = teclado.nextLine();
        var json = consumoAPI.obtenerDatos(URL_BASE + nombreSerie.replace(" ","+") + "&apikey="+ API_KEY);
        var datos = conversor.obtenerDatos(json, DatosSerie.class);
        System.out.println(datos);

        List<DatosTemporada> temporadas = new ArrayList<>();
        for (int i = 1; i <= datos.totalDeTemporadas() ; i++) {
            json = consumoAPI.obtenerDatos(URL_BASE + nombreSerie.replace(" ","+")+"&Season=" + i + "&apikey="+API_KEY);
            var datosTemporadas = conversor.obtenerDatos(json, DatosTemporada.class);
            temporadas.add(datosTemporadas);
        }
        //temporadas.forEach(System.out::println);

        //Mostrar solo el titulo de los episodios para la temporada con for
        /*for (int i = 0; i < datos.totalDeTemporadas(); i++) {
            List<DatosEpisodio> episodiosTemporadas = temporadas.get(i).episodios();
            for (int j = 0; j < episodiosTemporadas.size(); j++) {
                System.out.println(episodiosTemporadas.get(j).titulo());

            }
        }*/

        //Mostrar solo el titulo de los episodios para la temporada con expresion lambda
        //temporadas.forEach(t -> t.episodios().forEach(e-> System.out.println(e.titulo())));

        //Convertir todas las informaciones a una lista del tipo DatosEpisodios
        List<DatosEpisodio> datosEpisodios = temporadas.stream()
                .flatMap(t -> t.episodios().stream())
                .collect(Collectors.toList());

        //top 5 episodios
        datosEpisodios.stream()
                .filter(e->!e.evaluacion().equalsIgnoreCase("N/A"))
                .sorted(Comparator.comparing(DatosEpisodio::evaluacion).reversed())
                .limit(5)
                .forEach(System.out::println);

        //convirtiendo los datos a una lista del tipo Episodio
        List<Episodio> episodios = temporadas.stream()
                .flatMap(t->t.episodios().stream()
                .map(d->new Episodio(t.numero(),d)))
                .collect(Collectors.toList());
        episodios.forEach(System.out::println);


    }


}
