package com.Raj.SpringBoot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Raj.SpringBoot.Entity.User;
import com.Raj.SpringBoot.Repo.UserRepository;

@RestController
@RequestMapping("/api/v1")
public class UserController {

	
	@Autowired
	private UserRepository userrepository;
	
	
	public List<User> findAllUser(){
		return userrepository.findAll();
	}
	
	
}
