package ar.edu.unlam.tallerweb1.dao;

import java.util.Date;
import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.Vehiculo;

public interface VehiculoDao {
	
	Vehiculo buscarVehiculos(Long id);
	List<Vehiculo> listarVehiculos();
	List<Vehiculo> listarVehiculosXPasajeros(Integer cant, String sucursal, String fdesde , String fhasta );
	Integer maxPasajeros();
	void guardarNuevoVehiculo(Vehiculo vehiculo);

}
