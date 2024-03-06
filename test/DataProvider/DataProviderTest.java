/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package DataProvider;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
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
public class DataProviderTest {
    
    public DataProviderTest() {
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
    public void testGetConnect() {
        System.out.println("getConnect");
        DataProvider instance = new DataProvider();
        Connection expResult = null;
        Connection result = instance.getConnect();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetStatement() throws Exception {
        System.out.println("getStatement");
        DataProvider instance = new DataProvider();
        Statement expResult = null;
        Statement result = instance.getStatement();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testExcuteQuery() throws Exception {
        System.out.println("excuteQuery");
        String qry = "";
        DataProvider instance = new DataProvider();
        ResultSet expResult = null;
        ResultSet result = instance.excuteQuery(qry);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testExecuteUpdate() throws Exception {
        System.out.println("ExecuteUpdate");
        String qry = "";
        DataProvider instance = new DataProvider();
        int expResult = 0;
        int result = instance.ExecuteUpdate(qry);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCloseConnect() throws Exception {
        System.out.println("closeConnect");
        DataProvider instance = new DataProvider();
        instance.closeConnect();
        fail("The test case is a prototype.");
    }
    
}
