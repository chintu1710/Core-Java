package in.com.rays.list;

import java.util.Iterator;
import java.util.Stack;

public class TestVectorA {

	public static void main(String[] args) {

		Stack s1 = new Stack();

		for (char c = 'a'; c <= 'z'; c++) {

			s1.push(c);
			System.out.println(" " + c);
		}

		Stack s2 = new Stack();

		if (s1 != null) {yhy
			s2.push(s1.pop());
		}
		System.out.println(s2);
	}

}
