package collection_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionsClass {

    public static void main(String[] args) {

    	
    	// SORT STUDENT CUSTOM CLASS
    	
        List<Student> list = new ArrayList<>();

        list.add(new Student("Anuj", 2));
        list.add(new Student("Ramesh", 4));
        list.add(new Student("Shivam", 3));
        list.add(new Student("Rohit", 1));
        
        Student s1 = new Student("Anuj", 2);
        Student s2 = new Student("Rohit", 3);

//        System.out.println((s1.compareTo(s2)));

        System.out.println(list);

        // COMPARABLE
        
        // NOW students have been sort on the basis of rollNo: in ascending order
        // Here we used comparable for achieving our desirable goal
        // FOR A SINGLE CLASS WE CAN HAVE ONLY ONE comparable METHOD
        // IT HAS A STATIC BEHAVIOUR, JO SET KIYA USKE ACCORDING THINGS KO COMPARE KAREGA
        Collections.sort(list);
        System.out.println(list);
        
        
        // COMPARATOR
        
        // Implemented Comparator without using lambda
        Collections.sort(list, new Comparator<Student>() {
        	public int compare(Student o1, Student o2) {
        		return o1.name.compareTo(o2.name);
        	}
        });
        System.out.println(list);
        
        // Implemented comparator using Lambda
        Collections.sort(list, (o1, o2) -> o2.name.compareTo(o1.name));
        System.out.println(list);

        
        
        

/*

        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(12);
        list.add(9);
        list.add(9);
        list.add(9);
        list.add(76);
        list.add(29);
        list.add(75);

        System.out.println("min element " + Collections.min(list));
        System.out.println("max element " + Collections.max(list));
        System.out.println(Collections.frequency(list, 9));

        // sort in ascending order
        Collections.sort(list);
        System.out.println(list);
        		
        // sort in descending order
        Collections.sort(list, Comparator.reverseOrder());

        System.out.println(list);
*/        
      
        
    }

}