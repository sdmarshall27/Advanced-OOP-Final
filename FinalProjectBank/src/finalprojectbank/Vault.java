/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectbank;

/**
 * All of the money going into and out of the bank is handled here.
 *
 * @author steven
 */
public class Vault {
    private double totalCash; 
    /**
     * This is the constructor function.
     * 
     * @see Vault
     *
     */
    public Vault() {
        this.totalCash = 0; 
    }
    
    
    /**
     * Adds cash to vault when deposits are made.
     * 
     * @param cash 
     */
    public void addCashToVault(double cash) {
        this.totalCash += cash; 
    }
    
    /**
     * Removes cash when a withdrawal is made.
     * 
     * @param cash 
     */
    public void removeCashFromVault(double cash) {
        this.totalCash -= cash;
    }
    
    /**
     * Shows the total amount of cash in the bank
     * 
     * @return totalCash
     */
    public double getTotalCash() {
        return totalCash;
    }
}
