package edu.es.eoi.domain;

import java.util.List;

import edu.es.eoi.interfaces.Playable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Serie implements Playable {

	private CategoryEnum category;
	private String name;
	private String year;
	private List<Season> season;
	private List<Actor> actors;
	private List<Producer> producers;

	@Override
	public void play() {
		System.out.println("reproduciendo la serie: "+ name);
	}
	
}
