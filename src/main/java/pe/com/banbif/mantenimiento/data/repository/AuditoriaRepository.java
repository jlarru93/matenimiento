package pe.com.banbif.mantenimiento.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.com.banbif.mantenimiento.data.entity.Auditoria;


public interface AuditoriaRepository extends JpaRepository<Auditoria, Long> {

}
