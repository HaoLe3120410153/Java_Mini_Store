/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package BLL;

import DTO.TaiKhoanDTO;
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
public class TaiKhoanBLLTest {
    
    public TaiKhoanBLLTest() {
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
    public void testResetListTk() {
        System.out.println("resetListTk");
        TaiKhoanBLL instance = new TaiKhoanBLL();
        instance.resetListTk();
        fail("The test case is a prototype.");
    }

    @Test
    public void testLoadListTk() {
        System.out.println("loadListTk");
        TaiKhoanBLL instance = new TaiKhoanBLL();
        instance.loadListTk();
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetListTk() {
        System.out.println("setListTk");
        DefaultTableModel model = null;
        TaiKhoanBLL instance = new TaiKhoanBLL();
        instance.setListTk(model);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTkToCombobox() {
        System.out.println("setTkToCombobox");
        DefaultComboBoxModel model = null;
        TaiKhoanBLL instance = new TaiKhoanBLL();
        instance.setTkToCombobox(model);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTkToComboboxbyTT() {
        System.out.println("setTkToComboboxbyTT");
        DefaultComboBoxModel model = null;
        TaiKhoanBLL instance = new TaiKhoanBLL();
        instance.setTkToComboboxbyTT(model);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTkToComboboxbyMaNvHt() {
        System.out.println("setTkToComboboxbyMaNvHt");
        DefaultComboBoxModel model = null;
        int ma_nv = 0;
        TaiKhoanBLL instance = new TaiKhoanBLL();
        instance.setTkToComboboxbyMaNvHt(model, ma_nv);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCapNhatTrangThaiTK() {
        System.out.println("CapNhatTrangThaiTK");
        String ma_tk = "";
        String trang_thai = "";
        TaiKhoanBLL instance = new TaiKhoanBLL();
        instance.CapNhatTrangThaiTK(ma_tk, trang_thai);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTkByMaTK() {
        System.out.println("getTkByMaTK");
        int ma_tk = 0;
        TaiKhoanBLL instance = new TaiKhoanBLL();
        TaiKhoanDTO expResult = null;
        TaiKhoanDTO result = instance.getTkByMaTK(ma_tk);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testThemTK() {
        System.out.println("ThemTK");
        String[] arr = null;
        TaiKhoanBLL instance = new TaiKhoanBLL();
        instance.ThemTK(arr);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSuaTk() {
        System.out.println("SuaTk");
        String[] arr = null;
        TaiKhoanBLL instance = new TaiKhoanBLL();
        instance.SuaTk(arr);
        fail("The test case is a prototype.");
    }

    @Test
    public void testXoaTK() {
        System.out.println("XoaTK");
        int ma_tk = 0;
        TaiKhoanBLL instance = new TaiKhoanBLL();
        instance.XoaTK(ma_tk);
        fail("The test case is a prototype.");
    }

    @Test
    public void testMaMoi() {
        System.out.println("maMoi");
        TaiKhoanBLL instance = new TaiKhoanBLL();
        int expResult = 0;
        int result = instance.maMoi();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testLogin() {
        System.out.println("login");
        String username = "";
        String password = "";
        TaiKhoanBLL instance = new TaiKhoanBLL();
        boolean expResult = false;
        boolean result = instance.login(username, password);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMaTkAfterLogin() {
        System.out.println("getMaTkAfterLogin");
        String username = "";
        String password = "";
        TaiKhoanBLL instance = new TaiKhoanBLL();
        int expResult = 0;
        int result = instance.getMaTkAfterLogin(username, password);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimkiemTKTheoMa() {
        System.out.println("timkiemTKTheoMa");
        DefaultTableModel model = null;
        String ma_tk = "";
        TaiKhoanBLL instance = new TaiKhoanBLL();
        instance.timkiemTKTheoMa(model, ma_tk);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimkiemTKTheoTen() {
        System.out.println("timkiemTKTheoTen");
        DefaultTableModel model = null;
        String ten_tk = "";
        TaiKhoanBLL instance = new TaiKhoanBLL();
        instance.timkiemTKTheoTen(model, ten_tk);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimkiemTKTheoPQ() {
        System.out.println("timkiemTKTheoPQ");
        DefaultTableModel model = null;
        String quyen = "";
        TaiKhoanBLL instance = new TaiKhoanBLL();
        instance.timkiemTKTheoPQ(model, quyen);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimkiemTKTheoTT() {
        System.out.println("timkiemTKTheoTT");
        DefaultTableModel model = null;
        String trang_thai = "";
        TaiKhoanBLL instance = new TaiKhoanBLL();
        instance.timkiemTKTheoTT(model, trang_thai);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTongTK() {
        System.out.println("getTongTK");
        TaiKhoanBLL instance = new TaiKhoanBLL();
        int expResult = 0;
        int result = instance.getTongTK();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
