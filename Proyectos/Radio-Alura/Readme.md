# 🎧 Proyecto Final: Aplicación de Reproducción de Audio 🎶

Este proyecto es la culminación del curso "Java Orientado a Objetos" de Alura Latam, diseñado para consolidar los conocimientos adquiridos a lo largo del módulo. La propuesta principal fue desarrollar una aplicación de reproducción de audio, capaz de gestionar diferentes tipos de contenido como canciones y podcasts.

---

## 🎯 Objetivos del Proyecto

El propósito de este proyecto fue aplicar y reforzar los siguientes conceptos fundamentales de la Programación Orientada a Objetos (POO):

* **Herencia:** Modelar una jerarquía de clases donde una superclase `Audio` define características comunes, y subclases como `Cancion` y `Podcast` heredan y especializan esos comportamientos.
* **Encapsulamiento:** Proteger la integridad de los datos de las clases mediante el uso de atributos privados y métodos `getters` y `setters` para el acceso controlado.
* **Polimorfismo:** Utilizar referencias de la superclase `Audio` para manipular objetos de sus subclases (`Cancion`, `Podcast`), demostrando cómo un objeto puede comportarse de diferentes maneras según su tipo real.
* **Sobreescritura de Métodos (`@Override`):** Implementar versiones específicas de métodos heredados en las subclases para adaptar su funcionalidad (ej., calcular clasificación, manejar reproducciones o "me gusta" de manera particular).
* **Anotaciones:** Comprender y aplicar anotaciones como `@Override` para mejorar la seguridad del código en tiempo de compilación y su legibilidad.

---

## 💻 Modelo de la Aplicación

La aplicación se construyó siguiendo un modelado similar al visto en el curso, con una estructura de clases que refleja la jerarquía de contenidos de audio:

### Clase Principal (`Audio`)
Sirve como la superclase base para todo contenido reproducible.
* **Atributos sugeridos:** `titulo`, `duracionEnMinutos`, `totalReproducciones`, `cantidadMeGusta`, `clasificacion`.
* **Métodos sugeridos:** `meGusta()`, `reproduce()`, `getClasificacion()`, además de `getters` y `setters` para sus atributos.

### Subclases
Especializaciones de la clase `Audio` para diferentes tipos de contenido.
* **`Cancion`:** Hereda de `Audio`. Puede incluir atributos específicos como `artista`, `album`, `genero`.
* **`Podcast`:** Hereda de `Audio`. Puede incluir atributos específicos como `presentador`, `descripcion`, `temporada`, `episodio`.

---

## 🚀 Funcionalidades Implementadas (Ejemplos)

* Reproducción de audio (`reproduce()`): Incrementa el contador de reproducciones.
* Dar "Me Gusta" (`meGusta()`): Incrementa el contador de likes.
* Cálculo de Clasificación: Un método para determinar la popularidad del audio basado en reproducciones y likes.

---

## 🛠️ Tecnologías Utilizadas

* **Lenguaje:** Java
* **IDE:** IntelliJ IDEA
* **Conceptos POO:** Herencia, Encapsulamiento, Polimorfismo, Sobreescritura de Métodos, Interfaces, Anotaciones.

---

## 🔗 Repositorio Principal

Este proyecto es parte de un repositorio más grande que documenta mi viaje de aprendizaje en Java con Alura Latam. Puedes ver el repositorio completo aquí:
[Mi Viaje de Programación Java](https://github.com/stonedjjh/Java-Alura)

---

**© 2025 Daniel Jiménez / stonedjjh**