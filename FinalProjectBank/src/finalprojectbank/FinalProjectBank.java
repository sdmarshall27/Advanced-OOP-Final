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

import java.util.Scanner;
public class FinalProjectBank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //I think we should just try to get it running in this terminal and go with that and if we have a lot of extra time we can implement a GUI.
        
        Scanner input = new Scanner(System.in);
        String name;
        String password;
        
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
    
}
