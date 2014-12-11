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
        for(int i =1;i<11;i++){
            Table temp = new Table(i);
            tableList.add(temp);
            //System.out.println(temp.toString());
        }
        tableList.get(4).setTableStatus("DIRTY");
        currentTable = null;
    }
    
    public void setCurrentTable(Table table){
        
    }
    
    public void updateTableStatus(Table table){
        
    }
    
    public Table getTable(int tableID){
        //return the table from the tableList with the specified tableID
        
        //this is temporary
        for(int i =0;i<tableList.size();i++){
            if(tableList.get(i).getTableID()== tableID){
                return tableList.get(i);
            }
        }
        return null;
    }
}
