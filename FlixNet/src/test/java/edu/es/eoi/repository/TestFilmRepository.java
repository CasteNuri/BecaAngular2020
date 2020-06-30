package edu.es.eoi.repository;

import static org.junit.Assert.fail;

import org.junit.Test;

import edu.es.eoi.App;
import edu.es.eoi.domain.Film;

public class TestFilmRepository {

	App app = new App();
	FilmRepository repository = new FilmRepository(app.films);
	
	@Test
	public void testCreate() {
		repository.create(new Film());
	}

	@Test
	public void testRead() {
		repository.read("TEST");
	}

	@Test
	public void testUpdate() {
		repository.update(new Film());
	}

	@Test
	public void testDelete() {
		repository.delete(new Film());
	}

	@Test
	public void testReadAll() {
		repository.readAll();
	}

}
