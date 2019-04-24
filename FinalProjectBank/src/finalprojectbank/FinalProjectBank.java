/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectbank;

/**
 *
 * @author ersse
 */
public class FinalProjectBank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        
        Customer c1 = new Customer(123, "Sheraz", "Khan", "Password123"); 
        
        System.out.println(c1.getID());
        System.out.println(c1.getFirstName());
        System.out.println(c1.getLastName());
        System.out.println(c1.getPassword());
        
    }
    
}
