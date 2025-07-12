package com.aluracursos.screenmatch2086.repository;

import com.aluracursos.screenmatch2086.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * Interfaz de repositorio para la entidad Frase.
 *
 * Extender JpaRepository proporciona automáticamente métodos CRUD (Create, Read, Update, Delete)
 * y funcionalidades de paginación y ordenamiento para la entidad Frase.
 * Spring Data JPA se encarga de implementar estos métodos en tiempo de ejecución,
 * evitando que tengamos que escribir boilerplate code para operaciones comunes
 * de base de datos.
 *
 * Los parámetros de JpaRepository son:
 * - Frase: El tipo de la entidad (tu clase de modelo).
 * - Long: El tipo de la clave primaria de la entidad Frase (en este caso, 'id' que es de tipo Long).
 */
public interface FraseRepository extends JpaRepository<Frase, Long> {
    @Query("select f from Frase f order by function('RANDOM') limit 1")
    public Frase obtenerFraseAleatoria();
}
