# 🚀 Java SWAPI Películas: Tu Viaje por la Galaxia en Código

---

## 📄 Descripción del Proyecto

Este proyecto es una aplicación **Java** que te permite explorar el universo de Star Wars, consultando información detallada de las películas (episodios I al VI) directamente desde la **SWAPI**.

Hemos implementado esta solución para:
* Superar el problema de la API oficial (`swapi.dev`) que se encuentra inactiva, utilizando la alternativa **SWAPI Info** (`swapi.info`).
* Demostrar el uso de conceptos clave de Java para la comunicación con servicios web, el manejo de datos y la persistencia.

---

## ✨ Características Principales

* **Consulta de Películas:** Obtén detalles de tus películas favoritas de Star Wars (Episodios 1 a 6) mediante una interacción intuitiva.
* **Conexión HTTP Robusta:** Utiliza `HttpClient` para realizar peticiones eficientes y `HttpResponse` para gestionar las respuestas de la API.
* **Manejo de Datos JSON:** Transforma datos JSON recibidos de la API en objetos Java, gracias a la potencia de la librería **Gson**.
* **Modelado de Datos:** Emplea **Records** y el patrón DTO para una representación inmutable y clara de las películas.
* **Gestión de Errores:** Implementa **excepciones personalizadas** para un manejo de errores preciso y amigable.
* **Persistencia Local:** Guarda los datos consultados de cada película en un archivo **`.json`** local, facilitando su consulta posterior.

---

## 🛠️ Tecnologías Utilizadas

* **Java 17+**
* **API Pública:** [SWAPI Info](https://swapi.info/) (Alternative Star Wars API)
* **Gson:** Para la serialización y deserialización de objetos Java a JSON y viceversa.
* **`java.net.http`:** Paquete `HttpClient` para la gestión de peticiones y respuestas HTTP.
* **`java.io`:** Para la manipulación de archivos.

---

## ⚙️ Cómo Ejecutar el Proyecto

Sigue estos pasos para poner en marcha la aplicación en tu entorno local:

1.  **Clona el Repositorio:**
    ```bash
    git clone [https://github.com/stonedjjh/Java-Alura.git](https://github.com/stonedjjh/Java-Alura.git)
    cd Java-Alura
    ```

2.  **Cambia a la Rama del Proyecto:**
    ```bash
    git checkout Java-consumir-API-escribir-archivos-y-manejar-errores
    ```

3.  **Compila y Ejecuta:**
    Puedes usar tu **IDE favorito** (como IntelliJ IDEA o Eclipse) abriendo el proyecto y ejecutando la clase `Principal.java`.

    Alternativamente, desde la **línea de comandos** (asegúrate de tener **Java 17+** configurado):
    ```bash
    # Si tienes un sistema de build (Maven/Gradle), úsalo.
    # De lo contrario, compila manualmente:
    javac -d out -cp "Proyectos/swapi/resources/gson-2.10.1.jar" src/com/aluracurso/swapi/conexion/*.java src/com/aluracurso/swapi/modelos/*.java src/com/aluracurso/swapi/exception/*.java src/Principal.java
    java -cp "out;Proyectos/swapi/resources/gson-2.10.1.jar" Principal.java
    # NOTA: Reemplaza "ruta/a/gson-2.8.9.jar" con la ruta real a tu archivo JAR de Gson.
    # En Windows, usa ";" en lugar de ":" para el classpath.
    ```

4.  **Interacción con la Aplicación:**
    * Al ejecutar, el programa te pedirá que **ingreses el número de la película** (del 1 al 6).
    * Para terminar la aplicación, simplemente **escribe `salir`** cuando se te pida el número de película.
    * Los datos de cada película consultada se guardarán en un archivo llamado **`peliculas.json`** en la raíz del proyecto.

---

## 🗺️ Estructura del Proyecto
.
├── src/
│   ├── com.aluracurso.swapi.conexion       # Lógica para la conexión y peticiones a la SWAPI
│   ├── com.aluracurso.swapi.modelos        # Clases de modelado de datos (Pelicula, PeliculaSwapi, etc.)
│   └── com.aluracurso.swapi.exception      # Clases para manejo de excepciones personalizadas
└── Principal.java                          # Punto de entrada de la aplicación, contiene el menú y la orquestación.                     # Punto de entrada de la aplicación, contiene el menú y la orquestación.

---
© 2025 Daniel Jiménez / stonedjjh