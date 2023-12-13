/*

   //quitamos esta clase porque se va implementar la intreface CrudRepository
   //y quitamos los metodos del iClienteDao

package com.bolsadeideas.springboot.app.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.bolsadeideas.springboot.app.models.entity.Cliente;

@Repository
public class ClienteDaoImpl implements IClienteDao {

	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@Override
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return em.createQuery("from Cliente").getResultList();
	}

	@Override
	public Cliente findOne(Long id) {
		return em.find(Cliente.class, id);
	}

	//jpa va a al base de datos y obtienen el id
	@Override
	public void save(Cliente cliente) {
		if (cliente.getId() != null && cliente.getId() > 0) {
			em.merge(cliente);  //el merge actualiza si exite el id
		} else {
			em.persist(cliente);  //el persist sino hay id inserta un nuevo cliente
		}
	}

	//delete optimizado
	@Override
	public void delete(Long id) {
		em.remove(findOne(id));
	}


	//@Override
	//public void delete1(Long id) {
	//	Cliente cliente = findOne(id);
	//	em.remove(cliente);
	//}


 }
*/