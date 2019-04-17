package bankexample;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Bank {
    public final static Integer MAX_ACCOUNTS = 4;
    public final static Integer MAX_CUSTOMERS = 10;
    private final static Double INTEREST_RATE = 0.02;
    private final static Double INITIAL_DEPOSIT = 500.00;
    private final static Integer WITHDRAW_COUNT = 4;
    
    private List<Customer> customers;
    private List<Account> accounts;
    private Vault vault;
    
    private Integer customerIndex;
    
    public Bank() {
        this.accounts = new LinkedList();
        this.customers = new ArrayList();
        this.vault = new Vault();
        this.customerIndex = 0;
    }
    
    public void start() {
        createAllCustomers();
        createAccountsForAllCustomers();
        
//        outputAllAccounts();
        
        depositMoneyToAllAccounts();
        
//        outputAllAccounts();
        
        withdrawMoneyFromRandomAccounts();
        
//        outputAllAccounts();
    }
    
    public Customer getFirstCustomer() {
        return this.customers.get(0);
    }
    
    private void createAccountsForAllCustomers() {
        for(Customer customer: this.customers) {
            for(int k = 0; k < MAX_ACCOUNTS; k++) {
                Account account = createAccount(customer);
                this.accounts.add(account);
            }
        }        
    }
    
    private Account createAccount(Customer customer) {
        Account account = new Account(
                AccountType.Checking,
                INTEREST_RATE
        );
        account.setCustomer(customer);
        return account;
    }
    
    private void createAllCustomers() {
        for(int i = 0; i < MAX_CUSTOMERS; i++) {
            Customer customer = new Customer(
                    "FN " + i,
                    "LN " + i,
                    "FN_LN " + i + "@gmail.com",
                    "password"
            );
            this.customers.add(customer);
        }
    }
    
    private void depositMoneyToAllAccounts() {
        for(Account account: this.accounts) {
            account.deposit(INITIAL_DEPOSIT);
            vault.addCash(INITIAL_DEPOSIT);
        }
    }
    
    public void outputAllCustomers() {
        for(Customer customer: this.customers) {
            System.out.println(customer);
        }
    }
    
    public void outputAllAccounts() {
        for(Account account : this.accounts) {
            System.out.println(account);
        }
    }

    private void withdrawMoneyFromRandomAccounts() {
        int start = 0;
        int end = this.accounts.size();
        
        for(int i = 0; i < WITHDRAW_COUNT; i++) {
            int accountIndex = Utilities.getRandomNumber(start, end);
            Account account = this.accounts.get(accountIndex);
            withdrawMoneyFromAccount(account);
        }
    }
    
    private void withdrawMoneyFromAccount(Account account) {
        Integer amount = Utilities.getRandomNumber(1, (int)account.getBalance());
        account.withdraw(amount);
        this.vault.removeCash((double)amount);
    }

    public Customer getNextCustomer() {
        if(customerIndex < this.customers.size() - 1) {
           customerIndex++;
        } 
                
        return this.customers.get(customerIndex);
    }

    public Customer getPreviousCustomer() {
        if(customerIndex > 0) {
            customerIndex--;
        }
        return this.customers.get(customerIndex);
    }
    
    public List<Account> getAccounts(Customer customer) {
        List<Account> tempAccounts = new ArrayList();
        
        for(Account account: this.accounts) {
            if(account.getCustomer().equals(customer)) {
                tempAccounts.add(account);                
            }
        }
        return tempAccounts;
    }
}
