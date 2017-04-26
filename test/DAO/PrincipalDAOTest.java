/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidades.Pessoas;
import java.util.Calendar;
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
public class PrincipalDAOTest {
    
    public PrincipalDAOTest() {
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
     * Test of busca method, of class PrincipalDAO.
     */
    @Test
    public void testBusca() {
        System.out.println("busca");
        EntityManager session = null;
        Calendar c = null;
        PrincipalDAO instance = new PrincipalDAO();
        List<Pessoas> expResult = null;
        List<Pessoas> result = instance.busca(session, c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
