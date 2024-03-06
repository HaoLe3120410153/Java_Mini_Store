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
public class LoaiMonDTOTest {
    
    public LoaiMonDTOTest() {
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
    public void testGetMa_loai() {
        System.out.println("getMa_loai");
        LoaiMonDTO instance = new LoaiMonDTO();
        String expResult = "";
        String result = instance.getMa_loai();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMa_loai() {
        System.out.println("setMa_loai");
        String ma_loai = "";
        LoaiMonDTO instance = new LoaiMonDTO();
        instance.setMa_loai(ma_loai);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTen_loai() {
        System.out.println("getTen_loai");
        LoaiMonDTO instance = new LoaiMonDTO();
        String expResult = "";
        String result = instance.getTen_loai();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTen_loai() {
        System.out.println("setTen_loai");
        String ten_loai = "";
        LoaiMonDTO instance = new LoaiMonDTO();
        instance.setTen_loai(ten_loai);
        fail("The test case is a prototype.");
    }
    
}
