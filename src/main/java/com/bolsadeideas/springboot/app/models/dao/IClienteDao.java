package com.bolsadeideas.springboot.app.models.dao;

//import java.util.List;
import com.bolsadeideas.springboot.app.models.entity.Cliente;

//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.bolsadeideas.springboot.app.models.entity.Cliente;

  //cambiamos CrudRepository por PagingAndSortingRepository para la paginacion
    public interface IClienteDao extends PagingAndSortingRepository<Cliente, Long> {

        //public interface IClienteDao extends CrudRepository<Cliente, Long> {
        //}
            //se puede hacer consulta perosnalizadas


/*

public interface IClienteDao {

 //se comenta porque se quito la clase ClienteDaoImpl
    para hacer un CrudRepository
	public List<Cliente> findAll();

	public void save(Cliente cliente);
	
	public Cliente findOne(Long id);
	
	public void delete(Long id);
*/
}
