/*
 * Phillip Viau
 * 02/21/2016
 * interface for enumerators
 */
package pti.bank;

/**
 *
 * @author phillip389
 */
public interface TransactionTypes { // interface for checking and savings account classes
    public enum TransactionType{ // enumerators for class to use
        Check, Deposit;
    }
}
