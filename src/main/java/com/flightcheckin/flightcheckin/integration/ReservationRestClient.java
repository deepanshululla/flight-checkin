package com.flightcheckin.flightcheckin.integration;

import com.flightcheckin.flightcheckin.integration.dto.Reservation;
import com.flightcheckin.flightcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {
    public Reservation findReservation(Long id);
    public Reservation updateReservation(ReservationUpdateRequest reservationUpdateRequest);
}
