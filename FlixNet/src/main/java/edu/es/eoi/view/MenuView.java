package edu.es.eoi.view;

import java.util.Scanner;

import edu.es.eoi.App;
import edu.es.eoi.domain.Film;

public class MenuView {
	
	public static void printMenu() {
	
		System.out.println("**********************");
		System.out.println("*BIENVENIDO A FLIXNET*");
		System.out.println("**********************");
		System.out.println("¿QUE QUIERES VER HOY?");
		System.out.println("**********************");
		System.out.println("");
		
		for (int i = 0; i < App.films.size(); i++) {
			if(App.films.get(i)!=null){
				System.out.println(i+"-"+((Film)App.films.get(i)).getName());
			}
		}
		
		@SuppressWarnings("resource")
		Scanner scanner= new Scanner(System.in);
		int opcion=scanner.nextInt();
		
		App.playController.play(App.films.get(opcion));
		
		MenuView.printMenu();
		
	}

}
