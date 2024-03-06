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
public class CtkmFormTest {
    
    public CtkmFormTest() {
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
    public void testGetMaCTKM() {
        System.out.println("getMaCTKM");
        CtkmForm instance = null;
        int expResult = 0;
        int result = instance.getMaCTKM();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTenCTKM() {
        System.out.println("getTenCTKM");
        CtkmForm instance = null;
        String expResult = "";
        String result = instance.getTenCTKM();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testInitTableCTCTKM() {
        System.out.println("initTableCTCTKM");
        CtkmForm instance = null;
        instance.initTableCTCTKM();
        fail("The test case is a prototype.");
    }

    @Test
    public void testLoadTableCTCTKM() {
        System.out.println("loadTableCTCTKM");
        CtkmForm instance = null;
        instance.loadTableCTCTKM();
        fail("The test case is a prototype.");
    }

    @Test
    public void testLoadComboboxLoai() {
        System.out.println("loadComboboxLoai");
        CtkmForm instance = null;
        instance.loadComboboxLoai();
        fail("The test case is a prototype.");
    }

    @Test
    public void testLoadComboboxMon() {
        System.out.println("loadComboboxMon");
        String ma_loai = "";
        CtkmForm instance = null;
        instance.loadComboboxMon(ma_loai);
        fail("The test case is a prototype.");
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CtkmForm.main(args);
        fail("The test case is a prototype.");
    }
    
}
