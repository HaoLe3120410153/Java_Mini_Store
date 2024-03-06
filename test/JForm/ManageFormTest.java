/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package JForm;

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
public class ManageFormTest {
    
    public ManageFormTest() {
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
        String expResult = "";
        String result = ManageForm.getMa_thanh_vien();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMa_thanh_vien() {
        System.out.println("setMa_thanh_vien");
        String ma_thanh_vien = "";
        ManageForm.setMa_thanh_vien(ma_thanh_vien);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMa_nv() {
        System.out.println("getMa_nv");
        String expResult = "";
        String result = ManageForm.getMa_nv();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMa_nv() {
        System.out.println("setMa_nv");
        String ma_nv = "";
        ManageForm.setMa_nv(ma_nv);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMaQuyen() {
        System.out.println("getMaQuyen");
        int expResult = 0;
        int result = ManageForm.getMaQuyen();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMaQuyen() {
        System.out.println("setMaQuyen");
        int ma_quyen = 0;
        ManageForm.setMaQuyen(ma_quyen);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetGiaThanhToan() {
        System.out.println("setGiaThanhToan");
        ManageForm instance = new ManageForm();
        instance.setGiaThanhToan();
        fail("The test case is a prototype.");
    }

    @Test
    public void testLoadTableManager() {
        System.out.println("loadTableManager");
        String ma_loai = "";
        ManageForm instance = new ManageForm();
        instance.loadTableManager(ma_loai);
        fail("The test case is a prototype.");
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ManageForm.main(args);
        fail("The test case is a prototype.");
    }
    
}
