package com.devsuperior.mydslist.repositories; 

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.mydslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
