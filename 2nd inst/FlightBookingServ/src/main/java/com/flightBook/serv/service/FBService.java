package com.flightBook.serv.service;

import java.math.BigInteger;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.flightBook.serv.entity.BookingDetails;
import com.flightBook.serv.repository.FBRepository;

@Service
public class FBService {
	
	@Autowired
	FBRepository fbRepository;

	public Iterable<BookingDetails> viewAllAirport() {
		return fbRepository.findAll();
	}

	public void createBooking(BookingDetails newBooking) {
		fbRepository.save(newBooking);
		
	}

	public void updateBooking(BookingDetails updateBooking) {
		fbRepository.save(updateBooking);
	}

	public ResponseEntity<?> findBookingById(BigInteger bookingId) {
		Optional<BookingDetails> findById = fbRepository.findById(bookingId);
		BookingDetails findBooking = findById.get();
		return new ResponseEntity<BookingDetails>(findBooking, HttpStatus.OK);
	}

	public void deleteBooking(BigInteger bookingId) {
		fbRepository.deleteById(bookingId);
		
	}
}
