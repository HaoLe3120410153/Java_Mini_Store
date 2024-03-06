/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package DTO;

import java.sql.Date;
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
public class PhieuGiamGiaDTOTest {
    
    public PhieuGiamGiaDTOTest() {
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
    public void testGetTrang_thai() {
        System.out.println("getTrang_thai");
        PhieuGiamGiaDTO instance = new PhieuGiamGiaDTO();
        int expResult = 0;
        int result = instance.getTrang_thai();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTrang_thai() {
        System.out.println("setTrang_thai");
        int trang_thai = 0;
        PhieuGiamGiaDTO instance = new PhieuGiamGiaDTO();
        instance.setTrang_thai(trang_thai);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMa_phieu_giam_gia() {
        System.out.println("getMa_phieu_giam_gia");
        PhieuGiamGiaDTO instance = new PhieuGiamGiaDTO();
        String expResult = "";
        String result = instance.getMa_phieu_giam_gia();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMa_phieu_giam_gia() {
        System.out.println("setMa_phieu_giam_gia");
        String ma_phieu_giam_gia = "";
        PhieuGiamGiaDTO instance = new PhieuGiamGiaDTO();
        instance.setMa_phieu_giam_gia(ma_phieu_giam_gia);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTen_phieu_giam_gia() {
        System.out.println("getTen_phieu_giam_gia");
        PhieuGiamGiaDTO instance = new PhieuGiamGiaDTO();
        String expResult = "";
        String result = instance.getTen_phieu_giam_gia();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTen_phieu_giam_gia() {
        System.out.println("setTen_phieu_giam_gia");
        String ten_phieu_giam_gia = "";
        PhieuGiamGiaDTO instance = new PhieuGiamGiaDTO();
        instance.setTen_phieu_giam_gia(ten_phieu_giam_gia);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetGiam() {
        System.out.println("getGiam");
        PhieuGiamGiaDTO instance = new PhieuGiamGiaDTO();
        int expResult = 0;
        int result = instance.getGiam();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetGiam() {
        System.out.println("setGiam");
        int giam = 0;
        PhieuGiamGiaDTO instance = new PhieuGiamGiaDTO();
        instance.setGiam(giam);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetNgay_bat_dau() {
        System.out.println("getNgay_bat_dau");
        PhieuGiamGiaDTO instance = new PhieuGiamGiaDTO();
        Date expResult = null;
        Date result = instance.getNgay_bat_dau();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNgay_bat_dau() {
        System.out.println("setNgay_bat_dau");
        Date ngay_bat_dau = null;
        PhieuGiamGiaDTO instance = new PhieuGiamGiaDTO();
        instance.setNgay_bat_dau(ngay_bat_dau);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetNgay_ket_thuc() {
        System.out.println("getNgay_ket_thuc");
        PhieuGiamGiaDTO instance = new PhieuGiamGiaDTO();
        Date expResult = null;
        Date result = instance.getNgay_ket_thuc();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNgay_ket_thuc() {
        System.out.println("setNgay_ket_thuc");
        Date ngay_ket_thuc = null;
        PhieuGiamGiaDTO instance = new PhieuGiamGiaDTO();
        instance.setNgay_ket_thuc(ngay_ket_thuc);
        fail("The test case is a prototype.");
    }
    
}
