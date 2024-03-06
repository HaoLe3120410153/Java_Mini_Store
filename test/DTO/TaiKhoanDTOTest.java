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
public class TaiKhoanDTOTest {
    
    public TaiKhoanDTOTest() {
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
    public void testGetMa_tai_khoan() {
        System.out.println("getMa_tai_khoan");
        TaiKhoanDTO instance = new TaiKhoanDTO();
        int expResult = 0;
        int result = instance.getMa_tai_khoan();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMa_tai_khoan() {
        System.out.println("setMa_tai_khoan");
        int ma_tai_khoan = 0;
        TaiKhoanDTO instance = new TaiKhoanDTO();
        instance.setMa_tai_khoan(ma_tai_khoan);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTen_tai_khoan() {
        System.out.println("getTen_tai_khoan");
        TaiKhoanDTO instance = new TaiKhoanDTO();
        String expResult = "";
        String result = instance.getTen_tai_khoan();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTen_tai_khoan() {
        System.out.println("setTen_tai_khoan");
        String ten_tai_khoan = "";
        TaiKhoanDTO instance = new TaiKhoanDTO();
        instance.setTen_tai_khoan(ten_tai_khoan);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMat_khau() {
        System.out.println("getMat_khau");
        TaiKhoanDTO instance = new TaiKhoanDTO();
        String expResult = "";
        String result = instance.getMat_khau();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMat_khau() {
        System.out.println("setMat_khau");
        String mat_khau = "";
        TaiKhoanDTO instance = new TaiKhoanDTO();
        instance.setMat_khau(mat_khau);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetPhan_quyen() {
        System.out.println("getPhan_quyen");
        TaiKhoanDTO instance = new TaiKhoanDTO();
        int expResult = 0;
        int result = instance.getPhan_quyen();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetPhan_quyen() {
        System.out.println("setPhan_quyen");
        int phan_quyen = 0;
        TaiKhoanDTO instance = new TaiKhoanDTO();
        instance.setPhan_quyen(phan_quyen);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTrang_thai() {
        System.out.println("getTrang_thai");
        TaiKhoanDTO instance = new TaiKhoanDTO();
        int expResult = 0;
        int result = instance.getTrang_thai();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTrang_thai() {
        System.out.println("setTrang_thai");
        int trang_thai = 0;
        TaiKhoanDTO instance = new TaiKhoanDTO();
        instance.setTrang_thai(trang_thai);
        fail("The test case is a prototype.");
    }
    
}
