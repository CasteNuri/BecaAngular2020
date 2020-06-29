package edu.es.eoi.controller;

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
		
		public Film findByName(String name) {
			return filmService.findByName(name);
		}
		
		public Map<String, Film> findAll() {
			return filmService.findAll(); 
		}
		
		
		public void valorate(Film film, String opinion) {
			filmService.valorate(film, opinion);
		}
		
		public Map<String, Film> viewRecomendations(User user) {
			return filmService.viewRecomendations(user);
		}
		
		public void addToWishList(Wishlist list, Film film) {
			filmService.addToWishList(list, film);
		}
	}