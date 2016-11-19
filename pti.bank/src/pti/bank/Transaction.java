/*
 * Phillip Viau
 * 02/21/2016
 * child class to access base instanced variables
 */
package pti.bank;
// imported packages for class
import java.text.DateFormat;
import java.util.Date;
/**
 *
 * @author phillip389
 */
public class Transaction implements TransactionTypes { // child class of account that implements an interface
    // instanced variables
    private int checkNumber;
    private TransactionType transactionType;
    private Date date;
    private String recipient;
    private float amount;
    
    public Transaction(int checkNumber, TransactionType transactionType, String date, String recipient, float amount){ // default constructor to set passed variables
        this.checkNumber = checkNumber;
        this.transactionType = transactionType;
        this.date = new Date();
        this.recipient = recipient;
        this.amount = amount;
    }
    
    public int getCheckNumber(){// returns instanced int variable to accessor
        return checkNumber;
    }
    
    public TransactionType getTransactionType(){// returns instanced TransactionType variable to accessor
        return transactionType;
    }
    
    public String getDate(){// returns instanced String variable to accessor
        return DateFormat.getDateInstance().format(date);
    }
    
    public String getRecipient(){// returns instanced String variable to accessor
        return recipient;
    }
    
    public float getAmount(){// returns instanced float variable to accessor
        return amount;
    }
    
    public String toString(){// returns instanced String variable to accessor
        return checkNumber + " " + transactionType + " " + date + " " + recipient + " " + amount;
    }
    
}
