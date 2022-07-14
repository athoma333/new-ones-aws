package com.flightBook.serv.entity;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BookingDetails {
	@Id
	private BigInteger bookId;
	private String boDat;
	private int noOfPassengers;
	private String mail;
	public BookingDetails(BigInteger bookId, String boDat, int noOfPassengers, String mail) {
		super();
		this.bookId = bookId;
		this.boDat = boDat;
		this.noOfPassengers = noOfPassengers;
		this.mail = mail;
	}
	public BookingDetails() {
		super();
	}
	public BigInteger getBookId() {
		return bookId;
	}
	public void setBookId(BigInteger bookId) {
		this.bookId = bookId;
	}
	public String getBoDat() {
		return boDat;
	}
	public void setBoDat(String boDat) {
		this.boDat = boDat;
	}
	public int getNoOfPassengers() {
		return noOfPassengers;
	}
	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
}
