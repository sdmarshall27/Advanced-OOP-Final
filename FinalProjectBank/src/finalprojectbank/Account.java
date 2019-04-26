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
public class Account {
    private Double balance;
    private Double interestRate;
    private AccountType accountType;
        
    public Account(AccountType accountType, Double interestRate) {
        this.balance = 0.0;
        this.interestRate = interestRate;
        this.accountType = accountType;
    }
    
    public AccountType getAccountType() {
        return this.accountType;
    }
    
    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    
    public void deposit(double cash) {
        if(cash > 0) {
            this.balance += cash;
        }
    }
    
    public Boolean withdraw(double cash) {
        Boolean success = false;
        
        if(this.balance >= cash && cash > 0 ) {
            this.balance -= cash;
            success = true;
        }
        
        return success;
    }
    
    public void calculateInterest() {
        this.balance += this.balance * this.interestRate;
    }
/*    
    @Override
    public String toString() {
        return this.id + " | " + this.balance + " balance";
    }
*/
}
