/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package DAL;

import DTO.NhanVienDTO;
import java.util.List;
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
public class NhanVienDALTest {
    
    public NhanVienDALTest() {
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
    public void testGetData() {
        System.out.println("getData");
        NhanVienDAL instance = new NhanVienDAL();
        List<NhanVienDTO> expResult = null;
        List<NhanVienDTO> result = instance.getData();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testAddData() {
        System.out.println("addData");
        String[] arr = null;
        NhanVienDAL instance = new NhanVienDAL();
        instance.addData(arr);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDelData() {
        System.out.println("delData");
        String ma_nhan_vien = "";
        NhanVienDAL instance = new NhanVienDAL();
        instance.delData(ma_nhan_vien);
        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdateData() {
        System.out.println("updateData");
        String[] arr = null;
        NhanVienDAL instance = new NhanVienDAL();
        instance.updateData(arr);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMaMax() {
        System.out.println("getMaMax");
        NhanVienDAL instance = new NhanVienDAL();
        String expResult = "";
        String result = instance.getMaMax();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
