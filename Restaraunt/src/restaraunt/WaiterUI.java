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
public class WaiterUI extends javax.swing.JFrame {

    private RestaurantController restaurantController;
    private WaiterFloorScreen floorScreen;
    private WaiterTableScreen currentTableScreen;
    private WaiterAddItemScreen addItemScreen;
    
    private TableButton currentTableButton;
    /**
     * Creates new form WaiterUI
     */
    public WaiterUI(RestaurantController controller) {
        //initComponents();
        this.restaurantController = controller;
        this.floorScreen = new WaiterFloorScreen(this);
        this.addItemScreen = new WaiterAddItemScreen(this);
        //System.out.println(restaurantController.toString());
        setContentPane(floorScreen);
        pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelWaiterHome = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        jButton1.setText("View Floor Status");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelWaiterHomeLayout = new javax.swing.GroupLayout(panelWaiterHome);
        panelWaiterHome.setLayout(panelWaiterHomeLayout);
        panelWaiterHomeLayout.setHorizontalGroup(
            panelWaiterHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelWaiterHomeLayout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(472, Short.MAX_VALUE))
        );
        panelWaiterHomeLayout.setVerticalGroup(
            panelWaiterHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelWaiterHomeLayout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(238, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelWaiterHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelWaiterHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
   public void showTableScreen(int tableID){
       restaurantController.setCurrentTableID(tableID);
       WaiterTableScreen tableScreen = new WaiterTableScreen(tableID,this);
       //System.out.println("Blah: "+tableID);
       currentTableScreen = tableScreen;
       setContentPane(currentTableScreen);
       pack();
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel panelWaiterHome;
    // End of variables declaration//GEN-END:variables

   public void showFloorScreen() {
       floorScreen.initTableButtons();
        setContentPane(floorScreen);
        pack();
    }

   public void showAddItemScreen() {
        setContentPane(addItemScreen);
        pack();
    }
   
   public void showCurrentTableScreen(){
       currentTableScreen.populateOrderList();
       setContentPane(currentTableScreen);
       pack();
   }
   
   public ArrayList<String> getMenuCategories(){
       return this.restaurantController.getMenuCategories();
   }

    public RestaurantController getController() {
        return this.restaurantController;
    }
    
    public ArrayList<MenuItem> getItemsOfCategory(String category){
        ArrayList<MenuItem> temp = new ArrayList<>();
        temp = this.restaurantController.getItemsOfCategory(category);
        return temp;
    }
    
    public int getStatusOfTable(int tableID){
        return 0;
    }
    public Table getTable(int id){
        return restaurantController.getTable(id);
    }
    
    public void updateTableStatus(int tableID, String status){
        restaurantController.updateTableStatus(tableID, status);
    }
   
    public void createOrder(){
        restaurantController.createOrder();
    }
    
    public void addItemToOrder(String name, String category, int quantity){
        restaurantController.addItemToOrder(name, category, quantity);
    }
    
    public void submitOrder(){
        restaurantController.submitOrder();
    }
    
    public ArrayList<Order> getOrderList(){
        return restaurantController.getOrderList();
    }
    
    public void populateOrderList(){
        currentTableScreen.populateOrderList();
    }
}
