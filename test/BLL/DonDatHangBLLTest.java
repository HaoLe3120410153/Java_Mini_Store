/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package BLL;

import DTO.DonDatHangDTO;
import java.util.Date;
import java.util.List;
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
public class DonDatHangBLLTest {
    
    public DonDatHangBLLTest() {
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
    public void testGetListExcel() {
        System.out.println("getListExcel");
        DonDatHangBLL instance = new DonDatHangBLL();
        List<DonDatHangDTO> expResult = null;
        List<DonDatHangDTO> result = instance.getListExcel();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetList() {
        System.out.println("getList");
        DonDatHangBLL instance = new DonDatHangBLL();
        List<DonDatHangDTO> expResult = null;
        List<DonDatHangDTO> result = instance.getList();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testResetListDDH() {
        System.out.println("resetListDDH");
        DonDatHangBLL instance = new DonDatHangBLL();
        instance.resetListDDH();
        fail("The test case is a prototype.");
    }

    @Test
    public void testLoadListDDH() {
        System.out.println("loadListDDH");
        DonDatHangBLL instance = new DonDatHangBLL();
        instance.loadListDDH();
        fail("The test case is a prototype.");
    }

    @Test
    public void testResetListExcel() {
        System.out.println("resetListExcel");
        DonDatHangBLL instance = new DonDatHangBLL();
        instance.resetListExcel();
        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdateListExcel() {
        System.out.println("updateListExcel");
        DonDatHangDTO donDatHangDTO = null;
        DonDatHangBLL instance = new DonDatHangBLL();
        instance.updateListExcel(donDatHangDTO);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTaoDonDat() {
        System.out.println("taoDonDat");
        String[] str = null;
        DonDatHangBLL instance = new DonDatHangBLL();
        instance.taoDonDat(str);
        fail("The test case is a prototype.");
    }

    @Test
    public void testXoaDonDat() {
        System.out.println("xoaDonDat");
        String ma_don_dat = "";
        DonDatHangBLL instance = new DonDatHangBLL();
        instance.xoaDonDat(ma_don_dat);
        fail("The test case is a prototype.");
    }

    @Test
    public void testMaMoi() {
        System.out.println("MaMoi");
        DonDatHangBLL instance = new DonDatHangBLL();
        String expResult = "";
        String result = instance.MaMoi();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTableDN() {
        System.out.println("setTableDN");
        DefaultTableModel model = null;
        DonDatHangBLL instance = new DonDatHangBLL();
        instance.setTableDN(model);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetDonNhapCoGiaMin() {
        System.out.println("getDonNhapCoGiaMin");
        DonDatHangBLL instance = new DonDatHangBLL();
        int expResult = 0;
        int result = instance.getDonNhapCoGiaMin();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetDonNhapCoGiaMax() {
        System.out.println("getDonNhapCoGiaMax");
        DonDatHangBLL instance = new DonDatHangBLL();
        int expResult = 0;
        int result = instance.getDonNhapCoGiaMax();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetChiPhiNamHienTai() {
        System.out.println("getChiPhiNamHienTai");
        DonDatHangBLL instance = new DonDatHangBLL();
        int expResult = 0;
        int result = instance.getChiPhiNamHienTai();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetChiPhiThangHienTai() {
        System.out.println("getChiPhiThangHienTai");
        DonDatHangBLL instance = new DonDatHangBLL();
        int expResult = 0;
        int result = instance.getChiPhiThangHienTai();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetChiPhiNgayHienTai() {
        System.out.println("getChiPhiNgayHienTai");
        DonDatHangBLL instance = new DonDatHangBLL();
        int expResult = 0;
        int result = instance.getChiPhiNgayHienTai();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimKiemDonNhapTheoMaDN() {
        System.out.println("timKiemDonNhapTheoMaDN");
        DefaultTableModel modelDN = null;
        String search = "";
        DonDatHangBLL instance = new DonDatHangBLL();
        instance.timKiemDonNhapTheoMaDN(modelDN, search);
        fail("The test case is a prototype.");
    }

    @Test
    public void testThongKeDonNhapTheoMaNCC() {
        System.out.println("thongKeDonNhapTheoMaNCC");
        DefaultTableModel modelDN = null;
        String search = "";
        DonDatHangBLL instance = new DonDatHangBLL();
        instance.thongKeDonNhapTheoMaNCC(modelDN, search);
        fail("The test case is a prototype.");
    }

    @Test
    public void testThongKeDonNhapTheoTenNCC() {
        System.out.println("thongKeDonNhapTheoTenNCC");
        DefaultTableModel modelDN = null;
        String search = "";
        DonDatHangBLL instance = new DonDatHangBLL();
        instance.thongKeDonNhapTheoTenNCC(modelDN, search);
        fail("The test case is a prototype.");
    }

    @Test
    public void testThongKeDonNhapTheoNgay() {
        System.out.println("thongKeDonNhapTheoNgay");
        DefaultTableModel modelDN = null;
        String search = "";
        DonDatHangBLL instance = new DonDatHangBLL();
        instance.thongKeDonNhapTheoNgay(modelDN, search);
        fail("The test case is a prototype.");
    }

    @Test
    public void testThongKeDonNhapTheoTT() {
        System.out.println("thongKeDonNhapTheoTT");
        DefaultTableModel modelDN = null;
        int tongTienTu = 0;
        int tongTienDen = 0;
        DonDatHangBLL instance = new DonDatHangBLL();
        instance.thongKeDonNhapTheoTT(modelDN, tongTienTu, tongTienDen);
        fail("The test case is a prototype.");
    }

    @Test
    public void testThongKeDonNhapTheoKhoanTG() {
        System.out.println("thongKeDonNhapTheoKhoanTG");
        DefaultTableModel modelDN = null;
        Date DNTuNgay = null;
        Date DNDenNgay = null;
        DonDatHangBLL instance = new DonDatHangBLL();
        instance.thongKeDonNhapTheoKhoanTG(modelDN, DNTuNgay, DNDenNgay);
        fail("The test case is a prototype.");
    }
    
}
