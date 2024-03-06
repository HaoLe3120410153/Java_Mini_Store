/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package JForm;

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
public class ChiTietHDTest {
    
    public ChiTietHDTest() {
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
    public void testSetInitTable() {
        System.out.println("setInitTable");
        ChiTietHD instance = null;
        instance.setInitTable();
        fail("The test case is a prototype.");
    }

    @Test
    public void testLoadTableCTHD() {
        System.out.println("loadTableCTHD");
        ChiTietHD instance = null;
        instance.loadTableCTHD();
        fail("The test case is a prototype.");
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ChiTietHD.main(args);
        fail("The test case is a prototype.");
    }
    
}
