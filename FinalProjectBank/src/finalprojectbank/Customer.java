/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package finalprojectbank;


/**
 *
 * @author khan7
 */
public class Customer {
    
    private String firstName;
    private String lastName; 
    private String password;
    private Account SavingsAccount; 
    private Account CheckingAccount; 
    private boolean adminStats;
    
    public Customer(String newLastName, String newPW, Double StartSBalance, 
            Double StartCBalance, boolean admin) {
         lastName = newLastName; 
         password = newPW; 
         adminStats = admin;
         SavingsAccount = new Account(AccountType.Savings, 0.06, StartSBalance); 
         CheckingAccount = new Account(AccountType.Checking, 0.00, StartCBalance); 
        
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }
    
    public boolean getAdmin() {
        return adminStats;
    }

    public double getSavingsAccount() {
        return SavingsAccount.getBalance();
    }

    public double getCheckingAccount() {
        return CheckingAccount.getBalance();
    }
    
    public void deposit(double ammount, char choice) {
        if(choice == 'S')
            SavingsAccount.deposit(ammount);
        else if(choice == 'C')
            CheckingAccount.deposit(ammount);
    }
    
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
