package edu.es.eoi.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import edu.es.eoi.App;
import edu.es.eoi.domain.Film;

public class MenuView {
	
	public static void printMenu() {
	
		System.out.println("**********************");
		System.out.println("*BIENVENIDO A FLIXNET*");
		System.out.println("**********************");
		System.out.println(" ¿QUE QUIERES VER HOY?");
		System.out.println("**********************");
		System.out.println("");
		
		
		
		
		//We use this for loop when we have lists
//		for (int i = 0; i < App.films.size(); i++) {
//			if(App.films.get(i)!=null){
//				System.out.println(i+"-"+((Film)App.films.get(i)).getName());
//			}
//		}
		
		//On the other hand, if we are using maps, we have to do it using a method to find all from the repository:
		Map<String,Film> pelis = App.filmController.findAll();
		int i= 0;
		for(String peli : pelis.keySet()) { // Iterate over the keys cause is already the name of the films I want to print
			System.out.println((i+1) + "- " + peli);
			i++;
		}
		
		
		List<Film> filmList = new ArrayList<Film>();
		filmList.addAll(pelis.values());
		
		@SuppressWarnings("resource")
		Scanner scanner= new Scanner(System.in);
		int opcion=scanner.nextInt();
		
		App.playController.play(filmList.get(opcion-1));
		
		MenuView.printMenu();
		
	}

}
