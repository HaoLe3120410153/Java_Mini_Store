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
public class HoaDonHienThiDTOTest {
    
    public HoaDonHienThiDTOTest() {
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
    public void testGetTen_mon() {
        System.out.println("getTen_mon");
        HoaDonHienThiDTO instance = new HoaDonHienThiDTO();
        String expResult = "";
        String result = instance.getTen_mon();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTen_mon() {
        System.out.println("setTen_mon");
        String ten_mon = "";
        HoaDonHienThiDTO instance = new HoaDonHienThiDTO();
        instance.setTen_mon(ten_mon);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetGia() {
        System.out.println("getGia");
        HoaDonHienThiDTO instance = new HoaDonHienThiDTO();
        int expResult = 0;
        int result = instance.getGia();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetGia() {
        System.out.println("setGia");
        int gia = 0;
        HoaDonHienThiDTO instance = new HoaDonHienThiDTO();
        instance.setGia(gia);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetSo_luong() {
        System.out.println("getSo_luong");
        HoaDonHienThiDTO instance = new HoaDonHienThiDTO();
        int expResult = 0;
        int result = instance.getSo_luong();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetSo_luong() {
        System.out.println("setSo_luong");
        int so_luong = 0;
        HoaDonHienThiDTO instance = new HoaDonHienThiDTO();
        instance.setSo_luong(so_luong);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetThanh_tien() {
        System.out.println("getThanh_tien");
        HoaDonHienThiDTO instance = new HoaDonHienThiDTO();
        int expResult = 0;
        int result = instance.getThanh_tien();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetThanh_tien() {
        System.out.println("setThanh_tien");
        int thanh_tien = 0;
        HoaDonHienThiDTO instance = new HoaDonHienThiDTO();
        instance.setThanh_tien(thanh_tien);
        fail("The test case is a prototype.");
    }
    
}
