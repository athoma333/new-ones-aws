package com.user.serv.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;

import com.user.serv.entity.Users;


public interface UserRepository extends JpaRepository<Users, Integer>{
	@Query(value = "select * from users b where b.user_name=?1", nativeQuery = true)
	public ResponseEntity<?> getrole(String emailId);
}
