package ar.edu.unlam.tallerweb1.servicios;

import java.util.Date;
import java.util.List;
import ar.edu.unlam.tallerweb1.modelo.Vehiculo;

public interface  ServicioVehiculo {
	
	public Vehiculo buscarhiculos(Integer idVehiculo);
	public Vehiculo buscarfkSucursalV(Integer fkSucursalV);
	public List<Vehiculo> listarVehiculosXPasajeros(Integer cant, String sucursal, String fdesde , String fhasta );
	public Integer maxPasajeros();
	
	//new
	public List<Vehiculo> listarVehiculos();
	
}
