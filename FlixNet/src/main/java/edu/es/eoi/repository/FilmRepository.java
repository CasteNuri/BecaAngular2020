package edu.es.eoi.repository;

import edu.es.eoi.App;
import edu.es.eoi.domain.Film;
import edu.es.eoi.interfaces.Playable;
import edu.es.eoi.interfaces.RepositoryInterface;

public class FilmRepository implements RepositoryInterface<Film>{
	
	//Create Read Update Delete	
	public void create(Film film) {
		App.films.add(film);
	}	
	
	public Film read(String name) {		
		Film film = null;
		for(Playable temp : App.films) {
			if (((Film)temp).getName().equals(name)) {
				film = (Film) temp;
			}
		}
		return film;
	}	
	
	public void update(Film film) {
		
		for(Playable temp : App.films) {
			if (((Film)temp).equals(film)) {
				film = (Film) temp;
			}
		}
	}
	
	public void delete(Film film) {
		App.films.remove(film);
	}

}
