package med.voll.api.domain.consulta;

import org.springframework.data.jpa.repository.JpaRepository;
/**
 * Repositorio Spring Data JPA para la entidad Consulta.
 * Facilita operaciones CRUD automáticas para Consulta (ID de tipo Long).
 */
public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
}