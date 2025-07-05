import com.aluracursos.modelos.Producto;
import com.aluracursos.modelos.Tarjeta;

import java.util.*;

public class Principal { // O el nombre que le des a tu clase principal
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bienvenido al Stone Bank por favor ingrese el limite de la tarjeta de credito");
        Tarjeta miTarjeta = new Tarjeta(teclado.nextDouble());
        List<Producto> carritoDeCompra = new LinkedList<Producto>();
        /*carritoDeCompra.add(new Producto("Pantalon",20));
        carritoDeCompra.add(new Producto("Camisa",50));
        carritoDeCompra.add(new Producto("Cinturon",15));*/


        int opcion = -1;

        // Bucle principal del menú
        while (opcion != 0) {
            System.out.println("******************************************");
            System.out.println("APLICACIÓN DE COMPRAS CON TARJETA");
            System.out.println("******************************************");
            System.out.println("1. Realizar una compra");
            System.out.println("2. Ver saldo disponible");
            System.out.println("3. Ver deuda actual");
            System.out.println("4. Aumentar límite de la tarjeta");
            System.out.println("5. Realizar un pago");
            System.out.println("6. Ver cantidad de artículos en el carrito");
            System.out.println("7. Mostrar compras ordenadas por precio");
            System.out.println("8. Mostrar compras ordenadas por nombre");
            System.out.println("0. Salir de la aplicación");
            System.out.println("******************************************");
            System.out.print("Ingrese una opción: ");

            opcion = teclado.nextInt();
            teclado.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el producto a comprar");
                    var nombre = teclado.nextLine();
                    System.out.println("Ingrese el monto del producto");
                    var monto = teclado.nextDouble();
                    if (miTarjeta.realizarCargo(monto))
                        carritoDeCompra.add(new Producto(nombre,monto));
                    else
                        System.out.println("Su saldo es insuficiente para esta compra");
                    break;
                case 2:
                    System.out.println("Su saldo es de: " + (miTarjeta.getLimite() - miTarjeta.getDeuda()));
                    break;
                case 3:
                    System.out.println("Su deuda es de :" + miTarjeta.getDeuda());
                    break;
                case 4:
                    // Lógica para aumentar límite
                    break;
                case 5:
                    System.out.println("ingrese el monto a pagar: ");
                    miTarjeta.realizarPago(teclado.nextDouble());
                    System.out.println("Pago procesado");
                    break;
                case 6:
                    System.out.println("Su carrito actualmente tiene: " + carritoDeCompra.size()+" productos");
                    break;
                case 7:
                    Collections.sort(carritoDeCompra);
                    carritoDeCompra.forEach(System.out::println);
                    break;
                case 8:
                    Comparator<Producto> comparadorPorNombreLambda = (p1, p2) -> p1.getNombre().compareTo(p2.getNombre());
                    Collections.sort(carritoDeCompra, comparadorPorNombreLambda);
                    carritoDeCompra.forEach(System.out::println);
                    break;
                case 0:
                    System.out.println("Saliendo de la aplicación. ¡Gracias por usarla!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
            System.out.println("\n"); // Espacio para mayor legibilidad entre interacciones del menú
        }

        teclado.close(); // Cerrar el scanner al finalizar
    }
}