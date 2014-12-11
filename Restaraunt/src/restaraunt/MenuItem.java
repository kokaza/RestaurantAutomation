/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaraunt;

/**
 *
 * @author tejgi_000
 */
public class MenuItem {
    
    private int menuItemID;
    private double menuItemPrice;
    private String menuItemName;
    private String menuItemDescription;
    private String menuItemCategory;
    
    public MenuItem(int id, double price, String name, String description, String category){
        
        this.menuItemID = id;
        this.menuItemPrice = price;
        this.menuItemName = name;
        this.menuItemDescription = description;
        this.menuItemCategory = category;
    }

    public int getMenuItemID() {
        return menuItemID;
    }

    public void setMenuItemID(int menuItemID) {
        this.menuItemID = menuItemID;
    }

    public double getMenuItemPrice() {
        return menuItemPrice;
    }

    public void setMenuItemPrice(double menuItemPrice) {
        this.menuItemPrice = menuItemPrice;
    }

    public String getMenuItemName() {
        return menuItemName;
    }

    public void setMenuItemName(String menuItemName) {
        this.menuItemName = menuItemName;
    }

    public String getMenuItemDescription() {
        return menuItemDescription;
    }

    public void setMenuItemDescription(String menuItemDescription) {
        this.menuItemDescription = menuItemDescription;
    }

    public String getMenuItemCategory() {
        return menuItemCategory;
    }

    public void setMenuItemCategory(String menuItemCategory) {
        this.menuItemCategory = menuItemCategory;
    }
    
}
