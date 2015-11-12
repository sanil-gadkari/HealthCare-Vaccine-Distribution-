/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.Order;

/**
 *
 * @author sanil
 */
public class ProviderWorkRequest extends WorkRequest {
    private String orderApproved;
    private Order order;
    private int population;
    private int totalPrice;
    

    public String getOrderApproved() {
        return orderApproved;
    }

    public void setOrderApproved(String orderApproved) {
        this.orderApproved = orderApproved;
    }
    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    
    

   

   
    
}
