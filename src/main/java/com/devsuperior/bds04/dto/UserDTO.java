package com.devsuperior.bds04.dto;

import com.devsuperior.bds04.entities.User;

public class UserDTO {

	private Long id;
	private String email;	
	
	public UserDTO()
	{
		
	}

	public UserDTO(Long id, String email) {	
		this.id = id;
		this.email = email;		
	}
	
	public UserDTO(User entity) {		
		this.id = entity.getId();
		this.email = entity.getEmail();		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
