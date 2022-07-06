package com.springdatajpademo.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springdatajpademo.model.Fibonaci;
import com.springdatajpademo.service.Fibonaciservice;

@RestController
public class FibonaciController {

	@Autowired
	private Fibonaciservice service;



	@GetMapping("/fibonaci/{id}")
	public Fibonaci update(@PathVariable Integer id) {
		return service.getfibonacimunbers(id);
	
		
	}

}
