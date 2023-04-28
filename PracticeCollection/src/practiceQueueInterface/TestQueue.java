package practiceQueueInterface;
import java.util.*;

public class TestQueue {

	public static void main(String[] args) {
		//Queue<Integer> q= new LinkedList<>();
		//Queue<Integer> q= new ArrayDeque<>();
		
		Queue<Integer> q= new PriorityQueue<>();
		
		q.offer(30);
		q.offer(40);
		q.offer(20);
		q.offer(33);
		System.out.println("queue: "+q);
		System.out.println("deleted element: "+q.poll());
		System.out.println(q);
		
		Deque<Integer> dq= new LinkedList<>();
		
		//DeQue as Queue (FIFO)
		dq.offerLast(10);
		dq.offerLast(32);
		dq.offerLast(12);
		dq.offerLast(20);
		dq.offerLast(10);
		dq.offerLast(30);
		
		while(!dq.isEmpty()) {
			Integer ele = dq.pollFirst();
			System.out.println("Queue popped: "+ele);
		}
		
		System.out.println();
		
		//Deque as Stack(LIFO)
		dq.offerFirst(10);
		dq.offerFirst(50);
		dq.offerFirst(20);
		dq.offerFirst(10);
		dq.offerFirst(70);
		dq.offerFirst(10);

		while(!dq.isEmpty()) {
			Integer ele = dq.pollLast();
			System.out.println("Queue popped: "+ele);
		}
		
	}

}
