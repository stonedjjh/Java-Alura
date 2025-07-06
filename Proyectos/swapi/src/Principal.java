import com.aluracurso.swapi.conexion.ApiConexion;
import com.aluracurso.swapi.exception.ExceptionHandler;
import com.aluracurso.swapi.modelos.Pelicula;
import com.aluracurso.swapi.modelos.PeliculaSwapi;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {

        Scanner teclado = new Scanner(System.in);
        List<Pelicula> peliculas = new ArrayList<Pelicula>();
        String opcion;
        int numeroPelicula;
        ApiConexion conexion = new ApiConexion();
        PeliculaSwapi peliculaSwapi;
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();


        while (true){
            System.out.println("Ingrese el numero de la pelicula a consultar:");
            opcion = teclado.next();

            if(opcion.equalsIgnoreCase("salir") ){
                break;
            }

            try{
                numeroPelicula = Integer.parseInt(opcion);
                if(conexion.peticion(numeroPelicula)) {
                    peliculaSwapi = conexion.retornaPeticionJson(gson);
                    Pelicula miPelicula = new Pelicula(peliculaSwapi);
                    peliculas.add(miPelicula);
                    System.out.println("Pelicula agregada a la colección");
                }

            } catch (NumberFormatException e) {
                System.out.println("Opcion no valida");
                numeroPelicula = 0;
            } catch (ExceptionHandler e) {
                System.out.println(e.getMessage());
            }
        }
        try (FileWriter miArchivo = new FileWriter("Peliculas.json")){
            miArchivo.write(gson.toJson(peliculas));
            System.out.println("Archivo credo");
        } catch (IOException e) {
            System.out.println("No se pudo escribir el archivo");
        }
        catch (Exception e){
            System.out.println("No se pudo crear el archivo");
        }
        teclado.close();
        System.out.println("Finalizó la ejecución del programa!");
    }

}
