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
public class MenuHandler {
    
    private int currentItemID;
    private String currentItemName;
    private double currentItemPrice;
    private String currentItemCategory;
    
    private ArrayList<String> menuCategories;
    private ArrayList<MenuItem> menuItems;
    
    
    public MenuHandler(){
        
        this.currentItemID = -1;
        this.currentItemName = "";
        this.currentItemPrice = 0.0;
        
        menuCategories = new ArrayList<String>();
        menuCategories.add("Soup/Salad");
        menuCategories.add("Entrees");
        menuCategories.add("Drinks");
        
        menuItems = new ArrayList<MenuItem>();
        MenuItem salad = new MenuItem(1, 10.50,"Caesar Salad", "A Tasty Salad", "Soup/Salad");
        menuItems.add(salad);
        MenuItem steak = new MenuItem(2, 25.50, "Ribeye Steak", "A 12oz. piece of heaven", "Entrees");
        menuItems.add(steak);
    }

    public int getCurrentItemID() {
        return currentItemID;
    }

    public void setCurrentItemID(int currentItemID) {
        this.currentItemID = currentItemID;
    }

    public String getCurrentItemName() {
        return currentItemName;
    }

    public void setCurrentItemName(String currentItemName) {
        this.currentItemName = currentItemName;
    }

    public double getCurrentItemPrice() {
        return currentItemPrice;
    }

    public void setCurrentItemPrice(double currentItemPrice) {
        this.currentItemPrice = currentItemPrice;
    }

    public String getCurrentItemCategory() {
        return currentItemCategory;
    }

    public void setCurrentItemCategory(String currentItemCategory) {
        this.currentItemCategory = currentItemCategory;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public ArrayList<String> getMenuCategories() {
        return menuCategories;
    }

    public void setMenuCategories(ArrayList<String> menuCategories) {
        this.menuCategories = menuCategories;
    }
    
    
    
}
