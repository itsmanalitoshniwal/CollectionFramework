package practiceListInterface;

import java.util.*;

public class TestVector {

	public static void main(String[] args) {
		Vector<Integer> list = new Vector<>();
		
		System.out.println("Initial capacity: "+list.capacity());
		System.out.println("initial size: "+ list.size());
		for(int i=1; i<=10 ; i++)
			list.add(i);
		
		System.out.println("after adding 10: capacity: "+list.capacity());
		System.out.println("after adding 10: size: "+list.size());
		
		list.add(11);
		System.out.println("after adding 11: capacity: "+list.capacity());
		System.out.println("after adding 11: size: "+list.size());
		
		//Enumeration is older way of traversing vector
		Enumeration<Integer> en= list.elements();
		while(en.hasMoreElements())
			System.out.println(en.nextElement());
	}

}
