package in.co.rays.inheritance;

public class TestFoodOrder {
	
	public static void main(String[] args) {
		
		FoodOrder fo = new FoodOrder();
		
		
		fo.setCostumberName("rohit");
		fo.setDeliveryStatus("Rechived");
		fo.setOrderAmount(25052);
		fo.setOrderId(12);
		fo.setRestaurant("SAYA JI");
		
		
		
		System.out.println(fo.getRestaurant());
		System.out.println(fo.getOrderId());
		System.out.println(fo.getOrderAmount());
		System.out.println(fo.getDeliveryStatus());
		
		
		
	}

}
