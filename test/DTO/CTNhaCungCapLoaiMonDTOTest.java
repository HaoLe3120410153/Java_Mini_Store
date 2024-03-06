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
public class CTNhaCungCapLoaiMonDTOTest {
    
    public CTNhaCungCapLoaiMonDTOTest() {
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
    public void testGetMa_ncc() {
        System.out.println("getMa_ncc");
        CTNhaCungCapLoaiMonDTO instance = new CTNhaCungCapLoaiMonDTO();
        String expResult = "";
        String result = instance.getMa_ncc();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMa_ncc() {
        System.out.println("setMa_ncc");
        String ma_ncc = "";
        CTNhaCungCapLoaiMonDTO instance = new CTNhaCungCapLoaiMonDTO();
        instance.setMa_ncc(ma_ncc);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMa_loai() {
        System.out.println("getMa_loai");
        CTNhaCungCapLoaiMonDTO instance = new CTNhaCungCapLoaiMonDTO();
        String expResult = "";
        String result = instance.getMa_loai();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMa_loai() {
        System.out.println("setMa_loai");
        String ma_loai = "";
        CTNhaCungCapLoaiMonDTO instance = new CTNhaCungCapLoaiMonDTO();
        instance.setMa_loai(ma_loai);
        fail("The test case is a prototype.");
    }
    
}
