/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package EXCEL;

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
public class XuatExcelTest {
    
    public XuatExcelTest() {
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
    public void testXuatHD() throws Exception {
        System.out.println("xuatHD");
        XuatExcel instance = new XuatExcel();
        instance.xuatHD();
        fail("The test case is a prototype.");
    }

    @Test
    public void testXuatDN() throws Exception {
        System.out.println("xuatDN");
        XuatExcel instance = new XuatExcel();
        instance.xuatDN();
        fail("The test case is a prototype.");
    }
    
}
