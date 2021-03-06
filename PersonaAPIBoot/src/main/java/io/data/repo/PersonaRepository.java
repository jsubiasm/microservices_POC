package io.data.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.data.model.Persona;

/**
 * @author Empleado
 *
 */
public interface PersonaRepository extends MongoRepository<Persona, String>
{

	/**
	 * @param id
	 * @return
	 */
	public Persona findById(String id);

	/**
	 * @param nombre
	 * @return
	 */
	public List<Persona> findByNombre(String nombre);

	/**
	 * @param profesion
	 * @return
	 */
	public List<Persona> findByProfesion(String profesion);

}