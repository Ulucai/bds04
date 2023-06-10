package com.devsuperior.bds04.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.devsuperior.bds04.dto.CityDTO;
import com.devsuperior.bds04.entities.City;
import com.devsuperior.bds04.repositories.CityRepository;

@Service
public class CityService {

	@Autowired
	private CityRepository repository;
	
	public List<CityDTO> findAll()
	{
		List<City> result = repository.findAll(Sort.by("name"));
		return result.stream().map(city -> new CityDTO(city)).toList();
	}
	
	public CityDTO insert(CityDTO dto)
	{
		City entity = new City();		
		entity.setName(dto.getName());
		entity = repository.save(entity);
		return new CityDTO(entity);
	}
}
