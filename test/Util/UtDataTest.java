/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.util.Date;
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
public class UtDataTest {
    
    public UtDataTest() {
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
     * Test of getDate method, of class UtData.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Date data = null;
        String expResult = "";
        String result = UtData.getDate(data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataVencto method, of class UtData.
     */
    @Test
    public void testGetDataVencto() {
        System.out.println("getDataVencto");
        Date data = null;
        boolean ultDiaMes = false;
        int dia = 0;
        Date expResult = null;
        Date result = UtData.getDataVencto(data, ultDiaMes, dia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDiffEmDias method, of class UtData.
     */
    @Test
    public void testGetDiffEmDias() {
        System.out.println("getDiffEmDias");
        Date dtInicial = null;
        Date dtFinal = null;
        int expResult = 0;
        int result = UtData.getDiffEmDias(dtInicial, dtFinal);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDiffEmMes method, of class UtData.
     */
    @Test
    public void testGetDiffEmMes() {
        System.out.println("getDiffEmMes");
        Date dtInicial = null;
        Date dtFinal = null;
        int expResult = 0;
        int result = UtData.getDiffEmMes(dtInicial, dtFinal);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateAdd method, of class UtData.
     */
    @Test
    public void testGetDateAdd() {
        System.out.println("getDateAdd");
        Date data = null;
        int dia = 0;
        Date expResult = null;
        Date result = UtData.getDateAdd(data, dia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
