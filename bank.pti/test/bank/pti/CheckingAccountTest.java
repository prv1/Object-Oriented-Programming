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
public class CheckingAccountTest {
    
    public CheckingAccountTest() {
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
     * Test of getBalance method, of class CheckingAccount.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        CheckingAccount instance = new CheckingAccount(123,35.22f);
        float expResult = 35.22F;
        float result = instance.getBalance();
        assertEquals(expResult, result, 35.22);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAccountnumber method, of class CheckingAccount.
     */
    @Test
    public void testGetAccountNumber() {
        System.out.println("getAccountnumber");
        CheckingAccount instance = new CheckingAccount(14233, 0.0f);
        int expResult = 14233;
        int result = instance.getAccountNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAccountInformation method, of class CheckingAccount.
     */
    @Test
    public void testGetAccountInformation() {
        System.out.println("getAccountInformation");
        CheckingAccount instance = new CheckingAccount(16644,123.22f);
        String expResult = "Checking Account Information:\n\tAccount Number: 16644\n\tAccount Balance: $123.22";
        String result = instance.getAccountInformation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

/*    public class CheckingAccountImpl extends CheckingAccount {

        public CheckingAccountImpl() {
            super(0, 0.0F);
        }
    }*/


    
}
