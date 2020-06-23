package edu.es.eoi.service;

import edu.es.eoi.domain.Serie;
import edu.es.eoi.interfaces.RepositoryInterface;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class SerieService {

	private RepositoryInterface<Serie> repository;
	
	public void addSerie(Serie serie) {			
		repository.create(serie);
	}
	
	public Serie findByName(String name) {
		return repository.read(name);
	}
	
	public void remove(Serie serie) {
		repository.delete(serie);
	}
	
	public void updateSerie(Serie serie) {
		repository.update(serie);
	}
}
