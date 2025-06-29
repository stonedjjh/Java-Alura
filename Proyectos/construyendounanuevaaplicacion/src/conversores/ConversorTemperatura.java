package conversores;

public class ConversorTemperatura {

    // Métodos de Conversión de Temperatura

    // Celsius a Fahrenheit
    public double celsiusAFahrenheit(double cantidadCelsius) {
        return (cantidadCelsius * 9/5) + 32;
    }

    // Fahrenheit a Celsius
    public double fahrenheitACelsius(double cantidadFahrenheit) {
        return (cantidadFahrenheit - 32) * 5/9;
    }

    // Celsius a Kelvin
    public double celsiusAKelvin(double cantidadCelsius) {
        return cantidadCelsius + 273.15;
    }

    // Kelvin a Celsius
    public double kelvinACelsius(double cantidadKelvin) {
        return cantidadKelvin - 273.15;
    }

    // Fahrenheit a Kelvin
    public double fahrenheitAKelvin(double cantidadFahrenheit) {
        return (cantidadFahrenheit - 32) * 5/9 + 273.15;
    }

    // Kelvin a Fahrenheit
    public double kelvinAFahrenheit(double cantidadKelvin) {
        return (cantidadKelvin - 273.15) * 9/5 + 32;
    }

    /**
     * Muestra un menú de las conversiones de temperatura disponibles.
     * @return Un String que representa el menú de opciones.
     */
    public String mostrarConversionesDisponibles() {
        return """
               --- Menú de Conversiones de Temperatura ---
               1. Celsius a Fahrenheit
               2. Fahrenheit a Celsius
               3. Celsius a Kelvin
               4. Kelvin a Celsius
               5. Fahrenheit a Kelvin
               6. Kelvin a Fahrenheit
               -------------------------------------------
               """;
    }

    /**
     * Realiza la conversión de temperatura según la opción seleccionada.
     * @param opcion El número de la opción de conversión (1-6).
     * @param cantidad La cantidad a convertir.
     * @return El resultado de la conversión. Retorna Double.NaN si la opción no es válida.
     */
    public double realizarConversion(int opcion, double cantidad) {
        double resultado = Double.NaN; // Usamos Double.NaN para indicar una opción no válida

        switch (opcion) {
            case 1:
                resultado = celsiusAFahrenheit(cantidad);
                break;
            case 2:
                resultado = fahrenheitACelsius(cantidad);
                break;
            case 3:
                resultado = celsiusAKelvin(cantidad);
                break;
            case 4:
                resultado = kelvinACelsius(cantidad);
                break;
            case 5:
                resultado = fahrenheitAKelvin(cantidad);
                break;
            case 6:
                resultado = kelvinAFahrenheit(cantidad);
                break;
            default:
                // resultado ya es Double. NaN
                break;
        }
        return resultado;
    }

    /**
     * Obtiene el nombre de la unidad original para una opción de conversión de temperatura dada.
     * @param opcion El número de la opción de conversión.
     * @return El nombre de la unidad original (String) o null si la opción no es válida.
     */
    public String obtenerNombreUnidadOriginal(int opcion) {
        switch (opcion) {
            case 1:
            case 3:
                return "Celsius";
            case 2:
            case 5:
                return "Fahrenheit";
            case 4:
            case 6:
                return "Kelvin";
            default: return null;
        }
    }

    /**
     * Obtiene el nombre de la unidad de destino para una opción de conversión de temperatura dada.
     * @param opcion El número de la opción de conversión.
     * @return El nombre de la unidad de destino (String) o null si la opción no es válida.
     */
    public String obtenerNombreUnidadDestino(int opcion) {
        switch (opcion) {
            case 2:
            case 4:
                return "Celsius";
            case 1:
            case 6:
                return "Fahrenheit";
            case 3:
            case 5:
                return "Kelvin";
            default: return null;
        }
    }
}