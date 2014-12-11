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
        orderLineItemList.add(item);
    }
    
    public void assignCategoryToCurrentItem(String category){
        currentOrderLineItem.setCategory(category);
    }
    
    public void assignItemID(int itemID){
        currentOrderLineItem.setItemID(itemID);
    }
    
    public OrderLineItem createOrderLineItem(){
        return new OrderLineItem();
    }
    
    //TODO: Duplicate of assignCategoryToCurrentItem()
    public void inputCategoryToCurrentItem(String category){
        assignCategoryToCurrentItem(category);
    }
    
    public void setCurrentLineItem(OrderLineItem orderLineItem){
        this.currentOrderLineItem = orderLineItem;
    }
    
    public void setStatus(String status){
        this.status = status;
    }
    
    public void assignDetails(String details){
        currentOrderLineItem.setItemDetails(details);
    }
    
    public void assignQuantity(int quantity) {
        currentOrderLineItem.setQuantity(quantity);
    }

    public ArrayList<OrderLineItem> getOrderLineItemList() {
        return orderLineItemList;
    }

    public void setOrderLineItemList(ArrayList<OrderLineItem> orderLineItemList) {
        this.orderLineItemList = orderLineItemList;
    }
    
    @Override
    public String toString() {
        return status + "(Table " + tableID + ") (Order " + orderID + ")";
    }
    
    public int getOrderID(){
        return orderID;
    }
}
