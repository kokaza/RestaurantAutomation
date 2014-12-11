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
    
    public RestaurantController(){
        
        this.currentCategory = "";
        this.currentOrderID = -1;
        this.currentItemID = -1;
        this.currentTableID = -1;
        
        this.orderManager = new OrderManager();
        this.tableManager = new TableManager();
    }
    
    public void createOrder(){
        orderManager.createOrder(currentTableID);
    }
    
    public void submitOrderToSystem(){
        
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
    
    public void selectAddItem(){
        //use current table
    }
    
    public void submitOrder(){
        
    }
    
    public void submitStatusUpdate(){
        
    }
    
    public void inputItem(){
        //done in the UI
    }
    
    public void refreshFloorScreen(){
        
    }
    
    public void submitViewTables(){
        
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
    
}
