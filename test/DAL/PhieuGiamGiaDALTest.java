/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package DAL;

import DTO.PhieuGiamGiaDTO;
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
public class PhieuGiamGiaDALTest {
    
    public PhieuGiamGiaDALTest() {
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
        PhieuGiamGiaDAL instance = new PhieuGiamGiaDAL();
        List<PhieuGiamGiaDTO> expResult = null;
        List<PhieuGiamGiaDTO> result = instance.getData();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testAddData() {
        System.out.println("addData");
        String[] arr = null;
        PhieuGiamGiaDAL instance = new PhieuGiamGiaDAL();
        instance.addData(arr);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDelData() {
        System.out.println("delData");
        String ma_phieu_giam_gia = "";
        PhieuGiamGiaDAL instance = new PhieuGiamGiaDAL();
        instance.delData(ma_phieu_giam_gia);
        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdateData() {
        System.out.println("updateData");
        String[] arr = null;
        PhieuGiamGiaDAL instance = new PhieuGiamGiaDAL();
        instance.updateData(arr);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMaMax() {
        System.out.println("getMaMax");
        PhieuGiamGiaDAL instance = new PhieuGiamGiaDAL();
        String expResult = "";
        String result = instance.getMaMax();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdateTrangThaiPhieu() {
        System.out.println("updateTrangThaiPhieu");
        String ma_pgg = "";
        PhieuGiamGiaDAL instance = new PhieuGiamGiaDAL();
        instance.updateTrangThaiPhieu(ma_pgg);
        fail("The test case is a prototype.");
    }
    
}
