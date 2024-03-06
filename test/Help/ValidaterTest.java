/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Help;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HELO
 */
public class ValidaterTest {
    
    public ValidaterTest() {
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

    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        String text = "";
        StringBuilder sb = null;
        String title = "";
        boolean expResult = false;
        boolean result = Validater.isEmpty(text, sb, title);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCheckNumber() {
        System.out.println("checkNumber");
        String text = "";
        StringBuilder sb = null;
        String title = "";
        boolean expResult = false;
        boolean result = Validater.checkNumber(text, sb, title);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
