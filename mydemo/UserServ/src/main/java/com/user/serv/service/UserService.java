package com.user.serv.service;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.user.serv.entity.Users;

@Service
public interface UserService {

	public ResponseEntity<?> createUser(Users newUser);

	public Users updateUser(Users newUser);

	public String deleteUser(Integer UserId);

	public Iterable<Users> displayAllUser();

	public ResponseEntity<?> findUserById(Integer userId);
}
