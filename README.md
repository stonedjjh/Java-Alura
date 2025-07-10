# 🚀 Java: Persistencia con Spring Data JPA 🚀

Este segmento del repositorio marca mi incursión profunda en la **persistencia de datos** y las **consultas avanzadas** en Java, utilizando el potente *framework* de **Spring Data JPA**. Es una continuación directa de mi progreso en el proyecto ScreenMatch, donde ahora el enfoque es dotar a la aplicación de capacidades robustas para interactuar con bases de datos.

---

## 📚 Estructura del Repositorio y Contenido

Manteniendo la organización, este nuevo módulo de aprendizaje reside en una rama dedicada, lo que permite un historial de *commits* claro y una exploración enfocada en las técnicas de persistencia.

---

### 💡 Rama de Curso Específico

`persistencia-de-datos-y-consultas-con-Spring-Data-JPA`:
* **Descripción**: Esta rama abarca los fundamentos y las técnicas avanzadas para manejar la persistencia de datos en aplicaciones Java con **Spring Data JPA**. Desde el mapeo de entidades hasta la realización de consultas complejas y la integración con APIs externas para enriquecer la aplicación.

* **Ir a la rama**: `git checkout persistencia-de-datos-y-consultas-con-Spring-Data-JPA`

---

## ✨ Habilidades y Aprendizajes Clave Adquiridos

En este curso, he consolidado y expandido mis habilidades en:

* **Spring Data JPA**: Dominio de los **repositorios** para operaciones CRUD simplificadas y personalizadas.
* **Mapeo Objeto-Relacional (ORM)**: Configuración y uso de JPA para mapear clases Java a tablas de base de datos.
* **Modelado de Relaciones**: Implementación de relaciones entre entidades (`@OneToOne`, `@OneToMany`, `@ManyToOne`, `@ManyToMany`).
* **Estrategias de Consulta**: Exploración de diversas formas de consultar la base de datos, incluyendo métodos derivados de nombres, `@Query` con JPQL y posiblemente SQL nativo.
* **Seguridad de Credenciales**: Uso de **variables de entorno** para gestionar de forma segura información sensible (ej. claves de base de datos, API Keys).
* **Integración de APIs**: Conexión e interacción con la **API de ChatGPT** para añadir funcionalidades inteligentes a la aplicación.

---

## 🛠️ Tecnologías y Herramientas Utilizadas

* **Lenguaje**: Java
* **Framework**: Spring Boot, Spring Data JPA
* **Base de Datos**: PostgreSQL (o H2 para desarrollo)
* **Herramienta de Construcción**: Maven
* **IDE**: IntelliJ IDEA (o tu IDE preferido)
* **Control de Versiones**: Git & GitHub
* **Servicios Externos**: API de ChatGPT

---

## 🚀 Cómo Navegar por Este Repositorio

Si ya tienes el repositorio clonado, simplemente puedes cambiar a esta rama:

1.  **Clonar el repositorio (si aún no lo has hecho)**:
    ```bash
    git clone https://github.com/stonedjjh/Java-Alura
    cd screenmatch
    ```
2.  **Cambiar a la rama del curso**:
    ```bash
    git checkout persistencia-de-datos-y-consultas-con-Spring-Data-JPA
    ```
3.  **Explora el código**: Navega por los directorios `src/main/java/com/aluracursos/screenmatch` para encontrar las entidades, repositorios y servicios relacionados con la persistencia.

---

## ⚙️ Configuración para Ejecutar la Aplicación

Para poner en marcha la aplicación localmente:

1.  Asegúrate de estar en la rama correcta (`persistencia-de-datos-y-consultas-con-Spring-Data-JPA`).
2.  **Configura tus variables de entorno**: Es crucial para la seguridad de tus credenciales. Puedes crear un archivo `.env` o configurarlas directamente en tu sistema.
    Ejemplo de `.env`:
    ```
    DB_URL=jdbc:postgresql://localhost:5432/screenmatch
    DB_USERNAME=tu_usuario
    DB_PASSWORD=tu_contrasena
    OPENAI_API_KEY=tu_clave_api_chatgpt
    ```
    Alternativamente, puedes usar el `application.properties` en `src/main/resources` con valores por defecto o variables de entorno:
    ```properties
    spring.datasource.url=${DB_URL:jdbc:postgresql://localhost:5432/screenmatch}
    spring.datasource.username=${DB_USERNAME:tu_usuario}
    spring.datasource.password=${DB_PASSWORD:tu_contrasena}
    openai.api.key=${OPENAI_API_KEY:tu_clave_api_chatgpt}
    ```
3.  **Construye el proyecto con Maven**:
    ```bash
    mvn clean install
    ```
4.  **Ejecuta la aplicación Spring Boot**:
    ```bash
    mvn spring-boot:run
    ```

---

## 📞 Contacto

No dudes en contactarme si tienes alguna pregunta o comentario sobre este proyecto o mi progreso en Java.

[LinkedIn](https://www.linkedin.com/in/daniel-jimenez-88a2a293/)

---
© 2025 [Daniel Jiménez / stonedjjh]