package com.devsuperior.mydslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.mydslist.dto.GameDTO;
import com.devsuperior.mydslist.dto.GameMinDTO;
import com.devsuperior.mydslist.services.GameService;


@RestController
@RequestMapping(value = "/games")
public class GameController {

	@Autowired
	private GameService gameService;
	
	@GetMapping()
	public List<GameMinDTO> findAll() {
		return gameService.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public GameDTO getMethodName(@PathVariable Long id) {
		return gameService.findById(id);
	}
	
}
