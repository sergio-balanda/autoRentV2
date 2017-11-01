package ar.edu.unlam.tallerweb1.dao;



import javax.inject.Inject;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import ar.edu.unlam.tallerweb1.modelo.Reserva;

@Service("reservaDao")
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class ReservaDaoImpl implements ReservaDao{

	@Inject
	private SessionFactory sessionFactory;

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
	public void guardarReserva(Reserva reserva) {
		final Session session = sessionFactory.getCurrentSession();
			session.saveOrUpdate(reserva);
	}

	@Override
	public void guardarNuevaReserva(Reserva reserva) {
		final Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(reserva);
	}
	//new
	@Override
	public Reserva buscarReserva(Integer idReserva) {
		final Session session = sessionFactory.getCurrentSession();
		Reserva reserva = (Reserva) session.createCriteria(Reserva.class)
				.add(Restrictions.eq("idReserva", idReserva)).uniqueResult();
		return reserva;
	}
	
}