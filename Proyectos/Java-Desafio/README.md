# Aplicación de Compras con Tarjeta de Crédito

## Descripción del Proyecto

Este proyecto es una aplicación de consola en Java que simula un sistema básico de compras con tarjeta de crédito. Permite al usuario establecer un límite para su tarjeta, realizar compras, llevar un control del saldo y la deuda, y gestionar pagos. El objetivo principal es aplicar conceptos de programación orientada a objetos y estructuras de datos en Java, como listas y mecanismos de ordenación.

La aplicación detiene las compras si el límite de la tarjeta es excedido o si el usuario decide finalizar la sesión, mostrando un resumen de las compras realizadas.

## Funcionalidades Implementadas

* **Configuración Inicial:** El usuario puede definir el límite inicial de la tarjeta de crédito.
* **Realización de Compras:**
    * Ingresar la descripción y el valor de los productos.
    * Verificación de saldo disponible antes de cada compra.
    * Adición de productos al carrito de compras si hay crédito suficiente.
* **Gestión de la Tarjeta:**
    * Consulta de saldo disponible.
    * Consulta de deuda actual.
    * Realización de pagos a la tarjeta, reduciendo la deuda (con un manejo particular del excedente de pago para este ejercicio).    
* **Gestión del Carrito de Compras:**
    * Visualización de la cantidad de artículos en el carrito.
    * Listado de todas las compras realizadas, ordenadas:
        * Por precio (usando la interfaz `Comparable`).
        * Por nombre del producto (usando la interfaz `Comparator` y expresiones lambda).
* **Control de Flujo:** Menú interactivo para navegar por las opciones y finalización de la aplicación.

## Conceptos de Java Aplicados

Este proyecto ha servido para reforzar y aplicar los siguientes conceptos:

* **Programación Orientada a Objetos (POO):** Clases (`Tarjeta`, `Producto`, `Principal`), objetos, constructores, atributos y métodos (getters/setters, encapsulamiento).
* **Interfaces:** Uso de `Comparable` para ordenación natural y `Comparator` para ordenación personalizada.
* **Colecciones:** Utilización de la interfaz `List` (`ArrayList` o `LinkedList`) para gestionar el carrito de compras.
* **Polimorfismo:** Declaración de variables usando la interfaz (`List`) para mayor flexibilidad.
* **Expresiones Lambda y Method References:** Para operaciones concisas, especialmente en el manejo de colecciones y `Comparator`.
* **Control de Flujo:** Bucles `while`, sentencias `switch-case`.
* **Entrada/Salida:** Uso de `Scanner` para la interacción con el usuario.

## Cómo Ejecutar el Proyecto

1.  **Clonar el repositorio y cambiar a la rama del proyecto:**
    ```bash
    git clone -b java-listas-colecciones [https://github.com/stonedjjh/Java-Alura.git](https://github.com/stonedjjh/Java-Alura.git)
    cd Java-Alura/Proyectos/Java-Desafio
    ```    

2.  **Compilar el código:**
    Desde el directorio `Java-Desafio`, ejecuta:
    ```bash
    javac -d out src/com/aluracursos/modelos/*.java src/Principal.java
    ```    

3.  **Ejecutar la aplicación:**
    Desde el directorio `Java-Desafio`, ejecuta:
    ```bash
    java -cp out Principal
    ```   

## Tecnologías Utilizadas

* Java (versión 17).
* Intellij Idea community edition

## Contribuciones

Las contribuciones son bienvenidas. Si encuentras algún error o tienes sugerencias de mejora, no dudes en abrir un *issue* o enviar un *pull request*.


## Autor

* Daniel Jiménez