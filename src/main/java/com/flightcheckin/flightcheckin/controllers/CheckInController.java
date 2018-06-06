package com.flightcheckin.flightcheckin.controllers;

import com.flightcheckin.flightcheckin.integration.ReservationRestClient;
import com.flightcheckin.flightcheckin.integration.dto.Reservation;
import com.flightcheckin.flightcheckin.integration.dto.ReservationUpdateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CheckInController {

    @Autowired
    ReservationRestClient reservationRestClient;

    @RequestMapping("/showStartCheckin")
    public String showStartCheckin() {
        return "startCheckIn";

    }
    @RequestMapping(value = "/startCheckIn")
    public String startCheckIn(@RequestParam("reservationId") Long reservationId, ModelMap modelMap) {
        Reservation reservation=reservationRestClient.findReservation(reservationId);

        modelMap.addAttribute("reservation",reservation);
        return "displayRegistrationDetails";
    }

    @RequestMapping(value = "/completeCheckIn")
    public String completeCheckIn(@RequestParam("reservationId") Long reservationId, @RequestParam("numberOfBags") int numberOfBags){
        ReservationUpdateRequest reservationUpdateRequest=new ReservationUpdateRequest();
        reservationUpdateRequest.setId(reservationId);
        reservationUpdateRequest.setCheckedIn(true);
        reservationUpdateRequest.setNumberOfBags(numberOfBags);
        reservationRestClient.updateReservation(reservationUpdateRequest);
        return "confirmCheckIn";
    }

}
