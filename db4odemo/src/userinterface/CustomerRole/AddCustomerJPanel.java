/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Role.CustomerRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author shivanginagar
 */
public class AddCustomerJPanel extends javax.swing.JPanel {

    private CustomerDirectory custDirectory;
    private JPanel container;
    private EcoSystem system;
    
    Customer cust = new Customer();
    /**
     * Creates new form AddCustomerJPanel
     */
    public AddCustomerJPanel(JPanel container, EcoSystem system, CustomerDirectory custDir) {
        initComponents();
        this.custDirectory = custDir;
        this.system = system;
        this.container = container;
        System.out.println("-- "+system);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAddCustomer = new javax.swing.JLabel();
        lblCustName = new javax.swing.JLabel();
        lblCustUserName = new javax.swing.JLabel();
        lblCustPass = new javax.swing.JLabel();
        lblCustContact = new javax.swing.JLabel();
        txtCustName = new javax.swing.JTextField();
        txtCustUserName = new javax.swing.JTextField();
        txtCustContact = new javax.swing.JTextField();
        lblCustEmail = new javax.swing.JLabel();
        txtCustEmail = new javax.swing.JTextField();
        pbCustPassStr = new javax.swing.JProgressBar();
        lblCustAddr = new javax.swing.JLabel();
        txtCustAddr = new javax.swing.JTextField();
        lblCustZip = new javax.swing.JLabel();
        txtCustZip = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        lblCustPhoto = new javax.swing.JLabel();
        btnCustPhotoUpload = new javax.swing.JButton();
        lblAddCust = new javax.swing.JButton();
        pwCustPass = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAddCustomer.setBackground(new java.awt.Color(204, 255, 255));
        lblAddCustomer.setFont(new java.awt.Font("Tamil MN", 1, 18)); // NOI18N
        lblAddCustomer.setForeground(new java.awt.Color(0, 51, 51));
        lblAddCustomer.setText("Add Customer");
        add(lblAddCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        lblCustName.setBackground(new java.awt.Color(204, 255, 255));
        lblCustName.setFont(new java.awt.Font("Tamil MN", 1, 12)); // NOI18N
        lblCustName.setForeground(new java.awt.Color(0, 51, 51));
        lblCustName.setText("Enter Full Name :");
        add(lblCustName, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 72, -1, -1));

        lblCustUserName.setBackground(new java.awt.Color(204, 255, 255));
        lblCustUserName.setFont(new java.awt.Font("Tamil MN", 1, 12)); // NOI18N
        lblCustUserName.setForeground(new java.awt.Color(0, 51, 51));
        lblCustUserName.setText("Set Username :");
        add(lblCustUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 99, -1, -1));

        lblCustPass.setBackground(new java.awt.Color(204, 255, 255));
        lblCustPass.setFont(new java.awt.Font("Tamil MN", 1, 12)); // NOI18N
        lblCustPass.setForeground(new java.awt.Color(0, 51, 51));
        lblCustPass.setText("Set Password :");
        add(lblCustPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 134, -1, -1));

        lblCustContact.setBackground(new java.awt.Color(204, 255, 255));
        lblCustContact.setFont(new java.awt.Font("Tamil MN", 1, 12)); // NOI18N
        lblCustContact.setForeground(new java.awt.Color(0, 51, 51));
        lblCustContact.setText("Enter Contact No :");
        add(lblCustContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 190, -1, -1));

        txtCustName.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        txtCustName.setForeground(new java.awt.Color(0, 51, 51));
        add(txtCustName, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 69, 127, -1));

        txtCustUserName.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        txtCustUserName.setForeground(new java.awt.Color(0, 51, 51));
        add(txtCustUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 96, 127, -1));

        txtCustContact.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        txtCustContact.setForeground(new java.awt.Color(0, 51, 51));
        add(txtCustContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 187, 127, -1));

        lblCustEmail.setBackground(new java.awt.Color(204, 255, 255));
        lblCustEmail.setFont(new java.awt.Font("Tamil MN", 1, 12)); // NOI18N
        lblCustEmail.setForeground(new java.awt.Color(0, 51, 51));
        lblCustEmail.setText("Enter Email ID:");
        add(lblCustEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 222, -1, -1));

        txtCustEmail.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        txtCustEmail.setForeground(new java.awt.Color(0, 51, 51));
        add(txtCustEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 220, 127, -1));

        pbCustPassStr.setBackground(new java.awt.Color(204, 255, 255));
        pbCustPassStr.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        pbCustPassStr.setForeground(new java.awt.Color(0, 51, 51));
        pbCustPassStr.setMaximum(13);
        pbCustPassStr.setMinimum(1);
        pbCustPassStr.setBorder(null);
        pbCustPassStr.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                pbCustPassStrStateChanged(evt);
            }
        });
        add(pbCustPassStr, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 162, 127, 10));

        lblCustAddr.setBackground(new java.awt.Color(204, 255, 255));
        lblCustAddr.setFont(new java.awt.Font("Tamil MN", 1, 12)); // NOI18N
        lblCustAddr.setForeground(new java.awt.Color(0, 51, 51));
        lblCustAddr.setText("Enter Street Address :");
        add(lblCustAddr, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 251, -1, -1));

        txtCustAddr.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        txtCustAddr.setForeground(new java.awt.Color(0, 51, 51));
        add(txtCustAddr, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 249, 127, -1));

        lblCustZip.setBackground(new java.awt.Color(204, 255, 255));
        lblCustZip.setFont(new java.awt.Font("Tamil MN", 1, 12)); // NOI18N
        lblCustZip.setForeground(new java.awt.Color(0, 51, 51));
        lblCustZip.setText("Enter Zip Code :");
        add(lblCustZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 283, -1, -1));

        txtCustZip.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        txtCustZip.setForeground(new java.awt.Color(0, 51, 51));
        add(txtCustZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 280, 127, -1));

        btnBack.setBackground(new java.awt.Color(204, 255, 255));
        btnBack.setFont(new java.awt.Font("Tamil MN", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 51, 51));
        btnBack.setText("Back");
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 60, -1));

        lblCustPhoto.setBackground(new java.awt.Color(222, 236, 236));
        lblCustPhoto.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblCustPhoto.setForeground(new java.awt.Color(0, 102, 102));
        lblCustPhoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCustPhoto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(lblCustPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 94, 102, 129));

        btnCustPhotoUpload.setBackground(new java.awt.Color(204, 255, 255));
        btnCustPhotoUpload.setFont(new java.awt.Font("Tamil MN", 1, 12)); // NOI18N
        btnCustPhotoUpload.setForeground(new java.awt.Color(0, 102, 102));
        btnCustPhotoUpload.setText("Upload");
        btnCustPhotoUpload.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCustPhotoUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustPhotoUploadActionPerformed(evt);
            }
        });
        add(btnCustPhotoUpload, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 232, 67, 27));

        lblAddCust.setBackground(new java.awt.Color(204, 255, 255));
        lblAddCust.setFont(new java.awt.Font("Tamil MN", 1, 12)); // NOI18N
        lblAddCust.setForeground(new java.awt.Color(0, 51, 51));
        lblAddCust.setText("Add");
        lblAddCust.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblAddCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblAddCustActionPerformed(evt);
            }
        });
        add(lblAddCust, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 60, -1));

        pwCustPass.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        pwCustPass.setForeground(new java.awt.Color(0, 51, 51));
        pwCustPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwCustPassActionPerformed(evt);
            }
        });
        pwCustPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pwCustPassKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pwCustPassKeyTyped(evt);
            }
        });
        add(pwCustPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 131, 127, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCustPhotoUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustPhotoUploadActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(null);

        BufferedImage bfImage = null;
        try {
            File fileImage = fileChooser.getSelectedFile();
            bfImage = ImageIO.read(new File(fileImage.getAbsolutePath()));
        } catch (IOException ex) {
            Logger.getLogger(AddCustomerJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        Image imPhoto = bfImage.getScaledInstance(lblCustPhoto.getWidth(), lblCustPhoto.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon imIcon = new ImageIcon(imPhoto);
       
        lblCustPhoto.setIcon(imIcon);
        cust.setCustPhoto(imPhoto);

    }//GEN-LAST:event_btnCustPhotoUploadActionPerformed

    private void lblAddCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblAddCustActionPerformed
        // TODO add your handling code here:
        
        String custName = txtCustName.getText();
        String custContact = txtCustContact.getText();
        String custAddr = txtCustAddr.getText();
        String custZipCode = txtCustZip.getText();
        String custUserName = txtCustUserName.getText();
        String custPass = String.valueOf(pwCustPass.getPassword());
        String custEmail = txtCustEmail.getText();
     
        if( custName.isEmpty() || custContact.isEmpty() || custAddr.isEmpty() || custZipCode.isEmpty() ||
                custUserName.isEmpty() || custPass.isEmpty() || custEmail.isEmpty() ) {
            JOptionPane.showMessageDialog(null, "Kindly Enter all the required fields!");
        }   else if (!system.validateMobileNo(custContact)) {
            JOptionPane.showMessageDialog(null, "Kindly enter a Valid Contact Number.");
        }   else if (!system.validateEmail(custEmail)) {
            JOptionPane.showMessageDialog(null, "Kindly check the entered Email ID format.");
        }   else if (!system.getUserAccountDirectory().checkIfUsernameIsUnique(custUserName)) {
            JOptionPane.showMessageDialog(null, "Entered User Name is already mapped to another Customer");    
        }   else if (!custDirectory.isEmailUnique(custEmail)) {
            JOptionPane.showMessageDialog(null, "Entered Email ID is already mapped to another Customer.");
        }   else if (!custDirectory.isContactNoUnique(custContact)) {
            JOptionPane.showMessageDialog(null, "Entered Contact No is already mapped to another Customer.");
        }   else {
        
            cust.setCustID(custDirectory.genCustID() );
            cust.setCustName(custName);
            cust.setCustAddr(custAddr);
            cust.setCustContact(custContact);
            cust.setCustEmail(custEmail);
            cust.setCustZipCode(custZipCode);
            custDirectory.addCustomer(cust);
            Employee employee = system.getEmployeeDirectory().createEmployee(cust.getCustID());
            system.setCustomerDirectory(custDirectory);
             UserAccount account = system.getUserAccountDirectory().createUserAccount(custUserName, custPass, employee, new CustomerRole());
            JOptionPane.showMessageDialog(null, "New Customer "+account.getUsername()+" added to the System Successfully!");
            resetFields();
        }
    }//GEN-LAST:event_lblAddCustActionPerformed
   public void resetFields() {
        txtCustAddr.setText("");
        txtCustContact.setText("");
        txtCustEmail.setText("");
        txtCustName.setText("");
        pwCustPass.setText("");
        txtCustUserName.setText("");
        txtCustZip.setText("");
        pbCustPassStr.setValue(0);
        lblCustPhoto.setText("");
    }
    private void pbCustPassStrStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_pbCustPassStrStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_pbCustPassStrStateChanged

    private void pwCustPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwCustPassActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_pwCustPassActionPerformed

    private void pwCustPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwCustPassKeyTyped
        // TODO add your handling code here:
        int pwSize = pwCustPass.getText().length();
//        System.out.println("PassKeyTyped PwSize :: "+pwSize);
        pbCustPassStr.setValue(pwSize);
    }//GEN-LAST:event_pwCustPassKeyTyped

    private void pwCustPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwCustPassKeyReleased
        // TODO add your handling code here:
//          int pwSize = pwCustPass.getText().length();
//        System.out.println("PassKeyReleased PwSize :: "+pwSize);
//        pbCustPassStr.setValue(pwSize);
    }//GEN-LAST:event_pwCustPassKeyReleased

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
         container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageCustomersJPanel manageCustomersJPanel = (ManageCustomersJPanel) component;
        manageCustomersJPanel.populateCustomerListTable();
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCustPhotoUpload;
    private javax.swing.JButton lblAddCust;
    private javax.swing.JLabel lblAddCustomer;
    private javax.swing.JLabel lblCustAddr;
    private javax.swing.JLabel lblCustContact;
    private javax.swing.JLabel lblCustEmail;
    private javax.swing.JLabel lblCustName;
    private javax.swing.JLabel lblCustPass;
    private javax.swing.JLabel lblCustPhoto;
    private javax.swing.JLabel lblCustUserName;
    private javax.swing.JLabel lblCustZip;
    private javax.swing.JProgressBar pbCustPassStr;
    private javax.swing.JPasswordField pwCustPass;
    private javax.swing.JTextField txtCustAddr;
    private javax.swing.JTextField txtCustContact;
    private javax.swing.JTextField txtCustEmail;
    private javax.swing.JTextField txtCustName;
    private javax.swing.JTextField txtCustUserName;
    private javax.swing.JTextField txtCustZip;
    // End of variables declaration//GEN-END:variables
}
