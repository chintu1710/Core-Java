package in.co.rays.encapsulation;

import java.util.Date;

public class Order {

    private long productid;
    private Date orderdate;
    private double amount;
    private String status;
    private long customerid;

    public void setProductid(long productid) {
        this.productid = productid;
    }
    public long getProductid() {
        return productid;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }
    public Date getOrderdate() {
        return orderdate;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public double getAmount() {
        return amount;
    }


    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatus() {
        return status;
    }


    public void setCustomerid(long customerid) {
        this.customerid = customerid;
    }
    public long getCustomerid() {
        return customerid;
    }
}
