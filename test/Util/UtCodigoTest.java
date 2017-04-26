/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

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
public class UtCodigoTest {
    
    public UtCodigoTest() {
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
     * Test of getCodigoVerificacao method, of class UtCodigo.
     */
    @Test
    public void testGetCodigoVerificacao() {
        System.out.println("getCodigoVerificacao");
        String codigo = "";
        String nome = "";
        String expResult = "";
        String result = UtCodigo.getCodigoVerificacao(codigo, nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
