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
public class CTChuongTrinhKMDTOTest {
    
    public CTChuongTrinhKMDTOTest() {
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
        CTChuongTrinhKMDTO instance = new CTChuongTrinhKMDTO();
        int expResult = 0;
        int result = instance.getMa_ctkm();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMa_ctkm() {
        System.out.println("setMa_ctkm");
        int ma_ctkm = 0;
        CTChuongTrinhKMDTO instance = new CTChuongTrinhKMDTO();
        instance.setMa_ctkm(ma_ctkm);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMa_mon() {
        System.out.println("getMa_mon");
        CTChuongTrinhKMDTO instance = new CTChuongTrinhKMDTO();
        String expResult = "";
        String result = instance.getMa_mon();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMa_mon() {
        System.out.println("setMa_mon");
        String ma_mon = "";
        CTChuongTrinhKMDTO instance = new CTChuongTrinhKMDTO();
        instance.setMa_mon(ma_mon);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTen_mon() {
        System.out.println("getTen_mon");
        CTChuongTrinhKMDTO instance = new CTChuongTrinhKMDTO();
        String expResult = "";
        String result = instance.getTen_mon();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTen_mon() {
        System.out.println("setTen_mon");
        String ten_mon = "";
        CTChuongTrinhKMDTO instance = new CTChuongTrinhKMDTO();
        instance.setTen_mon(ten_mon);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetGia_goc() {
        System.out.println("getGia_goc");
        CTChuongTrinhKMDTO instance = new CTChuongTrinhKMDTO();
        int expResult = 0;
        int result = instance.getGia_goc();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetGia_goc() {
        System.out.println("setGia_goc");
        int gia_goc = 0;
        CTChuongTrinhKMDTO instance = new CTChuongTrinhKMDTO();
        instance.setGia_goc(gia_goc);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTien_giam() {
        System.out.println("getTien_giam");
        CTChuongTrinhKMDTO instance = new CTChuongTrinhKMDTO();
        int expResult = 0;
        int result = instance.getTien_giam();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTien_giam() {
        System.out.println("setTien_giam");
        int tien_giam = 0;
        CTChuongTrinhKMDTO instance = new CTChuongTrinhKMDTO();
        instance.setTien_giam(tien_giam);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetGia_hien_tai() {
        System.out.println("getGia_hien_tai");
        CTChuongTrinhKMDTO instance = new CTChuongTrinhKMDTO();
        int expResult = 0;
        int result = instance.getGia_hien_tai();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetGia_hien_tai() {
        System.out.println("setGia_hien_tai");
        int gia_hien_tai = 0;
        CTChuongTrinhKMDTO instance = new CTChuongTrinhKMDTO();
        instance.setGia_hien_tai(gia_hien_tai);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTen_loai() {
        System.out.println("getTen_loai");
        CTChuongTrinhKMDTO instance = new CTChuongTrinhKMDTO();
        String expResult = "";
        String result = instance.getTen_loai();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTen_loai() {
        System.out.println("setTen_loai");
        String ten_loai = "";
        CTChuongTrinhKMDTO instance = new CTChuongTrinhKMDTO();
        instance.setTen_loai(ten_loai);
        fail("The test case is a prototype.");
    }
    
}
