package com.flight.serv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flight.serv.entity.Flight;
import com.flight.serv.exception.RecordAlreadyPresentException;
import com.flight.serv.exception.RecordNotFoundException;
import com.flight.serv.service.FlightService;

@CrossOrigin
@RestController
@RequestMapping("/flight")
public class FlightController {
	@Autowired(required = true)
	FlightService flightService;

	@PostMapping("/addFlight")
	@ExceptionHandler(RecordAlreadyPresentException.class)
	public void addFlight(@RequestBody Flight flight) {
		flight.setStatus("unblocked");
		flightService.addFlight(flight);
	}

	//view all flights- /api/v1.0/flight/airline/inventory/add
	@GetMapping("/search")
	public Iterable<Flight> viewAllFlight() {
		return flightService.viewAllFlight();
	}

	@GetMapping("/viewFlight/{id}")
	@ExceptionHandler(RecordNotFoundException.class)
	public Flight viewFlight(@PathVariable("id") Integer flightNo) {
		return flightService.viewFlight(flightNo);
	}

	@PutMapping("/updateFlight")
	@ExceptionHandler(RecordNotFoundException.class)
	public void modifyFlight(@RequestBody Flight flight) {
		flightService.modifyFlight(flight);
	}
	
	@PutMapping("/blockflight/{id}")
	@ExceptionHandler(RecordNotFoundException.class)
	public void modifyFlight(@PathVariable("id") Integer flightNo) {
		Flight flight =  flightService.viewFlight(flightNo);
		flight.setStatus("blocked");
		flightService.modifyFlight(flight);
	}


	@DeleteMapping("/deleteFlight/{id}")
	@ExceptionHandler(RecordNotFoundException.class)
	public void removeFlight(@PathVariable("id") Integer flightNo) {
		flightService.removeFlight(flightNo);
	}
}