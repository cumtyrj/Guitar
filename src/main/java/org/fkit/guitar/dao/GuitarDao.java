package org.fkit.guitar.dao;

import java.util.List;

import org.fkit.guitar.pojo.Guitar;


public interface GuitarDao {
	
	
	
	List<Guitar> findAll();	

	void add(Guitar guitar);

	void update(Guitar guitar);

	void delete (String id);
	
	int count ();
	
}
