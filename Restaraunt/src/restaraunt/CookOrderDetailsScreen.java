/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaraunt;

import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author dmhaffner
 */
public class CookOrderDetailsScreen extends javax.swing.JPanel {

    private CookUI cookUI;
    private Order currentOrder;
    /**
     * Creates new form CookOrderDetailsScreen
     */
    public CookOrderDetailsScreen(Order order, CookUI cookUI) {
        this.cookUI = cookUI;
        this.currentOrder = order;
        initComponents();
        initOrderDetails(order);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        orderDetailsLabel = new javax.swing.JLabel();
        orderDetailsScrollPane = new javax.swing.JScrollPane();
        listOrderDetails = new javax.swing.JList();
        btnBack = new javax.swing.JButton();
        btnConfirm = new javax.swing.JButton();

        orderDetailsLabel.setText("Order Details");

        listOrderDetails.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        orderDetailsScrollPane.setViewportView(listOrderDetails);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(orderDetailsScrollPane)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(orderDetailsLabel)
                        .addGap(0, 300, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnConfirm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBack)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(orderDetailsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(orderDetailsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnConfirm))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        cookUI.showOrderQueueScreen();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:
        currentOrder.setStatus("CONFIRMED");
        cookUI.populateOrderList();
        cookUI.showOrderQueueScreen();
    }//GEN-LAST:event_btnConfirmActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JList listOrderDetails;
    private javax.swing.JLabel orderDetailsLabel;
    private javax.swing.JScrollPane orderDetailsScrollPane;
    // End of variables declaration//GEN-END:variables

    private void initOrderDetails(Order order) {
        javax.swing.DefaultListModel<String> listModel;
        listModel = new javax.swing.DefaultListModel<>();
        
        //listModel.addElement("test 1");
        //listModel.addElement("test 2");
        //listModel.addElement("test 3");
        
        for (OrderLineItem orderLineItem : order.getOrderLineItemList()) {
            listModel.addElement(orderLineItem.toString());
        }
        listOrderDetails.setModel(listModel);
        cookUI.pack();
    }
    
    public void populateOrderDetails(){
        DefaultListModel<OrderLineItem> listModel;
        listModel = new DefaultListModel<OrderLineItem>();
        ArrayList<OrderLineItem> temp = currentOrder.getOrderLineItemList();
        for(int i = 0;i< temp.size();i++){
            listModel.addElement(temp.get(i));
        }
        listOrderDetails.setModel(listModel);
    }
}