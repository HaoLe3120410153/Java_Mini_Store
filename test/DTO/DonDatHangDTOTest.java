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
public class DonDatHangDTOTest {
    
    public DonDatHangDTOTest() {
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
    public void testGetMa_don_dat() {
        System.out.println("getMa_don_dat");
        DonDatHangDTO instance = new DonDatHangDTO();
        String expResult = "";
        String result = instance.getMa_don_dat();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMa_don_dat() {
        System.out.println("setMa_don_dat");
        String ma_don_dat = "";
        DonDatHangDTO instance = new DonDatHangDTO();
        instance.setMa_don_dat(ma_don_dat);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMa_ncc() {
        System.out.println("getMa_ncc");
        DonDatHangDTO instance = new DonDatHangDTO();
        String expResult = "";
        String result = instance.getMa_ncc();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMa_ncc() {
        System.out.println("setMa_ncc");
        String ma_ncc = "";
        DonDatHangDTO instance = new DonDatHangDTO();
        instance.setMa_ncc(ma_ncc);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetNgay_dat() {
        System.out.println("getNgay_dat");
        DonDatHangDTO instance = new DonDatHangDTO();
        Date expResult = null;
        Date result = instance.getNgay_dat();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNgay_dat() {
        System.out.println("setNgay_dat");
        Date ngay_dat = null;
        DonDatHangDTO instance = new DonDatHangDTO();
        instance.setNgay_dat(ngay_dat);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTong_tien_dat() {
        System.out.println("getTong_tien_dat");
        DonDatHangDTO instance = new DonDatHangDTO();
        int expResult = 0;
        int result = instance.getTong_tien_dat();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTong_tien_dat() {
        System.out.println("setTong_tien_dat");
        int tong_tien_dat = 0;
        DonDatHangDTO instance = new DonDatHangDTO();
        instance.setTong_tien_dat(tong_tien_dat);
        fail("The test case is a prototype.");
    }
    
}
