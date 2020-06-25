package edu.es.eoi.controller;

import java.util.Map;

import edu.es.eoi.domain.Film;
import edu.es.eoi.service.FilmService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class FilmController {

		private FilmService service;
		
		public void addFilm(Film film) {		
			service.addFilm(film);
		}
		
		public Film findByName(String name) {
			return service.findByName(name);
		}
		
		public void remove(Film film) {
			service.remove(film);
		}
		
		public void updateFilm(Film film) {
			service.updateFilm(film);
		}
		
		public Map<String, Film> findAll() {
			return service.findAll(); 
		}
	}