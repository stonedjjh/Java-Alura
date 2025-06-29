import java.util.Scanner;
import conversores.ConversorDistancia;
import conversores.ConversorTemperatura;

public class Conversor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ConversorDistancia conversorDistancia = new ConversorDistancia();
        ConversorTemperatura conversorTemperatura = new ConversorTemperatura();
        boolean continuarPrograma = true;

        while (continuarPrograma) {
            System.out.println("\n--- Seleccione la Categoría de Conversión ---");
            System.out.println("1. Distancia");
            System.out.println("2. Temperatura");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opción: ");

            int categoriaSeleccionada = teclado.nextInt(); // Sin manejo de excepciones

            switch (categoriaSeleccionada) {
                case 1: // Categoría Distancia
                    procesarCategoria(teclado, conversorDistancia);
                    break;
                case 2: // Categoría: Temperatura
                    procesarCategoria(teclado, conversorTemperatura);
                    break;
                case 0: // Opción Salir
                    continuarPrograma = false;
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default: // Categoría no reconocida
                    System.out.println("Categoría no válida. Por favor, intente de nuevo.");
                    break;
            }
        }
        teclado.close(); // Cierra el Scanner al finalizar el programa
    }

    /**
     * Método auxiliar privado para procesar la lógica de conversión para una categoría específica.
     * Recibe un objeto genérico (Object) y utiliza 'instanceof' para determinar su tipo,
     * permitiendo llamar a los métodos correctos de ese conversor.
     *
     * @param teclado El objeto Scanner para la entrada del usuario.
     * @param conversorObjeto Una instancia de una clase de conversor (ej. ConversorDistancia, ConversorTemperatura).
     */
    private static void procesarCategoria(Scanner teclado, Object conversorObjeto) {
        // Variables para almacenar los resultados que se imprimirán
        double resultadoConversion = Double.NaN;
        String unidadOrigen = null;
        String unidadDestino = null;
        double cantidadAConvertir = 0.0; // Inicializar por si no se entra en ningún if

        // Utilizamos 'instanceof' y 'casting' para saber qué tipo de conversor es
        // y así llamar a sus métodos específicos. La lógica de lectura y cálculo se repite
        // aquí porque Java exige que el objeto esté casteado a su tipo específico
        // para poder llamar a sus métodos.
        if (conversorObjeto instanceof ConversorDistancia) {
            ConversorDistancia conversorActual = (ConversorDistancia) conversorObjeto; // Casteo
            System.out.println(conversorActual.mostrarConversionesDisponibles());
            System.out.print("Ingrese el número de la conversión deseada: ");
            int opcionConversion = teclado.nextInt();
            System.out.print("Ingrese la cantidad a convertir: ");
            cantidadAConvertir = teclado.nextDouble();
            resultadoConversion = conversorActual.realizarConversion(opcionConversion, cantidadAConvertir);
            unidadOrigen = conversorActual.obtenerNombreUnidadOriginal(opcionConversion);
            unidadDestino = conversorActual.obtenerNombreUnidadDestino(opcionConversion);

        } else if (conversorObjeto instanceof ConversorTemperatura) {
            ConversorTemperatura conversorActual = (ConversorTemperatura) conversorObjeto; // Casteo
            System.out.println(conversorActual.mostrarConversionesDisponibles());
            System.out.print("Ingrese el número de la conversión deseada: ");
            int opcionConversion = teclado.nextInt();
            System.out.print("Ingrese la cantidad a convertir: ");
            cantidadAConvertir = teclado.nextDouble();
            resultadoConversion = conversorActual.realizarConversion(opcionConversion, cantidadAConvertir);
            unidadOrigen = conversorActual.obtenerNombreUnidadOriginal(opcionConversion);
            unidadDestino = conversorActual.obtenerNombreUnidadDestino(opcionConversion);
        } else {
            System.out.println("Error interno: Tipo de conversor no reconocido.");
            return; // Sale del método si el tipo no es válido
        }

        // Esta parte sí se unifica, ya que las variables de resultado tienen los valores correctos
        if (!Double.isNaN(resultadoConversion) && unidadOrigen != null && unidadDestino != null) {
            System.out.printf("Resultado: %.2f %s son %.2f %s%n", cantidadAConvertir, unidadOrigen, resultadoConversion, unidadDestino);
        } else {
            System.out.println("Opción de conversión no válida o entrada incorrecta.");
        }
    }
}
