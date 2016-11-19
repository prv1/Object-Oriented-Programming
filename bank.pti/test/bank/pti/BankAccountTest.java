/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.pti;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author phillip389
 */
public class BankAccountTest {
    
    public BankAccountTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setBalance method, of class BankAccount.
     */
    @Test
    public void testSetBalance() {
        System.out.println("setBalance");
        int accountNumber = 0;
        float accountBalance = 0.0F;
        BankAccount instance;
        instance = new BankAccount(123,35.55d);
        instance.setBalance(accountNumber, accountBalance);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAccountNumber method, of class BankAccount.
     */
    @Test
    public void testGetAccountNumber() {
        System.out.println("getAccountNumber");
        BankAccount instance = null;
        int expResult = 0;
        int result = instance.getAccountNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBalance method, of class BankAccount.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        BankAccount instance = null;
        float expResult = 0.0F;
        float result = instance.getBalance();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAccountInformation method, of class BankAccount.
     */
    @Test
    public void testGetAccountInformation() {
        System.out.println("getAccountInformation");
        BankAccount instance = null;
        String expResult = "";
        String result = instance.getAccountInformation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class BankAccountImpl extends BankAccount {

        public BankAccountImpl() {
            super(0, 0.0F);
        }

        public int getAccountNumber() {
            return 0;
        }

        public float getBalance() {
            return 0.0F;
        }

        public String getAccountInformation() {
            return "";
        }
    }
    
}
