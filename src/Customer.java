/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sydney
 */
public class Customer {
//customer information
    private final String firstName;
    private final String lastName;
    private final String IdNumber;
    private final Account account;

    Customer(String firstName, String lastName, String IdNumber, Account account) {
        
    this.firstName=firstName;
    this.lastName=lastName;
    this.IdNumber=IdNumber;
    this.account=account;
    
    
    
    
    }
    //to string method for outputting data
    public String toString(){
        return "First Name: "+firstName+"\n"+
                "Last Name: "+lastName+"\n"+
                "ID Number: "+IdNumber+"\n"+
                account;
        
        
        
    }
    //same as the toString method
    public String basicInfo(){
        return "First Name: "+firstName+
                "Last Name: "+lastName+
                "ID Number: "+IdNumber+
                "Account Number: "+account.getAccountNumber();
        
        
        
    }
    
    
    Account getAccount(){
        return account;
        
    }
    
    
}
