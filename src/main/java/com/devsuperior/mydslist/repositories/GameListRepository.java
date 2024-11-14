package com.devsuperior.mydslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.mydslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
