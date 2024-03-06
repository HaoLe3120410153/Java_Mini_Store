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
public class CTDonDatHangDTOTest {
    
    public CTDonDatHangDTOTest() {
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
    public void testGetMa_hoa_don() {
        System.out.println("getMa_hoa_don");
        CTDonDatHangDTO instance = new CTDonDatHangDTO();
        String expResult = "";
        String result = instance.getMa_hoa_don();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMa_hoa_don() {
        System.out.println("setMa_hoa_don");
        String ma_hoa_don = "";
        CTDonDatHangDTO instance = new CTDonDatHangDTO();
        instance.setMa_hoa_don(ma_hoa_don);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMa_mon() {
        System.out.println("getMa_mon");
        CTDonDatHangDTO instance = new CTDonDatHangDTO();
        String expResult = "";
        String result = instance.getMa_mon();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMa_mon() {
        System.out.println("setMa_mon");
        String ma_mon = "";
        CTDonDatHangDTO instance = new CTDonDatHangDTO();
        instance.setMa_mon(ma_mon);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTen_mon() {
        System.out.println("getTen_mon");
        CTDonDatHangDTO instance = new CTDonDatHangDTO();
        String expResult = "";
        String result = instance.getTen_mon();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTen_mon() {
        System.out.println("setTen_mon");
        String ten_mon = "";
        CTDonDatHangDTO instance = new CTDonDatHangDTO();
        instance.setTen_mon(ten_mon);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetSo_luong() {
        System.out.println("getSo_luong");
        CTDonDatHangDTO instance = new CTDonDatHangDTO();
        int expResult = 0;
        int result = instance.getSo_luong();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetSo_luong() {
        System.out.println("setSo_luong");
        int so_luong = 0;
        CTDonDatHangDTO instance = new CTDonDatHangDTO();
        instance.setSo_luong(so_luong);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetGia_mon() {
        System.out.println("getGia_mon");
        CTDonDatHangDTO instance = new CTDonDatHangDTO();
        int expResult = 0;
        int result = instance.getGia_mon();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetGia_mon() {
        System.out.println("setGia_mon");
        int gia_mon = 0;
        CTDonDatHangDTO instance = new CTDonDatHangDTO();
        instance.setGia_mon(gia_mon);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetThanh_tien() {
        System.out.println("getThanh_tien");
        CTDonDatHangDTO instance = new CTDonDatHangDTO();
        int expResult = 0;
        int result = instance.getThanh_tien();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetThanh_tien() {
        System.out.println("setThanh_tien");
        int thanh_tien = 0;
        CTDonDatHangDTO instance = new CTDonDatHangDTO();
        instance.setThanh_tien(thanh_tien);
        fail("The test case is a prototype.");
    }
    
}
