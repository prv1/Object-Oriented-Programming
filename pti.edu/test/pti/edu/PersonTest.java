/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pti.edu;

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
public class PersonTest {
    
    public PersonTest() {
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
     * Test of getlName method, of class Person.
     */
    @Test
    public void testGetlName() {
        System.out.println("getlName");
        Person instance = new Person();
        instance.setlName("Tom");
        String expResult = "Tom";
        String result = instance.getlName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setlName method, of class Person.
     */
    @Test
    public void testSetlName() {
        System.out.println("setlName");
        String lName = "Bart";
        Person instance = new Person();
        instance.setlName(lName);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getfName method, of class Person.
     */
    @Test
    public void testGetfName() {
        System.out.println("getfName");
        Person instance = new Person();
        instance.setfName("Bob");
        String expResult = "Bob";
        String result = instance.getfName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setfName method, of class Person.
     */
    @Test
    public void testSetfName() {
        System.out.println("setfName");
        String fName = "Tim";
        Person instance = new Person();
        instance.setfName(fName);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getStreetAddress method, of class Person.
     */
    @Test
    public void testGetStreetAddress() {
        System.out.println("getStreetAddress");
        Person instance = new Person();
        instance.setStreetAddress("15 main");
        String expResult = "15 main";
        String result = instance.getStreetAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setStreetAddress method, of class Person.
     */
    @Test
    public void testSetStreetAddress() {
        System.out.println("setStreetAddress");
        String streetAddress = "154 totp";
        Person instance = new Person();
        instance.setStreetAddress(streetAddress);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getZip method, of class Person.
     */
    @Test
    public void testGetZip() {
        System.out.println("getZip");
        Person instance = new Person();
        instance.setZip(55212);
        int expResult = 55212;
        int result = instance.getZip();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setZip method, of class Person.
     */
    @Test
    public void testSetZip() {
        System.out.println("setZip");
        int zip = 0;
        Person instance = new Person();
        instance.setZip(zip);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPhone method, of class Person.
     */
    @Test
    public void testGetPhone() {
        System.out.println("getPhone");
        Person instance = new Person();
        instance.setPhone("7859991234");
        String expResult = "7859991234";
        String result = instance.getPhone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPhone method, of class Person.
     */
    @Test
    public void testSetPhone() {
        System.out.println("setPhone");
        String phone = "123456789";
        Person instance = new Person();
        instance.setPhone(phone);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Person.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Person instance = new Person();
        
        String expResult = "First Name: null Last Name: null Street Address: null Zip: 0 Phone: null ";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
