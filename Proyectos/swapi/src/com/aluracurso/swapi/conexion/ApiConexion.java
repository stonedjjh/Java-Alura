package com.aluracurso.swapi.conexion;

import com.aluracurso.swapi.exception.ExceptionHandler;
import com.aluracurso.swapi.modelos.PeliculaSwapi;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiConexion {
    private String direccion = "https://swapi.info/api/films/";
    private HttpRequest request;
    private HttpResponse<String> response;


    public boolean peticion(int numeroFilm)  {
        HttpClient client = HttpClient.newHttpClient();
        try {
             this.request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion+"/"+numeroFilm))
                    .build();
             this.response = client
                     .send(this.request, HttpResponse.BodyHandlers.ofString());
            return true;
        }
        catch (IOException | InterruptedException e){
            System.out.println("No se pudo conectar con la Api");
        }
        catch (ExceptionHandler e){
            System.out.println(e.getMessage());
        }

        return false;
    }

    public  PeliculaSwapi retornaPeticionJson(Gson gson){
        String json = response.body();
        PeliculaSwapi respuesta;
        try {
            respuesta = gson.fromJson(json, PeliculaSwapi.class);
        } catch (JsonSyntaxException e) {
            throw new ExceptionHandler();
        }
        return  respuesta;
    }

}
