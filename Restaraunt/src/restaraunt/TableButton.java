/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaraunt;

import javax.swing.JButton;

/**
 *
 * @author tejgi_000
 */
public class TableButton extends JButton{
    
    private Table table;
    
    public TableButton(){
        super();
        //this.table = table;
    }
    
    public void changeColor(){
         
    }
    
    public int getTableID(){
        return table.getTableID();
    }
    
    public void setTable(Table table){
        this.table = table;
    }
}
