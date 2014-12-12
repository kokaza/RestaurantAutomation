/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaraunt;

import java.util.ArrayList;

/**
 *
 * @author tejgi_000
 */
public class OrderQueue {
    
    private ArrayList<Integer> orderIDList;
    
    public OrderQueue(){
        
        orderIDList = new ArrayList<>();
    }
    
    public void addOrderToQueue(int orderID){
        orderIDList.add(orderID);
        System.out.println("Order "+orderID+" added to the order queue");
    }
}
