/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checking;

/**
 *
 * @author prv1
 */
public class Checking {
    
private String account;
private double balance;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    // initial constructor for default variables
    public Checking(){
        this.account = "";
        this.balance = 0.00;
        
    }
    // initial constructor that sets the account name and balance
    public Checking(String newAccount, double openBalance){
        this.balance = openBalance;
        this.account = newAccount;
    }
    // function that sets balance of account
    public void setBalance(double balance){
        this.balance = balance;
    }
    // function that gets the balance of an account
    public double getBalance(){
        return balance;
    }
    // function that takes strings and converts them to doubles to become account information
    public double getDeposit(String amount, String balance ){
        this.balance = Integer.parseInt(balance);
        this.balance += Integer.parseInt(amount);
        return this.balance;
    }
    // function that takes strings and converts them to doubles to become account information
    public double getWithdrawl(String amount, String balance){
        this.balance = Integer.parseInt(balance);
        this.balance -= Integer.parseInt(amount);
        return this.balance;
    }
    // returns string of account balance
    public String toString(){
        return "" + this.account + " " + this.balance;
    }
    
    
    
}
