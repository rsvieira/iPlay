package br.com.devrsvieira.iPlay.model;

public record GameRequestDTO(Long id, String name, Integer year, Integer console, String urlImage, String finished) {

	public GameRequestDTO(Game game) {
		this(game.getId(), game.getName(), game.getYear(), game.getConsole(), game.getUrlImage(), game.getFinished());
	}

}
