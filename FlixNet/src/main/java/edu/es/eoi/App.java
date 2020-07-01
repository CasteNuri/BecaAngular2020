package edu.es.eoi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import edu.es.eoi.controller.FilmController;
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
		films=filmController.findAll();
	}
	
}
