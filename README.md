# 📚 Practicando Java: Condicionales (if-else) 📚

Este repositorio contiene una serie de ejercicios prácticos en Java, enfocados en el uso de estructuras condicionales (`if`, `else if`, `else`). Estos ejercicios están diseñados para reforzar la comprensión y aplicación de la lógica condicional en la programación.

---

## 🚀 Estructura del Proyecto

El código está organizado de la siguiente manera:

-   **`condicionales/`**: Carpeta principal que contiene todos los ejercicios de este módulo.
    -   **`src/`**: Directorio de código fuente.
        -   **`com/cursosalura/condicionales/`**: Paquete Java donde se encuentran las clases.
            -   **`Funciones.java`**: Contiene métodos que implementan la lógica de cada ejercicio propuesto.
            -   **`Principal.java`**: Contiene el método `main` para ejecutar y probar cada uno de los ejercicios definidos en `Funciones.java`.

---

## ✨ Ejercicios Implementados

A continuación, se listan los ejercicios resueltos en este módulo:

### 1. **Par o Impar**
    * **Problema**: Determinar si un número dado es par o impar.
    * **Método**: `Funciones.parida(int numero)`
    * **Concepto clave**: Operador módulo (`%`), `if-else`.

### 2. **Estatus de Aprobación de Estudiante**
    * **Problema**: Determinar si un estudiante es aprobado, está en recuperación o reprobado según su promedio.
    * **Método**: `Funciones.estatusAprobacion(double nota)`
    * **Concepto clave**: `if-else if-else` para múltiples condiciones, rangos numéricos.

### 3. **Verificación de Acceso con Contraseña**
    * **Problema**: Verificar si una contraseña ingresada coincide con una predefinida.
    * **Método**: `Funciones.verificacionDeAcceso()`
    * **Concepto clave**: Comparación de `String` (`.equals()`), entrada de usuario (`Scanner`).

### 4. **Comparación de Números**
    * **Problema**: Comparar dos números enteros ingresados por el usuario e indicar cuál es mayor o si son iguales.
    * **Método**: `Funciones.compararNumeros()`
    * **Concepto clave**: `if-else if-else`, operadores de comparación (`>`, `<`).

### 5. **Calificación de Descuento en Compra**
    * **Problema**: Aplicar un 10% de descuento a una compra si el valor es igual o mayor a $100.00.
    * **Método**: `Funciones.calificarDescuento(double monto)`
    * **Concepto clave**: `if-else`, operaciones aritméticas.

### 6. **Día Hábil o No Hábil**
    * **Problema**: Determinar si un día de la semana es hábil o no (lunes a viernes son hábiles).
    * **Método**: `Funciones.diaHabil(String dia)`
    * **Concepto clave**: `boolean` como tipo de retorno, `equalsIgnoreCase()`, operadores lógicos (`||`).

### 7. **Verificación de Elegibilidad para Préstamo**
    * **Problema**: Verificar si un valor de préstamo está dentro de un rango permitido (1000 a 5000 dólares).
    * **Método**: `Funciones.verificarElegibilidad()`
    * **Concepto clave**: `if-else`, operadores lógicos (`&&`), rangos numéricos.

### 8. **Verificación de Triángulo**
    * **Problema**: Determinar si tres lados dados pueden formar un triángulo (la suma de dos lados debe ser mayor que el tercero).
    * **Método**: `Funciones.verificarTriangulo(double lado1, double lado2, double lado3)`
    * **Concepto clave**: Operadores lógicos (`&&`) para múltiples condiciones obligatorias.

### 9. **Verificación de Compatibilidad de Donante de Sangre**
    * **Problema**: Verificar si un donante cumple con criterios de edad y peso para donar sangre, indicando los motivos si no es compatible.
    * **Método**: `Funciones.verificarCompatibilidadDonante(int edad, double peso)`
    * **Concepto clave**: Combinación de `if` para múltiples condiciones de falla, construcción de mensajes dinámicos.

### 10. **Sistema de Seguridad de Acceso**
    * **Problema**: Permitir o denegar el acceso a un sistema basado en un código y un nivel de permiso, informando el motivo detallado.
    * **Método**: `Funciones.verificarAcceso(int codigoAcceso, int nivelPermiso)`
    * **Concepto clave**: `if-else` complejo con múltiples condiciones (`&&`, `||`), construcción de mensajes de error concatenados.

---

## ⚙️ Cómo Ejecutar

1.  Clona este repositorio: `git clone https://github.com/stonedjjh/Java-Alura/`
2.  Cambia a la rama de este módulo: `git checkout practicando-java-condicionales-if-else`
3.  Navega a la carpeta del módulo: `cd condicionales`
4.  Compila los archivos Java: `javac src/Principal.java src/com/cursosalura/condicionales/Funciones.java`
    *Alternativamente, si estás en IntelliJ o un IDE, la compilación se maneja automáticamente.*
5.  Ejecuta la clase principal (en el paquete por defecto): `java -cp src Principal`
---

© 2025 Daniel Jiménez / stonedjjh
