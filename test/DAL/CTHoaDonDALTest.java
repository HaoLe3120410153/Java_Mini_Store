/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package DAL;

import DTO.CTHoaDonDTO;
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
public class CTHoaDonDALTest {
    
    public CTHoaDonDALTest() {
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
        String ma_hd = "";
        CTHoaDonDAL instance = new CTHoaDonDAL();
        List<CTHoaDonDTO> expResult = null;
        List<CTHoaDonDTO> result = instance.getData(ma_hd);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testInsertData() {
        System.out.println("insertData");
        String[] str = null;
        CTHoaDonDAL instance = new CTHoaDonDAL();
        instance.insertData(str);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDelData() {
        System.out.println("delData");
        String[] str = null;
        CTHoaDonDAL instance = new CTHoaDonDAL();
        instance.delData(str);
        fail("The test case is a prototype.");
    }
    
}
