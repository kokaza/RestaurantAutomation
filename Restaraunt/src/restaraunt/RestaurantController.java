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
public class RestaurantController {
    
    private String currentCategory;
    private int currentOrderID;
    private int currentItemID;
    private int currentTableID;
    
    private OrderManager orderManager;
    private TableManager tableManager;
    
    private CookUI cookUI;
    private WaiterUI waiterUI;
    
    public RestaurantController(){
        
        this.currentCategory = "";
        this.currentOrderID = -1;
        this.currentItemID = -1;
        this.currentTableID = -1;
        
        this.orderManager = new OrderManager();
        this.tableManager = new TableManager();
    }
    
    public void createOrder(){
        currentOrderID = orderManager.createOrder(currentTableID);
        System.out.println("Order Created with order ID: "+currentOrderID);
    }
    

    public void acknowledgeOrder(){
        
    }
    
    public void inputCategory(){
        
    }
    
    //probably not needed
    public void refreshScreen(){
        
    }
    //probably not needed
    public void refreshTableScreen(){
        
    }
    
    public void addItemToOrder(String name, String category, int quantity){
        orderManager.addItemToOrder(currentOrderID, name, category, quantity);
    }
    
    public void submitOrder(){
        System.out.println("Order "+ currentOrderID +" was submitted to the kitchen");
        Order order = orderManager.getOrder(currentOrderID);
        order.printItems();
        orderManager.submitOrderToSystem(currentOrderID);
        populateOrderQueue();
        //System.out.println(order.toString());
        
        
    }
    
    public void submitStatusUpdate(){
        
    }
    

    public Table getTable(int tableID){
        
        return tableManager.getTable(tableID);
    }
    
    public ArrayList<String> getMenuCategories(){
        return orderManager.getMenuCategories();
    }

    public OrderManager getOrderManager() {
        return orderManager;
    }

    public String getCurrentCategory() {
        return currentCategory;
    }
    public ArrayList<MenuItem> getItemsOfCategory(String category){
        ArrayList<MenuItem> temp = new ArrayList<>();
        temp = this.orderManager.getItemsOfCategory(category);
        return temp;
    }
    
    public void setCurrentTableID(int tableID){
        this.currentTableID = tableID;
    }
    
    public void updateTableStatus(int tableID, String status){
        tableManager.updateTableStatus(tableID, status);
    }
    
    public ArrayList<OrderLineItem> getOrderLineItemList(int orderID){
        return orderManager.getOrderLineItemList(orderID);
    }
    
    public ArrayList<Order> getOrderList(){
        return orderManager.getOrderList();
    }
    
    public void populateOrderQueue(){
        cookUI.populateOrderQueueScreen();
    }
    
    public void setCookUI(CookUI ui){
        cookUI = ui;
    }
    
    public void setWaiterUI(WaiterUI ui){
        waiterUI = ui;
    }
}
