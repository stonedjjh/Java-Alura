import com.cursosalura.condicionales.Funciones;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Funciones funciones = new Funciones();
        funciones.parida(8);
        funciones.parida(7);

        System.out.println("El alumno con nota de 8.2 esta: " + funciones.estatusAprobacion(8.2));
        System.out.println("El alumno con nota de 5.8 esta: " + funciones.estatusAprobacion(5.8));
        System.out.println("El alumno con nota de 4.3 esta: " + funciones.estatusAprobacion(4.3));

        funciones.verificacionDeAcceso();
        funciones.compararNumeros();

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el monto de la compra");
        double monto = teclado.nextDouble();
        funciones.calificarDescuento(monto);
        System.out.println("Ingrese un dia de la semana");
        String dia = teclado.nextLine();
        if (funciones.diaHabil(dia))
            System.out.println("El dia " + dia + " es habil");
        else
            System.out.println("El dia " + dia + " no es habil");
        funciones.verificarElegibilidad();
        if(funciones.verificarTriangulo(1,2,10))
            System.out.println("Los lados pueden formar un triángulo.");
        else
            System.out.println("No se puede formar un triangulo con esos valores");

        funciones.verificarCompatibilidadDonante(17,50);

        // Caso 1: Acceso permitido (código correcto, nivel válido)
        System.out.println("Intento 1 (2023, 1): " + funciones.verificarAcceso(2023, 1));

        // Caso 2: Código incorrecto
        System.out.println("Intento 2 (1234, 2): " + funciones.verificarAcceso(1234, 2));
    }

}
