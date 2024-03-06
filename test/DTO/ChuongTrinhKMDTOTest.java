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
public class ChuongTrinhKMDTOTest {
    
    public ChuongTrinhKMDTOTest() {
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
    public void testGetMa_ctkm() {
        System.out.println("getMa_ctkm");
        ChuongTrinhKMDTO instance = new ChuongTrinhKMDTO();
        int expResult = 0;
        int result = instance.getMa_ctkm();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMa_ctkm() {
        System.out.println("setMa_ctkm");
        int ma_ctkm = 0;
        ChuongTrinhKMDTO instance = new ChuongTrinhKMDTO();
        instance.setMa_ctkm(ma_ctkm);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTen_ctkm() {
        System.out.println("getTen_ctkm");
        ChuongTrinhKMDTO instance = new ChuongTrinhKMDTO();
        String expResult = "";
        String result = instance.getTen_ctkm();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTen_ctkm() {
        System.out.println("setTen_ctkm");
        String ten_ctkm = "";
        ChuongTrinhKMDTO instance = new ChuongTrinhKMDTO();
        instance.setTen_ctkm(ten_ctkm);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetNgay_bat_dau() {
        System.out.println("getNgay_bat_dau");
        ChuongTrinhKMDTO instance = new ChuongTrinhKMDTO();
        Date expResult = null;
        Date result = instance.getNgay_bat_dau();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNgay_bat_dau() {
        System.out.println("setNgay_bat_dau");
        Date ngay_bat_dau = null;
        ChuongTrinhKMDTO instance = new ChuongTrinhKMDTO();
        instance.setNgay_bat_dau(ngay_bat_dau);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetNgay_ket_thuc() {
        System.out.println("getNgay_ket_thuc");
        ChuongTrinhKMDTO instance = new ChuongTrinhKMDTO();
        Date expResult = null;
        Date result = instance.getNgay_ket_thuc();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNgay_ket_thuc() {
        System.out.println("setNgay_ket_thuc");
        Date ngay_ket_thuc = null;
        ChuongTrinhKMDTO instance = new ChuongTrinhKMDTO();
        instance.setNgay_ket_thuc(ngay_ket_thuc);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTrang_thai() {
        System.out.println("getTrang_thai");
        ChuongTrinhKMDTO instance = new ChuongTrinhKMDTO();
        int expResult = 0;
        int result = instance.getTrang_thai();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTrang_thai() {
        System.out.println("setTrang_thai");
        int trang_thai = 0;
        ChuongTrinhKMDTO instance = new ChuongTrinhKMDTO();
        instance.setTrang_thai(trang_thai);
        fail("The test case is a prototype.");
    }
    
}
