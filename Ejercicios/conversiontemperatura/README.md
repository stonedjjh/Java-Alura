# Ejercicio: Conversor de Temperatura Celsius a Fahrenheit

---

## Descripción del Ejercicio

Este proyecto es parte de los desafíos prácticos de mi curso de Java. Su objetivo es implementar un programa que convierta una temperatura dada en grados Celsius a su equivalente en grados Fahrenheit.

El ejercicio se centra en el uso de variables para almacenar y manipular datos, la aplicación de una fórmula matemática simple y la correcta visualización de los resultados en la consola, incluyendo la manipulación de decimales.

---

## Contenido del Proyecto

Este proyecto contiene la clase `Main.java`, que incluye:

* **Variables de Temperatura:** Uso de variables de tipo `double` para almacenar la temperatura en Celsius y el resultado en Fahrenheit.
* **Fórmula de Conversión:** Aplicación de la fórmula `(temperatura * 1.8) + 32` para realizar la conversión.
* **Conversión a Entero (Casting):** Implementación de un *casting* explícito a `int` para mostrar la temperatura en Fahrenheit sin decimales, como se solicitó en el desafío.
* **Formateo de Salida:** Demostración de cómo usar `String.format()` para controlar la precisión decimal en la salida por consola, ofreciendo un método alternativo para presentar valores sin decimales.
* **Método Personalizado `celsiumAFahrenheit`:** Se incluye una función (método estático) `celsiumAFahrenheit` para encapsular la lógica de conversión, lo que ilustra el concepto de reutilización y modularización del código antes de ser formalmente introducido en el curso. Esta es una forma de demostrar diferentes enfoques para el mismo problema.

**Funcionalidad:**
Al ejecutar el programa, se imprimirá en la consola la temperatura original en Celsius y su correspondiente valor convertido a Fahrenheit, presentado de dos maneras: una utilizando *casting* a entero y otra utilizando formateo de salida sin decimales.

---

## Cómo Ejecutar este Ejercicio

Para ejecutar este programa en tu entorno local, sigue estos pasos:

1.  **Clona el Repositorio Principal:**
    Si aún no lo has hecho, clona el repositorio completo donde se encuentra este ejercicio:
    ```bash
    git clone [https://github.com/stone_djjh/Java-Alura.git](https://github.com/stone_djjh/Java-Alura.git)
    ```   

2.  **Abre el Proyecto en IntelliJ IDEA:**
    * Abre IntelliJ IDEA.
    * Selecciona `File` > `Open...`.
    * Navega y selecciona la carpeta específica de este ejercicio (ej. `Ejercicios/ConversorTemperatura` o la que hayas usado) dentro de tu repositorio clonado.
    * IntelliJ debería reconocerlo automáticamente como un proyecto Java.

3.  **Ejecuta la Clase Principal (ej. `Main`):**
    * Dentro de IntelliJ IDEA, abre el archivo `src/Main.java`.
    * Busca el método `main` y haz clic en el pequeño icono verde de "Play" (Run) que aparece en el margen del editor junto a la declaración del método. Alternativamente, puedes usar el menú `Run` > `Run 'Main'`.
    * La salida del programa, mostrando la conversión de temperatura, aparecerá en la ventana de la consola de IntelliJ IDEA.

---

## Desarrollado por

**Daniel Jiménez**

---