/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package DAL;

import DataProvider.DataProvider;
import DTO.MonAnDTO;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class MonAnDALTest {
    
    DataProvider dataProvider = new DataProvider();
    public MonAnDALTest() {
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
    public void testGetData() throws Exception {
        System.out.println("getData");
        List<MonAnDTO> expResult = new ArrayList<MonAnDTO>();
        String query = "SELECT * FROM `mon_an` ORDER BY ma_mon ASC";
        ResultSet rs =  dataProvider.excuteQuery(query);
            while(rs.next()){
                expResult.add(new MonAnDTO(
                    rs.getString("ma_mon"),
                    rs.getString("ten_mon"),
                    rs.getInt("so_luong"),
                    rs.getInt("gia"),       
                    rs.getInt("gia_giam"),
                    rs.getString("ma_loai")                      
                ));
            }
            dataProvider.closeConnect();
            
        MonAnDAL instance = new MonAnDAL();
        
        List<MonAnDTO> result = instance.getData();
        assertEquals(expResult.size(), result.size());
       
    }

   

    @Test
    public void testAddData() {
        System.out.println("addData");
        String[] arr = {"MA12","Mi Y","1","10000","LM03"};
        MonAnDAL instance = new MonAnDAL();
        instance.addData(arr);
        List<MonAnDTO> result = instance.getData();
        
        assertEquals(result.get(result.size()-1).getMa_mon(),arr[0]);
        
       
    }

    @Test
    public void testDelData() {
        System.out.println("delData");
        String ma_mon = "MA12";
        MonAnDAL instance = new MonAnDAL();
        instance.delData(ma_mon);
        List<MonAnDTO> result = instance.getData();
        assertEquals(11, result.size());
      
    }

    @Test
    public void testUpdateData() {
        System.out.println("updateData");
        String[] arr = {"MA12","CoCa","2","10000","LM03"};
        MonAnDAL instance = new MonAnDAL();
        instance.updateData(arr);
        List<MonAnDTO> result = instance.getData();
        assertEquals(result.get(result.size()-1).getMa_mon(),arr[0]);
       
    }

    @Test
    public void testUpdatePriceFromData() {
        System.out.println("updatePriceFromData");
        String ma_mon = "MA12";
        int gia_giam = 5000;
        MonAnDAL instance = new MonAnDAL();
        instance.updatePriceFromData(ma_mon, gia_giam);
       
    }

    @Test
    public void testUpdateCountFromData() {
        
        System.out.println("updateCountFromData");
        String ma_mon = "MA12";
        int so_luong = 10;
        MonAnDAL instance = new MonAnDAL();
        instance.updateCountFromData(ma_mon, so_luong);
      
    }
    
}
