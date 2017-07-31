package io.data.model;

import org.springframework.data.annotation.Id;

/**
 * @author Empleado
 *
 */
public class Persona
{

	@Id
	public Long id;

	/**
	 * 
	 */
	private String nombre = null;
	private String profesion = null;

	/**
	 * 
	 */
	public Persona()
	{
	}

	/**
	 * @param id
	 * @param nombre
	 * @param profesion
	 */
	public Persona(Long id, String nombre, String profesion)
	{
		super();
		this.id = id;
		this.nombre = nombre;
		this.profesion = profesion;
	}

	/**
	 * @return the id
	 */
	public Long getId()
	{
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id)
	{
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre()
	{
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	/**
	 * @return the profesion
	 */
	public String getProfesion()
	{
		return profesion;
	}

	/**
	 * @param profesion
	 *            the profesion to set
	 */
	public void setProfesion(String profesion)
	{
		this.profesion = profesion;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Persona [id=" + id + ", nombre=" + nombre + ", profesion=" + profesion + "]";
	}

}
