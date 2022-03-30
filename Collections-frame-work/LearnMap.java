package collection_framework;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {

    public static void main(String[] args) {

        Map<String, Integer> numbers1 = new HashMap<>();
        Map<String, Integer> numbers = new TreeMap<>();
        
        
		/* 
		 * The only difference between TreeMap and HashMap are:
		 * In treeMap keys will be in sorted order because, TreeMap has the property of both binary tree and map alike TreeSet
		 * All the operations in TreeMap will be in O(logn), 
		 * where as all the operations in HashMap will be in O(1) 
		 */

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Four", 4);
        numbers.put("Five", 5);

        numbers.remove("Three");

        
        if(!numbers.containsKey("Two")) {
            numbers.put("Two", 23);
        }
        numbers.putIfAbsent("Two", 23);
        
        
        System.out.println(numbers);
        System.out.println(numbers.containsValue(3));
        System.out.println(numbers.isEmpty());

 
        
     // Ways to TRAVERSING in a MAP
        
        // method1 (to get both keys and values)
        for(Map.Entry<String, Integer> e: numbers.entrySet()) {
        	System.out.println(e);
        	
        	System.out.print(e.getKey() + " ");
        	System.out.println(e.getValue());
        }
        
        
        // method2 (to get only keys)
        for (String key: numbers.keySet()) 
            System.out.println(key);
        
        
        // method3 (to get only values)
        for(Integer value: numbers.values()) 
            System.out.println(value);
        

    }
}
