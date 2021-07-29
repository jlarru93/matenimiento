package pe.com.banbif.mantenimiento.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import pe.com.banbif.mantenimiento.data.entity.Tabla;

public interface TablaRepository  extends JpaRepository<Tabla, Integer> {
	}
