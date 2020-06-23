package edu.es.eoi.repository;

import edu.es.eoi.App;
import edu.es.eoi.domain.Serie;
import edu.es.eoi.interfaces.Playable;
import edu.es.eoi.interfaces.RepositoryInterface;

public class SerieRepository implements RepositoryInterface<Serie> {
	@Override
	public void create(Serie serie) {
		App.series.add(serie);
	}	
	
	@Override
	public Serie read(String name) {		
		Serie serie = null;
		for(Playable temp : App.series) {
			if (((Serie)temp).getName().equals(name)) {
				serie = (Serie) temp;
			}
		}
		return serie;
	}	
	
	@Override
	public void update(Serie serie) {
		
		for(Playable temp : App.series) {
			if (((Serie)temp).equals(serie)) {
				serie = (Serie) temp;
			}
		}
	}
	
	@Override
	public void delete(Serie serie) {
		App.series.remove(serie);
	}

}
