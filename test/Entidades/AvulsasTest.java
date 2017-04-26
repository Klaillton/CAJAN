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
public class AvulsasTest {
    
    public AvulsasTest() {
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
     * Test of getUsuario method, of class Avulsas.
     */
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        Avulsas instance = new Avulsas();
        Usuario expResult = null;
        Usuario result = instance.getUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsuario method, of class Avulsas.
     */
    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario");
        Usuario usuario = null;
        Avulsas instance = new Avulsas();
        instance.setUsuario(usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCodigo method, of class Avulsas.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        Avulsas instance = new Avulsas();
        Integer expResult = null;
        Integer result = instance.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigo method, of class Avulsas.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        Integer codigo = null;
        Avulsas instance = new Avulsas();
        instance.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Avulsas.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Avulsas instance = new Avulsas();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Avulsas.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Avulsas instance = new Avulsas();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataCad method, of class Avulsas.
     */
    @Test
    public void testGetDataCad() {
        System.out.println("getDataCad");
        Avulsas instance = new Avulsas();
        Date expResult = null;
        Date result = instance.getDataCad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataCad method, of class Avulsas.
     */
    @Test
    public void testSetDataCad() {
        System.out.println("setDataCad");
        Date dataCad = null;
        Avulsas instance = new Avulsas();
        instance.setDataCad(dataCad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValor method, of class Avulsas.
     */
    @Test
    public void testGetValor() {
        System.out.println("getValor");
        Avulsas instance = new Avulsas();
        Double expResult = null;
        Double result = instance.getValor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValor method, of class Avulsas.
     */
    @Test
    public void testSetValor() {
        System.out.println("setValor");
        Double valor = null;
        Avulsas instance = new Avulsas();
        instance.setValor(valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Avulsas.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Avulsas instance = new Avulsas();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Avulsas.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Avulsas instance = new Avulsas();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Avulsas.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Avulsas instance = new Avulsas();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
