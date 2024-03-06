/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package BLL;

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
public class CTHoaDonBLLTest {
    
    public CTHoaDonBLLTest() {
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
    public void testResetListCTHD() {
        System.out.println("resetListCTHD");
        CTHoaDonBLL instance = new CTHoaDonBLL();
        instance.resetListCTHD();
        fail("The test case is a prototype.");
    }

    @Test
    public void testLoadListCTHD() {
        System.out.println("loadListCTHD");
        String ma_hd = "";
        CTHoaDonBLL instance = new CTHoaDonBLL();
        instance.loadListCTHD(ma_hd);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTaoCTHoaDonToHoaDon() {
        System.out.println("taoCTHoaDonToHoaDon");
        DefaultTableModel model = null;
        String ma_hd = "";
        CTHoaDonBLL instance = new CTHoaDonBLL();
        instance.taoCTHoaDonToHoaDon(model, ma_hd);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTableCTHD() {
        System.out.println("setTableCTHD");
        DefaultTableModel model = null;
        String ma_hd = "";
        CTHoaDonBLL instance = new CTHoaDonBLL();
        instance.setTableCTHD(model, ma_hd);
        fail("The test case is a prototype.");
    }

    @Test
    public void testXoaCTHD() {
        System.out.println("xoaCTHD");
        String[] str = null;
        CTHoaDonBLL instance = new CTHoaDonBLL();
        instance.xoaCTHD(str);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimKiemCTHDTheoMaMon() {
        System.out.println("timKiemCTHDTheoMaMon");
        DefaultTableModel modelCT = null;
        String search = "";
        String ma_hd = "";
        CTHoaDonBLL instance = new CTHoaDonBLL();
        instance.timKiemCTHDTheoMaMon(modelCT, search, ma_hd);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimKiemCTHDTheoTenMon() {
        System.out.println("timKiemCTHDTheoTenMon");
        DefaultTableModel modelCT = null;
        String search = "";
        String ma_hd = "";
        CTHoaDonBLL instance = new CTHoaDonBLL();
        instance.timKiemCTHDTheoTenMon(modelCT, search, ma_hd);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimKiemTheoKhoanGia() {
        System.out.println("timKiemTheoKhoanGia");
        DefaultTableModel modelCT = null;
        int SearchTu = 0;
        int searchDen = 0;
        String ma_hd = "";
        CTHoaDonBLL instance = new CTHoaDonBLL();
        instance.timKiemTheoKhoanGia(modelCT, SearchTu, searchDen, ma_hd);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimKiemTheoKhoanSL() {
        System.out.println("timKiemTheoKhoanSL");
        DefaultTableModel modelCT = null;
        int SearchTu = 0;
        int searchDen = 0;
        String ma_hd = "";
        CTHoaDonBLL instance = new CTHoaDonBLL();
        instance.timKiemTheoKhoanSL(modelCT, SearchTu, searchDen, ma_hd);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimKiemTheoKhoanTT() {
        System.out.println("timKiemTheoKhoanTT");
        DefaultTableModel modelCT = null;
        int SearchTu = 0;
        int searchDen = 0;
        String ma_hd = "";
        CTHoaDonBLL instance = new CTHoaDonBLL();
        instance.timKiemTheoKhoanTT(modelCT, SearchTu, searchDen, ma_hd);
        fail("The test case is a prototype.");
    }
    
}
