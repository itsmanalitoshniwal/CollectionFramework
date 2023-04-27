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
		
		
	}

}
