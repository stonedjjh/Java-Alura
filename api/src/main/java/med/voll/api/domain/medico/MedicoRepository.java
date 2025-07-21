package med.voll.api.domain.medico;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Range;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;

public interface MedicoRepository extends JpaRepository<Medico, Long> {

    Page<Medico> findByActivoTrue(Pageable paginacion);

    /*Se define el metodo elegirMedicoAleatorioDisponibleEnLaFecha
    que permite buscar un medico activo de una especialidad dada
    en una fecha especificada usando el lenguaje de JPQL
    * */
    @Query("""
            select m from Medico m
            where
            m.activo = true
            and
            m.especialidad = :especialidad
            and m.id not in(
                select c.medico.id from Consulta c
                where
                c.fecha = :fecha
            )
            order by rand()
            limit 1
            """)
    Medico elegirMedicoAleatorioDisponibleEnLaFecha(Especialidad especialidad, LocalDateTime fecha);



    @Query("""
            select m.activo
            from Medico m
            where
            m.id = :idMedico
            """)
    boolean findActivoById(Long idMedico);



}
