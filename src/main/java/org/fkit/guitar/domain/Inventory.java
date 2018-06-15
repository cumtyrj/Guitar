package org.fkit.guitar.domain;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.fkit.guitar.pojo.Guitar;
import org.fkit.guitar.pojo.spec.GuitarSpec;
import org.springframework.stereotype.Component;

@Component("inventory")
public class Inventory {
	/*	����(1) ʹ�÷���iterator()Ҫ����������һ��Iterator��
		* ��һ�ε���Iterator��next()����ʱ�����������еĵ�һ��Ԫ�ء�
		* ע�⣺iterator()������java.lang.Iterable�ӿ�,��Collection�̳С�

����(2) ʹ��next()��������е���һ��Ԫ�ء�

����(3) ʹ��hasNext()����������Ƿ���Ԫ�ء�

����(4) ʹ��remove()���������·��ص�Ԫ��ɾ����

���� Iterator��Java��������򵥵�ʵ�֣�ΪList��Ƶ�ListIterator���и���Ĺ��ܣ�
	�����Դ������������List��Ҳ���Դ�List�в����ɾ��Ԫ�ء�*/	
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
