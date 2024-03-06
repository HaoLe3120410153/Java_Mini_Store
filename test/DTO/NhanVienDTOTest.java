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
public class NhanVienDTOTest {
    
    public NhanVienDTOTest() {
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
    public void testGetMa_nhan_vien() {
        System.out.println("getMa_nhan_vien");
        NhanVienDTO instance = new NhanVienDTO();
        String expResult = "";
        String result = instance.getMa_nhan_vien();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMa_nhan_vien() {
        System.out.println("setMa_nhan_vien");
        String ma_nhan_vien = "";
        NhanVienDTO instance = new NhanVienDTO();
        instance.setMa_nhan_vien(ma_nhan_vien);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTen_nhan_vien() {
        System.out.println("getTen_nhan_vien");
        NhanVienDTO instance = new NhanVienDTO();
        String expResult = "";
        String result = instance.getTen_nhan_vien();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTen_nhan_vien() {
        System.out.println("setTen_nhan_vien");
        String ten_nhan_vien = "";
        NhanVienDTO instance = new NhanVienDTO();
        instance.setTen_nhan_vien(ten_nhan_vien);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetNgay_sinh() {
        System.out.println("getNgay_sinh");
        NhanVienDTO instance = new NhanVienDTO();
        Date expResult = null;
        Date result = instance.getNgay_sinh();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNgay_sinh() {
        System.out.println("setNgay_sinh");
        Date ngay_sinh = null;
        NhanVienDTO instance = new NhanVienDTO();
        instance.setNgay_sinh(ngay_sinh);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetSdt() {
        System.out.println("getSdt");
        NhanVienDTO instance = new NhanVienDTO();
        String expResult = "";
        String result = instance.getSdt();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetSdt() {
        System.out.println("setSdt");
        String sdt = "";
        NhanVienDTO instance = new NhanVienDTO();
        instance.setSdt(sdt);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMail() {
        System.out.println("getMail");
        NhanVienDTO instance = new NhanVienDTO();
        String expResult = "";
        String result = instance.getMail();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMail() {
        System.out.println("setMail");
        String mail = "";
        NhanVienDTO instance = new NhanVienDTO();
        instance.setMail(mail);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTai_khoan() {
        System.out.println("getTai_khoan");
        NhanVienDTO instance = new NhanVienDTO();
        int expResult = 0;
        int result = instance.getTai_khoan();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTai_khoan() {
        System.out.println("setTai_khoan");
        int tai_khoan = 0;
        NhanVienDTO instance = new NhanVienDTO();
        instance.setTai_khoan(tai_khoan);
        fail("The test case is a prototype.");
    }
    
}
