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
public class SavingsAccountTest {
    
    public SavingsAccountTest() {
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
     * Test of getBalance method, of class SavingsAccount.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        SavingsAccount instance = new SavingsAccount(42548,15.21f,3.25f);
        float expResult = 15.21F;
        float result = instance.getBalance();
        assertEquals(expResult, result, 15.21f);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAccountNumber method, of class SavingsAccount.
     */
    @Test
    public void testGetAccountNumber() {
        System.out.println("getAccountNumber");
        SavingsAccount instance = new SavingsAccount(54212,57.84f,2.47f);
        int expResult = 54212;
        int result = instance.getAccountNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getInterestRate method, of class SavingsAccount.
     */
    @Test
    public void testGetInterestRate() {
        System.out.println("getInterestRate");
        SavingsAccount instance = new SavingsAccount(63251,945.12f,3.21f);
        float expResult = 3.21F;
        float result = instance.getInterestRate();
        assertEquals(expResult, result, 3.21f);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAccountInformation method, of class SavingsAccount.
     */
    @Test
    public void testGetAccountInformation() {
        System.out.println("getAccountInformation");
        SavingsAccount instance = new SavingsAccount(25487,54.21f,1.25f);
        String expResult = "Savings Account Information:\n\tAccount Number: 25487\n\tAccount Balance: $54.21\n\tInterest Rate: 1.25";
        String result = instance.getAccountInformation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
