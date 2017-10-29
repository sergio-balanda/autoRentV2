package ar.edu.unlam.tallerweb1.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Vehiculo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String patente;
	private String marca;
	private String nombre;
	private String imagen;
	private Integer capacidadPasajeros;
	private Integer capacidadValijas;
	private Integer kilometraje;



	public Vehiculo() {
		super();
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getPatente() {
		return patente;
	}



	public void setPatente(String patente) {
		this.patente = patente;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getImagen() {
		return imagen;
	}



	public void setImagen(String imagen) {
		this.imagen = imagen;
	}



	public Integer getCapacidadPasajeros() {
		return capacidadPasajeros;
	}



	public void setCapacidadPasajeros(Integer capacidadPasajeros) {
		this.capacidadPasajeros = capacidadPasajeros;
	}



	public Integer getCapacidadValijas() {
		return capacidadValijas;
	}



	public void setCapacidadValijas(Integer capacidadValijas) {
		this.capacidadValijas = capacidadValijas;
	}



	public Integer getKilometraje() {
		return kilometraje;
	}



	public void setKilometraje(Integer kilometraje) {
		this.kilometraje = kilometraje;
	}


	

}