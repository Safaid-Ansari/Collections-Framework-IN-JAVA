package collection_framework;

import java.util.ArrayDeque;

/*
 * We can use ArrayDeque in many ways
 * 1. We can insert elements from the front and the end
 * 2. We can delete elements from the front and the end
 * 3. We can peek elements from the front and the end
*/
public class LearnArrayDeque {
	
	public static void main(String[] args) {
		
		ArrayDeque<Integer> adq = new ArrayDeque<>();
		
		// offer() always add the new element at the end of queue and in this case at the end of dequeue
		// ArrayDeque also implements Queue implements so we can use offer() in ArrayDeque also
		adq.offer(23);
		adq.offer(33);
		adq.offer(44);
		adq.offer(55);
		adq.offer(66);
		
		System.out.println(adq);
		// insert the element at the front of the deque
		adq.offerFirst(1);
		// insert the element at the end of the deque
		adq.offerLast(2);
		System.out.println(adq);
		
		
		    System.out.println(adq.peek());
	        System.out.println(adq.peekFirst());
	        System.out.println(adq.peekLast());

	        System.out.println(adq.poll());
	        System.out.println("poll() " +adq);

	        System.out.println(adq.pollFirst());
	        System.out.println("pollFirst() " +adq);

	        System.out.println(adq.pollLast());
	        System.out.println("pollLast() " +adq);
	}
	
}
