package arrupe.springdependencyinjection.service;

import arrupe.springdependencyinjection.model.Reservation;
import arrupe.springdependencyinjection.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {
    @Autowired
    ReservationRepository reservationRepository;

    public Reservation createReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    public List<Reservation> getReservationsById(int reservationId) {
        return reservationRepository.findById(reservationId);
    }
}
