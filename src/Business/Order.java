/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business;

import java.util.ArrayList;

/**
 *
 * @author sanil
 */
public class Order {
    private ArrayList  <OrderItem>orderItemList;
    private int orderNumber;
    
    private static int count=0;
  
    public Order()
    {
        count++;
        orderNumber=count;
        orderItemList = new ArrayList<OrderItem> ();
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

   
     
    public void removeOrderItem(OrderItem o)
    {
        
        int avail= o.getProductvaccine().getAvail();
        int newavail= avail + o.getQuantity();
        o.getProductvaccine().setAvail(newavail);
        orderItemList.remove(o);
    }
    public OrderItem addOrderItem(ProductVaccine p,int quantity){
        OrderItem o= new OrderItem();
        o.setProductvaccine(p);
        o.setQuantity(quantity);
        orderItemList.add(o);
        return o;
    }
      @Override
    public String toString(){
        return String.valueOf(orderNumber);
    }
    
    
}
