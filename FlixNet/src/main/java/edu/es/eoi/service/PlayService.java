package edu.es.eoi.service;

import java.util.List;

import edu.es.eoi.interfaces.Playable;

public class PlayService {
	
	public void play(Playable playable) {
		playable.play();
	}
	
	public void play(List<Playable> playList) {		
		for (Playable playable : playList) {
			playable.play();
		}
	}

}
