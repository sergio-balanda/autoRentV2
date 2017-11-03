package ar.edu.unlam.tallerweb1;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


import org.hibernate.criterion.Restrictions;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.modelo.Reserva;
import ar.edu.unlam.tallerweb1.modelo.Vehiculo;

public class TestCriterias extends SpringTest{

	@Test
	@Transactional
	@Rollback
	public void test() {
		
		Vehiculo vUno = new Vehiculo();
		vUno.setIdVehiculo(1);
		vUno.setMarca("Toyota");
		Vehiculo vDos = new Vehiculo();
		vDos.setIdVehiculo(2);
		vDos.setMarca("Toyota");
		Vehiculo vTres = new Vehiculo();
		vTres.setIdVehiculo(3);
		vTres.setMarca("Ford");
		Vehiculo vCuatro = new Vehiculo();
		vCuatro.setIdVehiculo(4);
		vCuatro.setMarca("Ford");
		
		Reserva r1 = new Reserva();
		r1.setIdReserva(1);
		r1.setFkVehiculoR(vTres);
		r1.setFechaInicio(new Date( "03/11/2017"));
		r1.setFechaFin(new Date( "04/11/2017"));
		Reserva r2 = new Reserva();
		r2.setIdReserva(2);
		r2.setFkVehiculoR(vCuatro);
		r2.setFechaInicio(new Date( "03/11/2017"));
		r2.setFechaFin(new Date( "04/11/2017"));
 		
		getSession().save(vUno);
		getSession().save(vDos);
		getSession().save(vTres);
		getSession().save(vCuatro);
		getSession().save(r1);
		getSession().save(r2);
		
		System.out.println("///////////////////");
		System.out.println(vUno.toString());
		System.out.println("///////////////////");
		System.out.println(r1.toString());
		System.out.println("////////lista//////////");
		
		Date d =  new SimpleDateFormat("yyyy-MM-dd").parse("2014-10-12");
		Date h =  new SimpleDateFormat("yyyy-MM-dd").parse("2014-10-12");
		

		List<Reserva> listaDeReserva = getSession().createCriteria(Reserva.class,"rv")
				.createAlias("rv.fkVehiculoR", "vehiculo")
				.add(Restrictions.between("rv.FechaInicio", d, h))
				.list();

		
		//System.out.println(listaDeReserva.get(0).getIdReserva());
		assertThat(listaDeReserva).hasSize(2);
	}

}
