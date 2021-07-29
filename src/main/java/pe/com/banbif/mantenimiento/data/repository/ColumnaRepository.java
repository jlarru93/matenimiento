package pe.com.banbif.mantenimiento.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import pe.com.banbif.mantenimiento.data.entity.Columna;


public interface ColumnaRepository extends JpaRepository<Columna, Integer> {
	

}
