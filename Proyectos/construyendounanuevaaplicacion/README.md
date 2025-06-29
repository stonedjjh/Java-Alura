-----

# Conversor de Unidades Java

-----

## Descripción del Proyecto

¡Hola\! Este proyecto es mi respuesta al desafío propuesto en el curso de Java de Alura, buscando consolidar y aplicar los conocimientos adquiridos de una manera práctica y divertida. A diferencia de `ScreenMatch`, esta aplicación es un **Conversor de Unidades** interactivo, diseñado para ser modular, extensible y fácil de usar desde la consola.

El objetivo principal es ofrecer una herramienta versátil para conversiones comunes, al mismo tiempo que demuestro el uso de **paquetes** para una mejor organización del código y el poder de la programación orientada a objetos en Java.

-----

## Características Principales

* **Menú Interactivo:** Navega fácilmente entre diferentes categorías de conversión (distancia, temperatura) y elige la opción que necesites.
* **Conversiones de Distancia:** Incluye un amplio rango de conversiones entre unidades métricas y del sistema imperial, como metros, centímetros, kilómetros, pies, pulgadas, millas y yardas.
* **Conversiones de Temperatura:** Permite convertir entre las escalas más comunes: Celsius, Fahrenheit y Kelvin.
* **Diseño Modular con Paquetes:** La lógica para cada categoría de conversión (`distancia`, `temperatura`) está encapsulada en sus propios **paquetes** y clases dedicadas. Esto no solo mantiene el código organizado, sino que facilita enormemente la adición de nuevas categorías de conversión sin afectar las existentes.
* **Reutilización de Código (Principio DRY):** La aplicación está construida para evitar la repetición de código, manejando la lógica común de interacción del usuario de manera centralizada a través del método `procesarCategoria`.

-----

## Estructura del Proyecto

El proyecto está organizado de manera que refleja una buena práctica en la modularización de aplicaciones Java usando paquetes:

```
proyectos/
└── conversor-unidades/
    ├── src/
    │   └── Conversor.java             <-- Clase principal
    │   └── conversores/               <-- Carpeta del paquete 'conversores'
    │       ├── ConversorDistancia.java
    │       └── ConversorTemperatura.java
    └── README.md (Este archivo)
```

En el directorio `src/conversores/` encontrarás las clases específicas para cada tipo de conversión, lo que te permite entender cómo se agrupa la funcionalidad relacionada.

-----

## Cómo Compilar y Ejecutar

Para poner en marcha este conversor en tu máquina, sigue estos sencillos pasos:

1.  **Navega al Directorio del Proyecto:**
    Abre tu terminal o línea de comandos y dirígete a la carpeta `conversor-unidades`:
    ```bash
    cd proyectos/conversor-unidades
    ```
2.  **Compila los Archivos Java:**
    Usa el compilador de Java (`javac`) para compilar todas las clases. Asegúrate de estar en el directorio `conversor-unidades`.
    ```bash
    javac src/Conversor.java src/conversores/ConversorDistancia.java src/conversores/ConversorTemperatura.java
    ```
    *(Si usas un IDE como IntelliJ IDEA o VS Code, la compilación se gestiona automáticamente).*
3.  **Ejecuta la Aplicación:**
    Desde la carpeta `conversor-unidades`:
    ```bash
    java -cp src Conversor
    ```
    La aplicación se iniciará en tu consola, presentándote un menú interactivo para que empieces a convertir.

-----

## ¡Colabora\!

Este proyecto es una excelente base, pero el mundo de las conversiones es vasto. ¿Te gustaría contribuir? ¡Tu participación es bienvenida\!

* **Creación de Nuevos Paquetes:** Te invito a crear nuevos **paquetes** para añadir más categorías de conversión. ¿Qué tal un paquete `moneda/` para convertir divisas, o `volumen/`, `peso/`, `tiempo/`? ¡Las posibilidades son infinitas\!
* **Mejoras Existentes:** ¿Ves alguna forma de optimizar el código actual, mejorar la interfaz de usuario en consola o añadir más conversiones dentro de las categorías existentes?

-----

### ¿Cómo Contribuir?

1.  Haz un "fork" de este repositorio.
2.  Crea una nueva rama (`git checkout -b mi-nueva-caracteristica`).
3.  Implementa tus cambios, asegurándote de seguir la estructura de paquetes y la modularidad.
4.  Realiza tus "commits" con mensajes claros y descriptivos.
5.  Envía un "pull request" explicando tus adiciones o mejoras.

¡Tus "pull requests" son más que bienvenidos\! Juntos podemos hacer de este conversor una herramienta aún más completa.

-----

## Desarrollado por

**Daniel Jiménez**

-----