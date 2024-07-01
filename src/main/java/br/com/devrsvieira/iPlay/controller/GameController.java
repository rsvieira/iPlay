package br.com.devrsvieira.iPlay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.devrsvieira.iPlay.model.Game;
import br.com.devrsvieira.iPlay.model.GameRequestDTO;
import br.com.devrsvieira.iPlay.model.GameResponseDTO;
import br.com.devrsvieira.iPlay.repository.GameRepository;

@RequestMapping(path = "/game")
@RestController
public class GameController {

	@Autowired
	private GameRepository gameRepository;

	@GetMapping("/list")
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	public List<GameResponseDTO> getList(){
		return gameRepository.findAll().stream().map(GameResponseDTO::new).toList();
	}

	@PostMapping("/save")
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	public void saveGame(@RequestBody GameRequestDTO gameRequestDTO){
		gameRepository.save(new Game(gameRequestDTO));
	}

}
