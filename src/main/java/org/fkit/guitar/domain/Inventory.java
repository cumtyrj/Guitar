package org.fkit.guitar.domain;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.fkit.guitar.pojo.Guitar;
import org.fkit.guitar.pojo.spec.GuitarSpec;
import org.springframework.stereotype.Component;

@Component("inventory")
public class Inventory {
	/*	　　(1) 使用方法iterator()要求容器返回一个Iterator。
		* 第一次调用Iterator的next()方法时，它返回序列的第一个元素。
		* 注意：iterator()方法是java.lang.Iterable接口,被Collection继承。

　　(2) 使用next()获得序列中的下一个元素。

　　(3) 使用hasNext()检查序列中是否还有元素。

　　(4) 使用remove()将迭代器新返回的元素删除。

　　 Iterator是Java迭代器最简单的实现，为List设计的ListIterator具有更多的功能，
	它可以从两个方向遍历List，也可以从List中插入和删除元素。*/	
	public List<Guitar> search(GuitarSpec searchSpec,List<Guitar> guitars) { 
		List<Guitar> matchingGuitars = new LinkedList<Guitar>(); 
		for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) { 
			Guitar guitar = i.next();
			if(guitar.getSpec().matches(searchSpec)){
				matchingGuitars.add(guitar);
			}
			 
		} 
		return matchingGuitars; 
	}
}
