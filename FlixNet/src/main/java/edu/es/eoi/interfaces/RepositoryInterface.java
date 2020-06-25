package edu.es.eoi.interfaces;

public interface RepositoryInterface<T> {

	void create(T entity);

	T read(String name);

	void update(T entity);

	void delete(T entity);
	
	//public Map<String, T> readAll();

}