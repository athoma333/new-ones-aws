package com.flight.serv.service;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.flight.serv.entity.Flight;

@Service
public interface FlightService {
	public ResponseEntity<?> addFlight(Flight flight);

	public Iterable<Flight> viewAllFlight();

	public Flight viewFlight(Integer flightNumber);

	public Flight modifyFlight(Flight flight);

	public String removeFlight(Integer flightNumber);

}
