package in.co.rays.type.cast;

public class TestPerson {
	public static void main(String[] args) {
	
	Person p = new Child();
	
	Child c = (Child)p;
	
	
//	c.setAge(18);
	c.setName("Rohit");
	c.setRelation("Friend");
	c.setRollno(1532010019);
	
	System.out.println(c.getName());
	System.out.println(c.getAge());
	System.out.println(c.getRelation());
	
	
	
	
	
	
	}

}
