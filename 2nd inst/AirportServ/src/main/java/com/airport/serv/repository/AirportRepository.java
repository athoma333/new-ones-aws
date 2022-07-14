package com.airport.serv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airport.serv.entity.Airport;

public interface AirportRepository extends JpaRepository<Airport, String>{

}
