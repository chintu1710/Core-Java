package in.com.rays.generics;

import java.util.List;
import java.util.ArrayList; 

public class Test {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("Rohit");
        list.add("Ram");
        list.add("Shyam");
        list.add("Chintu");

   
        for (String s : list) {
            System.out.println(s);
        }
    }
}
