/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package DTO;

import java.util.Date;
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
public class HoaDonDTOTest {
    
    public HoaDonDTOTest() {
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
        HoaDonDTO instance = new HoaDonDTO();
        String expResult = "";
        String result = instance.getMa_hoa_don();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMa_hoa_don() {
        System.out.println("setMa_hoa_don");
        String ma_hoa_don = "";
        HoaDonDTO instance = new HoaDonDTO();
        instance.setMa_hoa_don(ma_hoa_don);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetNgay_xuat() {
        System.out.println("getNgay_xuat");
        HoaDonDTO instance = new HoaDonDTO();
        Date expResult = null;
        Date result = instance.getNgay_xuat();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNgay_xuat() {
        System.out.println("setNgay_xuat");
        Date ngay_xuat = null;
        HoaDonDTO instance = new HoaDonDTO();
        instance.setNgay_xuat(ngay_xuat);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMa_nhan_vien() {
        System.out.println("getMa_nhan_vien");
        HoaDonDTO instance = new HoaDonDTO();
        String expResult = "";
        String result = instance.getMa_nhan_vien();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMa_nhan_vien() {
        System.out.println("setMa_nhan_vien");
        String ma_nhan_vien = "";
        HoaDonDTO instance = new HoaDonDTO();
        instance.setMa_nhan_vien(ma_nhan_vien);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMa_thanh_vien() {
        System.out.println("getMa_thanh_vien");
        HoaDonDTO instance = new HoaDonDTO();
        String expResult = "";
        String result = instance.getMa_thanh_vien();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMa_thanh_vien() {
        System.out.println("setMa_thanh_vien");
        String ma_thanh_vien = "";
        HoaDonDTO instance = new HoaDonDTO();
        instance.setMa_thanh_vien(ma_thanh_vien);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTong_tien() {
        System.out.println("getTong_tien");
        HoaDonDTO instance = new HoaDonDTO();
        int expResult = 0;
        int result = instance.getTong_tien();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTong_tien() {
        System.out.println("setTong_tien");
        int tong_tien = 0;
        HoaDonDTO instance = new HoaDonDTO();
        instance.setTong_tien(tong_tien);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTien_giam() {
        System.out.println("getTien_giam");
        HoaDonDTO instance = new HoaDonDTO();
        int expResult = 0;
        int result = instance.getTien_giam();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTien_giam() {
        System.out.println("setTien_giam");
        int tien_giam = 0;
        HoaDonDTO instance = new HoaDonDTO();
        instance.setTien_giam(tien_giam);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTien_con_lai() {
        System.out.println("getTien_con_lai");
        HoaDonDTO instance = new HoaDonDTO();
        int expResult = 0;
        int result = instance.getTien_con_lai();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTien_con_lai() {
        System.out.println("setTien_con_lai");
        int tien_con_lai = 0;
        HoaDonDTO instance = new HoaDonDTO();
        instance.setTien_con_lai(tien_con_lai);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMa_phieu_giam_gia() {
        System.out.println("getMa_phieu_giam_gia");
        HoaDonDTO instance = new HoaDonDTO();
        String expResult = "";
        String result = instance.getMa_phieu_giam_gia();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMa_phieu_giam_gia() {
        System.out.println("setMa_phieu_giam_gia");
        String ma_phieu_giam_gia = "";
        HoaDonDTO instance = new HoaDonDTO();
        instance.setMa_phieu_giam_gia(ma_phieu_giam_gia);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetDiem() {
        System.out.println("getDiem");
        HoaDonDTO instance = new HoaDonDTO();
        int expResult = 0;
        int result = instance.getDiem();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetDiem() {
        System.out.println("setDiem");
        int diem = 0;
        HoaDonDTO instance = new HoaDonDTO();
        instance.setDiem(diem);
        fail("The test case is a prototype.");
    }
    
}
