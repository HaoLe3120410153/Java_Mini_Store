/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package DAL;

import DTO.ThanhVienDTO;
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
public class ThanhVienDALTest {
    
    public ThanhVienDALTest() {
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
        ThanhVienDAL instance = new ThanhVienDAL();
        List<ThanhVienDTO> expResult = null;
        List<ThanhVienDTO> result = instance.getData();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testAddData() {
        System.out.println("addData");
        String[] arr = null;
        ThanhVienDAL instance = new ThanhVienDAL();
        instance.addData(arr);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDelData() {
        System.out.println("delData");
        String ma_thanh_vien = "";
        ThanhVienDAL instance = new ThanhVienDAL();
        instance.delData(ma_thanh_vien);
        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdateData() {
        System.out.println("updateData");
        String[] arr = null;
        ThanhVienDAL instance = new ThanhVienDAL();
        instance.updateData(arr);
        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdatePoint() {
        System.out.println("updatePoint");
        String[] str = null;
        ThanhVienDAL instance = new ThanhVienDAL();
        instance.updatePoint(str);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMaMax() {
        System.out.println("getMaMax");
        ThanhVienDAL instance = new ThanhVienDAL();
        String expResult = "";
        String result = instance.getMaMax();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
