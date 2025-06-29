# Ejercicio: Juego de Adivinanza de Números

---

## Descripción del Ejercicio

Este proyecto implementa un simple juego de adivinanzas como parte de los desafíos prácticos de mi curso de Java. El objetivo es que el programa genere un número secreto y el usuario intente adivinarlo en un número limitado de intentos.

Este ejercicio refuerza conceptos fundamentales como la generación de números aleatorios, la lectura de entrada del usuario por consola, el uso de bucles (`while`) para controlar la lógica del juego, las estructuras condicionales (`if-else if-else`) para dar pistas, y el manejo del flujo del programa (`break`).

---

## Contenido del Proyecto

Este proyecto contiene la clase `Main.java`, que implementa la lógica del juego:

* **Generación de Número Aleatorio:** El programa genera un número entero aleatorio entre 0 y 100 (inclusive), utilizando `new Random().nextInt(101)`.
* **Interacción con el Usuario:** Utiliza la clase `Scanner` para leer los intentos del usuario desde la consola.
* **Control de Intentos:** El usuario tiene un máximo de 5 intentos para adivinar el número.
* **Pistas:** Después de cada intento incorrecto, el programa informa al usuario si el número secreto es mayor o menor que el número ingresado.
* **Validación de Entrada:** Se incluye una validación para asegurar que el número ingresado por el usuario esté dentro del rango esperado (0-100).
* **Resultado del Juego:** Al finalizar los intentos o al adivinar el número, el programa informa si el usuario ganó o perdió, y revela el número secreto en caso de derrota.

---

## Cómo Ejecutar este Ejercicio

Para ejecutar el "Juego de Adivinanza" en tu entorno local, sigue estos pasos:

1.  **Clona el Repositorio Principal:**
    Si aún no lo has hecho, clona el repositorio completo `Java-Alura` desde GitHub:
    ```bash
    git clone [https://github.com/stonedjjh/Java-Alura.git](https://github.com/stonedjjh/Java-Alura.git)
    ```

2.  **Abre el Proyecto en IntelliJ IDEA:**
    * Abre IntelliJ IDEA.
    * Selecciona `File` > `Open...`.
    * Navega y selecciona la carpeta **`Ejercicios/juegoadivinanza`** dentro de tu repositorio `Java-Alura` clonado.
    * IntelliJ debería reconocerlo automáticamente como un proyecto Java.

3.  **Ejecuta la Clase `Main`:**
    * Dentro de IntelliJ IDEA, abre el archivo `src/Main.java`.
    * Busca el método `main` y haz clic en el pequeño icono verde de "Play" (Run) que aparece en el margen del editor junto a la declaración del método. Alternativamente, puedes usar el menú `Run` > `Run 'Main'`.
    * El juego comenzará a ejecutarse en la ventana de la consola de IntelliJ IDEA, pidiéndote que ingreses un número.

---

## Desarrollado por

**Daniel Jiménez**

---