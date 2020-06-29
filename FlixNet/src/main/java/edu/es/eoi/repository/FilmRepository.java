package edu.es.eoi.repository;


import java.util.Map;

import edu.es.eoi.App;
import edu.es.eoi.domain.Film;
import edu.es.eoi.interfaces.RepositoryInterface;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class FilmRepository implements RepositoryInterface<Film>{
	
	private Map<String,Film> films;
	
	//Create Read Update Delete	
	public void create(Film film) {
		App.films.put(film.getName(), film); //When we are using Maps, we use put instead of add and we has to provide the key (a String in this case) and the value
	}	
	
	
	//The advantage is that when we are using maps the code will be reduced a lot when asking for a value.
	public Film read(String name) {		
		
		return App.films.get(name);
	}	
	
	public void update(Film film) {
		
		App.films.put(film.getName(), film);
	}
	
	public void delete(Film film) {
		App.films.remove(film.getName()); //It is film.getName instead of only film due to it removes by key.
	}

	
	public Map<String, Film> readAll() {
		return App.films; 
	}
}
