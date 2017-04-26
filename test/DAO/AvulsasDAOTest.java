/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidades.Avulsas;
import java.util.List;
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
public class AvulsasDAOTest {
    
    public AvulsasDAOTest() {
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
     * Test of salvarJoin method, of class AvulsasDAO.
     */
    @Test
    public void testSalvarJoin() {
        System.out.println("salvarJoin");
        Avulsas entidade = null;
        AvulsasDAO instance = null;
        Avulsas expResult = null;
        Avulsas result = instance.salvarJoin(entidade);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of salvar method, of class AvulsasDAO.
     */
    @Test
    public void testSalvar() {
        System.out.println("salvar");
        Avulsas entidade = null;
        AvulsasDAO instance = null;
        Avulsas expResult = null;
        Avulsas result = instance.salvar(entidade);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of busca method, of class AvulsasDAO.
     */
    @Test
    public void testBusca() {
        System.out.println("busca");
        Integer codigo = null;
        AvulsasDAO instance = null;
        Avulsas expResult = null;
        Avulsas result = instance.busca(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lista method, of class AvulsasDAO.
     */
    @Test
    public void testLista() {
        System.out.println("lista");
        AvulsasDAO instance = null;
        List<Avulsas> expResult = null;
        List<Avulsas> result = instance.lista();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
