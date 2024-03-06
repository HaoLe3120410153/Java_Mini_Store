/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package DAL;

import DTO.ChuongTrinhKMDTO;
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
public class ChuongTrinhKMDALTest {
    
    public ChuongTrinhKMDALTest() {
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
        ChuongTrinhKMDAL instance = new ChuongTrinhKMDAL();
        List<ChuongTrinhKMDTO> expResult = null;
        List<ChuongTrinhKMDTO> result = instance.getData();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMaMax() {
        System.out.println("getMaMax");
        ChuongTrinhKMDAL instance = new ChuongTrinhKMDAL();
        int expResult = 0;
        int result = instance.getMaMax();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testAddData() {
        System.out.println("addData");
        String[] arr = null;
        ChuongTrinhKMDAL instance = new ChuongTrinhKMDAL();
        instance.addData(arr);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDelData() {
        System.out.println("delData");
        int ma_ctkm = 0;
        ChuongTrinhKMDAL instance = new ChuongTrinhKMDAL();
        instance.delData(ma_ctkm);
        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdateData() {
        System.out.println("updateData");
        String[] arr = null;
        ChuongTrinhKMDAL instance = new ChuongTrinhKMDAL();
        instance.updateData(arr);
        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdateStatus() {
        System.out.println("updateStatus");
        int ma_ctkm = 0;
        String tt = "";
        ChuongTrinhKMDAL instance = new ChuongTrinhKMDAL();
        instance.updateStatus(ma_ctkm, tt);
        fail("The test case is a prototype.");
    }
    
}
