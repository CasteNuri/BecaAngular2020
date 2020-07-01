package edu.es.eoi.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import edu.es.eoi.domain.Film;
import edu.es.eoi.domain.User;
import edu.es.eoi.domain.Wishlist;
import edu.es.eoi.service.FilmService;
import edu.es.eoi.service.PlayService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class FilmController {

	private FilmService filmService;
	private PlayService playService;

	public void play(String name) {
		playService.play(filmService.findByName(name));

	}

	public Film findByName(String name) throws FileNotFoundException {
		return filmService.findByName(name);
	}

	public Map<String, Film> findAll() {
		Map<String, Film> films = null;
		try {
			films = filmService.findAll();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return films;
	}

	public void valorate(Film film, String opinion) {
		filmService.valorate(film, opinion);
	}

	public Map<String, Film> viewRecomendations(User user) {
		Map<String, Film> recommended = null;
		try {
			recommended = filmService.viewRecomendations(user);
		} catch (IOException e) {

			e.printStackTrace();
		}
		return recommended;
	}

	public void addToWishList(Wishlist list, Film film) {
		filmService.addToWishList(list, film);
	}
}