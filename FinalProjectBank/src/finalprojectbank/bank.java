/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectbank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author ersse
 */
public class bank {
    //sheraz and I are going to work with a list cause we dont really know how maps work
    //Map<Integer, Customer> Customers = new HashMap();
    private List<Customer> Customers = new ArrayList();
    private Customer current;
    private static Integer CUSTOMERS_IN_BANK; 
    private Customer c1;
        
    Scanner input = new Scanner(System.in);
    
    private Vault v1 = new Vault();
    private double addCash;
    
    //Customers.get(0) = new Customer("Khan", "123", 50.00, 5.00);
    
    public bank( ) {
        c1 = new Customer("Khan", "123", 50.00, 5.00, true);
        Customers.add(c1);
        c1 = new Customer("Marshall", "abc", 5000.00, 500.00, false);
        Customers.add(c1);
        c1 = new Customer("Senor", "password", 10000.00, 5.00, false);
        Customers.add(c1);
        
        for(int i = 0; i < Customers.size(); i++) {
            addCash = addCash + (Customers.get(i).getCheckingAccount() + Customers.get(i).getSavingsAccount());
        }
        
        v1.addCashToVault(addCash);
        
        //System.out.println(Customers.get(0).getLastName());
        
    }
    
    public void choice(String option) {
        
        
        //this will handle the choice made in the main terminal
        switch(option) {
            case "deposit" :
                deposit();
                //runs deposit method within customer.
                break;
            case "withdrawl" :
                withdrawl();
                //runs withdrawl method :
                break;
            case "view" :
                view();
                //shows accounts for the specific customer.
                break;
            case "loan" :
                //runs the loan system for the customer.
                break;
            case "admin" :
                getallCash();
                //this will return the total money within the bank. 
                break;
            
        }
    }
    
    public Boolean userCheck(String name, String password) {
        for(int i = 0; i < Customers.size(); i++) {
            if(Customers.get(i).getLastName().equals(name) && Customers.get(i).getPassword().equals(password)) {
                current = Customers.get(i);
                return true;
            }
        }
            
        
        return false;
    }
    
    public void deposit() {
        double dep;
        char accChoice = ' ';
        System.out.println("How much would you like to deposit: ");
        
        dep = input.nextDouble();
        
        while(accChoice != 'S' && accChoice != 'C') {
            System.out.println("Which account would you like to deposit into? (S for saving C for checking): ");
            accChoice = input.next().charAt(0);
            
            if(accChoice != 'S' && accChoice != 'C')
                System.out.println("Invalid Choice try again.");
            else {
                current.deposit(dep, accChoice); 
                v1.addCashToVault(dep);
            }
        }
    }
    
    public void withdrawl() {
        boolean passed = false;
        double withdrawl;
        char accChoice = ' ';
        
        System.out.println("How much would you like to withdrawl: ");
        
        withdrawl = input.nextDouble();
        
        while(accChoice != 'S' && accChoice != 'C') {
            System.out.println("Which account would you like to deposit into? (S for saving C for checking): ");
            accChoice = input.next().charAt(0);
            
            if(accChoice != 'S' && accChoice != 'C')
                System.out.println("Invalid Choice try again.");
            else 
                passed = current.withdrawl(withdrawl, accChoice);                
        }
        
        if(passed == true) {
            v1.removeCashFromVault(withdrawl);
        }
        
    }
    
    public void view() {
        System.out.println("Total in Savings: $" + current.getSavingsAccount());
        System.out.println("Total in Checking: $" + current.getCheckingAccount());
    }
    
    //this will only be usuable by an admin
    public void getallCash() {
        if(current.getAdmin() == true)
            System.out.println("The total amount of money in the bank right now is: $" + v1.getTotalCash());
        else
            System.out.println("You are not permited to view this information!");
    }


/*    
    public void addCustomers (Integer customersWanted) {        
        for (CUSTOMERS_IN_BANK=CUSTOMERS_IN_BANK; CUSTOMERS_IN_BANK < CUSTOMERS_IN_BANK + customersWanted; CUSTOMERS_IN_BANK++) {
            Customers.put(CUSTOMERS_IN_BANK, new Customer()); 
        }
    }
*/   
//    public void deposit(double cash) {
//        if(cash > 0) {
//            this.balance += cash;
//        }
//    }
//    
//    public Boolean withdraw(double cash) {
//        Boolean success = false;
//        
//        if(this.balance >= cash && cash > 0 ) {
//            this.balance -= cash;
//            success = true;
//        }
//        
//        return success;
//    }
}
