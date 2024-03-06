/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package BLL;

import DTO.MonAnDTO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class MonAnBLLTest {
    
    public MonAnBLLTest() {
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
    public void testResetListMA() {
        System.out.println("resetListMA");
        MonAnBLL instance = new MonAnBLL();
        instance.resetListMA();
        fail("The test case is a prototype.");
    }

    @Test
    public void testLoadListMA() {
        System.out.println("loadListMA");
        MonAnBLL instance = new MonAnBLL();
        instance.loadListMA();
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetListTableMA() {
        System.out.println("setListTableMA");
        DefaultTableModel model = new DefaultTableModel();
        MonAnBLL instance = new MonAnBLL();
        instance.setListTableMA(model);
       
    }

    @Test
    public void testThemMon() {
        System.out.println("ThemMon");
        String[] arr = {"MA13","Mi Y","1","10000","LM03"};;
        MonAnBLL instance = new MonAnBLL();
        instance.ThemMon(arr);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSuaMon() {
        System.out.println("SuaMon");
        String[] arr = {"MA12","Mi Y 2","1","10000","LM03"};;
        MonAnBLL instance = new MonAnBLL();
        instance.SuaMon(arr);
        fail("The test case is a prototype.");
    }

    @Test
    public void testXoaMon() {
        System.out.println("XoaMon");
        String arr = "MA12";
        MonAnBLL instance = new MonAnBLL();
        instance.XoaMon(arr);
        fail("The test case is a prototype.");
    }

    @Test
    public void testMaMoi() {
        System.out.println("maMoi");
        MonAnBLL instance = new MonAnBLL();
        String expResult = "MA13";
        String result = instance.maMoi();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetCountFood() {
        System.out.println("getCountFood");
        String maMon = "";
        MonAnBLL instance = new MonAnBLL();
        int expResult = 0;
        int result = instance.getCountFood(maMon);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetFoodByMaMon() {
        System.out.println("getFoodByMaMon");
        String maMon = "MA01";
        MonAnBLL instance = new MonAnBLL();
        MonAnDTO expResult = new MonAnDTO();
        MonAnDTO result = instance.getFoodByMaMon(maMon);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMaMonByTenMon() {
        System.out.println("getMaMonByTenMon");
        String ten_mon = "";
        MonAnBLL instance = new MonAnBLL();
        String expResult = "";
        String result = instance.getMaMonByTenMon(ten_mon);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSuaGiaMonTheoKM() {
        System.out.println("suaGiaMonTheoKM");
        String ma_mon = "";
        int gia_giam = 0;
        MonAnBLL instance = new MonAnBLL();
        instance.suaGiaMonTheoKM(ma_mon, gia_giam);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetListFoodByMaLoai() {
        System.out.println("setListFoodByMaLoai");
        DefaultTableModel model = new DefaultTableModel();
        String maLoai = "";
        MonAnBLL instance = new MonAnBLL();
        instance.setListFoodByMaLoai(model, maLoai);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMonAnToComboboxByMaLoai() {
        System.out.println("setMonAnToComboboxByMaLoai");
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        String maLoai = "";
        MonAnBLL instance = new MonAnBLL();
        instance.setMonAnToComboboxByMaLoai(model, maLoai);
        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdateSoLuongSauKhiNhapHang() {
        System.out.println("updateSoLuongSauKhiNhapHang");
        String ma_mon = "";
        int so_luong = 0;
        MonAnBLL instance = new MonAnBLL();
        instance.updateSoLuongSauKhiNhapHang(ma_mon, so_luong);
        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdateSoLuongSauKhiKhachMua() {
        System.out.println("updateSoLuongSauKhiKhachMua");
        String ma_mon = "";
        int so_luong = 0;
        MonAnBLL instance = new MonAnBLL();
        instance.updateSoLuongSauKhiKhachMua(ma_mon, so_luong);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimkiemMonAnTheoMa() {
        System.out.println("timkiemMonAnTheoMa");
        DefaultTableModel model = new DefaultTableModel();
        String ma_mon = "";
        MonAnBLL instance = new MonAnBLL();
        instance.timkiemMonAnTheoMa(model, ma_mon);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimkiemMonAnTheoten() {
        System.out.println("timkiemMonAnTheoten");
        DefaultTableModel model = new DefaultTableModel();
        String ten_mon = "";
        MonAnBLL instance = new MonAnBLL();
        instance.timkiemMonAnTheoten(model, ten_mon);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimkiemMonAnTheoSL() {
        System.out.println("timkiemMonAnTheoSL");
        DefaultTableModel model = new DefaultTableModel();
        String so_luong = "";
        MonAnBLL instance = new MonAnBLL();
        instance.timkiemMonAnTheoSL(model, so_luong);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimkiemMonAnTheoGia() {
        System.out.println("timkiemMonAnTheoGia");
        DefaultTableModel model =new DefaultTableModel();
        String gia = "";
        MonAnBLL instance = new MonAnBLL();
        instance.timkiemMonAnTheoGia(model, gia);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimkiemMonAnTheoGiaGiam() {
        System.out.println("timkiemMonAnTheoGiaGiam");
        DefaultTableModel model = new DefaultTableModel();
        String gia_giam = "";
        MonAnBLL instance = new MonAnBLL();
        instance.timkiemMonAnTheoGiaGiam(model, gia_giam);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimkiemMonAnTheoGiaHT() {
        System.out.println("timkiemMonAnTheoGiaHT");
        DefaultTableModel model = new DefaultTableModel();
        String gia_hien_tai = "";
        MonAnBLL instance = new MonAnBLL();
        instance.timkiemMonAnTheoGiaHT(model, gia_hien_tai);
       
    }

    @Test
    public void testTimkiemMonAnTheoTenLoai() {
        System.out.println("timkiemMonAnTheoTenLoai");
        DefaultTableModel model = new DefaultTableModel();
        String ten_loai = "";
        MonAnBLL instance = new MonAnBLL();
        instance.timkiemMonAnTheoTenLoai(model, ten_loai);
       
    }

    @Test
    public void testTimkiemMonAnTheoKhoangGia() {
        System.out.println("timkiemMonAnTheoKhoangGia");
        DefaultTableModel model = new DefaultTableModel();
        int giaFrom = 0;
        int giaTo = 0;
        MonAnBLL instance = new MonAnBLL();
        instance.timkiemMonAnTheoKhoangGia(model, giaFrom, giaTo);
       
    }

    @Test
    public void testTimkiemMonAnTheoKhoangSL() {
        System.out.println("timkiemMonAnTheoKhoangSL");
        DefaultTableModel model = new DefaultTableModel();
        int soLuongFrom = 0;
        int soLuongTo = 0;
        MonAnBLL instance = new MonAnBLL();
        instance.timkiemMonAnTheoKhoangSL(model, soLuongFrom, soLuongTo);
     
    }

    @Test
    public void testTimkiemMonAnDNTheoMa() {
        System.out.println("timkiemMonAnDNTheoMa");
        DefaultTableModel model =new DefaultTableModel();
;
        String search = "";
        String ma_loai = "";
        MonAnBLL instance = new MonAnBLL();
        instance.timkiemMonAnDNTheoMa(model, search, ma_loai);
    
    }

    @Test
    public void testTimkiemMonAnDNTheoTen() {
        System.out.println("timkiemMonAnDNTheoTen");
        
        String search = "Pánh mì ngọt";
        String ma_loai = "LM02";
        MonAnBLL instance = new MonAnBLL();
        DefaultTableModel model =new DefaultTableModel();
        
        instance.timkiemMonAnDNTheoTen(model, search, ma_loai);
       
    }

    @Test
    public void testTimkiemMonAnDNTheoKhoangGia() {
        System.out.println("timkiemMonAnDNTheoKhoangGia");
        DefaultTableModel model = new DefaultTableModel();
        int giaFrom = 0;
        int giaTo = 0;
        String ma_loai = "LM02";
        MonAnBLL instance = new MonAnBLL();
        instance.timkiemMonAnDNTheoKhoangGia(model, giaFrom, giaTo, ma_loai);
        
    }

    @Test
    public void testGetTongMA() {
        System.out.println("getTongMA");
        MonAnBLL instance = new MonAnBLL();
        int expResult = 0;
        int result = instance.getTongMA();
        assertEquals(expResult, result);
       
    }
    
}
