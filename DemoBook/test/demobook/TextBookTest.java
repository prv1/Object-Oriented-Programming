/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demobook;

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
public class TextBookTest {
    
    public TextBookTest() {
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
     * Test of getGradeLevel method, of class TextBook.
     */
    @Test
    public void testGetGradeLevel() {
        System.out.println("getGradeLevel");
        TextBook instance = new TextBook();
        int expResult = 0;
        int result = instance.getGradeLevel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setGradeLevel method, of class TextBook.
     */
    @Test
    public void testSetGradeLevel() {
        System.out.println("setGradeLevel");
        int gradeLevel = 0;
        TextBook instance = new TextBook();
        instance.setGradeLevel(gradeLevel);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
