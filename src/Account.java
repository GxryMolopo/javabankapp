/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sydney
 */
public class Account {
//initialize your variables

    private double balance=0;
    private double interest=0.2;
    private double accountNumber;
    
    private static int numOfAccounts=1000;
    
    Account(){
        
        //increment account number for primary key reasons
        accountNumber=numOfAccounts++;
        
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * @return the interest
     */
    public double getInterest() {
        // times 100 for percentage 
        return interest*100;
    }

    /**
     * @param interest the interest to set
     */
    public void setInterest(double interest) {
        this.interest = interest;
    }

    /**
     * @return the accountNumber
     */
    public double getAccountNumber() {
        return accountNumber;
    }

    /**
     * @param accountNumber the accountNumber to set
     */
    public void withdraw(double amount){
        if(amount+5>balance){
            System.out.println("Insufficient funds available");
            return;
            
        }
        
        
        balance-=amount + 5;
        System.out.println("You have withdrawn R"+amount+ "and your current balacnce is R"+balance);
}
    public void deposit(double amount){
        if(amount<=0){
            System.out.println("You cannot deposit negative money");
            return;
        }
        chceckInterest(0);
        amount= amount + amount * interest;
        //add amount to the balance
        
        balance+=amount;
        System.out.println("You have deposited R"+amount+ " with an interest of "+(interest*100)+"%"+"\n"
        +"Your current balance is "+balance);
}
    
    public void chceckInterest(double amount){
        if (balance + amount<10000){
            interest=0.02;
            
        }else{
            interest =0.05;
            
        }
    }
    }
    


