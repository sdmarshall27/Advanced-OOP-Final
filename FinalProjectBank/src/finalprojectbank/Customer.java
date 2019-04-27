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
    private double SavingsAccount; 
    private double CheckingAccount;


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

    public Double getSavingsAccount() {
        return SavingsAccount;
    }

    public Double getCheckingAccount() {
        return CheckingAccount;
    }
    
    
/*    
    @Override
    public String toString() {
        return this.firstName + " " +
                this.lastName;
    } 
*/ 

    
}
