package ar.edu.unlam.tallerweb1.servicios;

import java.util.Date;
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
	public Vehiculo buscarhiculos(Integer idVehiculo) {
		return vehiculoDao.buscarVehiculos(idVehiculo);
	}

	@Override
	public Vehiculo buscarfkSucursalV(Integer fkSucursalV) {
		return vehiculoDao.buscarfkSucursalV(fkSucursalV);
	}
	//new
	@Override
	public List<Vehiculo> listarVehiculos() {
		return vehiculoDao.listarVehiculos();
	}
	
}