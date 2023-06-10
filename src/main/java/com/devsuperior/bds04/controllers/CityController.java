package com.devsuperior.bds04.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.bds04.dto.CityDTO;

@RestController
@RequestMapping("/cities")
public class CityController {

	@GetMapping
	public ResponseEntity<CityDTO> findAll()
	{
		return null;
	}
	
	@PostMapping("/{id}")
	public ResponseEntity<CityDTO> insert(@RequestBody CityDTO dto)
	{
		return null;
	}
}
