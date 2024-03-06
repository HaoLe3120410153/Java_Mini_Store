/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package DAL;

import DTO.CTDonDatHangDTO;
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
public class CTDonDatHangDALTest {
    
    public CTDonDatHangDALTest() {
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
        String ma_don_dat = "";
        CTDonDatHangDAL instance = new CTDonDatHangDAL();
        List<CTDonDatHangDTO> expResult = null;
        List<CTDonDatHangDTO> result = instance.getData(ma_don_dat);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testAddData() {
        System.out.println("addData");
        String[] str = null;
        CTDonDatHangDAL instance = new CTDonDatHangDAL();
        instance.addData(str);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDelData() {
        System.out.println("delData");
        String[] str = null;
        CTDonDatHangDAL instance = new CTDonDatHangDAL();
        instance.delData(str);
        fail("The test case is a prototype.");
    }
    
}
