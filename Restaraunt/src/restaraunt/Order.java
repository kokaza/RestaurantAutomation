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
public class Order {
    
    private int orderID;
    private String status;
    private OrderLineItem currentOrderLineItem;
    private ArrayList<OrderLineItem> orderLineItemList;
    private int tableID;
    
    public Order(int tableID, int orderID){
        
        this.orderID = orderID;
        this.status = "PENDING";
        this.currentOrderLineItem = null;
        this.orderLineItemList = new ArrayList<OrderLineItem>();
        this.tableID = tableID;
    }
    
    public void addLineItemToList(OrderLineItem item){
        
    }
    
    public void assignCategoryToCurrentItem(){
        
    }
    
    public void assignItemID(int itemID){
        
    }
    
    public void createOrderLineItem(){
        
    }
    
    public void inputCategoryToCurrentItem(){
        
    }
    
    public void setCurrentLineItem(OrderLineItem orderLineItem){
        
    }
    
    public void setStatus(String status){
        
    }
    
    public void assignDetails(String details){
        
    }
}
