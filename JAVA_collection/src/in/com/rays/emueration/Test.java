package in.com.rays.emueration;

import java.util.Enumeration;
import java.util.Vector;

public class Test {
	
	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		
		v.add("orange");
		v.add("Mango");
		v.add("Banana");
		v.add("Kivi");
		v.add("Papaya");
		
		Enumeration e = v.elements();
		
		while (e.hasMoreElements()) {
			Object o = e.nextElement();
			System.out.println(o);
		}
	}

}
