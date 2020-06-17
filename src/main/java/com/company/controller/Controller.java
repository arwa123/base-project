package com.company.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.domain.respository.Repository1;
import com.company.domain.dto.DTO1;
import com.company.domain.entity.Entity1;


@RestController
@RequestMapping("/v1")
public class Controller
{

   
	@Autowired
	private Repository1 repository;
	
	

	@PostMapping(path = "/resource_name")
	public Entity1 add(@Valid @RequestBody Entity1 entity) {

		return repository.save(entity);

	}

	
	@PutMapping(path = "/resource_name/{resource_id}")
	public Entity1 update(@PathVariable(value = "resource_id") Long id , @RequestBody DTO1 dto) {

		return null;

	}


	
}
