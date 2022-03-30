package collection_framework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	/*
	 * In set duplicates elements are not allowed
	 */
    public static void main(String[] args) {

    	// 	CUSTOM SET OF CUSTOM CLASSES
    	
        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student("Anuj", 2));
        studentSet.add(new Student("Ramesh", 4));
        studentSet.add(new Student("Shivam", 3));

        studentSet.add(new Student("Ramesh", 2));

        Student s1 = new Student("Anuj", 2);
        Student s2 = new Student("Rohit", 2);

        System.out.println(s1.equals(s2));
        System.out.println(studentSet);

    	
/*    	
    	
//    	GENERAL OPEERATIONS
    	
    	
    	 // All the operations in HashSet is in O(1)
         Set<Integer> set1 = new HashSet<>();
    	
    	// LinkedHashSet IS ALSO A KIND OF SET
    	// WHERE IT HAS THE PROPERTY OF BOTH SET AND LINKEDLIST
    	// THAT ELEMENT ADD TO IT END TO END
        //Set<Integer> set = new LinkedHashSet<>();

        
        // TreeSet IS IMPLEMENTED ON THE PROPERTY OF BINARY SEARCH TREE
        // It has both the property of Tree and set
    	// that's why all the elements in TreeSet will be unique and in sorted order
    	// All the operations in TreeSet in O(logn)
        Set<Integer> set = new TreeSet<>();

        set.add(32);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(65);
        
        System.out.println(set);

        set.remove(54);

        System.out.println(set);
		  
        // contains() is used to check wheter an element is present or not
        System.out.println(set.contains(21));

        System.out.println(set.isEmpty());

        System.out.println(set.size());

        set.clear();

        System.out.println(set);
        
*/

    }
}
