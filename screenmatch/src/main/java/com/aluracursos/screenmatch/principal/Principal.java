package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.model.*;
import com.aluracursos.screenmatch.repository.SerieRepository;
import com.aluracursos.screenmatch.service.ConsumoAPI;
import com.aluracursos.screenmatch.service.ConvierteDatos;

import java.util.*;
import java.util.stream.Collectors;

public class Principal {
    private Scanner teclado = new Scanner(System.in);
    private ConsumoAPI consumoApi = new ConsumoAPI();
    private final String URL_BASE = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey="+System.getenv("OMDB_API_KEY");
    private ConvierteDatos conversor = new ConvierteDatos();
    private List<DatosSerie> datosSeries = new ArrayList<>();
    private SerieRepository repositorio;
    private List<Serie> series;
    private Optional<Serie> serieBuscada;

    public Principal(SerieRepository repository) {
        this.repositorio = repository;
    }

    public void mostrarMenu() {
        var opcion = -1;
        while (opcion != 0) {
            var menu = """
                    1 - Buscar series 
                    2 - Buscar episodios
                    3 - Mostrar series buscadas
                    4 - Buscar serie por titulo
                    5 - Buscar el Top 5 de Serie
                    6 - Buscar serie por categoria
                    7 - filtrar series por temporadas y evaluacion
                    8 - Buscar episodio por titulo
                    9 - Top 5 episodios por serie.                    
                                  
                    0 - Salir
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    buscarSerieWeb();
                    break;
                case 2:
                    buscarEpisodioPorSerie();
                    break;
                case 3:
                    mostrarSeriesBuscadas();
                    break;
                case 4:
                    buscarSeriePorTitulo();
                    break;
                case 5:
                    buscarTop5Series();
                    break;
                    case 6:
                    buscarSeriePorCategoria();
                    break;
                case 7:
                    filtrarSeriePorTemporadayEvaluacion();
                    break;
                case 8:
                    buscarEpisodioPorTitulo();
                    break;
                case 9:
                    buscarTop5Episodios();
                    break;
                case 0:
                    System.out.println("Cerrando la aplicación...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }

    }

    private DatosSerie getDatosSerie() {
        System.out.println("Escribe el nombre de la serie que deseas buscar");
        var nombreSerie = teclado.nextLine();
        var json = consumoApi.obtenerDatos(URL_BASE + nombreSerie.replace(" ", "+") + API_KEY);
        System.out.println(json);
        DatosSerie datos = conversor.obtenerDatos(json, DatosSerie.class);
        return datos;
    }
    private void buscarEpisodioPorSerie() {
        //DatosSerie datosSerie = getDatosSerie();
        mostrarSeriesBuscadas();
        System.out.println("Escriba el nombre de la serie de la cual quieres ver los episodios");
        var nombreSerie = teclado.nextLine();

        Optional<Serie> serie = series.stream()
                .filter(s -> s.getTitulo().toLowerCase().contains(nombreSerie.toLowerCase()))
                .findFirst();
        if(serie.isPresent()){
            var serieEncontrada = serie.get();
            List<DatosTemporadas> temporadas = new ArrayList<>();

            for (int i = 1; i <= serieEncontrada.getTotalTemporadas(); i++) {
                var json = consumoApi.obtenerDatos(URL_BASE +
                        serieEncontrada.getTitulo().replace(" ", "+") + "&season=" + i + API_KEY);
                DatosTemporadas datosTemporada = conversor.obtenerDatos(json, DatosTemporadas.class);
                temporadas.add(datosTemporada);
            }
            temporadas.forEach(System.out::println);

            List<Episodio>  episodios = temporadas.stream()
                    .flatMap(d -> d.episodios().stream()
                            .map(e-> new Episodio(d.numero(),e)))
                    .collect(Collectors.toUnmodifiableList());
            serieEncontrada.setEpisodios(episodios);
            repositorio.save(serieEncontrada);
        }




    }
    private void buscarSerieWeb() {
        DatosSerie datos = getDatosSerie();
        Serie serie = new Serie(datos);
        repositorio.save(serie);
        //datosSeries.add(datos);

        System.out.println(datos);
    }

    private void mostrarSeriesBuscadas() {
         /* List<Serie> series = new ArrayList<>();
      series = datosSeries.stream()
                .map(d -> new Serie(d))
                .collect(Collectors.toList());
*/
        series = repositorio.findAll();
        series.stream()
                .sorted(Comparator.comparing(Serie::getGenero))
                .forEach(System.out::println);

        //datosSeries.forEach(System.out::println);
    }

    public void buscarSeriePorTitulo(){
        System.out.println("Escriba el nombre de la serie que desea buscar");
        var nombreSerie = teclado.nextLine();

        serieBuscada =repositorio.findByTituloContainsIgnoreCase(nombreSerie);

        if (serieBuscada.isPresent()){
            System.out.println("La serie buscada es: "+ serieBuscada.get());
        }else {
            System.out.println("Serie no encontrada");
        }

    }

    private void buscarTop5Series(){
        List<Serie> topSeries = repositorio.findTop5ByOrderByEvaluacionDesc();
        topSeries.forEach(s -> System.out.println("Serie " + s.getTitulo() + " Evaluacion " + s.getEvaluacion()));
    }

    private void buscarSeriePorCategoria(){
        System.out.println("Escriba el genero/categoria de la serie que desea buscar");
        var nombreCategoria = teclado.nextLine();
        var categoria = Categoria.fromEspanol(nombreCategoria);
        List<Serie> seriePorCategoria = repositorio.findByGenero(categoria);
        System.out.println("La serie de la categoria " + nombreCategoria);
        seriePorCategoria.forEach(System.out::println);

    }

    private void filtrarSeriePorTemporadayEvaluacion(){
        System.out.println("Escriba la cantidad de temporadas que quiere filtrar");
        var temporadas = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Minimo de evaluacion");
        var evaluacion = teclado.nextDouble();
        teclado.nextLine();
        List<Serie> episodios = repositorio.seriesPorTemporadaYEvaluacion(temporadas,evaluacion);

        episodios.forEach(System.out::println);

    }

    private void buscarEpisodioPorTitulo(){
        System.out.println("escribe el nombre del episodio que deseas buscar");
        var nombreEpisodio = teclado.nextLine();

        List<Episodio> episodiosEncontrados = repositorio.episodiosPorNombre(nombreEpisodio);
        episodiosEncontrados.forEach(e ->
                System.out.printf("Serie: %s Temporada %s Episodio %s Evaluación %s\n",
                        e.getTitulo(), e.getTemporada(), e.getNumeroEpisodio(), e.getEvaluacion()));
    }

    private void buscarTop5Episodios(){
        buscarSeriePorTitulo();
        if(serieBuscada.isPresent()){
            Serie serie = serieBuscada.get();
            List<Episodio> topEpisodios = repositorio.top5Episodios(serie);

            topEpisodios.forEach(e ->
                    System.out.printf("Serie: %s Titulo %s Temporada %s Episodio %s Evaluación %s\n",
                            e.getSerie().getTitulo(),e.getTitulo(), e.getTemporada(), e.getNumeroEpisodio(), e.getEvaluacion()));

        }
    }

}
