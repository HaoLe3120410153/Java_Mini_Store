/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package BLL;

import javax.swing.DefaultComboBoxModel;
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
public class PhanQuyenBLLTest {
    
    public PhanQuyenBLLTest() {
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
    public void testResetListPQ() {
        System.out.println("resetListPQ");
        PhanQuyenBLL instance = new PhanQuyenBLL();
        instance.resetListPQ();
        fail("The test case is a prototype.");
    }

    @Test
    public void testLoadListPQ() {
        System.out.println("loadListPQ");
        PhanQuyenBLL instance = new PhanQuyenBLL();
        instance.loadListPQ();
        fail("The test case is a prototype.");
    }

    @Test
    public void testThemPQ() {
        System.out.println("ThemPQ");
        String[] arr = null;
        PhanQuyenBLL instance = new PhanQuyenBLL();
        instance.ThemPQ(arr);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSuaPQ() {
        System.out.println("suaPQ");
        String[] arr = null;
        PhanQuyenBLL instance = new PhanQuyenBLL();
        instance.suaPQ(arr);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDelPQ() {
        System.out.println("delPQ");
        int maPQ = 0;
        PhanQuyenBLL instance = new PhanQuyenBLL();
        instance.delPQ(maPQ);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetQuyenByMaQuyen() {
        System.out.println("getQuyenByMaQuyen");
        int ma_quyen = 0;
        PhanQuyenBLL instance = new PhanQuyenBLL();
        String expResult = "";
        String result = instance.getQuyenByMaQuyen(ma_quyen);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMaQuyenByQuyen() {
        System.out.println("getMaQuyenByQuyen");
        String quyen = "";
        PhanQuyenBLL instance = new PhanQuyenBLL();
        int expResult = 0;
        int result = instance.getMaQuyenByQuyen(quyen);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetLoaiTkToComboBox() {
        System.out.println("setLoaiTkToComboBox");
        DefaultComboBoxModel model = null;
        PhanQuyenBLL instance = new PhanQuyenBLL();
        instance.setLoaiTkToComboBox(model);
        fail("The test case is a prototype.");
    }
    
}
