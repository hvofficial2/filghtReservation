package com.harshit.flightReservation.model;

public class Reservation extends AbstractModel{
    private Passenger passenger;
    private Flight flight;
    private long flightId;

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public long getFlightId() {
        return flightId;
    }

    public void setFlightId(long flightId) {
        this.flightId = flightId;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "p=" + passenger +
                ", f=" + flight +
                ", flightId=" + flightId +
                '}';
    }
}
