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
public class ThanhVienDTOTest {
    
    public ThanhVienDTOTest() {
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
    public void testGetMa_thanh_vien() {
        System.out.println("getMa_thanh_vien");
        ThanhVienDTO instance = new ThanhVienDTO();
        String expResult = "";
        String result = instance.getMa_thanh_vien();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMa_thanh_vien() {
        System.out.println("setMa_thanh_vien");
        String ma_thanh_vien = "";
        ThanhVienDTO instance = new ThanhVienDTO();
        instance.setMa_thanh_vien(ma_thanh_vien);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMat_khau() {
        System.out.println("getMat_khau");
        ThanhVienDTO instance = new ThanhVienDTO();
        String expResult = "";
        String result = instance.getMat_khau();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMat_khau() {
        System.out.println("setMat_khau");
        String mat_khau = "";
        ThanhVienDTO instance = new ThanhVienDTO();
        instance.setMat_khau(mat_khau);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTen_thanh_vien() {
        System.out.println("getTen_thanh_vien");
        ThanhVienDTO instance = new ThanhVienDTO();
        String expResult = "";
        String result = instance.getTen_thanh_vien();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTen_thanh_vien() {
        System.out.println("setTen_thanh_vien");
        String ten_thanh_vien = "";
        ThanhVienDTO instance = new ThanhVienDTO();
        instance.setTen_thanh_vien(ten_thanh_vien);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetNgay_sinh() {
        System.out.println("getNgay_sinh");
        ThanhVienDTO instance = new ThanhVienDTO();
        Date expResult = null;
        Date result = instance.getNgay_sinh();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNgay_sinh() {
        System.out.println("setNgay_sinh");
        Date ngay_sinh = null;
        ThanhVienDTO instance = new ThanhVienDTO();
        instance.setNgay_sinh(ngay_sinh);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetSdt() {
        System.out.println("getSdt");
        ThanhVienDTO instance = new ThanhVienDTO();
        String expResult = "";
        String result = instance.getSdt();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetSdt() {
        System.out.println("setSdt");
        String sdt = "";
        ThanhVienDTO instance = new ThanhVienDTO();
        instance.setSdt(sdt);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMail() {
        System.out.println("getMail");
        ThanhVienDTO instance = new ThanhVienDTO();
        String expResult = "";
        String result = instance.getMail();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMail() {
        System.out.println("setMail");
        String mail = "";
        ThanhVienDTO instance = new ThanhVienDTO();
        instance.setMail(mail);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetPoint() {
        System.out.println("getPoint");
        ThanhVienDTO instance = new ThanhVienDTO();
        int expResult = 0;
        int result = instance.getPoint();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetPoint() {
        System.out.println("setPoint");
        int point = 0;
        ThanhVienDTO instance = new ThanhVienDTO();
        instance.setPoint(point);
        fail("The test case is a prototype.");
    }
    
}
