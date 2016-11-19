/*
 * Phillip Viau
 * 02/21/2016
 * Parent class for base instanced variables
 */
package pti.bank;

/**
 *
 * @author phillip389
 */
public abstract class Account { // abstract class for children
    //instanced variables
    private int userID;
    private float balance;
    private String nameOnAccount;
    
    public Account(int userID, String nameOnAccount, float initialBalance){ // default constructor
        this.userID = userID; // assigns from passed variable
        this.nameOnAccount = nameOnAccount;// assigns from passed variable
        this.balance = initialBalance;// assigns from passed variable
    }
    
    public void setNameOnAccount(String newName){ // mutator to assign value to instanced variable
        nameOnAccount = newName;
    }
    
    public int getUserID(){ // returns instanced int variable to accessor
        return userID;
    }
    
    public String getNameOnAccount(){ // returns instanced String variable to accessor
        return nameOnAccount;
    }
    
    public float getAccountBalance(){ // returns instanced float variable to accessor
        return balance;
    }
    
    // abstract methods
    public abstract boolean equals(Object object); 
    public abstract String toString();
    
}
