package in.com.rays.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestElement {
    public static void main(String[] args) {
        
        List list = new ArrayList();
        
        list.add("Ram");
        list.add("Shyam");
        list.add("Rahul");
        list.add("Sumit");
        list.add("85");  
        
        list.add("Ram");
        list.add("85");
        
        System.out.println("Original List: " + list);
        
        Set s = new TreeSet(list);
        
        System.out.println("Sorted Unique Set: " + s);
    }
}
