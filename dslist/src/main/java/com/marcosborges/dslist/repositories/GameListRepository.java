package com.marcosborges.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcosborges.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
