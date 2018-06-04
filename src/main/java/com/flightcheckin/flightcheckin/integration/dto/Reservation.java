package com.flightcheckin.flightcheckin.integration.dto;


public class Reservation extends AbstractEntity{

    private boolean checkedIn;
    private int numberOfBags;

    private Passenger passenger;

    private Flight flight;


    public boolean isCheckedin() {
        return checkedIn;
    }

    public void setCheckedin(boolean checkedin) {
        this.checkedIn = checkedin;
    }

    public int getNumberOfBags() {
        return numberOfBags;
    }

    public void setNumberOfBags(int numberOfBags) {
        this.numberOfBags = numberOfBags;
    }

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

    @Override
    public String toString() {
        return "Reservation{" +
                "checkedin=" + checkedIn +
                ", numberOfBags=" + numberOfBags +
                ", passenger=" + passenger +
                ", flight=" + flight +
                '}';
    }
}
