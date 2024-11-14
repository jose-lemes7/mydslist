package com.devsuperior.mydslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.mydslist.dto.GameListDTO;
import com.devsuperior.mydslist.services.GameListService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

	@Autowired
	private GameListService gameListService;
	
	@GetMapping()
	public List<GameListDTO> findAll() {
		return gameListService.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public GameListDTO getMethodName(@PathVariable Long id) {
		return gameListService.findById(id);
	}
	
}

