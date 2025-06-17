package themes.LMD_07_collections.queues;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Reference : https://www.jmdoudoux.fr/java/dej/chap-collections.htm#collections-3
 * Section: 14
 * 
 * Demonstrates the use of PriorityQueue in Java.
 * - Elements are ordered by natural order or custom comparator
 * - Not FIFO: sorted by priority !
 */
public class PriorityQueueDemo {
	
	public static void main(String[] args) {
		
		Queue<Integer> queue = new PriorityQueue<>();
		
		queue.add(5);
		queue.add(1);
		queue.add(6);
		queue.add(4);
		queue.add(12);
		
		System.out.println("PriorityQueue contents: " + queue); // Warning: This is the internal structure (min-heap) NOT sorted order only the head is guaranteed to be the smallest element
        while (!queue.isEmpty()) {
            System.out.println("Polled: " + queue.poll());  // Poll removes and returns elements in priority order (smallest first)
        }
	}
}
