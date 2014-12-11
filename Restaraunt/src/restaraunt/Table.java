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
public class Table {

    private ArrayList<Order> orderList;
    private String status;
    private int tableID;
    
    //default constructor
    public Table(){
        
        orderList = new ArrayList<Order>();
        status = "OPEN";
        tableID = -1;
    }
    
    public Table(int id){
        orderList = new ArrayList<Order>();
        status = "OPEN";
        tableID = id;
    }
    
    public int getTableID(){
        return tableID;
    }
    
    public String getStatus(){
        return this.status;
    }
    
    public void setTableStatus(String status){
        this.status = status;
    }
    
    public String toString(){
        
        return status+" "+tableID;
    }
}
