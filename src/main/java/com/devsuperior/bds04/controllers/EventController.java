package com.devsuperior.bds04.controllers;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.bds04.dto.EventDTO;

@RestController
@RequestMapping("/events")
public class EventController {

	@GetMapping
	public ResponseEntity<Page<EventDTO>> findAllPageable(Pageable pageable){
		return null;
	}
	
	@PostMapping("/{id}")
	public ResponseEntity<EventDTO> insert(@RequestBody EventDTO dto){
		return null;
	}
}
