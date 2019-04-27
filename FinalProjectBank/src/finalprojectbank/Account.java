/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectbank;

/**
 * @author Sheraz 
 * @version 1.00
 * 
 * The class sets up the account types and allows for them to output 
 * the amounts inside of them. 
 * 
 */
public class Account {
    private Double balance;
    private Double interestRate;
    private AccountType accountType; 
        
    /** 
     * this is the constructor for the different parameters we used
     * 
     * @param accountType
     * @param interestRate
     * @param StartingBalance 
     */
    public Account(AccountType accountType, Double interestRate, 
            Double StartingBalance) {
        this.balance = StartingBalance;
        this.interestRate = interestRate;
        this.accountType = accountType; 
        
    }
    /** 
     * This returns what type of account is being used
     * @return 
     */
    public AccountType getAccountType() {
        return this.accountType;
    }
    /** 
     * This simply returns the balance the Customer has in the account 
     * @return 
     */
    public double getBalance() {
        return balance;
    }
    /** 
     * This would have gotten/calculated the interest rate, but it was 
     * too time consuming so we just made it a constant
     * @return 
     */
    public double getInterestRate() {
        return interestRate;
    }
    /**
     * This would have gotten/calculated the interest rate, but it was 
     * too time consuming so we just made it a constant 
     * UNUSED
     * @param interestRate 
     */
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    /** 
     * The allows money to be deposited into the vault
     * UNUSED 
     * @param ammount 
     */
    public void deposit(double ammount) {
        balance += ammount;
    }
    /** 
     * This allows for monet to be take out of the vault 
     * @param ammount 
     */
    public void withdrawl(double ammount) {
        balance -= ammount;
    }

}
