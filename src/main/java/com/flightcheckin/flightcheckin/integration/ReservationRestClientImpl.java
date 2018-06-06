package com.flightcheckin.flightcheckin.integration;

import com.flightcheckin.flightcheckin.integration.dto.Reservation;
import com.flightcheckin.flightcheckin.integration.dto.ReservationUpdateRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ReservationRestClientImpl implements ReservationRestClient{

    @Value("${flightreservation.url}")
    private String RESERVATION_REST_URL;

    @Override
    public Reservation findReservation(Long id) {
        RestTemplate restTemplate=new RestTemplate();
        Reservation reservation=restTemplate.getForObject(RESERVATION_REST_URL+id,Reservation.class);
        return reservation;
    }

    @Override
    public Reservation updateReservation(ReservationUpdateRequest reservationUpdateRequest) {
        RestTemplate restTemplate=new RestTemplate();
        Reservation reservation=restTemplate.postForObject(RESERVATION_REST_URL,reservationUpdateRequest,Reservation.class);
        return reservation;
    }


}
