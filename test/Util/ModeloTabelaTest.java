/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.util.ArrayList;
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
public class ModeloTabelaTest {
    
    public ModeloTabelaTest() {
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
     * Test of getLinhas method, of class ModeloTabela.
     */
    @Test
    public void testGetLinhas() {
        System.out.println("getLinhas");
        ModeloTabela instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.getLinhas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLinhas method, of class ModeloTabela.
     */
    @Test
    public void testSetLinhas() {
        System.out.println("setLinhas");
        ArrayList dados = null;
        ModeloTabela instance = null;
        instance.setLinhas(dados);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColunas method, of class ModeloTabela.
     */
    @Test
    public void testGetColunas() {
        System.out.println("getColunas");
        ModeloTabela instance = null;
        String[] expResult = null;
        String[] result = instance.getColunas();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setColunas method, of class ModeloTabela.
     */
    @Test
    public void testSetColunas() {
        System.out.println("setColunas");
        String[] nomes = null;
        ModeloTabela instance = null;
        instance.setColunas(nomes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColumnCount method, of class ModeloTabela.
     */
    @Test
    public void testGetColumnCount() {
        System.out.println("getColumnCount");
        ModeloTabela instance = null;
        int expResult = 0;
        int result = instance.getColumnCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRowCount method, of class ModeloTabela.
     */
    @Test
    public void testGetRowCount() {
        System.out.println("getRowCount");
        ModeloTabela instance = null;
        int expResult = 0;
        int result = instance.getRowCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColumnName method, of class ModeloTabela.
     */
    @Test
    public void testGetColumnName() {
        System.out.println("getColumnName");
        int numCol = 0;
        ModeloTabela instance = null;
        String expResult = "";
        String result = instance.getColumnName(numCol);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValueAt method, of class ModeloTabela.
     */
    @Test
    public void testGetValueAt() {
        System.out.println("getValueAt");
        int numLin = 0;
        int numCol = 0;
        ModeloTabela instance = null;
        Object expResult = null;
        Object result = instance.getValueAt(numLin, numCol);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
