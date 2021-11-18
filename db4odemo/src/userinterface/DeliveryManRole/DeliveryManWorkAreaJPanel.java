/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DeliveryManRole;

import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Order.Order;
import Business.Order.OrderDirectory;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shivanginagar
 */
public class DeliveryManWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    
    
    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public DeliveryManWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem business, DeliveryManDirectory deliveryManDirectory, OrderDirectory orderDirectory) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
             
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        model.setRowCount(0);
        for (Order order : business.getOrderDirectory().getOrderDir()) {
            if (order.getDeliveryMan() != null) {
                if (order.getDeliveryMan().getDeliveryID().equalsIgnoreCase(userAccount.getEmployee().getName())) {
                    Object[] row = new Object[7];
                    row[5] = order.getMessage();
                    row[2] = order.getSender();
                    row[1] = order.getStatus();
                    row[0] = order.getOrderNo();
                    row[4] = order.getCustomer().getCustAddr();
                    row[3] = order.getRestaurant().getRestAddress();;
                    model.addRow(row);
                }
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        refreshJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        btnConfirm = new javax.swing.JButton();
        lblMarkDeli = new javax.swing.JLabel();
        txtComments = new javax.swing.JTextField();
        btnDeliComplete = new javax.swing.JButton();
        lblDeliDetails = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        refreshJButton.setBackground(new java.awt.Color(204, 255, 255));
        refreshJButton.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        refreshJButton.setForeground(new java.awt.Color(0, 51, 51));
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(711, 55, -1, -1));

        workRequestJTable.setBackground(new java.awt.Color(204, 255, 255));
        workRequestJTable.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        workRequestJTable.setForeground(new java.awt.Color(0, 51, 51));
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Order No", "Order Status", "Ordered By", "Restaurant Address", "Customer Address", "Customer Feedback"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 96, 790, 190));

        btnConfirm.setBackground(new java.awt.Color(204, 255, 255));
        btnConfirm.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        btnConfirm.setForeground(new java.awt.Color(0, 51, 51));
        btnConfirm.setText("Confirm Order Pickup");
        btnConfirm.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 292, 150, 35));

        lblMarkDeli.setBackground(new java.awt.Color(204, 255, 255));
        lblMarkDeli.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        lblMarkDeli.setForeground(new java.awt.Color(0, 51, 51));
        lblMarkDeli.setText("Mark Delivery Complete (Enter comments) :");
        add(lblMarkDeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 365, -1, -1));

        txtComments.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        txtComments.setForeground(new java.awt.Color(0, 51, 51));
        add(txtComments, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 362, 150, -1));

        btnDeliComplete.setBackground(new java.awt.Color(204, 255, 255));
        btnDeliComplete.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        btnDeliComplete.setForeground(new java.awt.Color(0, 51, 51));
        btnDeliComplete.setText("Delivery Complete");
        btnDeliComplete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDeliComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliCompleteActionPerformed(evt);
            }
        });
        add(btnDeliComplete, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 357, 120, 33));

        lblDeliDetails.setBackground(new java.awt.Color(204, 255, 255));
        lblDeliDetails.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        lblDeliDetails.setForeground(new java.awt.Color(0, 51, 51));
        lblDeliDetails.setText("Delivery Details");
        add(lblDeliDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 25, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
        txtComments.setVisible(true);
        lblMarkDeli.setVisible(true);
        btnDeliComplete.setVisible(true);
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:
                int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row!");
            return;
        }
        String orderStatus = (String) workRequestJTable.getValueAt(selectedRow, 1);
        String selectedOrderId = (String) workRequestJTable.getValueAt(selectedRow, 0);
       if(orderStatus.equals("Completed")){
           lblMarkDeli.setVisible(false);
           txtComments.setVisible(false);
           btnDeliComplete.setVisible(false);
           JOptionPane.showMessageDialog(null, "Order has already been completed!");
       }
       else{
           
           lblMarkDeli.setVisible(true);
           txtComments.setVisible(true);
           btnDeliComplete.setVisible(true);
        Order order = business.getOrderDirectory().fetchOrders(selectedOrderId);
        order.setStatus("Out For Delivery");
        JOptionPane.showMessageDialog(null, "Order has been updated!");
        populateTable();
       }
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnDeliCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliCompleteActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row first!");
            return;
        }

        String selectedOrderId = (String) workRequestJTable.getValueAt(selectedRow, 0);
        Order order = business.getOrderDirectory().fetchOrders(selectedOrderId);

        if (order.getStatus().trim().equalsIgnoreCase("Out For Delivery")) {
            order.setConfirmOrder(txtComments.getText());
            order.setStatus("Completed");
            txtComments.setText("");
            JOptionPane.showMessageDialog(null, "Order has been updated!");
            populateTable();
        } else {
            JOptionPane.showMessageDialog(null, "Kindly confirm the order pick-up before confirming delivery!");
        }
    }//GEN-LAST:event_btnDeliCompleteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnDeliComplete;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDeliDetails;
    private javax.swing.JLabel lblMarkDeli;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTextField txtComments;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
