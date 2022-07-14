package com.schFlight.serv.service;

import java.math.BigInteger;

import org.springframework.stereotype.Service;

import com.schFlight.serv.entity.ScheduledFlight;
import com.schFlight.serv.exception.RecordNotFoundException;
import com.schFlight.serv.exception.ScheduledFlightNotFoundException;

@Service
public interface ScheduledFlightService {
	public ScheduledFlight addScheduledFlight(ScheduledFlight scheduledFlight);

	public ScheduledFlight modifyScheduledFlight(ScheduledFlight scheduledFlight);

	public String removeScheduledFlight(BigInteger id) throws RecordNotFoundException;

	public Iterable<ScheduledFlight> viewAllScheduledFlights();

	public ScheduledFlight viewScheduledFlight(BigInteger id) throws ScheduledFlightNotFoundException;
	// boolean cancelBookings(BigInteger flightId) throws RecordNotFoundException;

}
