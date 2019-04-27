/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package finalprojectbank;


/**
 * @author Sheraz 
 * @version 1.0 
 * 
 * This sets up the variables that will be attached to each customer 
 */
public class Customer {
    
    private String firstName;
    private String lastName; 
    private String password;
    private Account SavingsAccount; 
    private Account CheckingAccount; 
    private boolean adminStats;
    
    /** 
     * 
     * @param newLastName
     * @param newPW
     * @param StartSBalance
     * @param StartCBalance
     * @param admin 
     * 
     * This is the constructor for are all of the variables that 
     * the customers will have 
     */
    public Customer(String newLastName, String newPW, Double StartSBalance, 
            Double StartCBalance, boolean admin) {
         lastName = newLastName; 
         password = newPW; 
         adminStats = admin;
         SavingsAccount = new Account(AccountType.Savings, 0.06, StartSBalance); 
         CheckingAccount = new Account(AccountType.Checking, 0.00, StartCBalance); 
        
    }

    /** 
     * This sets the customer's first name 
     * UNUSED
     * @param firstName 
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /** 
     * This sets the customer's last name (assigned in bank class)
     * @param lastName 
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /** 
     * This sets the customers password (assigned in bank class)
     * @param password 
     */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * This would have returned the customer's first name 
     * UNUSED
     * @return 
     */
    public String getFirstName() {
        return firstName;
    }
    /** 
     * This returns the customer's last name 
     * USED FOR VALIDATION
     * @return 
     */
    public String getLastName() {
        return lastName;
    }
    /** 
     * This returns the customer's password 
     * USED FOR VALIDATION
     * @return 
     */
    public String getPassword() {
        return password;
    }
    /** 
     * This returns the status of Administrator 
     * USED FOR VALIDATION
     * @return 
     */
    public boolean getAdmin() {
        return adminStats;
    }
    /** 
     * This returns how much money is in the Savings Account 
     * @return 
     */
    public double getSavingsAccount() {
        return SavingsAccount.getBalance();
    }
    /** 
     * This returns how much money is in the Checking Account 
     * @return 
     */
    public double getCheckingAccount() {
        return CheckingAccount.getBalance();
    }
    /** 
     * This allows the user to choose where to deposit the money
     * @param ammount
     * @param choice 
     */
    public void deposit(double ammount, char choice) {
        if(choice == 'S')
            SavingsAccount.deposit(ammount);
        else if(choice == 'C')
            CheckingAccount.deposit(ammount);
    }
    /** 
     * This allows the user to choose where to withdraw the money from 
     * This also validates whether you have enough in your account
     * @param ammount
     * @param choice
     * @return 
     */
    public boolean withdrawl(double ammount, char choice) {
        if(choice == 'S') {
            if(ammount > SavingsAccount.getBalance()) {
                System.out.println("You do not have enough money in the savings account to withdrawl $" + ammount);
                return false;
            }
            else {
                SavingsAccount.withdrawl(ammount);
                return true;
            }
        }
        
        if(choice == 'C') {
            if(ammount > CheckingAccount.getBalance()) {
                System.out.println("You do not have enough money in the savings account to withdrawl $" + ammount);
                return false;
            }
            else {
                CheckingAccount.withdrawl(ammount);
                return true;
            }
        }
        
        return false;
    }
/*    
    @Override
    public String toString() {
        return this.firstName + " " +
                this.lastName;
    } 
*/ 

    
}
