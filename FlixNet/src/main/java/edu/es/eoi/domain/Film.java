package edu.es.eoi.domain;

import java.util.List;

import edu.es.eoi.interfaces.Playable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Film implements Playable{

	private Category category;
	private String name;
	private String year;
	private double duration;
	private List<Actor> actors;
	private List<Producer> producers;
	
	@Override
	public void play() {
		System.out.println("reproduciendo la pelicula :"+ name);		
	}

	
	
	
	
}
