package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.model.DatosEpisodio;
import com.aluracursos.screenmatch.model.DatosSerie;
import com.aluracursos.screenmatch.model.DatosTemporada;
import com.aluracursos.screenmatch.model.Episodio;
import com.aluracursos.screenmatch.service.ConsumoAPI;
import com.aluracursos.screenmatch.service.ConvierteDatos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
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
        System.out.println("Mostrando los 5 capitulos mejor evaluados");
        datosEpisodios.stream()
                .filter(e->!e.evaluacion().equalsIgnoreCase("N/A"))
                .peek(e -> System.out.println("Primer Filtro (N/A)" + e))
                .sorted(Comparator.comparing(DatosEpisodio::evaluacion).reversed())
                .peek(e -> System.out.println("Segundo Filtro (M>m)" + e))
                .map(e-> e.titulo().toUpperCase())
                .peek(e -> System.out.println("Tercer Filtro Mayusculas" + e))
                .limit(5)
                .forEach(System.out::println);

        //convirtiendo los datos a una lista del tipo Episodio
        List<Episodio> episodios = temporadas.stream()
                .flatMap(t->t.episodios().stream()
                .map(d->new Episodio(t.numero(),d)))
                .collect(Collectors.toList());
/*        episodios.forEach(System.out::println);

        // Busqueda de episodios a partir de x año
        System.out.println("Por favor indicar el año a partir del cual deseas ver los episodios");
        var fecha = teclado.nextInt();
        teclado.nextLine();

        LocalDate fechaBusqueda =LocalDate.of(fecha,1,1);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        episodios.stream()
                .filter(e -> e.getFechaDeLanzamiento() != null && e.getFechaDeLanzamiento().isAfter(fechaBusqueda))
                .forEach(e -> System.out.println(
                        "Temporada " + e.getTemporada() +
                                "Episodio " + e.getTitulo() +
                                "Fecha de Lanzamiento " + e.getFechaDeLanzamiento().format(dtf)
                ));*/
        //Busca episodios por pedazo del titulo
    /*    System.out.println("Por favor escriba el titulo del episodio que desea ver");
        var pedazoTitulo = teclado.nextLine();
        Optional<Episodio> episodioBuscado = episodios.stream()
                .filter(e -> e.getTitulo().toUpperCase().contains(pedazoTitulo.toUpperCase()))
                .findFirst();
        if(episodioBuscado.isPresent()){
            System.out.println(episodioBuscado);
            System.out.println("Los datos son: " + episodioBuscado.get());
        }else{
            System.out.println("Episodio no encontrado");
        }*/

        Map<Integer, Double> evaluacionesPorTemporadas = episodios.stream()
                .filter(e -> e.getEvaluacion() > 0.0)
                .collect(Collectors.groupingBy(Episodio::getTemporada,
                        Collectors.averagingDouble(Episodio::getEvaluacion)));
        System.out.println(evaluacionesPorTemporadas);

        DoubleSummaryStatistics est = episodios.stream()
                .filter(e -> e.getEvaluacion() > 0.0)
                .collect(Collectors.summarizingDouble(Episodio::getEvaluacion));


    }


}
