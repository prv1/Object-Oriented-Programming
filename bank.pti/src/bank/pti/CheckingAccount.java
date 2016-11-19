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
public class CheckingAccount extends BankAccount {

    // default constructor with arguments to pass initial variables to super class
    public CheckingAccount(int accountNumber, float accountBalance){
        super(accountNumber, accountBalance); // passes arguments to super class
        
        
    }
    // accessor to return float variable
    @Override
    public float getBalance(){
        return this.accountBalance; // returns instanced variable to accessor
    }
    // accessor to return int variable
    @Override
    public int getAccountNumber() {
        return this.accountNumber; // returns instanced variable to accessor
    }
    // method to return account information in string format

    /**
     *
     * @return
     */
    @Override
    public String getAccountInformation(){
        return "Checking Account Information:\n\tAccount Number: " + this.getAccountNumber() + "\n\tAccount Balance: $" + this.getBalance();  // displays accountInformation in string format on screen
    }
    // accessor to return int variable

}
