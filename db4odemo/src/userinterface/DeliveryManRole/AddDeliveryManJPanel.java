/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DeliveryManRole;

import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Role.DeliverManRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author shivanginagar
 */
public class AddDeliveryManJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddDeliveryManJPanel
     */
    private final DeliveryManDirectory deliveryManDirectory;
    private final EcoSystem system;
    private final JPanel container;
    public AddDeliveryManJPanel(JPanel container, EcoSystem system, DeliveryManDirectory deliveryManDirectory) {
        initComponents();
        this.deliveryManDirectory = deliveryManDirectory;
        this.system = system;
        this.container = container;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDeliName = new javax.swing.JLabel();
        lblDeliUserName = new javax.swing.JLabel();
        lblDeliPass = new javax.swing.JLabel();
        lblDeliContact = new javax.swing.JLabel();
        lblDeliEmail = new javax.swing.JLabel();
        txtDeliName = new javax.swing.JTextField();
        txtDeliUserName = new javax.swing.JTextField();
        pwDeliPass = new javax.swing.JPasswordField();
        txtDeliContact = new javax.swing.JTextField();
        txtDeliEmail = new javax.swing.JTextField();
        lblAddRest = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnAddRest = new javax.swing.JButton();
        pbDeliPassStr = new javax.swing.JProgressBar();

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDeliName.setBackground(new java.awt.Color(204, 255, 255));
        lblDeliName.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        lblDeliName.setForeground(new java.awt.Color(0, 51, 51));
        lblDeliName.setText("Enter Full Name :");
        add(lblDeliName, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 56, -1, -1));

        lblDeliUserName.setBackground(new java.awt.Color(204, 255, 255));
        lblDeliUserName.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        lblDeliUserName.setForeground(new java.awt.Color(0, 51, 51));
        lblDeliUserName.setText("Set Username :");
        add(lblDeliUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 85, -1, -1));

        lblDeliPass.setBackground(new java.awt.Color(204, 255, 255));
        lblDeliPass.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        lblDeliPass.setForeground(new java.awt.Color(0, 51, 51));
        lblDeliPass.setText("Set Password :");
        add(lblDeliPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 114, -1, -1));

        lblDeliContact.setBackground(new java.awt.Color(204, 255, 255));
        lblDeliContact.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        lblDeliContact.setForeground(new java.awt.Color(0, 51, 51));
        lblDeliContact.setText("Enter Contact No :");
        add(lblDeliContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 161, -1, -1));

        lblDeliEmail.setBackground(new java.awt.Color(204, 255, 255));
        lblDeliEmail.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        lblDeliEmail.setForeground(new java.awt.Color(0, 51, 51));
        lblDeliEmail.setText("Enter Email ID :");
        add(lblDeliEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 190, -1, -1));

        txtDeliName.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        txtDeliName.setForeground(new java.awt.Color(0, 51, 51));
        add(txtDeliName, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 53, 127, -1));

        txtDeliUserName.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        txtDeliUserName.setForeground(new java.awt.Color(0, 51, 51));
        add(txtDeliUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 82, 127, -1));

        pwDeliPass.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        pwDeliPass.setForeground(new java.awt.Color(0, 51, 51));
        pwDeliPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwDeliPassActionPerformed(evt);
            }
        });
        pwDeliPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pwDeliPassKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pwDeliPassKeyTyped(evt);
            }
        });
        add(pwDeliPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 111, 127, -1));

        txtDeliContact.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        txtDeliContact.setForeground(new java.awt.Color(0, 51, 51));
        add(txtDeliContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 158, 126, -1));

        txtDeliEmail.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        txtDeliEmail.setForeground(new java.awt.Color(0, 51, 51));
        add(txtDeliEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 187, 126, -1));

        lblAddRest.setBackground(new java.awt.Color(204, 255, 255));
        lblAddRest.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        lblAddRest.setForeground(new java.awt.Color(0, 51, 51));
        lblAddRest.setText("Add Delivery Person");
        add(lblAddRest, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

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
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 251, 80, 30));

        btnAddRest.setBackground(new java.awt.Color(204, 255, 255));
        btnAddRest.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        btnAddRest.setForeground(new java.awt.Color(0, 51, 51));
        btnAddRest.setText("Add");
        btnAddRest.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddRest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRestActionPerformed(evt);
            }
        });
        add(btnAddRest, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 80, 30));

        pbDeliPassStr.setBackground(new java.awt.Color(204, 255, 255));
        pbDeliPassStr.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        pbDeliPassStr.setForeground(new java.awt.Color(0, 51, 51));
        pbDeliPassStr.setMaximum(30);
        pbDeliPassStr.setMinimum(1);
        pbDeliPassStr.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                pbDeliPassStrStateChanged(evt);
            }
        });
        add(pbDeliPassStr, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 139, 126, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void pwDeliPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwDeliPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwDeliPassActionPerformed

    private void pwDeliPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwDeliPassKeyReleased
        // TODO add your handling code here
    }//GEN-LAST:event_pwDeliPassKeyReleased

    private void pwDeliPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwDeliPassKeyTyped
        // TODO add your handling code here:
        int pwSize = pwDeliPass.getText().length();
        pbDeliPassStr.setValue(pwSize);
    }//GEN-LAST:event_pwDeliPassKeyTyped

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageDeliveryManJPanel manageDeliJPanel = (ManageDeliveryManJPanel) component;
        manageDeliJPanel.populateDeliveryManTable();
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddRestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRestActionPerformed
        // TODO add your handling code here:

        String custName = txtDeliName.getText();
        String custContact = txtDeliContact.getText();
        String custUserName = txtDeliUserName.getText();
        String custPass = String.valueOf(pwDeliPass.getPassword());
        String custEmail = txtDeliEmail.getText();

        if( custName.isEmpty() || custContact.isEmpty() || 
            custUserName.isEmpty() || custPass.isEmpty() || custEmail.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Kindly Enter all the required fields!");
        }   else if (!system.validateMobileNo(custContact)) {
            JOptionPane.showMessageDialog(null, "Kindly enter a Valid Contact Number.");
        }   else if (!system.validateEmail(custEmail)) {
            JOptionPane.showMessageDialog(null, "Kindly check the entered Email ID format.");
        }   else if (!system.getUserAccountDirectory().checkIfUsernameIsUnique(custUserName)) {
            JOptionPane.showMessageDialog(null, "Entered User Name is already mapped to another Restaurant");
        }   else if (!deliveryManDirectory.isEmailUnique(custEmail)) {
            JOptionPane.showMessageDialog(null, "Entered Email ID is already mapped to another Restaurant.");
        }   else if (!deliveryManDirectory.isContactNoUnique(custContact)) {
            JOptionPane.showMessageDialog(null, "Entered Contact No is already mapped to another Restaurant.");
        }   else {
            DeliveryMan deliveryMan = new DeliveryMan();
            deliveryMan.setDeliName(custName);
            deliveryMan.setDeliPhoneNo(custContact);
            deliveryMan.setDeliEmail(custEmail);
            deliveryManDirectory.addDeliveryMan(deliveryMan);
            Employee employee = system.getEmployeeDirectory().createEmployee(deliveryMan.getDeliveryID());
            system.setDeliveryManDirectory(deliveryManDirectory);
            UserAccount account = system.getUserAccountDirectory().createUserAccount(custUserName, custPass, employee, new DeliverManRole());
            JOptionPane.showMessageDialog(null, "New Delivery Man "+account.getUsername()+" added to the System Successfully!");
            resetFields();
        }
    }//GEN-LAST:event_btnAddRestActionPerformed
    public void resetFields(){
            txtDeliName.setText("");
            txtDeliContact.setText("");
            txtDeliUserName.setText("");
            txtDeliEmail.setText("");
            pwDeliPass.setText("");
    }
    private void pbDeliPassStrStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_pbDeliPassStrStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_pbDeliPassStrStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddRest;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel lblAddRest;
    private javax.swing.JLabel lblDeliContact;
    private javax.swing.JLabel lblDeliEmail;
    private javax.swing.JLabel lblDeliName;
    private javax.swing.JLabel lblDeliPass;
    private javax.swing.JLabel lblDeliUserName;
    private javax.swing.JProgressBar pbDeliPassStr;
    private javax.swing.JPasswordField pwDeliPass;
    private javax.swing.JTextField txtDeliContact;
    private javax.swing.JTextField txtDeliEmail;
    private javax.swing.JTextField txtDeliName;
    private javax.swing.JTextField txtDeliUserName;
    // End of variables declaration//GEN-END:variables
}
