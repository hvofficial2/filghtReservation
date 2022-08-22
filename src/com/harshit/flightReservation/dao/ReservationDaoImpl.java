package com.harshit.flightReservation.dao;

import com.harshit.flightReservation.model.Flight;
import com.harshit.flightReservation.model.Reservation;

import javax.naming.spi.ResolveResult;
import java.util.HashMap;
import java.util.Map;

public class ReservationDaoImpl implements ReservationDao{
    Map<Long, Flight> flights = new HashMap<>();
    Map<Long, Reservation> reservations = new HashMap<>();
    long reservationId;

    public ReservationDaoImpl(){
        Flight f1 = new Flight();
        f1.setId(1l);
        f1.setFlightNumber("123");
        f1.setOperatingAirlines("American");
        f1.setDepartureCity("Austin");
        f1.setArrivalCity("New York");
        f1.setDateAndTimeOfDeparture("05/22/2022 9PM");
        flights.put(f1.getId(),f1);

        Flight f2 = new Flight();
        f2.setId(2l);
        f2.setFlightNumber("456");
        f2.setOperatingAirlines("SouthWest");
        f2.setDepartureCity("Denver");
        f2.setArrivalCity("San Diego");
        f2.setDateAndTimeOfDeparture("6/22/2022 10PM");
        flights.put(f2.getId(),f2);
    }

    @Override
    public Reservation bookFlight(Reservation reservation){
        Flight f = flights.get(reservation.getFlightId());
        reservation.setFlight(f);
        reservationId++;
        reservation.setId(reservationId);
        reservations.put(reservationId,reservation);
        return reservation;
    }

    @Override
    public Reservation checkIn(long reservationId,int noOfBags){
        Reservation reservation = reservations.get(reservationId);
        reservation.setNoOfBags(noOfBags);
        reservation.setCheckedIn(true);
        return reservation;
    }
}
