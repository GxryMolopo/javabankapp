/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sydney
 */
public class Checking extends Account {
    private static String accountType="checking";
    Checking(double initialDeposit){
        
        super();
        this.setBalance(initialDeposit);
        this.chceckInterest(0);
        
    }public String toString(){
        
        return "Account Number: "+this.getAccountNumber()+"\n"+
                
                "Account Type: " +accountType + "\n"+
                "Account Balance: "+ this.getBalance()
                ;
        
    }
}
