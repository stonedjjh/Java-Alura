//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/*¡Ahora te toca a ti! Práctica los conceptos que se enseñaron a lo largo de esta
lección con el siguiente desafío:

Escribe un programa que convierta una temperatura en grados Celsius a Fahrenheit.
Utiliza variables para representar los valores de las temperaturas e imprime en la
consola el valor convertido de Celsius a Fahrenheit.

Consejo: La fórmula para convertir temperaturas de grados Celsius a Fahrenheit es:
(temperatura * 1.8) + 32.

Después de terminar, probar y verificar que tu programa se haya ejecutado correctamente,
crea una variable entera para mostrar la temperatura en Fahrenheit sin decimales.
Recuerda que probablemente necesitarás realizar un casting de valores.*/


public class Main {
    /*creamos una función aunque aun no lo han dado en el curso una función nos permite
    repetir un bloque de código que podemos llamar en cualquier parte de nuestro programa
    consta de el alcance en este caso publico, la palabra static es opcional y se usa para
    poder usar el método sin tener que declarar un objeto de su clase contenedora el tipo
    de retorno en ese caso double, el nombre de la función y sus parametros, en este momento
    puede parecer complicado pero es para que vean que siempre hay varias manera de obtener
    el mismo resultado
     */
    public static double celsiumAFahrenheit(double celsium){
        return (celsium * 1.8 ) + 32;
    }
    public static void main(String[] args) {
        double celsium = 160 ;
        double fahrenheit = celsiumAFahrenheit(celsium);
        int fahrenheitEntero = (int) fahrenheit; // <--- Aquí el casting explícito
        //aqui se usa un cast para presentar el valor sin decimal
        System.out.println(String.format("%.2f grados celsium a grados fahrenheit son %d", celsium, fahrenheitEntero));
        double fahrenheit2 = (celsium * 1.8 ) + 32;
        //aqui usamos la funcion format para presentar el valor sin decimal
        System.out.println(String.format("%.2f grados celsium a grados fahrenheit son %.0f",celsium, fahrenheit2));
        //el resultado debe ser el mismo asi usemos métodos distintos.

    }
}