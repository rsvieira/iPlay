package br.com.devrsvieira.iPlay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.devrsvieira.iPlay.model.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
