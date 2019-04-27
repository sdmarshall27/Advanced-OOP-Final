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
    //sheraz and I are going to work with a list cause we dont really know how maps work
    //Map<Integer, Customer> Customers = new HashMap();
    private List<Customer> Customers = new ArrayList();
    private Customer current;
    private static Integer CUSTOMERS_IN_BANK; 
    
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
    
    public Boolean userCheck(String name, String password) {
        for(int i = 0; i < Customers.size(); i++) {
            if(Customers.get(i).getLastName().equals(name) && Customers.get(i).getPassword().equals(password))
                return true;
        }
        
        return false;
    }
/*    
    public void addCustomers (Integer customersWanted) {        
        for (CUSTOMERS_IN_BANK=CUSTOMERS_IN_BANK; CUSTOMERS_IN_BANK < CUSTOMERS_IN_BANK + customersWanted; CUSTOMERS_IN_BANK++) {
            Customers.put(CUSTOMERS_IN_BANK, new Customer()); 
        }
    }
*/   
//    public void deposit(double cash) {
//        if(cash > 0) {
//            this.balance += cash;
//        }
//    }
//    
//    public Boolean withdraw(double cash) {
//        Boolean success = false;
//        
//        if(this.balance >= cash && cash > 0 ) {
//            this.balance -= cash;
//            success = true;
//        }
//        
//        return success;
//    }
}
