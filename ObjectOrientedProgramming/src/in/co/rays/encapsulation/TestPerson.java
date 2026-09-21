package in.co.rays.encapsulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
public static void main(String[] args) throws ParseException{
		
	Person p = new Person();
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	p.setName("chintu");
	p.setDob(sdf.parse("2003-10-05"));
	p.setAddress("betul");
	
	
	System.out.println(p.getName());
	System.out.println(sdf.format(p.getDob()));
	System.out.println(p.getAddress());
	p.getAge();
	
	
	
			
}
}
