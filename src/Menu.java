
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * 
and open the template in the editor.
 */

/**
 *
 * @author sydney
 */
public class Menu {
    Scanner keyborad = new Scanner(System.in);
    boolean exit;
    
    Bank obj = new Bank();
     public static void main(String[] args) {
        // TODO code application logic here
        //create the menu object 
        Menu menu =new Menu();
        
        //utilize the object 
        menu.runMenu();
        
    }
     
    public void runMenu(){
   
        //call the printreader method
        printReader();
    
    while(!exit){
        //call printMenu method
        printMenu();
        
        //intialize choice to input 
        int Choice=getInput();
        //call performAction based on the choice
        performAction(Choice);
        
         
     }
}

    private void printReader() {
        System.out.println("*********************************");
        System.out.println("****Standard Bank Core Group*****");
        System.out.println("*************Welcome*************");
        System.out.println("*********************************");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       
        
    
 
    
    
    
    
    
    
    
    
    }
    

    private void printMenu() {
        
        System.out.println("Please choose an option below");
        System.out.println("1. Create an Account");
        System.out.println("2.Make a Deposit");
        System.out.println("3.Make a Withdrawal ");
        System.out.println("4. View Statetment");
        System.out.println("0. Exit");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       }

    private int getInput() {
        
    int choice=-1;
    do{
        
    try{
                
        System.out.print("Enter your choice");
        choice=Integer.parseInt(keyborad.nextLine());

                }
                catch(NumberFormatException e){
                    System.out.println("Invalid Selection Numbers only please");
                }



                if(choice<0 || choice>5){
                    System.out.println("Invlaid Selection , please type in mumbers range from 1-4.");
                     }
    }while(choice<0 || choice>5);
    
     return choice;
    }
    
   
    
    
    private void performAction(int Choice) {
       
    switch(Choice){
        case 0:
            System.out.println("Thank you for using Standard Bank App");
            System.exit(0);
            
            
            //System.out.println("Please choose an option below")
       // System.out.println("1. Create an Account");
       // System.out.println("2.Make a Deposit");
       // System.out.println("3.Make a Withdrawal ");
        //System.out.println("4. View Statetment");
        //System.out.println("5. Exit");
        
        
            break;
        case 1:
            createAnAccount();
            
            break;
        case 2:
            MakeADeposit();
            
            break;
        case 3:
            
            MakeAWithDrawal();
            break;
        case 4:
            ViewStatement();
            break;
        default:    
                System.out.println("Error ");    
    }
    
    
    }

    private void createAnAccount() {
   
    String firstName, lastName, IdNumber, accountType="";
    
    boolean valid=false;
    double initialDeposit=0;
    
    while(!valid){
        System.out.println("please enter acount type (checkings/savings");
        accountType=keyborad.nextLine();
        if(accountType.equalsIgnoreCase("checkings")|| accountType.equalsIgnoreCase("savings")){
            valid=true;
        }
        else{
            System.out.println("Invalid account type selected");
        }
        
    }
    
        System.out.print("Please enter your First Name: ");
        firstName=keyborad.nextLine();
        System.out.print("Please enter your Last Name: ");
        lastName=keyborad.nextLine();
        System.out.println("Please enter your 13 digit ID Number: ");
        IdNumber=keyborad.nextLine();
        valid=false;
        while(!valid){
            
            System.out.println("Please enter an amount to deposit");
            
            
            try{
                initialDeposit=Integer.parseInt(keyborad.nextLine());
            }catch(NumberFormatException e){
                System.out.println("Please input a number");
        }
            if(accountType.equalsIgnoreCase("checkings")){
                if(initialDeposit<100){
                    System.out.println("Checking accounts require R100 or more");
                }else{
                    valid=true;
                    
                }
            }
            
            else if(accountType.equalsIgnoreCase("savings")){
                if(initialDeposit<50){
                    System.out.println("Savings accounts require R100 or more");
                }else{
                    valid=true;
                    
                }   
        
    
    
    
    
    
    
    }
    }
        
        
        
        Account account;
        if(accountType.equalsIgnoreCase("checkings")){
            account=new Checking(initialDeposit);
        }else{
            account= new Savings(initialDeposit);
        }
        Customer customer=new Customer(firstName,lastName,IdNumber,account);
        
        
        obj.addCustomer(customer);
        
        
    }

    private void MakeADeposit() {
        int account=selectAccount();
        if(account>=0){
        System.out.println("How much would you like to deposit? ");
        
        double amount=0;
        
        
        try{
            amount=Double.parseDouble(keyborad.nextLine());
        }catch(NumberFormatException e){
            amount =0;
            
        }
        obj.getCustomer(account).getAccount().deposit(amount);
        
    }
    }

    private void MakeAWithDrawal() {
         int account=selectAccount();
        if(account>=0){
        System.out.println("How much would you like to withdraw? ");
        
        double amount=0;
        
        
        try{
            amount=Double.parseDouble(keyborad.nextLine());
        }catch(NumberFormatException e){
            amount =0;
            
        }
        obj.getCustomer(account).getAccount().withdraw(amount);
        
    } 
    
    
    }

    private void ViewStatement() {
    int account=selectAccount();
        if(account>=0){
        
            
        
            System.out.println(obj.getCustomer(account).getAccount());
        
    } 
    
        
    
    
    
    
    
    }

    private int selectAccount() {
    
        ArrayList<Customer> customers=obj.getCustomers();
        if(customers.size()<=0){
            System.out.println("No customers at your bank.");
            
            return -1;
        }
        System.out.println("Select an account");
        
        for (int i=0; i<customers.size();i++){
            System.out.println((i+1)+")" +customers.get(i).basicInfo());
            
            
        }
        int account=0;
        System.out.println("Please enter yor selection");
        try{
            account=Integer.parseInt(keyborad.nextLine())-1;
        }catch(NumberFormatException e){
            account=-1;
            
            
        }if(account <0 || account>customers.size()){
            System.out.println("Invalid account selected");
            
            account=-1;
        }
        
        
        
        return account;    
    
    }
    
}

