package ar.edu.unlam.tallerweb1.controladores;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMethod;


import ar.edu.unlam.tallerweb1.modelo.Vehiculo;
import ar.edu.unlam.tallerweb1.servicios.ServicioVehiculo;

@Controller
public class ControladorFront {

	@Inject
	private ServicioVehiculo servicioVehiculo;

	@RequestMapping(path="/")
	public ModelAndView inicio() {
		return new ModelAndView("index");
	}

	//ACA SE LISTA TODO
	@RequestMapping("/listas")
	public ModelAndView irAListarTodo(){
		ModelMap modelo = new ModelMap();
		modelo.put("v", servicioVehiculo.listarVehiculos());
		return new ModelAndView("listas",modelo);
	}
	
	@RequestMapping("/registrar-vehiculo")
	public ModelAndView nuevoVehiculo(HttpServletRequest request){
				ModelMap modelo = new ModelMap();
				return new ModelAndView("registrar-vehiculo", modelo);
	}
	
	@RequestMapping(path = "/registro-usuario", method = RequestMethod.GET)
	public ModelAndView irARegistroUsuario() {
		ModelMap modelo = new ModelMap();
		Vehiculo vehiculo = new Vehiculo();

		modelo.put("vehiculo", vehiculo);
		return new ModelAndView("registrar-vehiculo", modelo);
	}
	
	
	@RequestMapping(path="registrar-vehiculo",method=RequestMethod.POST)
	public ModelAndView registrarVehiculo(@RequestParam (required=false, value="id") Long id,
			@RequestParam (required=false, value="patente") String patente,
			@RequestParam (required=false, value="marca") String marca,
			@RequestParam (required=false, value="nombre") String nombre,
			@RequestParam (required=false, value="imagen") String imagen,
			@RequestParam (required=false, value="capacidadPasajeros") Integer capacidadPasajeros,
			@RequestParam (required=false, value="kilometraje") Integer kilometraje,
			@RequestParam (required=false, value="capacidadValijas") Integer capacidadValijas,
			HttpServletRequest request
			) {
		
		servicioVehiculo.guardarVehiculo(id, patente, marca, nombre, imagen, capacidadPasajeros, capacidadValijas, kilometraje);
		
		return new ModelAndView("redirect:/listas?mensaje=guardado.!!!");
		
	}
}