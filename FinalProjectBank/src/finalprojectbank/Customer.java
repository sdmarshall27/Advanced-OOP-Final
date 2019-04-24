/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package finalprojectbank;

import java.util.Scanner;


/**
 *
 * @author khan7
 */
public class Customer {
    
    private int ID;
    private String name; 
    private String password;

         
    public Customer(int newID, String newName, String newPassword) { 
        
        ID = newID;
        name = newName;
        password = newPassword; 
        
        
        
        
        Scanner input = new Scanner(System.in);
//        String name;
//        String password;
        
        String option;
        
        bank b1 = new bank();
        
        System.out.println("Front teller Erno: Who are you?");
        System.out.println("Name (if you want to logout type 'q'): ");

        //enter in a given last name and password
        name = input.next();
        
        //System.out.println("*Enters Bank*");
        while(name != new Character('q').toString()) {
            System.out.println("Front teller Erno: Who are you?");
            System.out.println("Name (if you want to logout type 'q'): ");

            //enter in a given last name and password
            name = input.next();
            
            System.out.println("Password: ");
            password = input.next();

            //check to see if the two are viable. If not output the password dosnt work.

            System.out.println("Erno: What can I help you with ");
            //we can make it to where the options are deposit, withdrawl, apply for loan, view accounts
            //We can also have another option and call it admin to view total money in the bank. 
            //have a switch statement within bank class.
            option = input.next();

            b1.choice(option);

            while(option != "quit") {
                System.out.println("Erno: Is there anything esle I can assist you with.");
                option = input.next();
                b1.choice(option);
            }
        }

            System.out.println("Erno: Thank you and have a great day.");
        
        
        
    }
        
        
        
        


    public int getID() { 
        return ID;
    }
    
    
    public String getName() {
        return name;
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
