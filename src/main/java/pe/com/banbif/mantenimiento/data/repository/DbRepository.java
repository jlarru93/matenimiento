package pe.com.banbif.mantenimiento.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import pe.com.banbif.mantenimiento.data.entity.Db;

public interface DbRepository  extends JpaRepository<Db, Integer> {

	}
