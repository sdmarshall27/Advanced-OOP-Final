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
    private Integer totalCash; 
    
    public Vault() {
        this.totalCash = 0; 
    }
    
    public void addCashToVault(Integer cash) {
        this.totalCash += cash; 
    }

    public Integer getTotalCash() {
        return totalCash;
    }
}
