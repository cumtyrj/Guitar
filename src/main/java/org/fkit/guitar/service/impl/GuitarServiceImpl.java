package org.fkit.guitar.service.impl;

import java.util.List;

import org.fkit.guitar.dao.GuitarDao;
import org.fkit.guitar.domain.Inventory;
import org.fkit.guitar.pojo.Guitar;
import org.fkit.guitar.pojo.spec.GuitarSpec;
import org.fkit.guitar.service.GuitarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("guitarService")
public class GuitarServiceImpl implements GuitarService{

	@Autowired
	private GuitarDao guitarDao;
	@Autowired
	private Inventory inventory;
	@Override
	public List<Guitar> search(GuitarSpec searchSpec){
		List<Guitar> guitars=guitarDao.findAll();
		return inventory.search(searchSpec, guitars);
	}
	
	@Override
	public void add(Guitar guitar) {
		guitarDao.add(guitar);
	}
	
	@Override
	public void update(Guitar guitar) {
		guitarDao.update(guitar);
	}
	
	@Override
	public void delete(String id) {
		guitarDao.delete(id);
	}

	@Override
	public int count() {
		return guitarDao.count();
	}

}
