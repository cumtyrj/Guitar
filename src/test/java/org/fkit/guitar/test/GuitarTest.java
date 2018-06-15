package org.fkit.guitar.test;

import java.util.ArrayList;
import java.util.List;

import org.fkit.guitar.dao.GuitarDao;
import org.fkit.guitar.domain.Inventory;
import org.fkit.guitar.pojo.Builder;
import org.fkit.guitar.pojo.Guitar;
import org.fkit.guitar.pojo.Type;
import org.fkit.guitar.pojo.Wood;
import org.fkit.guitar.pojo.spec.GuitarSpec;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:springmvc-config.xml"})
@ActiveProfiles("sqlserver")//
@Transactional//
public class GuitarTest {	
	@Autowired
	private Inventory inventory;	
	@Autowired
	private GuitarDao guitarDao;	
	
	@Test
	public void add(){
		guitarDao.add(new Guitar("123",10.0d,Builder.FENDER, "X", Type.ACOUSTIC,Wood.ALDER, Wood.BRAZILIAN_ROSEWOOD,3));
	}
	
	@Test
	public void search(){		
		List<Guitar> all=new ArrayList<Guitar>();
		all.add(new Guitar("123",10.0d,Builder.FENDER, "X", Type.ACOUSTIC,Wood.ALDER, Wood.BRAZILIAN_ROSEWOOD,3));
		all.add(new Guitar("223",15.0d,Builder.GIBSON, "XL", Type.ACOUSTIC,Wood.CEDAR, Wood.MAPLE,2));
		all.add(new Guitar("323",20.0d,Builder.MARTIN, "M", Type.ACOUSTIC,Wood.CEDAR, Wood.COCOBOLO,5));
		
		GuitarSpec whatErinLikes = 
			      new GuitarSpec(Builder.FENDER, "X", 
			                     Type.ACOUSTIC,Wood.ALDER, Wood.BRAZILIAN_ROSEWOOD,3);
		
		List<Guitar> matchingGuitars = inventory.search(whatErinLikes,all);
		
		for(Guitar guitar:matchingGuitars){
			System.out.println("吉他序号"+guitar.getId());
		}
	}
	
	
	@Test
	public void delete(){
		guitarDao.delete("1");
	}
}
