package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ar.edu.unlam.tallerweb1.dao.VehiculoDao;
import ar.edu.unlam.tallerweb1.modelo.Vehiculo;

@Service("servicioVehiculo")
@Transactional
public class ServicioVehiculoImpl implements ServicioVehiculo{
	
	@Inject
	private VehiculoDao vehiculoDao;
	
	@Override
	public List<Vehiculo> listarVehiculosXPasajeros(Integer cant, String sucursal, String fdesde , String fhasta ) {
		return vehiculoDao.listarVehiculosXPasajeros(cant, sucursal,fdesde,fhasta);
	}

	@Override
	public Integer maxPasajeros() {
		return vehiculoDao.maxPasajeros();
	}

	@Override
	public Vehiculo buscarhiculos(Long id) {
		return vehiculoDao.buscarVehiculos(id);
	}

	@Override
	public List<Vehiculo> listarVehiculos() {
		return vehiculoDao.listarVehiculos();
	}

	@Override
	public Vehiculo guardarVehiculo(Long id, String patente, String marca, String nombre, String imagen,
			Integer capacidadPasajeros, Integer capacidadValijas, Integer kilometraje) {
		Vehiculo vehiculo = null;

		if (id!=null) {
			vehiculo = vehiculoDao.buscarVehiculos(id);
		} else {
			vehiculo = new Vehiculo();
		}
		
		vehiculo.setPatente(patente);;
		vehiculo.setMarca(marca);
		vehiculo.setNombre(nombre);
		vehiculo.setImagen(imagen);
		vehiculo.setCapacidadPasajeros(capacidadPasajeros);
		vehiculo.setCapacidadValijas(capacidadValijas);
		vehiculo.setKilometraje(kilometraje);
		
		vehiculoDao.guardarNuevoVehiculo(vehiculo);

		
		return vehiculo;
	}
	
}