/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

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
public class EventosTest {
    
    public EventosTest() {
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
     * Test of getCodigo method, of class Eventos.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        Eventos instance = new Eventos();
        Integer expResult = null;
        Integer result = instance.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigo method, of class Eventos.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        Integer codigo = null;
        Eventos instance = new Eventos();
        instance.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Eventos.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Eventos instance = new Eventos();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Eventos.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Eventos instance = new Eventos();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataInicio method, of class Eventos.
     */
    @Test
    public void testGetDataInicio() {
        System.out.println("getDataInicio");
        Eventos instance = new Eventos();
        Date expResult = null;
        Date result = instance.getDataInicio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataInicio method, of class Eventos.
     */
    @Test
    public void testSetDataInicio() {
        System.out.println("setDataInicio");
        Date dataInicio = null;
        Eventos instance = new Eventos();
        instance.setDataInicio(dataInicio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataFim method, of class Eventos.
     */
    @Test
    public void testGetDataFim() {
        System.out.println("getDataFim");
        Eventos instance = new Eventos();
        Date expResult = null;
        Date result = instance.getDataFim();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataFim method, of class Eventos.
     */
    @Test
    public void testSetDataFim() {
        System.out.println("setDataFim");
        Date dataFim = null;
        Eventos instance = new Eventos();
        instance.setDataFim(dataFim);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExpectativa method, of class Eventos.
     */
    @Test
    public void testGetExpectativa() {
        System.out.println("getExpectativa");
        Eventos instance = new Eventos();
        Double expResult = null;
        Double result = instance.getExpectativa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setExpectativa method, of class Eventos.
     */
    @Test
    public void testSetExpectativa() {
        System.out.println("setExpectativa");
        Double expectativa = null;
        Eventos instance = new Eventos();
        instance.setExpectativa(expectativa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArrecadacao method, of class Eventos.
     */
    @Test
    public void testGetArrecadacao() {
        System.out.println("getArrecadacao");
        Eventos instance = new Eventos();
        Double expResult = null;
        Double result = instance.getArrecadacao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArrecadacao method, of class Eventos.
     */
    @Test
    public void testSetArrecadacao() {
        System.out.println("setArrecadacao");
        Double arrecadacao = null;
        Eventos instance = new Eventos();
        instance.setArrecadacao(arrecadacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCont method, of class Eventos.
     */
    @Test
    public void testGetCont() {
        System.out.println("getCont");
        Eventos instance = new Eventos();
        int expResult = 0;
        int result = instance.getCont();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCont method, of class Eventos.
     */
    @Test
    public void testSetCont() {
        System.out.println("setCont");
        int cont = 0;
        Eventos instance = new Eventos();
        instance.setCont(cont);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Eventos.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Eventos instance = new Eventos();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Eventos.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Eventos instance = new Eventos();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Eventos.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Eventos instance = new Eventos();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
