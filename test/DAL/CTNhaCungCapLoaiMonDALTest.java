/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package DAL;

import DTO.CTNhaCungCapLoaiMonDTO;
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
public class CTNhaCungCapLoaiMonDALTest {
    
    public CTNhaCungCapLoaiMonDALTest() {
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
        String ma_ncc = "";
        CTNhaCungCapLoaiMonDAL instance = new CTNhaCungCapLoaiMonDAL();
        List<CTNhaCungCapLoaiMonDTO> expResult = null;
        List<CTNhaCungCapLoaiMonDTO> result = instance.getData(ma_ncc);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testAddData() {
        System.out.println("addData");
        String[] arr = null;
        StringBuilder tb = null;
        CTNhaCungCapLoaiMonDAL instance = new CTNhaCungCapLoaiMonDAL();
        instance.addData(arr, tb);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDelData() {
        System.out.println("delData");
        String[] arr = null;
        CTNhaCungCapLoaiMonDAL instance = new CTNhaCungCapLoaiMonDAL();
        instance.delData(arr);
        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdateData() {
        System.out.println("updateData");
        String[] str = null;
        StringBuilder t = null;
        CTNhaCungCapLoaiMonDAL instance = new CTNhaCungCapLoaiMonDAL();
        instance.updateData(str, t);
        fail("The test case is a prototype.");
    }
    
}
