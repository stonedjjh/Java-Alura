/*¡Ahora te toca a ti!

Practica los conceptos que se enseñaron durante esta clase con el siguiente desafío:

Crea un programa que simule un juego de adivinanzas. El programa debe generar un número aleatorio entre 0 y 100,
y pedir al usuario que intente adivinar ese número en un máximo de 5 intentos.
En cada intento, el programa debe informar si el número ingresado por el usuario es mayor o menor que el número generado.

Consejos:

Para generar un número aleatorio en Java: new Random().nextInt(100);

Utiliza el Scanner para obtener los datos del usuario.

Utiliza una variable para contar los intentos.

Utiliza un bucle para controlar los intentos.

Utiliza la instrucción ‘break;’ para salir del bucle.

¡Buena suerte!*/

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Se genera un número aleatorio entre 0 y 100
        int numeroAdivinar = new Random().nextInt(101);
        // Se establece la cantidad de intentos
        int intentos = 5;
        Scanner teclado = new Scanner(System.in);
        boolean adivino = false;
        int numeroUsuario = 0;

        // Se controla que el ciclo se repita mientras queden intentos
        while (intentos > 0) {
            System.out.println("Ingrese un numero entre 0 y 100");
            numeroUsuario = teclado.nextInt();
            // Se valida que el número esté en el rango esperado
            if (numeroUsuario >= 0 && numeroUsuario <= 100) {
                // Se valida si el usuario adivinó el número
                if (numeroUsuario == numeroAdivinar) {
                    // Se le informa al usuario que ganó, en cuál intento y se establece que adivinó como true
                    // Además, se sale del ciclo
                    System.out.println("Felicitaciones has ganado en tu intento numero " + (6 - intentos));
                    adivino = true;
                    break;
                } else if (numeroAdivinar > numeroUsuario)
                    System.out.println("El numero a Adivinar es mayor que " + numeroUsuario);
                else
                    System.out.println("El numero a Adivinar es menor que " + numeroUsuario);
                // Se van restando intentos válidos
                intentos--;
            } else
                System.out.println("Numero no valido intente de nuevo");
            // Si aún tiene intentos, se notifica la cantidad que le quedan
            if (intentos > 0)
                System.out.println("Te quedan " + intentos + " intentos");
        }
        // Si no adivinó, se le notifica que perdió y se le informa el número a adivinar
        if (!adivino)
            System.out.println("Perdiste el numero a adivinar era el: " + numeroAdivinar);
    }
}
