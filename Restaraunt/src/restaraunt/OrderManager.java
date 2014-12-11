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
public class OrderManager {
    
    private ArrayList<Order> orderList;
    private OrderQueue orderQueue;
    private MenuHandler menuHandler;
    //this keeps track of the number of orders so that orderIDs can be assigned
    private int orderCount;
    
    public OrderManager(){
        
        this.orderList = new ArrayList<>();
        this.orderQueue = new OrderQueue();
        this.menuHandler = new MenuHandler();
        this.orderCount= 1;
    }
    
    public void createOrder(int tableID){
        Order order = new Order(tableID, orderCount);
        orderCount++;
        setCurrentOrder(order);
        addOrderToList(order);
    }
    
    public void addOrderToList(Order order){
        
    }
    
    public void assignCategoryToCurrentItem(String category){
        
    }
    
    public void assignItemID(int itemID){
        
    }
    
    public void setCurrentOrder(Order order){
        
    }
    
    public void submitCurrentOrder(){
        
    }
    
    public void updateOrderStatus(Order order){
        
    }
    
    public void assignDetails(){
        
    }
    
}
