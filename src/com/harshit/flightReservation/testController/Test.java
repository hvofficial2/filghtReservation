package com.harshit.flightReservation.testController;

import com.harshit.flightReservation.dao.ReservationDao;
import com.harshit.flightReservation.dao.ReservationDaoImpl;
import com.harshit.flightReservation.model.Passenger;
import com.harshit.flightReservation.model.Reservation;

public class Test {
    static ReservationDao dao = new ReservationDaoImpl();
    public static void main(String...args){
        Passenger passenger1 = new Passenger();
        passenger1.setFirstName("John");
        passenger1.setLastName("Bailey");
        passenger1.setEmail("JohnBailey@gmail.com");
        passenger1.setPhone("9876543210");
        Reservation reservation1 = new Reservation();
        reservation1.setPassenger(passenger1);
        reservation1.setFlightId(1l);
        Reservation r = book(reservation1);
        System.out.println(r);
        checkIn(r.getId(),4);
//        System.out.println();
//        System.out.println();
//        System.out.println("ALL Reservations:");
//        System.out.println();
    }

    public static void checkIn(long reservationId,int noOfBags){
        System.out.println(dao.checkIn(reservationId,noOfBags));
    }
    public static Reservation book(Reservation reservation){
        return (dao.bookFlight(reservation));
    }
}
