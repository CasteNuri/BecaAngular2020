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
		fail("Not yet implemented");
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testReadAll() {
		fail("Not yet implemented");
	}

}
