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
    private Order currentOrder;
    //this keeps track of the number of orders so that orderIDs can be assigned
    private int orderCount;
    private int orderLineItemCount;
    
    public OrderManager(){
        
        this.orderList = new ArrayList<Order>();
        this.orderQueue = new OrderQueue();
        this.menuHandler = new MenuHandler();
        this.orderCount= 1;
        this.orderLineItemCount = 1;
    }
    
    public int createOrder(int tableID){
        Order order = new Order(tableID, orderCount);
        orderCount++;
        setCurrentOrder(order);
        addOrderToList(order);
        return order.getOrderID();
    }
    
    public void addOrderToList(Order order){
        orderList.add(order);
    }
    
    public void assignCategoryToCurrentItem(String category){
        
    }
    
    public void assignItemID(int itemID){
        
    }
    
    public void setCurrentOrder(Order order){
        currentOrder = order;
    }
    
    public void submitOrderToSystem(int orderID){
        orderQueue.addOrderToQueue(orderID);
    }
    
    public void updateOrderStatus(Order order){
        
    }
    
    public void assignDetails(){
        
    }
    
    public ArrayList<String> getMenuCategories(){
        return menuHandler.getMenuCategories();
    }

    public MenuHandler getMenuHandler() {
        return menuHandler;
    }
    public ArrayList<MenuItem> getItemsOfCategory(String category){
        ArrayList<MenuItem> temp = new ArrayList<>();
        temp = this.menuHandler.getItemsOfCategory(category);
        return temp;
    }
    
    public void addItemToOrder(int id, String name, String category, int quantity){
        OrderLineItem orderLineItem = new OrderLineItem(orderLineItemCount, name, category, quantity);
        currentOrder.addLineItemToList(orderLineItem);
        orderLineItemCount++;
    }
    
    public Order getOrder(int orderID){
        for(int i =0; i< orderList.size();i++){
            if(orderList.get(i).getOrderID() == orderID){
                return orderList.get(i);
            }
        }
        return null;
    }
}
