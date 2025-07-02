package com.cursosalura.condicionales;
import java.util.Scanner;

public class Funciones {

    public Scanner teclado = new Scanner(System.in);
    /*Ana necesita identificar si un número es par o impar para un juego que está desarrollando.
    Para ello, quiere crear un programa que analice si el número que ha definido previamente
    es par o impar. ¿Cómo ayudarías a Ana a escribir un programa que determine si un número
    es par o impar y muestre el resultado correctamente?*/
    public void parida(int numero){
        if (numero % 2 == 0){
            System.out.println("El numero: " + numero +" es par");
        }
        else{
            System.out.println("El numero: " + numero +" es impar");
        }
    }

    /*Julia es profesora y necesita un programa que la ayude a determinar si un estudiante ha sido aprobado en la
    asignatura. La regla de la escuela es:

    El estudiante es aprobado si su promedio final es mayor o igual a 7.0.
    Si el promedio está entre 5.0 y 6.9, está en recuperación.
    Si es inferior a 5.0, está reprobado.
    Crea un programa que, a partir de una variable media, muestre la situación del estudiante según las reglas de
    la escuela.
     */

    public String estatusAprobacion(double nota){
        if(nota >= 7){
            return "Aprobado";
        }else if (nota >= 5 && nota <= 6.9){
            return "Recuperación";
        }
        return "Reprobado";
    }

    /*Jéssica trabaja en el departamento de TI de una empresa y necesita garantizar la seguridad de los accesos al
    sistema interno. Los empleados utilizan una contraseña fija para acceder a sus cuentas, y el sistema debe verificar
    si la contraseña ingresada es correcta.

    Ayuda a Jéssica a crear un programa que, con base en una contraseña predefinida, por ejemplo: 123456, verifique si
    lo que el usuario digitó es correcto o no. El programa debe comparar el intento con la contraseña correcta y
    mostrar si el acceso fue permitido o denegado.
     */

    public void verificacionDeAcceso(){
        System.out.println("Ingrese su contraseña: ");
        String password = this.teclado.nextLine();
        if (password.equals("123456"))
            System.out.println("¡Acceso permitido!");
        else
            System.out.println("¡Acceso denegado!");
    }

    /*
    Pedro está aprendiendo Java y se encontró con un problema: necesita crear un programa que compare dos números
    enteros proporcionados por el usuario e indique cuál es el mayor o si son iguales. Sin embargo, tiene dificultades
    para implementar la lógica de comparación y mostrar el resultado correctamente. ¡Ayuda a Pedro a resolver este
    problema! Crea un programa que solicite al usuario dos números enteros, los compare y muestre un mensaje indicando
    cuál es el mayor o si ambos son iguales.
     */


    public void compararNumeros(){
        System.out.println("Ingrese el primer numero: ");
        int numero1 = this.teclado.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int numero2 = this.teclado.nextInt();
        if (numero1 > numero2)
            System.out.println("El numero "+ numero1 +" es el mayor");
        else if (numero2 > numero1)
            System.out.println("El numero "+ numero2 +" es el mayor");
        else
            System.out.println("Los numeros son iguales ");
    }

    /*
    Marcos trabaja en una tienda y necesita verificar si un cliente tiene derecho a un descuento del 10% en su compra.
    El descuento se aplica solo si el valor de la compra es mayor o igual a $100.00. Para ello, quiere un programa que
    permita ingresar el valor de la compra y muestre si el descuento fue aplicado o no, junto con el nuevo valor después
    del descuento, en caso de que corresponda.

    Basado en este escenario, crea un programa que reciba el valor de la compra y muestre un mensaje indicando si el
    descuento fue aplicado o no.
    **/

    public void calificarDescuento(double monto){
        if (monto >= 100) {
            System.out.println("Descuento del 10% aplicado.");
            System.out.println("Nuevo valor: " + monto * 0.9 );
        }else{
            System.out.println("Descuento no aplicado.");
            System.out.println("Valor total: " + monto);
        }
    }

    /*Carlos trabaja en una empresa de logística que opera solo de lunes a viernes, sin actividades los fines de semana.
     Para evitar confusiones, necesita un programa que, al recibir un día de la semana, indique si es un día hábil o no.

    Crea un programa que reciba un día de la semana (en minúsculas) y muestre un mensaje indicando si es un día
    hábil o no.*/

    public boolean diaHabil(String dia){
        if (dia.equalsIgnoreCase("sabado") || dia.equalsIgnoreCase("domingo"))
            return false;
        return true;
    }

    /*
    Emerson trabaja en un banco y necesita verificar si un número digitado por el cliente está dentro del rango
    permitido de valores para un préstamo, que va de 1000 a 5000 dólares.

    Crea un programa que reciba un valor y muestre si está dentro del intervalo permitido o no.
     */
    public void verificarElegibilidad(){
        System.out.println("Ingrese el valor del préstamo:");
        double valor = this.teclado.nextDouble();
        if (valor >= 1000 && valor <=5000)
            System.out.println("Prestamo ortogado por la cantidad de "+ valor);
        else
            System.out.println("El valor "+ valor +" no está dentro del intervalo permitido para el préstamo.");
    }

    /*Marcos está estudiando geometría y necesita verificar si tres lados pueden formar un triángulo. Para que tres
    lados formen un triángulo, la suma de dos lados debe ser mayor que el tercer lado. Él quiere un programa que reciba
    tres lados y muestre un mensaje indicando si los lados pueden formar un triángulo o no.

    Con base en este escenario, crea un programa que reciba tres lados y muestre un mensaje indicando si los lados
    pueden formar un triángulo o no.*/

    public boolean verificarTriangulo(double lado1, double lado2, double lado3)
    {
        if (((lado1 + lado2) > lado3) && ((lado1 + lado3) > lado2) && ((lado2 + lado3) > lado1))
            return true;
        return false;
    }

    /*
    María trabaja en un banco de sangre y necesita verificar si un donante es compatible para donar sangre. Para ser
    compatible, el donante debe cumplir con los siguientes criterios:

    Tener entre 18 y 65 años.
    Pesar más de 50 kg.
    Ella desea un programa que reciba la edad y el peso del donante e indique si es compatible para donar sangre.
    Si no lo es, el programa debe indicar qué criterio no fue cumplido.

    ¿Cómo crearías un programa que reciba la edad y el peso del donante y muestre un mensaje indicando si es compatible o no, además de informar qué criterio no fue cumplido, si es el caso?
    * */

    public void verificarCompatibilidadDonante(int edad, double peso){
        String motivo = "";
        if(edad <=18 || edad >= 65)
            motivo = "Debe tener entre 18 y 65 años. ";
        if(peso < 50)
            motivo +="Debe pesar mas de 50 kilos";
         if (!motivo.equals("")){
             System.out.println("El donante no es compatible." );
             System.out.println(motivo);
         }else
             System.out.println("El donante es compatible." );
    }

    /*
    * Juan está desarrollando un sistema de seguridad para una empresa. Para acceder al sistema, el usuario debe
    * proporcionar:

    Un código de acceso numérico (el código correcto es 2023).
    Un nivel de permiso numérico (los niveles válidos son 1, 2 o 3).
    El sistema solo permitirá el acceso si:

    El código de acceso es correcto.
    El nivel de permiso es válido (1, 2 o 3).
    De lo contrario, el acceso será denegado, y el programa debe informar el motivo (código incorrecto, nivel de permiso
    *  inválido o ambos).

    Crea un programa que reciba el código de acceso y el nivel de permiso y muestre un mensaje indicando si el acceso
    * fue permitido o denegado, además del motivo, si es el caso.
    * */

    public String verificarAcceso(int codigoAcceso, int nivelPermiso) {
        final int CODIGO_CORRECTO = 2023; // Constante para el código de acceso

        boolean codigoEsCorrecto = (codigoAcceso == CODIGO_CORRECTO);
        boolean nivelEsValido = (nivelPermiso >= 1 && nivelPermiso <= 3);

        if (codigoEsCorrecto && nivelEsValido) {
            return "Acceso Permitido.";
        } else {
            String motivo = "";
            if (!codigoEsCorrecto) {
                motivo += "Código incorrecto";
            }
            if (!nivelEsValido) {
                if (!motivo.isEmpty()) { // Si ya hay un motivo de código, añade " y "
                    motivo += " y ";
                }
                motivo += "Nivel de permiso inválido";
            }
            return "Acceso Denegado. Motivo: " + motivo + ".";
        }
    }

}
