package pe.com.banbif.mantenimiento.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import pe.com.banbif.mantenimiento.data.entity.Db;

import java.util.List;
import java.util.Optional;

public interface DbRepository  extends JpaRepository<Db, Integer> {
	@Query(value = "SELECT db.id_servidor,db.nombre_db,tbl.* FROM man_db db INNER JOIN man_tabla tbl ON db.id_db=tbl.id_db WHERE db.id_db=?1", nativeQuery = true)
	Optional<Db> getTableByDb(Integer id);

	}
