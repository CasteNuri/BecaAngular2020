package edu.es.eoi.controller;

import java.io.FileNotFoundException;
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
			try {
				playService.play(filmService.findByName(name));
			} catch (Exception e) {
				System.out.println("Pelicula descatalogada");
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
		
		public Film findByName(String name) throws FileNotFoundException {
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