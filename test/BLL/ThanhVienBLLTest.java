/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package BLL;

import DTO.ThanhVienDTO;
import java.util.Date;
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
public class ThanhVienBLLTest {
    
    public ThanhVienBLLTest() {
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
    public void testResetListTV() {
        System.out.println("resetListTV");
        ThanhVienBLL instance = new ThanhVienBLL();
        instance.resetListTV();
        fail("The test case is a prototype.");
    }

    @Test
    public void testLoadListTV() {
        System.out.println("loadListTV");
        ThanhVienBLL instance = new ThanhVienBLL();
        instance.loadListTV();
        fail("The test case is a prototype.");
    }

    @Test
    public void testThemTV() {
        System.out.println("ThemTV");
        String[] str = null;
        ThanhVienBLL instance = new ThanhVienBLL();
        instance.ThemTV(str);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSuaTV() {
        System.out.println("suaTV");
        String[] str = null;
        ThanhVienBLL instance = new ThanhVienBLL();
        instance.suaTV(str);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDelTV() {
        System.out.println("delTV");
        String ma_thanh_vien = "";
        ThanhVienBLL instance = new ThanhVienBLL();
        instance.delTV(ma_thanh_vien);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTableListTV() {
        System.out.println("setTableListTV");
        DefaultTableModel model = null;
        ThanhVienBLL instance = new ThanhVienBLL();
        instance.setTableListTV(model);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTvByMaTV() {
        System.out.println("getTvByMaTV");
        String ma_thanh_vien = "";
        ThanhVienBLL instance = new ThanhVienBLL();
        ThanhVienDTO expResult = null;
        ThanhVienDTO result = instance.getTvByMaTV(ma_thanh_vien);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testMaMoi() {
        System.out.println("maMoi");
        ThanhVienBLL instance = new ThanhVienBLL();
        String expResult = "";
        String result = instance.maMoi();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCheckMaThanhVien() {
        System.out.println("checkMaThanhVien");
        String ma_thanh_vien = "";
        ThanhVienBLL instance = new ThanhVienBLL();
        boolean expResult = false;
        boolean result = instance.checkMaThanhVien(ma_thanh_vien);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCheckMatKhau() {
        System.out.println("checkMatKhau");
        String mat_khau = "";
        ThanhVienBLL instance = new ThanhVienBLL();
        boolean expResult = false;
        boolean result = instance.checkMatKhau(mat_khau);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCapNhatDiemTichLuy() {
        System.out.println("capNhatDiemTichLuy");
        String[] str = null;
        ThanhVienBLL instance = new ThanhVienBLL();
        instance.capNhatDiemTichLuy(str);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimKiemThanhVienTheoMaTv() {
        System.out.println("timKiemThanhVienTheoMaTv");
        DefaultTableModel modelTV = null;
        String search = "";
        ThanhVienBLL instance = new ThanhVienBLL();
        instance.timKiemThanhVienTheoMaTv(modelTV, search);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimKiemThanhVienTheoTenTV() {
        System.out.println("timKiemThanhVienTheoTenTV");
        DefaultTableModel modelTV = null;
        String search = "";
        ThanhVienBLL instance = new ThanhVienBLL();
        instance.timKiemThanhVienTheoTenTV(modelTV, search);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimKiemThanhVienTheoSDT() {
        System.out.println("timKiemThanhVienTheoSDT");
        DefaultTableModel modelTV = null;
        String search = "";
        ThanhVienBLL instance = new ThanhVienBLL();
        instance.timKiemThanhVienTheoSDT(modelTV, search);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimKiemThanhVienTheoMail() {
        System.out.println("timKiemThanhVienTheoMail");
        DefaultTableModel modelTV = null;
        String search = "";
        ThanhVienBLL instance = new ThanhVienBLL();
        instance.timKiemThanhVienTheoMail(modelTV, search);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimKiemThanhVienTheoKhoanDiem() {
        System.out.println("timKiemThanhVienTheoKhoanDiem");
        DefaultTableModel modelTV = null;
        int diemFrom = 0;
        int diemTo = 0;
        ThanhVienBLL instance = new ThanhVienBLL();
        instance.timKiemThanhVienTheoKhoanDiem(modelTV, diemFrom, diemTo);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimKiemThanhVienTheoKhoanNS() {
        System.out.println("timKiemThanhVienTheoKhoanNS");
        DefaultTableModel modelTV = null;
        Date NgayFrom = null;
        Date NgayTo = null;
        ThanhVienBLL instance = new ThanhVienBLL();
        instance.timKiemThanhVienTheoKhoanNS(modelTV, NgayFrom, NgayTo);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTongTV() {
        System.out.println("getTongTV");
        ThanhVienBLL instance = new ThanhVienBLL();
        int expResult = 0;
        int result = instance.getTongTV();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
