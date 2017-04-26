/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidades.Pagamento;
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
public class PagamentoDAOTest {
    
    public PagamentoDAOTest() {
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
     * Test of salvarJoin method, of class PagamentoDAO.
     */
    @Test
    public void testSalvarJoin() {
        System.out.println("salvarJoin");
        Pagamento entidade = null;
        PagamentoDAO instance = null;
        Pagamento expResult = null;
        Pagamento result = instance.salvarJoin(entidade);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of salvar method, of class PagamentoDAO.
     */
    @Test
    public void testSalvar() {
        System.out.println("salvar");
        Pagamento entidade = null;
        PagamentoDAO instance = null;
        Pagamento expResult = null;
        Pagamento result = instance.salvar(entidade);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of busca method, of class PagamentoDAO.
     */
    @Test
    public void testBusca() {
        System.out.println("busca");
        Integer codigo = null;
        PagamentoDAO instance = null;
        Pagamento expResult = null;
        Pagamento result = instance.busca(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lista method, of class PagamentoDAO.
     */
    @Test
    public void testLista() {
        System.out.println("lista");
        PagamentoDAO instance = null;
        List<Pagamento> expResult = null;
        List<Pagamento> result = instance.lista();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
