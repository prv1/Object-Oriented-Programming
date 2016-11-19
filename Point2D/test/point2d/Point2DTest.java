/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package point2d;

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
public class Point2DTest {
    
    public Point2DTest() {
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
     * Test of main method, of class Point2D.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Point2D.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getx method, of class Point2D.
     */
    @Test
    public void testGetx() {
        System.out.println("getx");
        Point2D instance = new Point2D();
        int expResult = 0;
        int result = instance.getx();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gety method, of class Point2D.
     */
    @Test
    public void testGety() {
        System.out.println("gety");
        Point2D instance = new Point2D();
        int expResult = 0;
        int result = instance.gety();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setx method, of class Point2D.
     */
    @Test
    public void testSetx() {
        System.out.println("setx");
        int x = 0;
        Point2D instance = new Point2D();
        instance.setx(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sety method, of class Point2D.
     */
    @Test
    public void testSety() {
        System.out.println("sety");
        int y = 0;
        Point2D instance = new Point2D();
        instance.sety(y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Equals method, of class Point2D.
     */
    @Test
    public void testEquals() {
        System.out.println("Equals");
        Object object = new Point2D(3,1);
        Point2D instance = new Point2D(2,1);
        boolean expResult = true;
        boolean result = instance.Equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Point2D.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Point2D instance = new Point2D();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
