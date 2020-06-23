package edu.es.eoi.controller;

import edu.es.eoi.domain.Serie;
import edu.es.eoi.service.SerieService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class SerieController {

		private SerieService service;
		
		public void addSerie(Serie serie) {		
			service.addSerie(serie);
		}
		
		public Serie findByName(String name) {
			return service.findByName(name);
		}
		
		public void remove(Serie serie) {
			service.remove(serie);
		}
		
		public void updateSerie(Serie serie) {
			service.updateSerie(serie);
		}
		
	}