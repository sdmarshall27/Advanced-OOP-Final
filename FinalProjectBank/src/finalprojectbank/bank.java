/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectbank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ersse
 */
public class bank {
    
    //list of customers with their Id, last name, accounts, password, admin.
    private List<Customer> Customers = new ArrayList(); 
    private Customer current;
    
    public bank( ) {
        
    }
    
    public void choice(String option) {
        
        
        //this will handle the choice made in the main terminal
        switch(option) {
            case "deposit" :
                //runs deposit method within customer.
                break;
            case "withdrawl" :
                //runs withdrawl method :
                break;
            case "view" :
                //shows accounts for the specific customer.
                break;
            case "loan" :
                //runs the loan system for the customer.
                break;
            case "admin" :
                //this will return the total money within the bank. 
                break;
            
        }
    }
    
}
