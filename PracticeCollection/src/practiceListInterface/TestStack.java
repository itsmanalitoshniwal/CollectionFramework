package practiceListInterface;
import java.util.*;

public class TestStack {

	public static void main(String[] args) {
		Stack<Integer> s= new Stack<>();
		s.push(10);
		s.push(20);
		System.out.println("stack elements: "+s);
		System.out.println("popped: "+s.pop());
		s.push(30);
		s.push(40);
		System.out.println("stack elements: "+s);
		System.out.println("popped: "+s.pop());
		
		System.out.println("stack elements: "+s);

	}

}
