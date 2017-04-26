/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.sql.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Klaillton
 */
public class UtilTest {
    
    public UtilTest() {
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

    /**
     * Test of getDateSQL method, of class Util.
     */
    @Test
    public void testGetDateSQL() {
        System.out.println("getDateSQL");
        String dateStr = "";
        Date expResult = null;
        Date result = Util.getDateSQL(dateStr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDate method, of class Util.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        java.util.Date date = null;
        String expResult = "";
        String result = Util.getDate(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateUtil method, of class Util.
     */
    @Test
    public void testGetDateUtil() {
        System.out.println("getDateUtil");
        String dataStr = "";
        java.util.Date expResult = null;
        java.util.Date result = Util.getDateUtil(dataStr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateUtilUS method, of class Util.
     */
    @Test
    public void testGetDateUtilUS() {
        System.out.println("getDateUtilUS");
        String dataStr = "";
        java.util.Date expResult = null;
        java.util.Date result = Util.getDateUtilUS(dataStr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
