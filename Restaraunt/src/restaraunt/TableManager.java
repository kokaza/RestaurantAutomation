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
public class TableManager {
    
    private ArrayList<Table> tableList;
    private Table currentTable;
    
    public TableManager(){
        
        tableList = new ArrayList<>();
        tableList.add(new Table());
        currentTable = null;
    }
    
    public void setCurrentTable(Table table){
        
    }
    
    public void updateTableStatus(Table table){
        
    }
    
    public Table getTable(int tableID){
        //return the table from the tableList with the specified tableID
        
        //this is temporary
        Table table = new Table();
        return table;
    }
}
