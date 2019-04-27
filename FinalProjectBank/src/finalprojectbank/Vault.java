/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectbank;

/**
 *
 * @author steven
 */
public class Vault {
    private double totalCash; 
    
    public Vault() {
        this.totalCash = 0; 
    }
    
    public void addCashToVault(double cash) {
        this.totalCash += cash; 
    }
    
    public void removeCashFromVault(double cash) {
        this.totalCash -= cash;
    }

    public double getTotalCash() {
        return totalCash;
    }
}
