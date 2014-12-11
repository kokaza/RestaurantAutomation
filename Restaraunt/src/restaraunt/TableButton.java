/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaraunt;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author tejgi_000
 */
public class TableButton extends JButton{
    
    private Table table;
    
    public TableButton(){
        super();
        this.table = new Table();
        changeColor();
    }
    
    public void changeColor(){
         switch(table.getStatus()){
             
             case "OPEN": setBackground(Color.GREEN);break;
             case "OCCUPIED": setBackground(Color.YELLOW);break;
             case "DIRTY": setBackground(Color.RED);break;
   
         }
    }
    
    public int getTableID(){
        return table.getTableID();
    }
    
    public void setTable(Table table){
        this.table = table;
    }
}
