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
    
    private int ID;
    private String firstName;
    private String lastName; 
    private String password;

         
    public Customer(int newID, String newFirstName, String newLastName, 
            String newPassword) { 
        
        ID = newID;
        firstName = newFirstName;
        lastName = newLastName;
        password = newPassword; 
        
    }

    public int getID() { 
        return ID;
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

    
/*    
    @Override
    public String toString() {
        return this.firstName + " " +
                this.lastName;
    } 
*/ 

    
}
