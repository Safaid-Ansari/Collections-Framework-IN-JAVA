package collection_framework;
 
import java.util.Arrays;

public class LearnArraysClass {

    public static void main(String[] args) {

        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int index = Arrays.binarySearch(numbers, 4);
		/*
		 * while using binarySearch() 
		 * 1. When an element is present then it will return the index of that element
		 * 2. If an element is not present then it will return some random -ve value
		 */
        System.out.println("The index of element 4 in the array is " + index);

//        Integer[] numbers = { 10, 2, 32, 12, 15, 76, 17, 48, 79, 9 };
//        Arrays.sort(numbers);
//
//        Arrays.parallelSort(numbers);
//        // 8192
//
//        Arrays.fill(numbers, 12);
//
//        for (int i : numbers) {
//            System.out.print(i + " ");
//        }



    }
}
