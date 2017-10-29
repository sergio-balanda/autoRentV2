package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.Vehiculo;

public interface  ServicioVehiculo {
	
	public Vehiculo buscarhiculos(Long id);
	public List<Vehiculo> listarVehiculos();
	public List<Vehiculo> listarVehiculosXPasajeros(Integer cant, String sucursal, String fdesde , String fhasta );
	public Integer maxPasajeros();
	public Vehiculo guardarVehiculo(Long id, String patente, String marca, String nombre, String imagen, Integer capacidadPasajeros, Integer capacidadValijas, Integer kilometraje);

	
}
