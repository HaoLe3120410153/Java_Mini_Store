/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package DAL;

import DTO.CTChuongTrinhKMDTO;
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
public class CTChuongTrinhKMDALTest {
    
    public CTChuongTrinhKMDALTest() {
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
    public void testGetDataByID() {
        System.out.println("getDataByID");
        int ma_ctkm = 0;
        CTChuongTrinhKMDAL instance = new CTChuongTrinhKMDAL();
        List<CTChuongTrinhKMDTO> expResult = null;
        List<CTChuongTrinhKMDTO> result = instance.getDataByID(ma_ctkm);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testAddData() {
        System.out.println("addData");
        String[] arr = null;
        CTChuongTrinhKMDAL instance = new CTChuongTrinhKMDAL();
        instance.addData(arr);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDelData() {
        System.out.println("delData");
        int ma_ctkm = 0;
        String ma_mon = "";
        CTChuongTrinhKMDAL instance = new CTChuongTrinhKMDAL();
        instance.delData(ma_ctkm, ma_mon);
        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdateData() {
        System.out.println("updateData");
        String[] arr = null;
        CTChuongTrinhKMDAL instance = new CTChuongTrinhKMDAL();
        instance.updateData(arr);
        fail("The test case is a prototype.");
    }
    
}
