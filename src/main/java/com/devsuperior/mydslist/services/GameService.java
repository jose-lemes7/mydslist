package com.devsuperior.mydslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.mydslist.dto.GameMinDTO;
import com.devsuperior.mydslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll() {
		var result = gameRepository.findAll();
		return result.stream().map(GameMinDTO::new).toList();
	}
}
