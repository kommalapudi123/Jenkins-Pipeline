package io.pivotal.workshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.pivotal.workshop.dto.Person;
import io.pivotal.workshop.service.FirstServiceImpl;

@RestController
public class FirstController {
	
	@Autowired
	public FirstServiceImpl firstServiceImpl;
	
	@RequestMapping(path = "/home", method = RequestMethod.GET , produces = "application/json")
	public Person home(int id) {
		return firstServiceImpl.getPersonDetails(id);
	}

}
