# 🛡️ Spring Boot 3: Aplica las Mejores Prácticas y Protege una API REST 🛡️

¡Bienvenidos al segundo curso de la formación de Spring Boot 3! En esta etapa, nos sumergimos en la **aplicación de buenas prácticas y la protección de APIs REST**, construyendo sobre la base sólida establecida en el curso anterior. Mi nombre es Bruno Darío Fernández Ederbach y fui el instructor que me guio a través de este importante viaje.

---

## 📚 Estructura del Repositorio y Contenido

Este módulo de aprendizaje se aloja en una nueva rama dedicada, asegurando un historial de _commits_ claro y permitiendo una exploración detallada de las técnicas avanzadas en seguridad y optimización de APIs REST.

### 💡 Rama de Curso Específico

`aplique-las-mejores-practicas-y-proteja-una-API-Rest`:

- **Descripción**: Esta rama cubre las mejores prácticas para APIs REST, el manejo de errores, y la implementación de mecanismos robustos de autenticación y autorización utilizando Spring Security y JSON Web Tokens (JWT). Es la continuación directa del proyecto desarrollado en el curso anterior de Spring Boot 3.
- **Ir a la rama**: `git checkout aplique-las-mejores-practicas-y-proteja-una-API-Rest`

---

## 🚀 Requisitos del Curso

Para aprovechar al máximo este curso, es fundamental haber completado el curso anterior de Spring Boot 3. En ese primer curso, se desarrolló la base de una API REST que continuaremos expandiendo y protegiendo aquí. Abordamos temas como:

- Desarrollo de una API REST desde cero con Spring Initializer.
- Implementación de operaciones CRUD para la entidad `Médico`.
- Validaciones con Bean Validation.
- Paginación y ordenación de datos devueltos al cliente.

---

## ✨ Habilidades y Aprendizajes Clave Adquiridos

En este curso, he consolidado y expandido mis habilidades en:

### Buenas Prácticas en el Desarrollo de APIs REST

- **Estandarización de Respuestas:** Aprender a estandarizar los retornos de los controladores de la API para ofrecer respuestas consistentes y predecibles al cliente.
- **Códigos HTTP:** Uso correcto y aplicación de los códigos de estado HTTP para comunicar adecuadamente el resultado de las operaciones de la API.
- **Tratamiento de Errores:** Gestión avanzada de excepciones en Spring Boot para devolver al usuario final solo los datos relevantes en caso de errores, mejorando la experiencia del consumidor de la API.

### Seguridad y Autenticación en APIs REST

- **Spring Security:** Integración del módulo Spring Security al proyecto para fortalecer la seguridad de la aplicación.
- **Mecanismos de Autenticación:** Implementación de un sistema de inicio de sesión y autenticación para restringir el acceso a la API.
- **Control de Acceso (Autorización):** Establecimiento de reglas de autorización para determinar qué usuarios pueden acceder a qué recursos o funcionalidades de la API.
- **JSON Web Tokens (JWT):** Utilización de JWT como un mecanismo seguro para controlar y verificar el acceso a la API, permitiendo un flujo de autenticación sin estado.

---

## 🛠️ Tecnologías y Herramientas Utilizadas

- **Lenguaje**: Java
- **Framework**: Spring Boot 3, Spring Web, Spring Data JPA, **Spring Security**
- **Base de Datos**: MySQL
- **Herramienta de Migraciones**: Flyway
- **Herramienta de Construcción**: Maven
- **IDE**: IntelliJ IDEA
- **Control de Versiones**: Git & GitHub
- **Cliente REST**: Insomnia (para probar la API)

---

## ⚙️ Configuración para Ejecutar la Aplicación

Para poner en marcha la aplicación localmente:

1.  Asegúrate de estar en la rama correcta (`aplique-las-mejores-practicas-y-proteja-una-API-Rest`).
2.  Asegúrate de tener una base de datos MySQL configurada y sus credenciales en `application.properties` (o `application.yaml`).
3.  **Construye el proyecto con Maven**:
    ```bash
    mvn clean install
    ```
4.  **Ejecuta la aplicación Spring Boot**:
    ```bash
    mvn spring-boot:run
    ```
    La API estará disponible en `localhost:8080` (o el puerto configurado).

---

## 📞 Contacto

No dudes en contactarme si tienes alguna pregunta o comentario sobre este proyecto o mi progreso en Java.

[LinkedIn](https://www.linkedin.com/in/daniel-jimenez-88a2a293/)

---

© 2025 [Daniel Jiménez / stonedjjh]
