package org.fkit.guitar.service;

import java.util.List;
import org.fkit.guitar.pojo.Guitar;
import org.fkit.guitar.pojo.spec.GuitarSpec;

public interface GuitarService {
	
	List<Guitar> search(GuitarSpec searchSpec);
		
	void add(Guitar guitar);
	
	void update(Guitar guitar);
	
	void delete (String id);
	
	int count ();
}
