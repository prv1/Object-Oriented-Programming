/*
 * Phillip Viau
 * 02/21/2016
 * child class to access base instanced variables
 */
package pti.bank;
// imported packages for class
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author phillip389
 */
public class CheckingAccount extends Account implements Iterable<Transaction> { // child class of account that implements an interface
    // instanced variables
    private float minimumDailyBalance;
    private ArrayList<Transaction> register;
    
    public CheckingAccount(int userID, String nameOnAccount, float initialBalance){ // default constructor to set passed variables
        super(userID, nameOnAccount, initialBalance); // passes variables to parent class
        
        register = new ArrayList<>(); // creates new register
    }
    
    public float getMinimumBalance(){// returns instanced float variable to accessor
        return minimumDailyBalance;
    }


    
    public Iterator<Transaction> iterator(){// returns instanced int variable to accessor
        return this.register.iterator();
    }
    
    public void setMinimumDailyBalance(float minimumDailyBalance){// mutator to assign value to instanced variable
        this.minimumDailyBalance = minimumDailyBalance;
    }
    
    public void addTransaction(Transaction transaction){// mutator to assign value to instanced variable
        register.add(transaction);
    }
    

    
    public boolean equals(Object object){// returns boolean variable to accessor
        if(object instanceof CheckingAccount){
            CheckingAccount p = (CheckingAccount) object;
            if(this.getUserID() == p.getUserID() )
                return true; // exits if true
        }
        return false;
    }

    public String toString(){ // returns instanced variables to accessor
        return this.getUserID() + " " + this.getNameOnAccount() + " " + this.getAccountBalance();
    }
}
