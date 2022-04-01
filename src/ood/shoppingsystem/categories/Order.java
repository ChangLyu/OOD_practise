package ood.shoppingsystem.categories;

import ood.shoppingsystem.constants.OrderStatus;

import java.util.Date;
import java.util.List;

public class Order {
    private String orderId;
    private OrderStatus status;
    private Date orderDate;
    private List<OrderLog> orderLog;

    public void searchForShipment(){}

    public void makePayment(){}
    public void addOrderLog(OrderLog orderLog){}
}
