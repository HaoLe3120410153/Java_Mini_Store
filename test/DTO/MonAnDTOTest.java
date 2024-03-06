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
 * @author PC
 */
public class MonAnDTOTest {
    
    public MonAnDTOTest() {
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
    public void testGetMa_mon() {
        System.out.println("getMa_mon");
        MonAnDTO instance = new MonAnDTO("MA12","Mi Y",10,10000,0,"ML02");
        String expResult = "";
        String result = instance.getMa_mon();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMa_mon() {
        System.out.println("setMa_mon");
        String ma_mon = "";
        MonAnDTO instance = new MonAnDTO("MA12","Mi Y",10,10000,0,"ML02");
        instance.setMa_mon(ma_mon);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTen_mon() {
        System.out.println("getTen_mon");
        MonAnDTO instance = new MonAnDTO("MA12","Mi Y",10,10000,0,"ML02");
        String expResult = "";
        String result = instance.getTen_mon();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTen_mon() {
        System.out.println("setTen_mon");
        String ten_mon = "";
        MonAnDTO instance = new MonAnDTO("MA12","Mi Y",10,10000,0,"ML02");
        instance.setTen_mon(ten_mon);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetSo_luong() {
        System.out.println("getSo_luong");
        MonAnDTO instance = new MonAnDTO("MA12","Mi Y",10,10000,0,"ML02");
        int expResult = 0;
        int result = instance.getSo_luong();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetSo_luong() {
        System.out.println("setSo_luong");
        int so_luong = 0;
        MonAnDTO instance = new MonAnDTO("MA12","Mi Y",10,10000,0,"ML02");
        instance.setSo_luong(so_luong);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetGia() {
        System.out.println("getGia");
        MonAnDTO instance = new MonAnDTO("MA12","Mi Y",10,10000,0,"ML02");
        int expResult = 0;
        int result = instance.getGia();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetGia() {
        System.out.println("setGia");
        int gia = 0;
        MonAnDTO instance = new MonAnDTO("MA12","Mi Y",10,10000,0,"ML02");
        instance.setGia(gia);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetGia_giam() {
        System.out.println("getGia_giam");
        MonAnDTO instance = new MonAnDTO("MA12","Mi Y",10,10000,0,"ML02");
        int expResult = 0;
        int result = instance.getGia_giam();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetGia_giam() {
        System.out.println("setGia_giam");
        int gia_giam = 0;
        MonAnDTO instance = new MonAnDTO("MA12","Mi Y",10,10000,0,"ML02");
        instance.setGia_giam(gia_giam);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMa_loai() {
        System.out.println("getMa_loai");
        MonAnDTO instance = new MonAnDTO("MA12","Mi Y",10,10000,0,"ML02");
        String expResult = "";
        String result = instance.getMa_loai();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMa_loai() {
        System.out.println("setMa_loai");
        String ma_loai = "";
        MonAnDTO instance = new MonAnDTO("MA12","Mi Y",10,10000,0,"ML02");
        instance.setMa_loai(ma_loai);
        fail("The test case is a prototype.");
    }
    
}
