package com.spring.learn.controller;

import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.spring.learn.domain.Actor;
import com.spring.learn.exception.ActorNotFoundException;
import com.spring.learn.repository.ActorRepository;

@RestController
public class ActorManagementController {

	@Value("${user.message}")
	private String message;

	@Autowired
	ActorRepository actorDetails;

	@GetMapping(value = "/user/welcome/{userId}")
	public ResponseEntity<String> welcomeUser(@PathVariable("userId") String userId) {
		
	//BeanFactoryPostProcessor
		// DispatcherServlet
		//ApplicationContext
		
		return new ResponseEntity<String>(message + " = " + userId, HttpStatus.OK);
	}

	@GetMapping(value = "/user/{actorId}")
	public ResponseEntity<Actor> getUserById(@PathVariable("actorId") Integer actorId) {
		Optional<Actor> actorOptional = actorDetails.findById(actorId);

		if (!actorOptional.isPresent()) {
			throw new ActorNotFoundException("id-" + actorId);
		}

		Actor data = actorOptional.get();

		return new ResponseEntity<Actor>(data, HttpStatus.OK);
	}

}
