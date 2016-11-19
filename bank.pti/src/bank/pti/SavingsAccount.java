/*
 * Phillip Viau
 * 0217/2016
 * child class that uses the BankAccount template for account
 */
package bank.pti;

/**
 *
 * @author phillip389
 */
public class SavingsAccount extends BankAccount {
    /***************** Instanced Variables ***************/
    protected float interestRate;
    /***************** Instanced Variables ***************/
    
    // default constructor with arguments to pass initial variables to super class

    /**
     * Instanced Variables
     * @param userID
     * @param initialBalance
     * @param interestRate
     */
    public SavingsAccount(int userID, float initialBalance, float interestRate){
        super(userID, initialBalance); // passes arguments to super class
        this.interestRate = interestRate; // passes interestRate argument to instanced variable
    }
    // accessor to return float variable
    @Override
    public float getBalance(){
        return super.accountBalance; // returns instanced variable to accessor
    }
    
    // accessor to return int variable
    @Override
    public int getAccountNumber() {
        return super.accountNumber; // returns instanced variable to accessor
    }
    // accessor to return float variable
    public float getInterestRate(){
        return interestRate; // returns instanced variable to accessor
    }
    // method to return account information in string format
    @Override
    public String getAccountInformation(){
        return "Savings Account Information:\n\tAccount Number: " + this.getAccountNumber() + "\n\tAccount Balance: $" + this.getBalance() + "\n\tInterest Rate: " + this.getInterestRate(); // displays accountInformation in string format on screen
    }
    // accessor to return int variable

    
}
