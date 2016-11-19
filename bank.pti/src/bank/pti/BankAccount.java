/*
 * Phillip Viau
 * 0217/2016
 * Parent class that sets a template for children classes to build off of
 */
package bank.pti;

/**
 *
 * @author phillip389
 */
public abstract class BankAccount {
    /***************** Instanced Variables ***************/
    protected int accountNumber;
    protected float accountBalance;
    /***************** Instanced Variables ***************/
    
    // default constructor with passed parameters
    public BankAccount(int accountNumber, float accountBalance){
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }
    // method sets balance to account number
    public void setBalance(int accountNumber, float accountBalance){
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }
    /********* Abstract methods **********/
    public abstract int getAccountNumber();
    public abstract float getBalance();
    public abstract String getAccountInformation();
    /********* Abstract methods **********/

}
