package themes.LMD_07_collections.queues;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Reference : https://www.jmdoudoux.fr/java/dej/chap-collections.htm#collections-3
 * Section: 14
 * 
 * Demonstrates the use of Queue in Java using LinkedList.
 * - FIFO structure: First-In, First-Out
 */
public class QueueDemo {
	
	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<>();
		
		queue.add("Charlie");
		queue.add("Alice");
		queue.add("Bob");
		
		System.out.println("Initial Queue: " + queue);
		System.out.println("Queue Size: " + queue.size());
        System.out.println("Polled: " + queue.poll());  // Removes and returns the first element (head) of the queue
        System.out.println("Queue after poll: " + queue); // Shows the queue after the head element has been removed
        System.out.println("Peek: " + queue.peek()); // Returns the head of the queue without removing it
	}
}
