package ar.edu.unlam.tallerweb1.dao;

import ar.edu.unlam.tallerweb1.modelo.Reserva;

public interface ReservaDao {

    void guardarReserva(Reserva reserva);
    //new
	void guardarNuevaReserva(Reserva reserva);
	Reserva buscarReserva(Integer idReserva);
	
    
}