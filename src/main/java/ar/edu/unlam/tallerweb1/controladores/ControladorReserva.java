package ar.edu.unlam.tallerweb1.controladores;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ar.edu.unlam.tallerweb1.modelo.Reserva;
import ar.edu.unlam.tallerweb1.servicios.ServicioReserva;
import ar.edu.unlam.tallerweb1.servicios.ServicioSucursal;
import ar.edu.unlam.tallerweb1.servicios.ServicioVehiculo;

@Controller
public class ControladorReserva {
	
	@Inject
	private ServicioVehiculo servicioVehiculo;
	@Inject
	private ServicioReserva servicioReserva;
	@Inject
	private ServicioSucursal servicioSucursal;
	
	@RequestMapping("/reserva")
	public ModelAndView irAReserva() {
		ModelMap modelo = new ModelMap();
		Reserva reserva = new Reserva();
		modelo.put("reserva", reserva);
		return new ModelAndView("reserva", modelo);
	}
	

	
	@RequestMapping("/nueva-reserva")
	public ModelAndView nuevoReserva(HttpServletRequest request){

				ModelMap modelo = new ModelMap();
				modelo.put("sucursales", servicioSucursal.listarSucursales());
				modelo.put("vehiculos", servicioVehiculo.listarVehiculos());

				return new ModelAndView("FormularioReserva", modelo);
			
	}
	
	@RequestMapping(path="/guardar-reserva", method=RequestMethod.POST)
	public ModelAndView guardarComic(@RequestParam (required=false, value="idReserva") Integer idReserva, @RequestParam (value="sucursal") Integer fkSucursalR, @RequestParam (value="costoOrigen") Double costoOrigen,
			@RequestParam (value="vehiculo") Integer fkVehiculo,
			HttpServletRequest request){


		servicioReserva.guardarReserva(idReserva, costoOrigen, fkSucursalR, fkVehiculo);

		return new ModelAndView("redirect:/index?mensaje=guardado.");
	}
	
}//fin