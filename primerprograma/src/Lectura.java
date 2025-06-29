//importamos la clase Scanner
import java.util.Scanner;

public class Lectura {

    public static void main(String[] args) {
        //Declaramos un objeto de la clase Scanner configurada para el Standard In(teclado)
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el nombre de tu pelicula favorita");
        //nextLine nos permite leer una linea completa por teclado
        String pelicula = teclado.nextLine();
        System.out.println("Ahora escribe la fecha de lanzamiento");
        //nextInt nos permite leer un numero entero
        int fechaDeLanzamiento = teclado.nextInt();
        //nextDouble se usa para leer un valor double
        System.out.println("Por ultimos dinos que nota le das a esta Pelicula");
        double nota = teclado.nextDouble();

        System.out.println(pelicula);
        System.out.println(fechaDeLanzamiento);
        System.out.println(nota);
    }
}
