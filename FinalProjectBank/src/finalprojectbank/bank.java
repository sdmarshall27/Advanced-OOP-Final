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
 * This is the backbone of the program. This contains all the information needed to make the bank.
 *
 * @author Ethan Sheraz Steven
 * @version 1.00
 */
public class bank {
    //sheraz and I are going to work with a list cause we dont really know how maps work
    //Map<Integer, Customer> Customers = new HashMap();
    private List<Customer> Customers = new ArrayList();
    private Customer current;
    //private static Integer CUSTOMERS_IN_BANK; 
    private Customer c1;
        
    Scanner input = new Scanner(System.in);
    
    private Vault v1 = new Vault();
    private double addCash;
    
    /**
     * This is the constructor function it takes no parameters and manually makes the customers. 
     * 
     * @see bank
     * 
     * 
     */
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
    
    /**
     * This function handles the choices made in the main terminal.
     * 
     * 
     * 
     * @param option this is the choice made by the user in the main terminal 
     */
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
                loan();
                //runs the loan system for the customer.
                break;
            case "admin" :
                getallCash();
                //this will return the total money within the bank. 
                break;
            
        }
    }
    
    /**
     * This is the validation for the name and password and sets the current logged in user into current.
     * 
     * @param name entered name.
     * @param password entered password.
     * @return true if the user is found. False if name and password is not valid. 
     */
    public Boolean userCheck(String name, String password) {
        for(int i = 0; i < Customers.size(); i++) {
            if(Customers.get(i).getLastName().equals(name) && Customers.get(i).getPassword().equals(password)) {
                current = Customers.get(i);
                return true;
            }
        }
            
        
        return false;
    }
    /**
     * Deposits a given amount of money into current users account as decided by the user.
     * <br>
     * Also adds the money deposited into the total amount for the bank. 
     */
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
    /**
     * Withdrawals a given number from the users account.
     * <br>
     * also removes the money from the banks total.
     * <br>
     * Validates whether the removal is possible by checking total funds in the given account. 
     */
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
    /**
     * Shows the given account totals.
     */
    public void view() {
        System.out.println("Total in Savings: $" + current.getSavingsAccount());
        System.out.println("Total in Checking: $" + current.getCheckingAccount());
    }
    
    /**
     * Shows the total amount of money inside the vault.
     * <br>
     * This function is only usable by an admin.
     */
    public void getallCash() {
        if(current.getAdmin() == true)
            System.out.println("The total amount of money in the bank right now is: $" + v1.getTotalCash());
        else
            System.out.println("You are not permited to view this information!");
    }
    
    /**
     * Generates what monthly and total payments will be for a specific loan amount.
     * <br>
     * initial amount and duration(in months) are entered by the user. 
     */
    public void loan() { 

        double a;            // Amount Requested
        double b = 0.06;     // Interest Rate
        double c;            // Duration (in Months)

        System.out.println("Please enter the Requested Amount: "); 
        a = input.nextDouble();
        
        System.out.println("Your Interest Rate is: " + b); 
        
        System.out.println("Please enter the duration of the loan in months: "); 
        c = input.nextDouble();

        
        Double MonthlyPayment = a * b * ( Math.pow( (1 + b), c ) )  /  ( Math.pow( (1 + b), c ) - 1);

        Double TotalPayment = MonthlyPayment * c; 

        
        System.out.println("Your Monthly Payment is: $" + MonthlyPayment);        

        System.out.println("Your Total Payment is: $" + TotalPayment);
            
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
