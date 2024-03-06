/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package BLL;

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
public class CTNhaCungCapLoaiMonBLLTest {
    
    public CTNhaCungCapLoaiMonBLLTest() {
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
    public void testResetListCTNccLM() {
        System.out.println("resetListCTNccLM");
        CTNhaCungCapLoaiMonBLL instance = new CTNhaCungCapLoaiMonBLL();
        instance.resetListCTNccLM();
        fail("The test case is a prototype.");
    }

    @Test
    public void testLoadListCTNccLM() {
        System.out.println("loadListCTNccLM");
        String ma_ncc = "";
        CTNhaCungCapLoaiMonBLL instance = new CTNhaCungCapLoaiMonBLL();
        instance.loadListCTNccLM(ma_ncc);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTenLoaiToComboboxByMaNcc() {
        System.out.println("setTenLoaiToComboboxByMaNcc");
        DefaultComboBoxModel model = null;
        String ma_ncc = "";
        CTNhaCungCapLoaiMonBLL instance = new CTNhaCungCapLoaiMonBLL();
        instance.setTenLoaiToComboboxByMaNcc(model, ma_ncc);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTableCTNCCLM() {
        System.out.println("setTableCTNCCLM");
        DefaultTableModel model = null;
        String ma_ncc = "";
        CTNhaCungCapLoaiMonBLL instance = new CTNhaCungCapLoaiMonBLL();
        instance.setTableCTNCCLM(model, ma_ncc);
        fail("The test case is a prototype.");
    }

    @Test
    public void testAddLM() {
        System.out.println("addLM");
        String[] str = null;
        StringBuilder tb = null;
        CTNhaCungCapLoaiMonBLL instance = new CTNhaCungCapLoaiMonBLL();
        instance.addLM(str, tb);
        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdateLM() {
        System.out.println("updateLM");
        String[] str = null;
        StringBuilder tb = null;
        CTNhaCungCapLoaiMonBLL instance = new CTNhaCungCapLoaiMonBLL();
        instance.updateLM(str, tb);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDelLM() {
        System.out.println("delLM");
        String[] str = null;
        CTNhaCungCapLoaiMonBLL instance = new CTNhaCungCapLoaiMonBLL();
        instance.delLM(str);
        fail("The test case is a prototype.");
    }
    
}
