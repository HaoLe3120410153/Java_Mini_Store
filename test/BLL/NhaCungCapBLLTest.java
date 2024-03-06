/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package BLL;

import DTO.NhaCungCapDTO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
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
public class NhaCungCapBLLTest {
    
    public NhaCungCapBLLTest() {
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
    public void testResetListNCC() {
        System.out.println("resetListNCC");
        NhaCungCapBLL instance = new NhaCungCapBLL();
        instance.resetListNCC();
        fail("The test case is a prototype.");
    }

    @Test
    public void testLoadListNCC() {
        System.out.println("loadListNCC");
        NhaCungCapBLL instance = new NhaCungCapBLL();
        instance.loadListNCC();
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetListNCC() {
        System.out.println("setListNCC");
        DefaultTableModel model = null;
        NhaCungCapBLL instance = new NhaCungCapBLL();
        instance.setListNCC(model);
        fail("The test case is a prototype.");
    }

    @Test
    public void testThemNCC() {
        System.out.println("ThemNCC");
        String[] str = null;
        NhaCungCapBLL instance = new NhaCungCapBLL();
        instance.ThemNCC(str);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSuaNCC() {
        System.out.println("suaNCC");
        String[] str = null;
        NhaCungCapBLL instance = new NhaCungCapBLL();
        instance.suaNCC(str);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDelNCC() {
        System.out.println("delNCC");
        String maNV = "";
        NhaCungCapBLL instance = new NhaCungCapBLL();
        instance.delNCC(maNV);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetNccByMaNcc() {
        System.out.println("getNccByMaNcc");
        String ma_ncc = "";
        NhaCungCapBLL instance = new NhaCungCapBLL();
        NhaCungCapDTO expResult = null;
        NhaCungCapDTO result = instance.getNccByMaNcc(ma_ncc);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTenNccByMaNcc() {
        System.out.println("getTenNccByMaNcc");
        String ma_ncc = "";
        NhaCungCapBLL instance = new NhaCungCapBLL();
        String expResult = "";
        String result = instance.getTenNccByMaNcc(ma_ncc);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTenNccToCombobox() {
        System.out.println("setTenNccToCombobox");
        DefaultComboBoxModel model = null;
        NhaCungCapBLL instance = new NhaCungCapBLL();
        instance.setTenNccToCombobox(model);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMaNccByTenNcc() {
        System.out.println("getMaNccByTenNcc");
        String ten_ncc = "";
        NhaCungCapBLL instance = new NhaCungCapBLL();
        String expResult = "";
        String result = instance.getMaNccByTenNcc(ten_ncc);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testMaMoi() {
        System.out.println("maMoi");
        NhaCungCapBLL instance = new NhaCungCapBLL();
        String expResult = "";
        String result = instance.maMoi();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimKiemNccTheoMa() {
        System.out.println("timKiemNccTheoMa");
        DefaultTableModel modelNCC = null;
        String search = "";
        NhaCungCapBLL instance = new NhaCungCapBLL();
        instance.timKiemNccTheoMa(modelNCC, search);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimKiemNccTheoTen() {
        System.out.println("timKiemNccTheoTen");
        DefaultTableModel modelNCC = null;
        String search = "";
        NhaCungCapBLL instance = new NhaCungCapBLL();
        instance.timKiemNccTheoTen(modelNCC, search);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimKiemNccTheoDC() {
        System.out.println("timKiemNccTheoDC");
        DefaultTableModel modelNCC = null;
        String search = "";
        NhaCungCapBLL instance = new NhaCungCapBLL();
        instance.timKiemNccTheoDC(modelNCC, search);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTongNVV() {
        System.out.println("getTongNVV");
        NhaCungCapBLL instance = new NhaCungCapBLL();
        int expResult = 0;
        int result = instance.getTongNVV();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
