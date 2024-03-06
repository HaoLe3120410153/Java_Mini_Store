/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package BLL;

import DTO.PhieuGiamGiaDTO;
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
public class PhieuGiamGiaBLLTest {
    
    public PhieuGiamGiaBLLTest() {
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
    public void testResetListPGG() {
        System.out.println("resetListPGG");
        PhieuGiamGiaBLL instance = new PhieuGiamGiaBLL();
        instance.resetListPGG();
        fail("The test case is a prototype.");
    }

    @Test
    public void testLoadListPGG() {
        System.out.println("loadListPGG");
        PhieuGiamGiaBLL instance = new PhieuGiamGiaBLL();
        instance.loadListPGG();
        fail("The test case is a prototype.");
    }

    @Test
    public void testThemPGG() {
        System.out.println("ThemPGG");
        String[] str = null;
        PhieuGiamGiaBLL instance = new PhieuGiamGiaBLL();
        instance.ThemPGG(str);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSuaPGG() {
        System.out.println("suaPGG");
        String[] str = null;
        PhieuGiamGiaBLL instance = new PhieuGiamGiaBLL();
        instance.suaPGG(str);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDelPGG() {
        System.out.println("delPGG");
        String maPGG = "";
        PhieuGiamGiaBLL instance = new PhieuGiamGiaBLL();
        instance.delPGG(maPGG);
        fail("The test case is a prototype.");
    }

    @Test
    public void testMaMoi() {
        System.out.println("MaMoi");
        PhieuGiamGiaBLL instance = new PhieuGiamGiaBLL();
        String expResult = "";
        String result = instance.MaMoi();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTablePGG() {
        System.out.println("setTablePGG");
        DefaultTableModel model = null;
        PhieuGiamGiaBLL instance = new PhieuGiamGiaBLL();
        instance.setTablePGG(model);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetPGGbyMaPGG() {
        System.out.println("getPGGbyMaPGG");
        String ma_PGG = "";
        PhieuGiamGiaBLL instance = new PhieuGiamGiaBLL();
        PhieuGiamGiaDTO expResult = null;
        PhieuGiamGiaDTO result = instance.getPGGbyMaPGG(ma_PGG);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetPGGbyTenPGG() {
        System.out.println("getPGGbyTenPGG");
        String ten_PGG = "";
        PhieuGiamGiaBLL instance = new PhieuGiamGiaBLL();
        PhieuGiamGiaDTO expResult = null;
        PhieuGiamGiaDTO result = instance.getPGGbyTenPGG(ten_PGG);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCheckDate() {
        System.out.println("checkDate");
        PhieuGiamGiaDTO x = null;
        PhieuGiamGiaBLL instance = new PhieuGiamGiaBLL();
        boolean expResult = false;
        boolean result = instance.checkDate(x);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimKiemPhieuTheoKhoanGia() {
        System.out.println("timKiemPhieuTheoKhoanGia");
        DefaultTableModel modelPGG = null;
        int giamTu = 0;
        int giamDen = 0;
        PhieuGiamGiaBLL instance = new PhieuGiamGiaBLL();
        instance.timKiemPhieuTheoKhoanGia(modelPGG, giamTu, giamDen);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimKiemPhieuGiamGiaTheoTen() {
        System.out.println("timKiemPhieuGiamGiaTheoTen");
        DefaultTableModel modelPGG = null;
        String search = "";
        PhieuGiamGiaBLL instance = new PhieuGiamGiaBLL();
        instance.timKiemPhieuGiamGiaTheoTen(modelPGG, search);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimKiemPhieuTheoKhoanNgay() {
        System.out.println("timKiemPhieuTheoKhoanNgay");
        DefaultTableModel modelPGG = null;
        Date ngayTu = null;
        Date ngayDen = null;
        PhieuGiamGiaBLL instance = new PhieuGiamGiaBLL();
        instance.timKiemPhieuTheoKhoanNgay(modelPGG, ngayTu, ngayDen);
        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdateTrangThai() {
        System.out.println("updateTrangThai");
        String ma_phieu_giam = "";
        PhieuGiamGiaBLL instance = new PhieuGiamGiaBLL();
        instance.updateTrangThai(ma_phieu_giam);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimKiemPhieuGiamGiaTheoMaPGG() {
        System.out.println("timKiemPhieuGiamGiaTheoMaPGG");
        DefaultTableModel modelPGG = null;
        String search = "";
        PhieuGiamGiaBLL instance = new PhieuGiamGiaBLL();
        instance.timKiemPhieuGiamGiaTheoMaPGG(modelPGG, search);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimKiemPhieuGiamGiaTheoTTPGG() {
        System.out.println("timKiemPhieuGiamGiaTheoTTPGG");
        DefaultTableModel modelPGG = null;
        String search = "";
        PhieuGiamGiaBLL instance = new PhieuGiamGiaBLL();
        instance.timKiemPhieuGiamGiaTheoTTPGG(modelPGG, search);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTongPGG() {
        System.out.println("getTongPGG");
        PhieuGiamGiaBLL instance = new PhieuGiamGiaBLL();
        int expResult = 0;
        int result = instance.getTongPGG();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
