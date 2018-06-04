package com.flightcheckin.flightcheckin.controllers;

import com.flightcheckin.flightcheckin.integration.ReservationRestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
    @RequestMapping(value = "/startCheckIn", method = RequestMethod.POST)
    public String startCheckIn(@RequestParam Long reservationId) {
        return null;
    }

}
