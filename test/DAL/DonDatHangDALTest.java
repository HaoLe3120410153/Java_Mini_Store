/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package DAL;

import DTO.DonDatHangDTO;
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
public class DonDatHangDALTest {
    
    public DonDatHangDALTest() {
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
        DonDatHangDAL instance = new DonDatHangDAL();
        List<DonDatHangDTO> expResult = null;
        List<DonDatHangDTO> result = instance.getData();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testAddData() {
        System.out.println("addData");
        String[] str = null;
        DonDatHangDAL instance = new DonDatHangDAL();
        instance.addData(str);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDelData() {
        System.out.println("delData");
        String ma_don_dat = "";
        DonDatHangDAL instance = new DonDatHangDAL();
        instance.delData(ma_don_dat);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMaMax() {
        System.out.println("getMaMax");
        DonDatHangDAL instance = new DonDatHangDAL();
        String expResult = "";
        String result = instance.getMaMax();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
