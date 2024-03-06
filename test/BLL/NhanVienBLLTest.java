/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package BLL;

import DTO.NhanVienDTO;
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
public class NhanVienBLLTest {
    
    public NhanVienBLLTest() {
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
    public void testResetListNV() {
        System.out.println("resetListNV");
        NhanVienBLL instance = new NhanVienBLL();
        instance.resetListNV();
        fail("The test case is a prototype.");
    }

    @Test
    public void testLoadListNV() {
        System.out.println("loadListNV");
        NhanVienBLL instance = new NhanVienBLL();
        instance.loadListNV();
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetListNV() {
        System.out.println("setListNV");
        DefaultTableModel model = null;
        NhanVienBLL instance = new NhanVienBLL();
        instance.setListNV(model);
        fail("The test case is a prototype.");
    }

    @Test
    public void testThemNV() {
        System.out.println("ThemNV");
        String[] str = null;
        NhanVienBLL instance = new NhanVienBLL();
        instance.ThemNV(str);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSuaNV() {
        System.out.println("suaNV");
        String[] str = null;
        NhanVienBLL instance = new NhanVienBLL();
        instance.suaNV(str);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDelNV() {
        System.out.println("delNV");
        String maNV = "";
        NhanVienBLL instance = new NhanVienBLL();
        instance.delNV(maNV);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetNvByMaNV() {
        System.out.println("getNvByMaNV");
        String ma_nhan_vien = "";
        NhanVienBLL instance = new NhanVienBLL();
        NhanVienDTO expResult = null;
        NhanVienDTO result = instance.getNvByMaNV(ma_nhan_vien);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testMaMoi() {
        System.out.println("maMoi");
        NhanVienBLL instance = new NhanVienBLL();
        String expResult = "";
        String result = instance.maMoi();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimkiemNVTheoMa() {
        System.out.println("timkiemNVTheoMa");
        DefaultTableModel model = null;
        String ma_nv = "";
        NhanVienBLL instance = new NhanVienBLL();
        instance.timkiemNVTheoMa(model, ma_nv);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimkiemNVTheoTen() {
        System.out.println("timkiemNVTheoTen");
        DefaultTableModel model = null;
        String ten_nv = "";
        NhanVienBLL instance = new NhanVienBLL();
        instance.timkiemNVTheoTen(model, ten_nv);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimkiemNVTheoSDT() {
        System.out.println("timkiemNVTheoSDT");
        DefaultTableModel model = null;
        String sdt = "";
        NhanVienBLL instance = new NhanVienBLL();
        instance.timkiemNVTheoSDT(model, sdt);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimkiemNVTheoMail() {
        System.out.println("timkiemNVTheoMail");
        DefaultTableModel model = null;
        String mail = "";
        NhanVienBLL instance = new NhanVienBLL();
        instance.timkiemNVTheoMail(model, mail);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimkiemNVTheoTK() {
        System.out.println("timkiemNVTheoTK");
        DefaultTableModel model = null;
        String tk = "";
        NhanVienBLL instance = new NhanVienBLL();
        instance.timkiemNVTheoTK(model, tk);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimkiemNVTheoNS() {
        System.out.println("timkiemNVTheoNS");
        DefaultTableModel model = null;
        Date ngayPd = null;
        Date ngayKt = null;
        NhanVienBLL instance = new NhanVienBLL();
        instance.timkiemNVTheoNS(model, ngayPd, ngayKt);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMaNvByMaTk() {
        System.out.println("getMaNvByMaTk");
        int ma_tk = 0;
        NhanVienBLL instance = new NhanVienBLL();
        String expResult = "";
        String result = instance.getMaNvByMaTk(ma_tk);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTongNV() {
        System.out.println("getTongNV");
        NhanVienBLL instance = new NhanVienBLL();
        int expResult = 0;
        int result = instance.getTongNV();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
