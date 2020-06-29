package edu.es.eoi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import edu.es.eoi.controller.FilmController;
import edu.es.eoi.domain.CategoryEnum;
import edu.es.eoi.domain.Film;
import edu.es.eoi.domain.User;
import edu.es.eoi.interfaces.Playable;
import edu.es.eoi.repository.FilmRepository;
import edu.es.eoi.service.FilmService;
import edu.es.eoi.service.PlayService;
import edu.es.eoi.view.MenuView;

public class App {
	
	public static Map<String, Film> films= new TreeMap<String, Film>();
	public static List<Playable> series= new ArrayList<Playable>();
	public static Set<User> users= new HashSet<User>();
	public static PlayService playService= new PlayService();
	public static FilmRepository filmRepository= new FilmRepository(films);
	public static FilmService filmService= new FilmService(filmRepository);
	public static FilmController filmController= new FilmController(filmService, playService);	

	public static void main(String[] args) {	
		createPlayOffer();
		MenuView.printMenu();		
	}
	
	public static void createPlayOffer() {		
		
		Film film1= new Film();
		film1.setName("La Jungla de cristal 1");
		Film film2= new Film();
		film2.setName("La Jungla de cristal 2");
		Film film3= new Film();
		film3.setName("La Jungla de cristal 3");
		Film film4= new Film();
		film4.setName("La Jungla de cristal 4");
		
		filmRepository.create(film1);
		filmRepository.create(film2);
		filmRepository.create(film3);
		filmRepository.create(film4);
		
		film1.setCategory(CategoryEnum.ACCION);
		
	}

}
