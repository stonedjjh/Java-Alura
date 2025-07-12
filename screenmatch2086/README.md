# Desafío: ScreenMatch - Frases Aleatorias (Edición 2086)

¡Bienvenidos a un nuevo desafío en el mundo de películas y series! En esta ocasión, nos embarcamos en una aventura diferente, centrada en poner en práctica y consolidar los conocimientos adquiridos en el curso de desarrollo con Spring Boot.

---

## 🚀 El Desafío

Este desafío está diseñado para que apliquen de forma práctica todo lo aprendido, desde el mapeo de rutas (endpoints) hasta la conexión con el frontend. La clave es que intenten construir esta aplicación **desde cero**, enfrentándose a los problemas y celebrando cada solución.

### 🌟 La Aplicación: ScreenMatch - Frases Clásicas

Vamos a desarrollar una aplicación **frontend** (similar a nuestro ScreenMatch original) que, en lugar de mostrar series, presentará **frases clásicas de películas y series de forma aleatoria**.

Cada vez que el usuario haga clic en un botón, una nueva frase aparecerá, revelando:
- La frase en sí.
- El título de la película o serie a la que pertenece.
- El personaje que la pronunció.
- Un póster representativo.

**Ejemplos de frases aleatorias que podrías ver:**
- "Que la fuerza te acompañe" (Star Wars, por Obi-Wan Kenobi)
- "Los Amigos No Mienten" (Stranger Things, por Eleven)
- ¡Y muchas más de tus favoritas!

### 💡 Arquitectura y Datos

A diferencia de proyectos anteriores, **no vamos a consumir una API externa**. En su lugar, tendremos nuestra **propia base de datos interna** donde almacenaremos estas frases y sus detalles (póster, título, frase, personaje). Esto nos permitirá controlar los datos que presentamos y reforzar el trabajo con la capa de persistencia.

La estructura de trabajo será similar a lo que ya hemos hecho, pero esta vez, seremos los creadores de los datos que la aplicación mostrará.

---

## 🛠️ Cómo Empezar (Tu Propuesta)

La invitación es clara:
1.  Ve al **Spring Initializer** y crea tu proyecto desde cero.
2.  Configura tu propia base de datos (se recomienda PostgreSQL, como en el curso).
3.  Implementa la lógica necesaria para almacenar y recuperar estas frases aleatoriamente.
4.  Conecta tu backend con un frontend (puede ser simple HTML/JS para empezar).

No te preocupes si encuentras dificultades. Esa es la idea: ¡que te rompas un poco la cabeza! Cuando sientas que ya no encuentras una solución, entonces podrás consultar las propuestas de resolución para acompañar el proceso. Lo importante es que primero intentes resolverlo por tu cuenta para consolidar el aprendizaje.

¡Cada uno tiene una perspectiva diferente, y lo valioso es la puesta en práctica!

---

# 🚀 Puesta en Marcha

Para ejecutar este proyecto después de clonarlo y configurarlo:

1.  **Clonar el Repositorio:**
    ```bash
    git clone [https://github.com/stone_djjh/Java-Alura.git](https://github.com/stone_djjh/Java-Alura.git)
    cd Java-Alura
    ```

2.  **Cambiar a la Rama del Proyecto:**
    Este proyecto se desarrolla en la rama `creando-tu-primera-API-y-conectandola-al-Front-End`.
    ```bash
    git checkout creando-tu-primera-API-y-conectandola-al-Front-End
    cd screenmatch2086 # Navega a la carpeta específica del proyecto Spring Boot
    ```

3.  **Configurar la Base de Datos:**
    Asegúrate de tener PostgreSQL instalado y una base de datos creada (ej. `alura_frase`).
    Las tablas serán generadas automáticamente por JPA/Hibernate al iniciar la aplicación.
    **Importante:** Añade tus frases favoritas directamente a la base de datos para que la aplicación tenga contenido.

4.  **Configurar Variables de Entorno (¡Crucial para la seguridad!):**
    Asegúrate de que tu `application.properties` está configurado para usar variables de entorno para las credenciales de la base de datos y cualquier API externa (si decides añadirla).
    Define las siguientes variables de entorno en tu sistema operativo:
    -   `DB_HOST`: Host y puerto de tu BD (ej. `localhost:5432`)
    -   `DB_NAME`: Nombre de tu base de datos (ej. `alura_frase`)
    -   `DB_PASSWORD`: Contraseña de tu usuario de base de datos
    -   (Opcional) `OPENAI_API_KEY`: Si integras alguna API de IA para generar frases, etc.

5.  **Construir y Ejecutar el Proyecto:**
    Desde la carpeta del proyecto Spring Boot (`screenmatch2086`):

    Usando **Maven**:
    ```bash
    mvn clean install
    mvn spring-boot:run
    ```

    O directamente desde tu IDE (IntelliJ IDEA, Eclipse) ejecutando la clase principal `Screenmatch2086Application`.


---

## 🌐 Endpoints de Ejemplo (Backend)

Una vez que el servidor esté corriendo (normalmente en `http://localhost:8080`), podrás acceder a los siguientes *endpoints* (ejemplo para obtener una frase aleatoria):

-   `GET /series/frases`

---

¡Que la fuerza te acompañe en este desafío! ¡Nos vemos en los próximos videos!