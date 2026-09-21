package in.co.rays.encapsulation;

import java.text.SimpleDateFormat;

public class TestEmployee {
    public static void main(String[] args) {
        Employee e = new Employee();
        
        e.setEmployeeId(101L);
        e.setName("Chintu");
        e.setDesignation("Software Developer");
        e.setSalary(50000.0);
        e.setJoiningDate(new java.util.Date());

        System.out.println("ID: " + e.getEmployeeId());
        System.out.println("Name: " + e.getName());
        System.out.println("Designation: " + e.getDesignation());
        System.out.println("Salary: " + e.getSalary());
        System.out.println("Joining Date: " + e.getJoiningDate());
    }
}
