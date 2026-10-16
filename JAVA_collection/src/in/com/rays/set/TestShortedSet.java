package in.com.rays.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestShortedSet {
	
	public static void main(String[] args) {
		
		
		SortedSet s = new TreeSet();
		
		
		
		s.add('b');
		s.add('c');  // duplicate element allow nhi hai
		s.add('a');	// hamasa asending order 
		s.add('c');	// iskie concrate class treeSet hai 
		s.add('b');
		s.add('d');
		
		System.out.println(s);
	}

}
