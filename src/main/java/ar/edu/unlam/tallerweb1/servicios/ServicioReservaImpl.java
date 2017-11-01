package ar.edu.unlam.tallerweb1.servicios;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.dao.ReservaDao;
import ar.edu.unlam.tallerweb1.dao.SucursalDao;
import ar.edu.unlam.tallerweb1.dao.VehiculoDao;
import ar.edu.unlam.tallerweb1.modelo.Reserva;
import ar.edu.unlam.tallerweb1.modelo.Sucursal;
import ar.edu.unlam.tallerweb1.modelo.Vehiculo;

@Service("servicioReserva")
@Transactional
public class ServicioReservaImpl implements ServicioReserva {
	
	@Inject
	private SessionFactory sessionFactory;
	@Inject 
	ReservaDao reservaDao;
	@Inject 
	VehiculoDao vehiculoDao;
	@Inject 
	SucursalDao sucursalDao;
	
	@Override
	public Reserva guardarReserva(Integer idVehiculo, String sucursal , String fdsd , String fhst,Integer fkVehiculo,Integer fkSucursalV) {
		
		final Session session = sessionFactory.getCurrentSession();
		List<Sucursal> s = new ArrayList<>();
		Reserva reserva = new Reserva();		
		 // CAST de String To Date
		SimpleDateFormat formatodsd = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat formatohst = new SimpleDateFormat("yyyy-MM-dd");
		
		Date datedsd = new Date();
		try {
			datedsd = formatodsd.parse(fdsd);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Date datehst = new Date();
		try {
			datehst = formatohst.parse(fhst);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// -----------FIN CAST
		
		//Busco sucursal por ciudad
		s = session.createCriteria(Sucursal.class)
					  .add(Restrictions.eq("ciudad",sucursal))
					  .list();
		
		//Esto lo tengo que comentar porque si no me da NULLPOINTEREXEPTION
		//reserva.getFkVehiculo().setIdVehiculo(idVehiculo);
		//reserva.getFkSucursalR().setIdSucursal(s.get(0).getIdSucursal());
		if ( fkSucursalV!=null ) {
			reserva.setFkVehiculo(vehiculoDao.buscarfkSucursalV(fkSucursalV));
		}
		if ( fkVehiculo!=null ) {
			reserva.setFkVehiculo(vehiculoDao.buscarVehiculos(idVehiculo));
		}
		reserva.setFechaInicio(datedsd);
		reserva.setFechaFin(datehst);
		reserva.setCostoOrigen(0D);
		reservaDao.guardarReserva(reserva);
		return reserva;
	
	}
	//new
	@Override
	public Reserva guardarReserva(Integer idReserva, Double costoOrigen, Integer fkSucursalR, Integer fkVehiculo) {
		Reserva reserva = null;
		
		if ( idReserva!=null ) {
			reserva = reservaDao.buscarReserva(idReserva);
		} else {
			reserva = new Reserva();
		}
		
		reserva.setCostoOrigen(0D);
		if ( fkSucursalR!=null ) {
			reserva.setFkSucursal(sucursalDao.buscarSucursal(fkSucursalR));
		}
		if ( fkVehiculo!=null ) {
			reserva.setFkVehiculo(vehiculoDao.buscarVehiculos(fkVehiculo));
		}
		
		if ( idReserva!=null ) {
			reservaDao.guardarReserva(reserva);
		} else {
			reservaDao.guardarNuevaReserva(reserva);
		}
		
		return reserva;
	}
	
	@Override
	public Reserva buscarReserva(Integer idReserva) {
		return reservaDao.buscarReserva(idReserva);
	}

}