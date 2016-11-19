/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pti.bank;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author phillipviau
 */
public class TransactionTest {
    

    public TransactionTest() {
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
     * Test of getCheckNumber method, of class Transaction.
     */
    @Test
    public void testGetCheckNumber() {
        System.out.println("getCheckNumber");
        Transaction instance = createOneTest();
        int expResult = 123;
        int result = instance.getCheckNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTransactionType method, of class Transaction.
     */
    @Test
    public void testGetTransactionType() {
        System.out.println("getTransactionType");
        Transaction instance = createOneTest();
        TransactionTypes.TransactionType expResult = Transaction.TransactionType.Check;
        TransactionTypes.TransactionType result = instance.getTransactionType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDate method, of class Transaction.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Transaction instance = createOneTest();
        String expResult = "Feb 18, 2016";
        String result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getRecipient method, of class Transaction.
     */
    @Test
    public void testGetRecipient() {
        System.out.println("getRecipient");
        Transaction instance = createOneTest();
        String expResult = "Phillip";
        String result = instance.getRecipient();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAmount method, of class Transaction.
     */
    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        Transaction instance = createOneTest();
        float expResult = 122.45F;
        float result = instance.getAmount();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Transaction.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Transaction instance = createOneTest();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    public Transaction createOneTest(){
        return new Transaction(123, Transaction.TransactionType.Check, "1/1/2016", "Phillip", 122.45f);
    }
    
    
}
