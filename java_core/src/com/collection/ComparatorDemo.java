package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
	    int value = 0;
	    if (o1.getSal()>o2.getSal()) {
			value = 1;
		}else if (o1.getSal()<o2.getSal()) {
			value = -1;
		}else if (o1.getSal()==o2.getSal()) {
			value = 0;
		}
		return value;
	}
	public static void main(String[] args) {
		ArrayList<Emp> list = new ArrayList<>();
		
		Emp e1 = new Emp();
		e1.setEid(1);
		e1.setEname("Paresh");
		e1.setSal(20000);
		
		Emp e2 = new Emp();
		e2.setEid(2);
		e2.setEname("Chintan");
		e2.setSal(22000);
		
		Emp e3 = new Emp();
		e3.setEid(3);
		e3.setEname("Adarsh");
		e3.setSal(25000);
		
		Emp e4 = new Emp();
	    e4.setEid(4);
		e4.setEname("Chaitali");
		e4.setSal(15000);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		Collections.sort(list, new ComparatorDemo());
		for (Emp emp : list) {
			System.out.println("EID :"+emp.getEid()+" ENAME :"+emp.getEname()+" ESALARY :"+emp.getSal());
		}
     }

}
