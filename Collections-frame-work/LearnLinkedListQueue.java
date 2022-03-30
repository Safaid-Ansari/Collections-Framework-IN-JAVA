package collection_framework;

import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        
        // offer() is used to add elements into the queue
        queue.offer(12);
        queue.offer(24);
        queue.offer(36);

        System.out.println(queue);

        // used to pop the first element
        System.out.println(queue.poll());	// 12

        System.out.println(queue);

        System.out.println(queue.peek());	// returns the head of the queue

    }
}
