/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidades.Pessoas;
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
public class CadastroDAOTest {
    
    public CadastroDAOTest() {
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
     * Test of salvarJoin method, of class CadastroDAO.
     */
    @Test
    public void testSalvarJoin() {
        System.out.println("salvarJoin");
        Pessoas entidade = null;
        CadastroDAO instance = null;
        Pessoas expResult = null;
        Pessoas result = instance.salvarJoin(entidade);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of salvar method, of class CadastroDAO.
     */
    @Test
    public void testSalvar() {
        System.out.println("salvar");
        Pessoas entidade = null;
        CadastroDAO instance = null;
        Pessoas expResult = null;
        Pessoas result = instance.salvar(entidade);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteJoin method, of class CadastroDAO.
     */
    @Test
    public void testDeleteJoin() {
        System.out.println("deleteJoin");
        Pessoas entidade = null;
        CadastroDAO instance = null;
        boolean expResult = false;
        boolean result = instance.deleteJoin(entidade);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class CadastroDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Pessoas entidade = null;
        CadastroDAO instance = null;
        boolean expResult = false;
        boolean result = instance.delete(entidade);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of busca method, of class CadastroDAO.
     */
    @Test
    public void testBusca() {
        System.out.println("busca");
        Integer codigo = null;
        CadastroDAO instance = null;
        Pessoas expResult = null;
        Pessoas result = instance.busca(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscaNome method, of class CadastroDAO.
     */
    @Test
    public void testBuscaNome() {
        System.out.println("buscaNome");
        String nome = "";
        CadastroDAO instance = null;
        Pessoas expResult = null;
        Pessoas result = instance.buscaNome(nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lista method, of class CadastroDAO.
     */
    @Test
    public void testLista() {
        System.out.println("lista");
        CadastroDAO instance = null;
        List<Pessoas> expResult = null;
        List<Pessoas> result = instance.lista();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListNamed method, of class CadastroDAO.
     */
    @Test
    public void testGetListNamed() throws Exception {
        System.out.println("getListNamed");
        EntityManager session = null;
        String query = "";
        Object[] parametros = null;
        CadastroDAO instance = null;
        List<Pessoas> expResult = null;
        List<Pessoas> result = instance.getListNamed(session, query, parametros);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
