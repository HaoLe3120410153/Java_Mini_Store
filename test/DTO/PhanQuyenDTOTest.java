/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package DTO;

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
public class PhanQuyenDTOTest {
    
    public PhanQuyenDTOTest() {
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
    public void testGetMa_quyen() {
        System.out.println("getMa_quyen");
        PhanQuyenDTO instance = new PhanQuyenDTO();
        int expResult = 0;
        int result = instance.getMa_quyen();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMa_quyen() {
        System.out.println("setMa_quyen");
        int ma_quyen = 0;
        PhanQuyenDTO instance = new PhanQuyenDTO();
        instance.setMa_quyen(ma_quyen);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetQuyen() {
        System.out.println("getQuyen");
        PhanQuyenDTO instance = new PhanQuyenDTO();
        String expResult = "";
        String result = instance.getQuyen();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetQuyen() {
        System.out.println("setQuyen");
        String quyen = "";
        PhanQuyenDTO instance = new PhanQuyenDTO();
        instance.setQuyen(quyen);
        fail("The test case is a prototype.");
    }
    
}
