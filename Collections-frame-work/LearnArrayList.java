package collection_framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class LearnArrayList {

	public static void main(String[] args) {

		/*
		  List<Integer> list = new ArrayList<>(); 
		  list.add(1); 
		  list.add(2);
		  list.add(3); 
		  System.out.println(list);
		  
		  list.add(4); // This will add 4 at the end of the List.
		  System.out.println(list);
		  
		  // ADDING ELEMENT AT A PERTICULAR INDEX 
		    
		  // HERE METHOD OVERLOADING IS BEING TAKEN PLACE
		  list.add(1, 50); // This will add 50 at index 1. All the other elements will be shifted to right. 
		  System.out.println(list);
		  
		  List<Integer> newList = new ArrayList(); // Creating a new List which will be added to original list. 
		  newList.add(150); 
		  newList.add(160);
		  
		  list.addAll(newList); // This will add all the elements present in newList to
		  list. System.out.println(list);
		  
		  System.out.println(list.get(1));
		 
		 */

		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);

		System.out.println(list);
		/*
		  // UPDATE VALUE 
		  list.set(2, 1000); 
		  
		  // update value at a particular index
		  System.out.println(list);
		  
		  
		  // CHECK VALUE;
		  System.out.println(list.contains(50));  // checking whether a particular value is present or not
		  
		  // REMOVIING ELEMENTS list.remove(1);  // remove value at a particular index
		  System.out.println(list);
		  
		  list.remove(Integer.valueOf(30)); // remove value from the list;
		  System.out.println(list);
		  
		  list.clear(); // remove or delete all the elements from the list;
		  
		  System.out.println(list);
		  
		  
		 */

		// TRAVERSING METHODS
		// using for loop
		for (int i = 0; i < list.size(); i++)
			System.out.println("the element is " + list.get(i));

		// using for each loop
		for (Integer element : list)
			System.out.println("for each element is " + element);

		// using iterator
		Iterator<Integer> it = list.iterator();
		while (it.hasNext())
			System.out.println("iterator " + it.next());

	}
}