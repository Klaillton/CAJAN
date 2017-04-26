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
public class PagamentoTest {
    
    public PagamentoTest() {
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
     * Test of getCodigo method, of class Pagamento.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        Pagamento instance = new Pagamento();
        Integer expResult = null;
        Integer result = instance.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigo method, of class Pagamento.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        Integer codigo = null;
        Pagamento instance = new Pagamento();
        instance.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataPag method, of class Pagamento.
     */
    @Test
    public void testGetDataPag() {
        System.out.println("getDataPag");
        Pagamento instance = new Pagamento();
        Date expResult = null;
        Date result = instance.getDataPag();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataPag method, of class Pagamento.
     */
    @Test
    public void testSetDataPag() {
        System.out.println("setDataPag");
        Date dataPag = null;
        Pagamento instance = new Pagamento();
        instance.setDataPag(dataPag);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdentificador method, of class Pagamento.
     */
    @Test
    public void testGetIdentificador() {
        System.out.println("getIdentificador");
        Pagamento instance = new Pagamento();
        String expResult = "";
        String result = instance.getIdentificador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdentificador method, of class Pagamento.
     */
    @Test
    public void testSetIdentificador() {
        System.out.println("setIdentificador");
        String identificador = "";
        Pagamento instance = new Pagamento();
        instance.setIdentificador(identificador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValor method, of class Pagamento.
     */
    @Test
    public void testGetValor() {
        System.out.println("getValor");
        Pagamento instance = new Pagamento();
        Double expResult = null;
        Double result = instance.getValor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValor method, of class Pagamento.
     */
    @Test
    public void testSetValor() {
        System.out.println("setValor");
        Double valor = null;
        Pagamento instance = new Pagamento();
        instance.setValor(valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCont method, of class Pagamento.
     */
    @Test
    public void testGetCont() {
        System.out.println("getCont");
        Pagamento instance = new Pagamento();
        Integer expResult = null;
        Integer result = instance.getCont();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCont method, of class Pagamento.
     */
    @Test
    public void testSetCont() {
        System.out.println("setCont");
        Integer cont = null;
        Pagamento instance = new Pagamento();
        instance.setCont(cont);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPessoas method, of class Pagamento.
     */
    @Test
    public void testGetPessoas() {
        System.out.println("getPessoas");
        Pagamento instance = new Pagamento();
        Pessoas expResult = null;
        Pessoas result = instance.getPessoas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPessoas method, of class Pagamento.
     */
    @Test
    public void testSetPessoas() {
        System.out.println("setPessoas");
        Pessoas pessoas = null;
        Pagamento instance = new Pagamento();
        instance.setPessoas(pessoas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Pagamento.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Pagamento instance = new Pagamento();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Pagamento.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Pagamento instance = new Pagamento();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Pagamento.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Pagamento instance = new Pagamento();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
