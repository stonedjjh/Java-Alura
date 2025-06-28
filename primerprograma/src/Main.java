//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Bienvenido(a) a Screen Match");
        System.out.println("Pelicula Matrix");

        //aunque no es una fecha sino el año lo declaramos int ya que no tenemos parte decimal
        int fechaDeLanzamiento = 1999;
        //declaramos una variable boolean sola acepta 2 valores segun el lenguaje puede ser 0,1, true/false , on/off
        boolean incluidoEnElPlan = true;
        //en esta variable tenemos una parte decimal por lo cual su tipo es double
        double notaDeLaPelicula = 8.2;

        double media = (8.2 + 6.0 + 9.0) / 3;

        System.out.println(media);

        //aqui usamos un bloque de cadena + concatenacion
        String sinopsis = """
                Matrix es una paradoja
                La mejor pelicula del fin del milenio
                Fué lanzada en :
                """ + fechaDeLanzamiento;

        System.out.println(sinopsis);

        int clasificacion  = (int) (media / 2);
        System.out.println(clasificacion);


    }
}