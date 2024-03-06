/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package DAL;

import DTO.TaiKhoanDTO;
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
public class TaiKhoanDALTest {
    
    public TaiKhoanDALTest() {
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
        TaiKhoanDAL instance = new TaiKhoanDAL();
        List<TaiKhoanDTO> expResult = null;
        List<TaiKhoanDTO> result = instance.getData();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMaMax() {
        System.out.println("getMaMax");
        TaiKhoanDAL instance = new TaiKhoanDAL();
        int expResult = 0;
        int result = instance.getMaMax();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testAddData() {
        System.out.println("addData");
        String[] arr = null;
        TaiKhoanDAL instance = new TaiKhoanDAL();
        instance.addData(arr);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDelData() {
        System.out.println("delData");
        int ma_tai_khoan = 0;
        TaiKhoanDAL instance = new TaiKhoanDAL();
        instance.delData(ma_tai_khoan);
        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdateData() {
        System.out.println("updateData");
        String[] arr = null;
        TaiKhoanDAL instance = new TaiKhoanDAL();
        instance.updateData(arr);
        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdateUsernameAndPass() {
        System.out.println("updateUsernameAndPass");
        String[] str = null;
        TaiKhoanDAL instance = new TaiKhoanDAL();
        instance.updateUsernameAndPass(str);
        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdateStatus() {
        System.out.println("updateStatus");
        String ma_tk = "";
        String trang_thai = "";
        TaiKhoanDAL instance = new TaiKhoanDAL();
        instance.updateStatus(ma_tk, trang_thai);
        fail("The test case is a prototype.");
    }
    
}
