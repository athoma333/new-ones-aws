package com.schFlight.serv.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.schFlight.serv.entity.ScheduledFlight;


public interface SchFlightRepository extends JpaRepository<ScheduledFlight, BigInteger>{

}
