/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package BLL;

import DTO.LoaiMonDTO;
import javax.swing.DefaultComboBoxModel;
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
public class LoaiMonAnBLLTest {
    
    public LoaiMonAnBLLTest() {
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
    public void testResetListLM() {
        System.out.println("resetListLM");
        LoaiMonAnBLL instance = new LoaiMonAnBLL();
        instance.resetListLM();
        fail("The test case is a prototype.");
    }

    @Test
    public void testLoadListLM() {
        System.out.println("loadListLM");
        LoaiMonAnBLL instance = new LoaiMonAnBLL();
        instance.loadListLM();
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetListLM() {
        System.out.println("setListLM");
        DefaultTableModel model = null;
        LoaiMonAnBLL instance = new LoaiMonAnBLL();
        instance.setListLM(model);
        fail("The test case is a prototype.");
    }

    @Test
    public void testThemLM() {
        System.out.println("ThemLM");
        String[] str = null;
        LoaiMonAnBLL instance = new LoaiMonAnBLL();
        instance.ThemLM(str);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSuaLM() {
        System.out.println("suaLM");
        String[] str = null;
        LoaiMonAnBLL instance = new LoaiMonAnBLL();
        instance.suaLM(str);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDelLM() {
        System.out.println("delLM");
        String maNV = "";
        LoaiMonAnBLL instance = new LoaiMonAnBLL();
        instance.delLM(maNV);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetLoaiByMaLoai() {
        System.out.println("getLoaiByMaLoai");
        String ma_loai = "";
        LoaiMonAnBLL instance = new LoaiMonAnBLL();
        LoaiMonDTO expResult = null;
        LoaiMonDTO result = instance.getLoaiByMaLoai(ma_loai);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testMaMoi() {
        System.out.println("maMoi");
        LoaiMonAnBLL instance = new LoaiMonAnBLL();
        String expResult = "";
        String result = instance.maMoi();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTenLoaiByMaLoai() {
        System.out.println("getTenLoaiByMaLoai");
        String ma_loai = "";
        LoaiMonAnBLL instance = new LoaiMonAnBLL();
        String expResult = "";
        String result = instance.getTenLoaiByMaLoai(ma_loai);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMaLoaiByTenLoai() {
        System.out.println("getMaLoaiByTenLoai");
        String ten_loai = "";
        LoaiMonAnBLL instance = new LoaiMonAnBLL();
        String expResult = "";
        String result = instance.getMaLoaiByTenLoai(ten_loai);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTenLoaiByMaLoai() {
        System.out.println("setTenLoaiByMaLoai");
        DefaultComboBoxModel cbx = null;
        String ma_loai = "";
        LoaiMonAnBLL instance = new LoaiMonAnBLL();
        instance.setTenLoaiByMaLoai(cbx, ma_loai);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTenLoaiToComboBox() {
        System.out.println("setTenLoaiToComboBox");
        DefaultComboBoxModel cbx = null;
        LoaiMonAnBLL instance = new LoaiMonAnBLL();
        instance.setTenLoaiToComboBox(cbx);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimLMTheoMa() {
        System.out.println("timLMTheoMa");
        DefaultTableModel model = null;
        String ma_loai = "";
        LoaiMonAnBLL instance = new LoaiMonAnBLL();
        instance.timLMTheoMa(model, ma_loai);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimLMTheoTen() {
        System.out.println("timLMTheoTen");
        DefaultTableModel model = null;
        String ten_loai = "";
        LoaiMonAnBLL instance = new LoaiMonAnBLL();
        instance.timLMTheoTen(model, ten_loai);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTongLM() {
        System.out.println("getTongLM");
        LoaiMonAnBLL instance = new LoaiMonAnBLL();
        int expResult = 0;
        int result = instance.getTongLM();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
