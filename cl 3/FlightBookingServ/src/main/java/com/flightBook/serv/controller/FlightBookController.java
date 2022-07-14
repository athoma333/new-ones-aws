package com.flightBook.serv.controller;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightBook.serv.entity.BookingDetails;
import com.flightBook.serv.repository.FBRepository;
import com.flightBook.serv.service.FBService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/book")
public class FlightBookController {
	@Autowired
	FBService fbService;
	
	@Autowired
	FBRepository fbRepository1;

	@GetMapping("/allbookings")
	public Iterable<BookingDetails> viewAllAirport() {
		return fbService.viewAllAirport();
	}
	
	@PostMapping("/createBooking")
	public void addBooking(@RequestBody BookingDetails newBooking) {

		fbService.createBooking(newBooking);
	}
	
	@PutMapping("/updateBooking")
	public void modifyBooking(@RequestBody BookingDetails updateBooking) {

		fbService.updateBooking(updateBooking);
	}
	
	@GetMapping("/history/{emailId}")
	public List<BookingDetails> searchBookingByID(@PathVariable("emailId") String emailId) {

		return fbRepository1.findBookingByMailId(emailId);
	}
	
	@GetMapping("/searchBooking/{id}")
	public ResponseEntity<?> searchBookingByID(@PathVariable("id") BigInteger bookingId) {

		return fbService.findBookingById(bookingId);
	}

	@DeleteMapping("/deleteBooking/{id}")
	public void deleteBookingByID(@PathVariable("id") BigInteger bookingId) {

		fbService.deleteBooking(bookingId);
	}
}
