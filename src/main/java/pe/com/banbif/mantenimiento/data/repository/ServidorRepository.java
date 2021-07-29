package pe.com.banbif.mantenimiento.data.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import pe.com.banbif.mantenimiento.data.entity.Servidor;

public interface  ServidorRepository  extends JpaRepository<Servidor, Integer> {
	 
	

}
