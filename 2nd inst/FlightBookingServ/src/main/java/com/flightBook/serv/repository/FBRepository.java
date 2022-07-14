package com.flightBook.serv.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.flightBook.serv.entity.BookingDetails;

import java.util.List;

public interface FBRepository extends JpaRepository<BookingDetails, BigInteger>{


	@Query(value = "select * from booking_details b where b.mail=?1", nativeQuery = true)
	public List<BookingDetails> findBookingByMailId(String emailId);
}
