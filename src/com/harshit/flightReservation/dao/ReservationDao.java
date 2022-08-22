package com.harshit.flightReservation.dao;

import com.harshit.flightReservation.model.Reservation;

public interface ReservationDao {
    Reservation bookFlight(Reservation reservation);
}
