package conversores;

public class ConversorDistancia {

    // Métodos de Conversión de Distancia (mantienen su función original de cálculo)

    public double metrosACentimetros(double cantidadMetros) {
        return cantidadMetros * 100.0;
    }

    public double centimetrosAMetros(double cantidadCentimetros) {
        return cantidadCentimetros / 100.0;
    }

    public double metrosAKilometros(double cantidadMetros) {
        return cantidadMetros / 1000.0;
    }

    public double kilometrosAMetros(double cantidadKilometros) {
        return cantidadKilometros * 1000.0;
    }

    public double metrosAPies(double cantidadMetros) {
        return cantidadMetros * 3.28084;
    }

    public double piesAMetros(double cantidadPies) {
        return cantidadPies * 0.3048;
    }

    public double centimetrosAPulgadas(double cantidadCentimetros) {
        return cantidadCentimetros / 2.54;
    }

    public double pulgadasACentimetros(double cantidadPulgadas) {
        return cantidadPulgadas * 2.54;
    }

    public double kilometrosAMillas(double cantidadKilometros) {
        return cantidadKilometros / 1.60934;
    }

    public double millasAKilometros(double cantidadMillas) {
        return cantidadMillas * 1.60934;
    }

    public double metrosAYardas(double cantidadMetros) {
        return cantidadMetros * 1.09361;
    }

    public double yardasAMetros(double cantidadYardas) {
        return cantidadYardas * 0.9144;
    }

    /**
     * Muestra un menú de las conversiones de distancia disponibles.
     * @return Un String que representa el menú de opciones.
     */
    public String mostrarConversionesDisponibles() {
        return """
               --- Menú de Conversiones de Distancia ---
               1. Metros a Centímetros
               2. Centímetros a Metros
               3. Metros a Kilómetros
               4. Kilómetros a Metros
               5. Metros a Pies
               6. Pies a Metros
               7. Centímetros a Pulgadas
               8. Pulgadas a Centímetros
               9. Kilómetros a Millas
               10. Millas a Kilómetros
               11. Metros a Yardas
               12. Yardas a Metros
               ----------------------------------------
               """;
    }

    /**
     * Realiza la conversión de distancia según la opción seleccionada.
     * @param opcion El número de la opción de conversión (1-12).
     * @param cantidad La cantidad a convertir.
     * @return El resultado de la conversión. Retorna Double.NaN si la opción no es válida.
     */
    public double realizarConversion(int opcion, double cantidad) {
        double resultado = Double.NaN; // Usamos Double.NaN para indicar una opción no válida

        switch (opcion) {
            case 1:
                resultado = metrosACentimetros(cantidad);
                break;
            case 2:
                resultado = centimetrosAMetros(cantidad);
                break;
            case 3:
                resultado = metrosAKilometros(cantidad);
                break;
            case 4:
                resultado = kilometrosAMetros(cantidad);
                break;
            case 5:
                resultado = metrosAPies(cantidad);
                break;
            case 6:
                resultado = piesAMetros(cantidad);
                break;
            case 7:
                resultado = centimetrosAPulgadas(cantidad);
                break;
            case 8:
                resultado = pulgadasACentimetros(cantidad);
                break;
            case 9:
                resultado = kilometrosAMillas(cantidad);
                break;
            case 10:
                resultado = millasAKilometros(cantidad);
                break;
            case 11:
                resultado = metrosAYardas(cantidad);
                break;
            case 12:
                resultado = yardasAMetros(cantidad);
                break;
            default:
                // resultado ya es Double.NaN
                break;
        }
        return resultado;
    }

    /**
     * Obtiene el nombre de la unidad original para una opción de conversión dada.
     * @param opcion El número de la opción de conversión.
     * @return El nombre de la unidad original (String) o null si la opción no es válida.
     */
    public String obtenerNombreUnidadOriginal(int opcion) {
        switch (opcion) {
            case 1: return "metros";
            case 2: return "centímetros";
            case 3: return "metros";
            case 4: return "kilómetros";
            case 5: return "metros";
            case 6: return "pies";
            case 7: return "centímetros";
            case 8: return "pulgadas";
            case 9: return "kilómetros";
            case 10: return "millas";
            case 11: return "metros";
            case 12: return "yardas";
            default: return null;
        }
    }

    /**
     * Obtiene el nombre de la unidad de destino para una opción de conversión dada.
     * @param opcion El número de la opción de conversión.
     * @return El nombre de la unidad de destino (String) o null si la opción no es válida.
     */
    public String obtenerNombreUnidadDestino(int opcion) {
        switch (opcion) {
            case 1: return "centímetros";
            case 2: return "metros";
            case 3: return "kilómetros";
            case 4: return "metros";
            case 5: return "pies";
            case 6: return "metros";
            case 7: return "pulgadas";
            case 8: return "centímetros";
            case 9: return "millas";
            case 10: return "kilómetros";
            case 11: return "yardas";
            case 12: return "metros";
            default: return null;
        }
    }
}