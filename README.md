# 🚀 Java: Creación de API REST con Spring Framework 🚀

Este segmento del repositorio marca mi incursión en la **creación de API RESTful** utilizando el potente **Spring Framework** y su **conexión con una aplicación Front-End**. Es una continuación directa de mi progreso en el proyecto ScreenMatch, donde ahora el enfoque es dotar a la aplicación de capacidades para exponer datos y funcionalidades a través de servicios web, interactuando directamente con una interfaz de usuario.

---

## 📚 Estructura del Repositorio y Contenido

Manteniendo la organización, este nuevo módulo de aprendizaje reside en una rama dedicada, lo que permite un historial de *commits* claro y una exploración enfocada en las técnicas de desarrollo de API REST.

---

### 💡 Rama de Curso Específico

`creando-tu-primera-API-y-conectandola-al-Front-End`:
* **Descripción**: Esta rama abarca los fundamentos y las técnicas para construir API RESTful en aplicaciones Java con **Spring Framework**, siguiendo el temario del **"Curso de Spring Boot 3: desarrolla una API REST en Java"**. Desde la comprensión de la arquitectura MVC y el mapeo de rutas hasta la implementación de buenas prácticas con DTOs, el manejo de errores CORS.
* **Ir a la rama**: `git checkout creando-tu-primera-API-y-conectandola-al-Front-End`

---

## ✨ Habilidades y Aprendizajes Clave Adquiridos

En este curso (parte del **"Curso de Spring Boot 3: desarrolla una API REST en Java"**), he consolidado y expandido mis habilidades en:

### Desarrollo de API REST con Spring Boot
* Creación desde cero de una API REST en Java con **Spring Boot**.
* Comprensión y aplicación de la arquitectura **Modelo-Vista-Controlador (MVC)** en el desarrollo web.
* Mapeo de rutas y definición de *endpoints* utilizando anotaciones de Spring (`@RestController`, `@GetMapping`, `@PostMapping`, `@PutMapping`, `@DeleteMapping`, etc.).
* Manejo de diferentes tipos de **solicitudes HTTP (GET, POST, PUT, DELETE)** para operaciones CRUD completas.
* Conexión y suministro de datos desde el back-end hacia aplicaciones front-end.
* Manejo y resolución de problemas de **CORS (Cross-Origin Resource Sharing)** para la disponibilidad de datos.

### Persistencia y Base de Datos
* Desarrollo de operaciones **CRUD (Create, Read, Update, Delete)** utilizando la base de datos **MySQL**.
* Uso de **Spring Data JPA** para la persistencia de datos y la simplificación de las interacciones con la base de datos.
* Implementación de **Flyway** como herramienta de migraciones para la gestión de la evolución del esquema de la base de datos de la API.

### Optimización y Buenas Prácticas de API
* Implementación de **Data Transfer Objects (DTOs)** y otros conceptos para un diseño de API robusto y eficiente.
* Realización de **validaciones** de datos utilizando **Bean Validation** para asegurar la integridad de la información.
* Implementación de **paginación** de los datos de la API para la gestión eficiente de grandes conjuntos de datos.

---

## 🛠️ Tecnologías y Herramientas Utilizadas

* **Lenguaje**: Java
* **Framework**: Spring Boot, Spring Web
* **Base de Datos**: MySQL
* **Herramienta de Migraciones**: Flyway
* **Herramienta de Construcción**: Maven
* **IDE**: IntelliJ IDEA (o tu IDE preferido)
* **Control de Versiones**: Git & GitHub

---

## 🚀 Cómo Navegar por Este Repositorio

Si ya tienes el repositorio clonado, simplemente puedes cambiar a esta rama:

1.  **Clonar el repositorio (si aún no lo has hecho)**:
    ```bash
    git clone [https://github.com/stonedjjh/Java-Alura.git](https://github.com/stonedjjh/Java-Alura.git)
    cd Java-Alura
    ```
2.  **Cambiar a la rama del curso**:
    ```bash
    git checkout creando-tu-primera-API-y-conectandola-al-Front-End    
    ```
3.  **Explora el código**: Navega por los directorios `src/main/java/com/aluracursos/api` para encontrar los controladores, DTOs y servicios relacionados con la API.

---

## ⚙️ Configuración para Ejecutar la Aplicación

Para poner en marcha la aplicación localmente:

1.  Asegúrate de estar en la rama correcta (`creando-tu-primera-API-y-conectandola-al-Front-End`).
2.  Asegúrate de tener una base de datos MySQL configurada y sus credenciales en las variables de entorno o `application.properties`.
3.  **Construye el proyecto con Maven**:
    ```bash
    mvn clean install
    ```
4.  **Ejecuta la aplicación Spring Boot**:
    ```bash
    mvn spring-boot:run
    ```
    La API estará disponible en `localhost:8081` (o el puerto configurado en `application.properties`).

---

## 📞 Contacto

No dudes en contactarme si tienes alguna pregunta o comentario sobre este proyecto o mi progreso en Java.

[LinkedIn](https://www.linkedin.com/in/daniel-jimenez-88a2a293/)

---
© 2025 [Daniel Jiménez / stonedjjh]