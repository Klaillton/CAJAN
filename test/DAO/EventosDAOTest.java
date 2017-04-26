/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidades.Eventos;
import java.util.List;
import javax.persistence.EntityManager;
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
public class EventosDAOTest {
    
    public EventosDAOTest() {
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
     * Test of salvarJoin method, of class EventosDAO.
     */
    @Test
    public void testSalvarJoin() {
        System.out.println("salvarJoin");
        Eventos entidade = null;
        EventosDAO instance = null;
        Eventos expResult = null;
        Eventos result = instance.salvarJoin(entidade);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of salvar method, of class EventosDAO.
     */
    @Test
    public void testSalvar() {
        System.out.println("salvar");
        Eventos entidade = null;
        EventosDAO instance = null;
        Eventos expResult = null;
        Eventos result = instance.salvar(entidade);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteJoin method, of class EventosDAO.
     */
    @Test
    public void testDeleteJoin() {
        System.out.println("deleteJoin");
        Eventos entidade = null;
        EventosDAO instance = null;
        boolean expResult = false;
        boolean result = instance.deleteJoin(entidade);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class EventosDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Eventos entidade = null;
        EventosDAO instance = null;
        boolean expResult = false;
        boolean result = instance.delete(entidade);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of busca method, of class EventosDAO.
     */
    @Test
    public void testBusca() {
        System.out.println("busca");
        Integer codigo = null;
        EventosDAO instance = null;
        Eventos expResult = null;
        Eventos result = instance.busca(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscaNome method, of class EventosDAO.
     */
    @Test
    public void testBuscaNome() {
        System.out.println("buscaNome");
        String nome = "";
        EventosDAO instance = null;
        Eventos expResult = null;
        Eventos result = instance.buscaNome(nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lista method, of class EventosDAO.
     */
    @Test
    public void testLista() {
        System.out.println("lista");
        EventosDAO instance = null;
        List<Eventos> expResult = null;
        List<Eventos> result = instance.lista();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListNamed method, of class EventosDAO.
     */
    @Test
    public void testGetListNamed() throws Exception {
        System.out.println("getListNamed");
        EntityManager session = null;
        String query = "";
        Object[] parametros = null;
        EventosDAO instance = null;
        List<Eventos> expResult = null;
        List<Eventos> result = instance.getListNamed(session, query, parametros);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
