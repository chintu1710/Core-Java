package in.com.rays.costam.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class TestPerson {
    
    public static void main(String[] args) {
        
        Person p1 = new Person("Rohit", 22, "Delhi", "rohit@gmail.com");
        Person p2 = new Person("Ram", 25, "Mumbai", "8**@gmail.com");
        Person p3 = new Person("Sita", 20, "Bangalore", "sita@2332");
        Person p4 = new Person("Mohan", 30, "Chennai", "mohan@2332");
        
        List<Person> list = new ArrayList<Person>();
        
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(new Person("Ramesh", 28, "Kolkata", "ramesh@2332"));
        
        Iterator<Person> it = list.iterator();
        
        while (it.hasNext()) {
            Person p = it.next();
            System.out.println(p.getName());
            System.out.println(p.getAge());
            System.out.println(p.getAddress());
            System.out.println(p.getEmail());
            System.out.println("------");
        }
    }
}
