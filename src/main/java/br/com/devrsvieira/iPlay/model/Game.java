package br.com.devrsvieira.iPlay.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Table(name = "game")
@Entity(name = "game")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@ToString
@SequenceGenerator(name = "game_seq", sequenceName = "GAME_SEQ", initialValue = 1, allocationSize = 1)
public class Game {

	@Id
	@Getter
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "game_seq")
	@Column(name = "ID")
	private Long id;

	@Getter @Setter @Column(name = "NAME")
	private String name;

	@Getter @Setter @Column(name = "\"year\"")
	private Integer year;

	@Getter @Setter @Column(name = "CONSOLE")
	private Integer console;

	@Getter @Setter @Column(name = "URL_IMAGE")
	private String urlImage;

	@Getter @Setter @Column(name = "FINISHED")
	private String finished;


	public Game(GameRequestDTO data) {
		this.name = data.name();
		this.year = data.year();
		this.console = data.console();
		this.urlImage = data.urlImage();
		this.finished = data.finished();
	}

}
