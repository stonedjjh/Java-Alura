import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;
        double totalEvaluaciones = 0;

        //parecido al ejericio Loop pero usando un ciclo while
        while (nota != -1){
            System.out.println("Escribe la nota que le darias a la pelicula Matrix");
            nota = teclado.nextDouble();
            //para que no tome el valor -1 para el promedio condicionamos por su valor
            if (nota != -1){
                //usamor el operador += que permite sumar a su valor la siguiente variable
                mediaEvaluaciones += nota;
                // ++ permite incrementar en 1 la variable asignada
                totalEvaluaciones++;
            }
        }
        System.out.println("La media de evaluaciones para Matrix es: " + mediaEvaluaciones/3);
    }
}
