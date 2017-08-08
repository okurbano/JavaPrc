package collections;

import java.util.PriorityQueue;

public class PriorityQueueEx1 {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(10);
		pq.add(20);
		pq.add(30);
		pq.add(40);
		
		System.out.println("size  = "+pq.size());
		System.out.println("value =   "+pq.peek());
		System.out.println("After peek the size  =   "+pq.size());
		System.out.println("value =     "+pq.poll());
		
		System.out.println("After poll the size  =   "+pq.size());
		
		System.out.println("Next value  = "+pq.peek());
		System.out.println("Finallyy My queue = "+pq);
		
		

	}

}
