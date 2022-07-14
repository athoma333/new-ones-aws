package com.schFlight.serv.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.schFlight.serv.entity.Schedule;

public interface ScheduleRepo extends JpaRepository<Schedule, BigInteger> {

}