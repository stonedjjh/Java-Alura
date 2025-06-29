public class Decisiones {

    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = false;
        double notaDeLaPelicula = 8.2;
        String tipoPlan = "plus";

        //uso de if-else con operador aritmetico
        if (fechaDeLanzamiento > 2022) {
            System.out.println("Peliculas mas populares");
        } else {
            System.out.println("Pelicula Retro que aun vale la pena ver");
        }

        //uso de if-else con variable booleana y operador lógico
        /*cuando se comparan String si se usa == comparara si apuntan
        a la misma dirección de memoria parecido a comparar objetos
        por eso es mejor usar el método equals
         */
        //if (incluidoEnElPlan || tipoPlan == 'plus' ){
        if (incluidoEnElPlan || tipoPlan.equals("plus")){
            System.out.println("Disfrute de su pelicula");
        } else {
            System.out.println("Pelicula no disponible para su plan actual");
        }

    }
}
