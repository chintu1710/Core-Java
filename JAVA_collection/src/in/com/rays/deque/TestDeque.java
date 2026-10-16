package in.com.rays.deque;

import java.util.ArrayDeque;

public class TestDeque {
	
	public static void main(String[] args) {
		
		// Fifo
		
		ArrayDeque a = new ArrayDeque();
		
		
		a.add('a');
		a.add('c');
		a.add('b');
		a.add('r');
		a.add('g');
		a.add('h');
		a.add('b');
		
		System.out.println(a);
		
		System.out.println(a.peek());
		System.out.println(a);
		
		System.out.println(a.poll());
		System.out.println(a);
		
		System.out.println(a.poll());
		System.out.println(a);
		
		
	}

}
