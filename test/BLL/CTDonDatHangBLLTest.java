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
public class CTDonDatHangBLLTest {
    
    public CTDonDatHangBLLTest() {
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
    public void testResetListCtDdh() {
        System.out.println("resetListCtDdh");
        CTDonDatHangBLL instance = new CTDonDatHangBLL();
        instance.resetListCtDdh();
        fail("The test case is a prototype.");
    }

    @Test
    public void testLoadListCtDdh() {
        System.out.println("loadListCtDdh");
        String ma_dn = "";
        CTDonDatHangBLL instance = new CTDonDatHangBLL();
        instance.loadListCtDdh(ma_dn);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTableCTDN() {
        System.out.println("setTableCTDN");
        DefaultTableModel model = null;
        String ma_dn = "";
        CTDonDatHangBLL instance = new CTDonDatHangBLL();
        instance.setTableCTDN(model, ma_dn);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTaoCTDonDatToDonDat() {
        System.out.println("taoCTDonDatToDonDat");
        DefaultTableModel model = null;
        String ma_ddh = "";
        CTDonDatHangBLL instance = new CTDonDatHangBLL();
        instance.taoCTDonDatToDonDat(model, ma_ddh);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTaoCTDonDatHang() {
        System.out.println("taoCTDonDatHang");
        String[] str = null;
        CTDonDatHangBLL instance = new CTDonDatHangBLL();
        instance.taoCTDonDatHang(str);
        fail("The test case is a prototype.");
    }

    @Test
    public void testXoaCTDonDat() {
        System.out.println("xoaCTDonDat");
        String[] str = null;
        CTDonDatHangBLL instance = new CTDonDatHangBLL();
        instance.xoaCTDonDat(str);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimKiemCTNDTheoMaMon() {
        System.out.println("timKiemCTNDTheoMaMon");
        DefaultTableModel model = null;
        String search = "";
        String ma_dn = "";
        CTDonDatHangBLL instance = new CTDonDatHangBLL();
        instance.timKiemCTNDTheoMaMon(model, search, ma_dn);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimKiemCTHDTheoTenMon() {
        System.out.println("timKiemCTHDTheoTenMon");
        DefaultTableModel model = null;
        String search = "";
        String ma_dn = "";
        CTDonDatHangBLL instance = new CTDonDatHangBLL();
        instance.timKiemCTHDTheoTenMon(model, search, ma_dn);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimKiemTheoKhoanGia() {
        System.out.println("timKiemTheoKhoanGia");
        DefaultTableModel model = null;
        int SearchTu = 0;
        int searchDen = 0;
        String ma_dn = "";
        CTDonDatHangBLL instance = new CTDonDatHangBLL();
        instance.timKiemTheoKhoanGia(model, SearchTu, searchDen, ma_dn);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimKiemTheoKhoanTT() {
        System.out.println("timKiemTheoKhoanTT");
        DefaultTableModel model = null;
        int SearchTu = 0;
        int searchDen = 0;
        String ma_dn = "";
        CTDonDatHangBLL instance = new CTDonDatHangBLL();
        instance.timKiemTheoKhoanTT(model, SearchTu, searchDen, ma_dn);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimKiemTheoKhoanSL() {
        System.out.println("timKiemTheoKhoanSL");
        DefaultTableModel model = null;
        int SearchTu = 0;
        int searchDen = 0;
        String ma_dn = "";
        CTDonDatHangBLL instance = new CTDonDatHangBLL();
        instance.timKiemTheoKhoanSL(model, SearchTu, searchDen, ma_dn);
        fail("The test case is a prototype.");
    }
    
}
