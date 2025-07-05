package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Titulo;
import com.aluracursos.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalConBusqueda {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Escriba el nombre de una pelicula: ");
        var busqueda = lectura.nextLine();

        String clave = System.getenv("OMDB_API_KEY"); ;//ingresa aqui tu clave
        String direccion = "https://www.omdbapi.com/?t="+busqueda+"&apikey="+clave;

        HttpClient client = HttpClient.newHttpClient(); // Creamos un cliente HTTP para enviar peticiones
        HttpRequest request = HttpRequest.newBuilder() // Iniciamos la construccion de la peticion HTTP
                .uri(URI.create(direccion)) // Definimos la URL a la que se enviara la peticion
                .build(); // Finalizamos la construccion de la peticion
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString()); // Enviamos la peticion y esperamos la respuesta como un String
        System.out.println(response.body()); // Imprimimos el cuerpo de la respuesta en consola

        String json = response.body();
        System.out.println(json);

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();
        TituloOmdb miTituloOmdb = gson.fromJson(json, TituloOmdb.class);
        System.out.println(miTituloOmdb);
        Titulo miTitulo = new Titulo(miTituloOmdb);
        System.out.println(miTitulo);
    }
}
