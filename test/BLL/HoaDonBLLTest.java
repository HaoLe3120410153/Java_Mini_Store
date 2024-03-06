/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package BLL;

import DTO.HoaDonDTO;
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
public class HoaDonBLLTest {
    
    public HoaDonBLLTest() {
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
    public void testResetListHD() {
        System.out.println("resetListHD");
        HoaDonBLL instance = new HoaDonBLL();
        instance.resetListHD();
        fail("The test case is a prototype.");
    }

    @Test
    public void testLoadListHD() {
        System.out.println("loadListHD");
        HoaDonBLL instance = new HoaDonBLL();
        instance.loadListHD();
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetList() {
        System.out.println("getList");
        HoaDonBLL instance = new HoaDonBLL();
        List<HoaDonDTO> expResult = null;
        List<HoaDonDTO> result = instance.getList();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetListExcel() {
        System.out.println("getListExcel");
        HoaDonBLL instance = new HoaDonBLL();
        List<HoaDonDTO> expResult = null;
        List<HoaDonDTO> result = instance.getListExcel();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testResetListExcel() {
        System.out.println("resetListExcel");
        HoaDonBLL instance = new HoaDonBLL();
        instance.resetListExcel();
        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdateListExcel() {
        System.out.println("updateListExcel");
        HoaDonDTO hoaDonDTO = null;
        HoaDonBLL instance = new HoaDonBLL();
        instance.updateListExcel(hoaDonDTO);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCreateHD() {
        System.out.println("CreateHD");
        String[] str = null;
        HoaDonBLL instance = new HoaDonBLL();
        instance.CreateHD(str);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDelHD() {
        System.out.println("delHD");
        String ma_hoa_don = "";
        HoaDonBLL instance = new HoaDonBLL();
        instance.delHD(ma_hoa_don);
        fail("The test case is a prototype.");
    }

    @Test
    public void testMaMoi() {
        System.out.println("MaMoi");
        HoaDonBLL instance = new HoaDonBLL();
        String expResult = "";
        String result = instance.MaMoi();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTableHD() {
        System.out.println("setTableHD");
        DefaultTableModel model = null;
        HoaDonBLL instance = new HoaDonBLL();
        instance.setTableHD(model);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetHoaDonCoGiaMax() {
        System.out.println("getHoaDonCoGiaMax");
        HoaDonBLL instance = new HoaDonBLL();
        int expResult = 0;
        int result = instance.getHoaDonCoGiaMax();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetHoaDonCoGiaMin() {
        System.out.println("getHoaDonCoGiaMin");
        HoaDonBLL instance = new HoaDonBLL();
        int expResult = 0;
        int result = instance.getHoaDonCoGiaMin();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetDoanhThuThangHienTai() {
        System.out.println("getDoanhThuThangHienTai");
        HoaDonBLL instance = new HoaDonBLL();
        int expResult = 0;
        int result = instance.getDoanhThuThangHienTai();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetDoanhThuNamHienTai() {
        System.out.println("getDoanhThuNamHienTai");
        HoaDonBLL instance = new HoaDonBLL();
        int expResult = 0;
        int result = instance.getDoanhThuNamHienTai();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetDoanhThuNgayHienTai() {
        System.out.println("getDoanhThuNgayHienTai");
        HoaDonBLL instance = new HoaDonBLL();
        int expResult = 0;
        int result = instance.getDoanhThuNgayHienTai();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testThongKeHoaDonTheoDiem() {
        System.out.println("thongKeHoaDonTheoDiem");
        DefaultTableModel modelHD = null;
        int searchHDTu = 0;
        int searchHDDen = 0;
        HoaDonBLL instance = new HoaDonBLL();
        instance.thongKeHoaDonTheoDiem(modelHD, searchHDTu, searchHDDen);
        fail("The test case is a prototype.");
    }

    @Test
    public void testThongKeHoaDonTheoTienConLai() {
        System.out.println("thongKeHoaDonTheoTienConLai");
        DefaultTableModel modelHD = null;
        int searchHDTu = 0;
        int searchHDDen = 0;
        HoaDonBLL instance = new HoaDonBLL();
        instance.thongKeHoaDonTheoTienConLai(modelHD, searchHDTu, searchHDDen);
        fail("The test case is a prototype.");
    }

    @Test
    public void testThongKeHoaDonTheoTienGiam() {
        System.out.println("thongKeHoaDonTheoTienGiam");
        DefaultTableModel modelHD = null;
        int searchHDTu = 0;
        int searchHDDen = 0;
        HoaDonBLL instance = new HoaDonBLL();
        instance.thongKeHoaDonTheoTienGiam(modelHD, searchHDTu, searchHDDen);
        fail("The test case is a prototype.");
    }

    @Test
    public void testThongKeHoaDonTheoTongTien() {
        System.out.println("thongKeHoaDonTheoTongTien");
        DefaultTableModel modelHD = null;
        int searchHDTu = 0;
        int searchHDDen = 0;
        HoaDonBLL instance = new HoaDonBLL();
        instance.thongKeHoaDonTheoTongTien(modelHD, searchHDTu, searchHDDen);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimKiemHoaDonTheoMaPGG() {
        System.out.println("timKiemHoaDonTheoMaPGG");
        DefaultTableModel modelHD = null;
        String search = "";
        HoaDonBLL instance = new HoaDonBLL();
        instance.timKiemHoaDonTheoMaPGG(modelHD, search);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimKiemHoaDonTheoTenTV() {
        System.out.println("timKiemHoaDonTheoTenTV");
        DefaultTableModel modelHD = null;
        String search = "";
        HoaDonBLL instance = new HoaDonBLL();
        instance.timKiemHoaDonTheoTenTV(modelHD, search);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimKiemHoaDonTheoMaTV() {
        System.out.println("timKiemHoaDonTheoMaTV");
        DefaultTableModel modelHD = null;
        String search = "";
        HoaDonBLL instance = new HoaDonBLL();
        instance.timKiemHoaDonTheoMaTV(modelHD, search);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimKiemHoaDonTheoTenNV() {
        System.out.println("timKiemHoaDonTheoTenNV");
        DefaultTableModel modelHD = null;
        String search = "";
        HoaDonBLL instance = new HoaDonBLL();
        instance.timKiemHoaDonTheoTenNV(modelHD, search);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimKiemHoaDonTheoMaNV() {
        System.out.println("timKiemHoaDonTheoMaNV");
        DefaultTableModel modelHD = null;
        String search = "";
        HoaDonBLL instance = new HoaDonBLL();
        instance.timKiemHoaDonTheoMaNV(modelHD, search);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimKiemHoaDonTheoNgay() {
        System.out.println("timKiemHoaDonTheoNgay");
        DefaultTableModel modelHD = null;
        String search = "";
        HoaDonBLL instance = new HoaDonBLL();
        instance.timKiemHoaDonTheoNgay(modelHD, search);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimKiemHoaDonTheoMaHD() {
        System.out.println("timKiemHoaDonTheoMaHD");
        DefaultTableModel modelHD = null;
        String search = "";
        HoaDonBLL instance = new HoaDonBLL();
        instance.timKiemHoaDonTheoMaHD(modelHD, search);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimKiemHoaDonTheoKhoanTG() {
        System.out.println("timKiemHoaDonTheoKhoanTG");
        DefaultTableModel modelHD = null;
        Date dateFrom = null;
        Date dateTo = null;
        HoaDonBLL instance = new HoaDonBLL();
        instance.timKiemHoaDonTheoKhoanTG(modelHD, dateFrom, dateTo);
        fail("The test case is a prototype.");
    }
    
}
