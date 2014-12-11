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
    
    public int getTableID(){
        return tableID;
    }
    
    public String getStatus(){
        return status;
    }
}
