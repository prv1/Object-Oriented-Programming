/*
 * Phillip Viau
 * 02/21/2016
 * child class to access base instanced variables
 */
package pti.bank;

/**
 *
 * @author phillip389
 */
public abstract class SavingsAccount extends Account implements Iterable<Transaction> {// child class of account that implements an interface
    private float interestRate;
    
    public SavingsAccount(int userID, String nameOnAccount, float initialBalance){// default constructor to set passed variables
        super(userID, nameOnAccount, initialBalance);// passes variables to parent class
    }
    
    public void setInterestRate(float newInterestRate){// mutator to assign value to instanced variable
        interestRate = newInterestRate;
    }
    
    public float getInterestRate(){// returns instanced float variable to accessor
        return interestRate;
    }
    
    public boolean equals(Object object){// returns boolean variable to accessor
        if(object instanceof SavingsAccount){
            SavingsAccount p = (SavingsAccount) object;
            if(this.getUserID() == p.getUserID() )
                return true; // exits if true
        }
        return false;
    }
    
    public String toString(){ // returns instanced variables to accessor
        return this.getUserID() + " " + this.getNameOnAccount() + " " + this.getAccountBalance();
    }
    
}
