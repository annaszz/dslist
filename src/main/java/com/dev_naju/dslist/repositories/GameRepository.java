package com.dev_naju.dslist.repositories;

import com.dev_naju.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {


}
