package in.co.rays.encapsulation;

import java.util.Date;

public class TestOrder {
	public static void main(String[] args) {
		Order o = new Order();
		o.setProductid(101);
		o.setOrderdate(new Date());
		o.setAmount(4500.75);
		o.setStatus("Confirmed");
		o.setCustomerid(2001);

		System.out.println("Product ID: " + o.getProductid());
		System.out.println("Order Date: " + o.getOrderdate());
		System.out.println("Amount: " + o.getAmount());
		System.out.println("Status: " + o.getStatus());
		System.out.println("Customer ID: " + o.getCustomerid());
	}
}
