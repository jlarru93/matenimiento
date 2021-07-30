package pe.com.banbif.mantenimiento.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.banbif.mantenimiento.data.entity.Db;
import pe.com.banbif.mantenimiento.data.entity.Tabla;

import java.util.List;

public interface TablaRepository extends JpaRepository<Tabla, Integer> {

    @Query(value = "SELECT TBL.ID_DB,TBL.NOMBRE_TABLA,TBL.FLAG_ELIMINAR_FILA,COL.* FROM MAN_COLUMNA COL INNER JOIN MAN_TABLA TBL ON COL.ID_TABLA=TBL.ID_TABLA WHERE TBL.ID_TABLA=?1", nativeQuery = true)
    List<Tabla> getColumnByTable(Integer id);
}
