
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sydney
 */
public class Bank {
    //create customer array list
ArrayList<Customer>customers=new ArrayList<Customer>();
    void addCustomer(Customer customer) {
        
        
      //add customer using the customer object   
        customers.add(customer);
        
      
        
    
    
    
    }

    Customer getCustomer(int account) {
       
    return customers.get(account);
    
    
    
    
    }
    
    ArrayList<Customer> getCustomers(){
        return customers;
    }
    
}
