package com.flightcheckin.flightcheckin.integration.dto;

public class ReservationUpdateRequest extends AbstractEntity{


    private Boolean checkedIn;
    private int numberOfBags;

    public Boolean getCheckedIn() {
        return checkedIn;
    }

    public void setCheckedIn(Boolean checkedIn) {
        this.checkedIn = checkedIn;
    }

    public int getNumberOfBags() {
        return numberOfBags;
    }

    public void setNumberOfBags(int numberOfBags) {
        this.numberOfBags = numberOfBags;
    }

}
