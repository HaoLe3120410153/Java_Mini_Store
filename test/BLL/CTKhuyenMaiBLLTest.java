/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package BLL;

import DTO.ChuongTrinhKMDTO;
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
public class CTKhuyenMaiBLLTest {
    
    public CTKhuyenMaiBLLTest() {
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
    public void testResetListKM() {
        System.out.println("resetListKM");
        CTKhuyenMaiBLL instance = new CTKhuyenMaiBLL();
        instance.resetListKM();
        fail("The test case is a prototype.");
    }

    @Test
    public void testLoadListKM() {
        System.out.println("loadListKM");
        CTKhuyenMaiBLL instance = new CTKhuyenMaiBLL();
        instance.loadListKM();
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetListTableKM() {
        System.out.println("setListTableKM");
        DefaultTableModel model = null;
        CTKhuyenMaiBLL instance = new CTKhuyenMaiBLL();
        instance.setListTableKM(model);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDoiTrangThai() {
        System.out.println("doiTrangThai");
        int ma_ctkm = 0;
        String tt = "";
        CTKhuyenMaiBLL instance = new CTKhuyenMaiBLL();
        instance.doiTrangThai(ma_ctkm, tt);
        fail("The test case is a prototype.");
    }

    @Test
    public void testThemCTKM() {
        System.out.println("themCTKM");
        String[] str = null;
        CTKhuyenMaiBLL instance = new CTKhuyenMaiBLL();
        instance.themCTKM(str);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSuaCTKM() {
        System.out.println("suaCTKM");
        String[] arr = null;
        CTKhuyenMaiBLL instance = new CTKhuyenMaiBLL();
        instance.suaCTKM(arr);
        fail("The test case is a prototype.");
    }

    @Test
    public void testXoaCTKM() {
        System.out.println("xoaCTKM");
        int ma_ctkm = 0;
        CTKhuyenMaiBLL instance = new CTKhuyenMaiBLL();
        instance.xoaCTKM(ma_ctkm);
        fail("The test case is a prototype.");
    }

    @Test
    public void testMaMoi() {
        System.out.println("maMoi");
        CTKhuyenMaiBLL instance = new CTKhuyenMaiBLL();
        int expResult = 0;
        int result = instance.maMoi();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetCtkmByMaCTKM() {
        System.out.println("getCtkmByMaCTKM");
        int ma_ctkm = 0;
        CTKhuyenMaiBLL instance = new CTKhuyenMaiBLL();
        ChuongTrinhKMDTO expResult = null;
        ChuongTrinhKMDTO result = instance.getCtkmByMaCTKM(ma_ctkm);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCheckKm() {
        System.out.println("checkKm");
        CTKhuyenMaiBLL instance = new CTKhuyenMaiBLL();
        boolean expResult = false;
        boolean result = instance.checkKm();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimKiemCtkmTheoMa() {
        System.out.println("timKiemCtkmTheoMa");
        DefaultTableModel modelCTKM = null;
        String search = "";
        CTKhuyenMaiBLL instance = new CTKhuyenMaiBLL();
        instance.timKiemCtkmTheoMa(modelCTKM, search);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimKiemCtkmTheoTen() {
        System.out.println("timKiemCtkmTheoTen");
        DefaultTableModel modelCTKM = null;
        String search = "";
        CTKhuyenMaiBLL instance = new CTKhuyenMaiBLL();
        instance.timKiemCtkmTheoTen(modelCTKM, search);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimKiemCtkmTheoTT() {
        System.out.println("timKiemCtkmTheoTT");
        DefaultTableModel modelCTKM = null;
        String search = "";
        CTKhuyenMaiBLL instance = new CTKhuyenMaiBLL();
        instance.timKiemCtkmTheoTT(modelCTKM, search);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimKiemCtkmTheoNgay() throws Exception {
        System.out.println("timKiemCtkmTheoNgay");
        DefaultTableModel modelCTKM = null;
        String search = "";
        CTKhuyenMaiBLL instance = new CTKhuyenMaiBLL();
        instance.timKiemCtkmTheoNgay(modelCTKM, search);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimKiemKMTheoKhoanNgay() {
        System.out.println("timKiemKMTheoKhoanNgay");
        DefaultTableModel model = null;
        Date ngayTu = null;
        Date ngayDen = null;
        CTKhuyenMaiBLL instance = new CTKhuyenMaiBLL();
        instance.timKiemKMTheoKhoanNgay(model, ngayTu, ngayDen);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTongCTKM() {
        System.out.println("getTongCTKM");
        CTKhuyenMaiBLL instance = new CTKhuyenMaiBLL();
        int expResult = 0;
        int result = instance.getTongCTKM();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
