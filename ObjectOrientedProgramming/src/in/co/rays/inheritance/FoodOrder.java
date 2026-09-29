package in.co.rays.inheritance;

public class FoodOrder {
	
	private int orderid;
	private String costumbername;
	private String restaurant;
	private double orderamount;
	private String deliverystatus;
	
	
	
	public int getOrderId() {
		return orderid;
	}
	public void setOrderId(int orderid) {
		this.orderid = orderid;
	}
	public String getCostumberName() {
		return costumbername;
	}
	public void setCostumberName(String costumbername) {
		this.costumbername = costumbername;
	}
	public String getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(String restaurant) {
		this.restaurant = restaurant;
	}
	public double getOrderAmount() {
		return orderamount;
	}
	public void setOrderAmount(double orderamount) {
		this.orderamount = orderamount;
	}
	public String getDeliveryStatus() {
		return deliverystatus;
	}
	public void setDeliveryStatus(String deliverystatus) {
		this.deliverystatus = deliverystatus;
	}
	}
