package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;
import ar.edu.unlam.tallerweb1.modelo.Sucursal;

public interface ServicioSucursal {
	
	public List<Sucursal> obtenerSucursales();
	//new
	public Sucursal buscarSucursal(Integer idSucursal);
	public List<Sucursal> listarSucursales();
}
