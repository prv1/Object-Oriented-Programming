/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date;

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
public class DateTest {
    
    public DateTest() {
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
     * Test of main method, of class Date.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Date.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMonth method, of class Date.
     */
    @Test
    public void testSetMonth() {
        System.out.println("setMonth");
        int month = 5;
        Date instance = new Date();
        instance.setMonth(month);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDay method, of class Date.
     */
    @Test
    public void testSetDay() {
        System.out.println("setDay");
        int day = 10;
        Date instance = new Date();
        instance.setDay(day);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setYear method, of class Date.
     */
    @Test
    public void testSetYear() {
        System.out.println("setYear");
        int year = 1951;
        Date instance = new Date();
        instance.setYear(year);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setHour method, of class Date.
     */
    @Test
    public void testSetHour() {
        System.out.println("setHour");
        int hour = 10;
        Date instance = new Date();
        instance.setHour(hour);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMinute method, of class Date.
     */
    @Test
    public void testSetMinute() {
        System.out.println("setMinute");
        int minute = 05;
        Date instance = new Date();
        instance.setMinute(minute);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSecond method, of class Date.
     */
    @Test
    public void testSetSecond() {
        System.out.println("setSecond");
        int second = 0;
        Date instance = new Date();
        instance.setSecond(second);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMonth method, of class Date.
     */
    @Test
    public void testGetMonth() {
        System.out.println("getMonth");
        Date instance = new Date();
        int expResult = 5;
        int result = instance.getMonth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDay method, of class Date.
     */
    @Test
    public void testGetDay() {
        System.out.println("getDay");
        Date instance = new Date();
        int expResult = 10;
        int result = instance.getDay();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getYear method, of class Date.
     */
    @Test
    public void testGetYear() {
        System.out.println("getYear");
        Date instance = new Date();
        int expResult = 1951;
        int result = instance.getYear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getHour method, of class Date.
     */
    @Test
    public void testGetHour() {
        System.out.println("getHour");
        Date instance = new Date();
        int expResult = 10;
        int result = instance.getHour();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMinute method, of class Date.
     */
    @Test
    public void testGetMinute() {
        System.out.println("getMinute");
        Date instance = new Date();
        int expResult = 5;
        int result = instance.getMinute();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSecond method, of class Date.
     */
    @Test
    public void testGetSecond() {
        System.out.println("getSecond");
        Date instance = new Date();
        int expResult = 0;
        int result = instance.getSecond();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of compare method, of class Date.
     */
    @Test
    public void testCompare() {
        System.out.println("compare");
        Date thatDate = new Date(10,5,1951);
        Date instance = new Date(10,5,1951);
        int expResult = 0;
        int result = instance.compare(thatDate);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testCompare2() {
        System.out.println("compare2");
        Date thatDate = new Date(10,5,1951);
        Date instance = new Date();
        int expResult = -1;
        int result = instance.compare(thatDate);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testCompare3() {
        System.out.println("compare3");
        Date thatDate = new Date(5,15,1951);
        Date instance = new Date(5,20,1951);
        int expResult = 1;
        int result = instance.compare(thatDate);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Date.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Date instance = new Date();
        String expResult = "5/10/1951 10:5:0";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
