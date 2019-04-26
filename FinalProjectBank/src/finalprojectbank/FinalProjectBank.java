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
        String newUser = "yes";       
        Boolean stay = true;
        Boolean check = false;
        
        String option;
        
        bank b1 = new bank();
        
        
        while(stay == true) {
            if(newUser.equals("yes")) {
                while(check == false) {
                    System.out.println("Erno: Who are you?");
                    //enter in a given last name and password
                    System.out.println("Name: (if you want to exit type 'quit') ");
                    name = input.next();
                    if(name.equals("quit")) {
                        System.out.println("Erno: Thank you and have a great day.");
                        System.exit(0);
                    }
                    System.out.println("Password: ");
                    password = input.next();

                    check = b1.userCheck(name, password);
                    if(check == false)
                        System.out.println("User not found please try again");
                }
                //check to see if the two are viable. If not output the password dosnt work.

                System.out.println("Erno: What can I help you with? (deposit, withdrawl, loan, view, admin) ");
                //We can also have another option and call it admin to view total money in the bank. 
                //have a switch statement within bank class.
                option = input.next();

                b1.choice(option);

                while(!option.equals("quit")) {
                    System.out.println("Erno: Is there anything else I can assist you with.");
                    option = input.next();
                    b1.choice(option);
                }
                System.out.println("Erno: would you like to continue?");
                newUser = input.next();
            }
            else 
                stay = false;
        }

        System.out.println("Erno: Thank you and have a great day.");
        
        
        
    }
    
}
