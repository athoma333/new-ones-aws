package com.airport.serv.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.airport.serv.entity.Airport;

@Service
public interface AirportService {
	public Iterable<Airport> viewAllAirport();

	public Airport viewAirport(String airportCode);

	public ResponseEntity<?> addAirport(Airport airport);

	public Airport modifyAirport(Airport airport);

	public String removeAirport(String airportCode);
}
