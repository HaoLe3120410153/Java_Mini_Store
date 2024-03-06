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
public class NhaCungCapDTOTest {
    
    public NhaCungCapDTOTest() {
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
        NhaCungCapDTO instance = new NhaCungCapDTO();
        String expResult = "";
        String result = instance.getMa_ncc();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMa_ncc() {
        System.out.println("setMa_ncc");
        String ma_ncc = "";
        NhaCungCapDTO instance = new NhaCungCapDTO();
        instance.setMa_ncc(ma_ncc);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTen_ncc() {
        System.out.println("getTen_ncc");
        NhaCungCapDTO instance = new NhaCungCapDTO();
        String expResult = "";
        String result = instance.getTen_ncc();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTen_ncc() {
        System.out.println("setTen_ncc");
        String ten_ncc = "";
        NhaCungCapDTO instance = new NhaCungCapDTO();
        instance.setTen_ncc(ten_ncc);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetDia_chi() {
        System.out.println("getDia_chi");
        NhaCungCapDTO instance = new NhaCungCapDTO();
        String expResult = "";
        String result = instance.getDia_chi();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetDia_chi() {
        System.out.println("setDia_chi");
        String dia_chi = "";
        NhaCungCapDTO instance = new NhaCungCapDTO();
        instance.setDia_chi(dia_chi);
        fail("The test case is a prototype.");
    }
    
}
