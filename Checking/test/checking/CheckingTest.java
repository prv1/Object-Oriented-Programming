/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checking;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author prv1
 */
public class CheckingTest {
    
    public CheckingTest() {
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
     * Test of main method, of class Checking.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Checking.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setBalance method, of class Checking.
     */
    @Test
    public void testSetBalance() {
        System.out.println("setBalance");
        double balance = 100.01;
        Checking instance = new Checking("Phillip", 100.01);
        instance.setBalance(balance);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getBalance method, of class Checking.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        Checking instance = new Checking("Mel", 100.05);
        double expResult = 100.05;
        double result = instance.getBalance();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDeposit method, of class Checking.
     */
    @Test(expected=NumberFormatException.class)
    public void testGetDeposit() {
        System.out.println("getDeposit");
        String amount = "25.01";
        String balance = "125.01";
        Checking instance = new Checking("Dan", 125.01);
        double expResult = 150.02;
        double result = instance.getDeposit(amount, balance);
        assertEquals(expResult, result, 125.00);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getWithdrawl method, of class Checking.
     */
    @Test(expected=NumberFormatException.class)
    public void testGetWithdrawl() {
        System.out.println("getWithdrawl");
        String amount = "25.01";
        String balance = "125.03";
        Checking instance = new Checking("Pip", 125.03);
        double expResult = 100.02;
        double result = instance.getWithdrawl(amount, balance);
        assertEquals(expResult, result, 100.02);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Checking.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Checking instance = new Checking("Mel", 500.01);
        String expResult = "Mel 500.01";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
