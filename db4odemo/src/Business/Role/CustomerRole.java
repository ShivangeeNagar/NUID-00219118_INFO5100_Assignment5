/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Order.Menu;
import Business.Order.OrderDirectory;

import Business.Organization;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import userinterface.CustomerRole.CustomerAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author shivanginagar
 */
public class CustomerRole extends Role{

    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business,  CustomerDirectory customerDirectory, RestaurantDirectory restaurantDirectory, DeliveryManDirectory deliveryManDirectory,Menu menu, OrderDirectory orderDirectory) {
        return new CustomerAreaJPanel(userProcessContainer, account, business, customerDirectory, restaurantDirectory, deliveryManDirectory,menu,orderDirectory);
    }
    
    
}
