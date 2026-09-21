package in.co.rays.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
	public static void main(String[] args) throws ParseException {
		
		
		Date d = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println(sdf.format(d));
		
		String dob = "2005-10-17";
		
		Date doo =sdf.parse(dob);
		System.out.println(doo);
		System.out.println();
		
	}

}
