/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Order;

import Business.Order.Menu;
import Business.Order.OrderItem;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.RestaurantAdminRole.RestMenuJPanel;

/**
 *
 * @author shivanginagar
 */



public class EditMenuItemJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EditMenuItemJPanel
     */
    private final JPanel container;
    private final OrderItem item;
    private final Menu menuDirectory;
    
    public EditMenuItemJPanel(JPanel container,OrderItem item, Menu menuDirectory) {
        initComponents();
        this.container = container;
        this.item = item;
        this.menuDirectory = menuDirectory;
        txtItemName.setText(item.getItemName());
        txtIngredients.setText(item.getIngredients());
        txtItemPrice.setText(String.valueOf(item.getPrice()));
        txtCategory.setText(String.valueOf(item.getCategory()));
        txtItemNo.setText(item.getItemNo());
        disableUpdate();
    }
    
    void disableUpdate(){
        txtItemName.setEditable(false);
        txtItemNo.setEditable(false);
        txtIngredients.setEditable(false);
        txtItemPrice.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAddItem = new javax.swing.JLabel();
        lblItemName = new javax.swing.JLabel();
        lblCategory = new javax.swing.JLabel();
        lblIngredients = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        txtItemPrice = new javax.swing.JTextField();
        txtCategory = new javax.swing.JTextField();
        txtIngredients = new javax.swing.JTextField();
        txtItemName = new javax.swing.JTextField();
        lblItemNo = new javax.swing.JLabel();
        txtItemNo = new javax.swing.JTextField();
        btnEnableUpdate = new javax.swing.JButton();
        btnSaveChanges = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));
        setForeground(new java.awt.Color(0, 51, 51));

        lblAddItem.setBackground(new java.awt.Color(204, 255, 255));
        lblAddItem.setFont(new java.awt.Font("Tamil MN", 1, 18)); // NOI18N
        lblAddItem.setForeground(new java.awt.Color(0, 51, 51));
        lblAddItem.setText("Order Item Details");

        lblItemName.setBackground(new java.awt.Color(204, 255, 255));
        lblItemName.setFont(new java.awt.Font("Tamil MN", 1, 12)); // NOI18N
        lblItemName.setForeground(new java.awt.Color(0, 51, 51));
        lblItemName.setText("Item Name :");

        lblCategory.setBackground(new java.awt.Color(204, 255, 255));
        lblCategory.setFont(new java.awt.Font("Tamil MN", 1, 12)); // NOI18N
        lblCategory.setForeground(new java.awt.Color(0, 51, 51));
        lblCategory.setText("Category :");

        lblIngredients.setBackground(new java.awt.Color(204, 255, 255));
        lblIngredients.setFont(new java.awt.Font("Tamil MN", 1, 12)); // NOI18N
        lblIngredients.setForeground(new java.awt.Color(0, 51, 51));
        lblIngredients.setText("Ingredients Added :");

        lblPrice.setBackground(new java.awt.Color(204, 255, 255));
        lblPrice.setFont(new java.awt.Font("Tamil MN", 1, 12)); // NOI18N
        lblPrice.setForeground(new java.awt.Color(0, 51, 51));
        lblPrice.setText("Price :");

        txtItemPrice.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        txtItemPrice.setForeground(new java.awt.Color(0, 51, 51));

        txtCategory.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        txtCategory.setForeground(new java.awt.Color(0, 51, 51));

        txtIngredients.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        txtIngredients.setForeground(new java.awt.Color(0, 51, 51));

        txtItemName.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        txtItemName.setForeground(new java.awt.Color(0, 51, 51));

        lblItemNo.setBackground(new java.awt.Color(204, 255, 255));
        lblItemNo.setFont(new java.awt.Font("Tamil MN", 1, 12)); // NOI18N
        lblItemNo.setForeground(new java.awt.Color(0, 51, 51));
        lblItemNo.setText("Item ID :");

        txtItemNo.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        txtItemNo.setForeground(new java.awt.Color(0, 51, 51));

        btnEnableUpdate.setBackground(new java.awt.Color(204, 255, 255));
        btnEnableUpdate.setFont(new java.awt.Font("Tamil MN", 1, 12)); // NOI18N
        btnEnableUpdate.setForeground(new java.awt.Color(0, 51, 51));
        btnEnableUpdate.setText("Update");
        btnEnableUpdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEnableUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnableUpdateActionPerformed(evt);
            }
        });

        btnSaveChanges.setBackground(new java.awt.Color(204, 255, 255));
        btnSaveChanges.setFont(new java.awt.Font("Tamil MN", 1, 12)); // NOI18N
        btnSaveChanges.setForeground(new java.awt.Color(0, 51, 51));
        btnSaveChanges.setText("Save ");
        btnSaveChanges.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSaveChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveChangesActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(204, 255, 255));
        btnBack.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 51, 51));
        btnBack.setText("Back");
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblIngredients)
                                    .addComponent(lblItemName))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIngredients, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPrice)
                                    .addComponent(lblCategory))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtItemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblItemNo)
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAddItem)
                                    .addComponent(txtItemNo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(124, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSaveChanges, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnableUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(161, 161, 161))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnBack)
                .addGap(10, 10, 10)
                .addComponent(lblAddItem)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblItemNo)
                    .addComponent(txtItemNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblItemName)
                    .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIngredients)
                    .addComponent(txtIngredients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategory)
                    .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrice)
                    .addComponent(txtItemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnEnableUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSaveChanges, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnableUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnableUpdateActionPerformed
        // TODO add your handling code here:
        txtCategory.setEditable(true);
        txtIngredients.setEditable(true);
        txtItemName.setEditable(true);
        txtItemPrice.setEditable(true);

        btnEnableUpdate.setEnabled(false);
    }//GEN-LAST:event_btnEnableUpdateActionPerformed

    private void btnSaveChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveChangesActionPerformed
        // TODO add your handling code here:

         String itemNo = txtItemNo.getText();
        String itemName = txtItemName.getText();
        String itemCat = txtCategory.getText();
        String ingredients = txtIngredients.getText();
        Double itemPrice = 0.0;
        try{
            itemPrice  = Double.parseDouble(txtItemPrice.getText());
        } catch(NumberFormatException exception){
            JOptionPane.showMessageDialog(null, "Invalid Price Entered!");
        }
        if(itemNo.isEmpty() || itemName.isEmpty() || itemCat.isEmpty() || ingredients.isEmpty() || itemPrice == 0.0){
            JOptionPane.showMessageDialog(null, "Kindly Fill All the Fields!");
        }
        else{
            menuDirectory.updateOrderItem(item.getItemNo(),itemName,ingredients,itemPrice,itemCat);
            disableUpdate();
            JOptionPane.showMessageDialog(null, "Menu item successfully!");
        }
        
    }//GEN-LAST:event_btnSaveChangesActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:

        container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        RestMenuJPanel restMenuJPanel = (RestMenuJPanel) component;
        restMenuJPanel.populateMenuTable();
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);

    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEnableUpdate;
    private javax.swing.JButton btnSaveChanges;
    private javax.swing.JLabel lblAddItem;
    private javax.swing.JLabel lblCategory;
    private javax.swing.JLabel lblIngredients;
    private javax.swing.JLabel lblItemName;
    private javax.swing.JLabel lblItemNo;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JTextField txtIngredients;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextField txtItemNo;
    private javax.swing.JTextField txtItemPrice;
    // End of variables declaration//GEN-END:variables
}
