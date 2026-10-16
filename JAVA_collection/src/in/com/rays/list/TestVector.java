package in.com.rays.list;

import java.util.Vector;

public class TestVector {
	
	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		
		v.addElement("Ram");
		v.addElement(26);
		v.addElement(99);
		v.addElement("Ram");
		v.addElement("Rohan");
		
		System.out.println(v.get(3));
		System.out.println(v);
		
	}

}
