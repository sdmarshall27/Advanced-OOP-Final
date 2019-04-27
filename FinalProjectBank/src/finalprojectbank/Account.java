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
        
    public Account(AccountType accountType, Double interestRate, 
            Double StartingBalance) {
        this.balance = StartingBalance;
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
}
