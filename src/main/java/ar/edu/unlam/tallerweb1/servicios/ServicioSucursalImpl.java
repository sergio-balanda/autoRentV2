package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ar.edu.unlam.tallerweb1.dao.SucursalDao;
import ar.edu.unlam.tallerweb1.modelo.Sucursal;

@Service("servicioSucursal")
@Transactional
public class ServicioSucursalImpl implements ServicioSucursal{

	@Inject
	private SucursalDao sucursalDao;
	
	@Override
	public List<Sucursal> obtenerSucursales() {
		return sucursalDao.obtenerSucursales();
	}
	//NEW
	@Override
	public Sucursal buscarSucursal(Integer idSucursal) {
		return sucursalDao.buscarSucursal(idSucursal);
	}
	@Override
	public List<Sucursal> listarSucursales() {
		return sucursalDao.listarSucursales();
	}

}