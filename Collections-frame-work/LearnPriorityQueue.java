package collection_framework;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {

    public static void main(String[] args) {

    	// max priority queue;
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        // min priority queue;
        Queue<Integer> pq2 = new PriorityQueue<>();
        
        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);

        pq2.offer(40);
        pq2.offer(12);
        pq2.offer(24);
        pq2.offer(36);

        
        System.out.println(pq);
        System.out.println(pq2);
        pq.poll();
        System.out.println(pq);

        System.out.println(pq.peek());

    }

}
