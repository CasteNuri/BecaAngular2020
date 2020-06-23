package edu.es.eoi.service;

import edu.es.eoi.domain.Film;
import edu.es.eoi.interfaces.RepositoryInterface;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class FilmService {
	
	private RepositoryInterface<Film> repository;
	
	public void addFilm(Film film) {			
		repository.create(film);
	}
	
	public Film findByName(String name) {
		return repository.read(name);
	}
	
	public void remove(Film film) {
		repository.delete(film);
	}
	
	public void updateFilm(Film film) {
		repository.update(film);
	}
	

}
