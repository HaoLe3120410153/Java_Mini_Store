/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package BLL;

import DTO.CTChuongTrinhKMDTO;
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
public class CTChuongTrinhKMBLLTest {
    
    public CTChuongTrinhKMBLLTest() {
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
    public void testResetListCTCTKM() {
        System.out.println("resetListCTCTKM");
        CTChuongTrinhKMBLL instance = new CTChuongTrinhKMBLL();
        instance.resetListCTCTKM();
        fail("The test case is a prototype.");
    }

    @Test
    public void testLoadListCTCTKM() {
        System.out.println("loadListCTCTKM");
        int ma_ctkm = 0;
        CTChuongTrinhKMBLL instance = new CTChuongTrinhKMBLL();
        instance.loadListCTCTKM(ma_ctkm);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetListCTCTKM() {
        System.out.println("setListCTCTKM");
        DefaultTableModel model = null;
        int ma_ctkm = 0;
        CTChuongTrinhKMBLL instance = new CTChuongTrinhKMBLL();
        instance.setListCTCTKM(model, ma_ctkm);
        fail("The test case is a prototype.");
    }

    @Test
    public void testApdungCTKM() {
        System.out.println("apdungCTKM");
        int ma_ctkm = 0;
        CTChuongTrinhKMBLL instance = new CTChuongTrinhKMBLL();
        instance.apdungCTKM(ma_ctkm);
        fail("The test case is a prototype.");
    }

    @Test
    public void testNgungApDung() {
        System.out.println("ngungApDung");
        int ma_ctkm = 0;
        CTChuongTrinhKMBLL instance = new CTChuongTrinhKMBLL();
        instance.ngungApDung(ma_ctkm);
        fail("The test case is a prototype.");
    }

    @Test
    public void testThemCTCTKM() {
        System.out.println("ThemCTCTKM");
        String[] str = null;
        CTChuongTrinhKMBLL instance = new CTChuongTrinhKMBLL();
        instance.ThemCTCTKM(str);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSuaCTCTKM() {
        System.out.println("suaCTCTKM");
        String[] str = null;
        CTChuongTrinhKMBLL instance = new CTChuongTrinhKMBLL();
        instance.suaCTCTKM(str);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDelCTCTKM() {
        System.out.println("delCTCTKM");
        int ma_ctkm = 0;
        String ma_mon = "";
        CTChuongTrinhKMBLL instance = new CTChuongTrinhKMBLL();
        instance.delCTCTKM(ma_ctkm, ma_mon);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetCtctkmByMaMon() {
        System.out.println("getCtctkmByMaMon");
        String ma_mon = "";
        int ma_ctkm = 0;
        CTChuongTrinhKMBLL instance = new CTChuongTrinhKMBLL();
        CTChuongTrinhKMDTO expResult = null;
        CTChuongTrinhKMDTO result = instance.getCtctkmByMaMon(ma_mon, ma_ctkm);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
