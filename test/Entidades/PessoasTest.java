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
public class PessoasTest {
    
    public PessoasTest() {
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
     * Test of getAtivo method, of class Pessoas.
     */
    @Test
    public void testGetAtivo() {
        System.out.println("getAtivo");
        Pessoas instance = new Pessoas();
        Boolean expResult = null;
        Boolean result = instance.getAtivo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAtivo method, of class Pessoas.
     */
    @Test
    public void testSetAtivo() {
        System.out.println("setAtivo");
        Boolean ativo = null;
        Pessoas instance = new Pessoas();
        instance.setAtivo(ativo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCodigo method, of class Pessoas.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        Pessoas instance = new Pessoas();
        Integer expResult = null;
        Integer result = instance.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigo method, of class Pessoas.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        Integer codigo = null;
        Pessoas instance = new Pessoas();
        instance.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCnpj method, of class Pessoas.
     */
    @Test
    public void testGetCnpj() {
        System.out.println("getCnpj");
        Pessoas instance = new Pessoas();
        int expResult = 0;
        int result = instance.getCnpj();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCnpj method, of class Pessoas.
     */
    @Test
    public void testSetCnpj() {
        System.out.println("setCnpj");
        int cnpj = 0;
        Pessoas instance = new Pessoas();
        instance.setCnpj(cnpj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Pessoas.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Pessoas instance = new Pessoas();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Pessoas.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Pessoas instance = new Pessoas();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTelefone method, of class Pessoas.
     */
    @Test
    public void testGetTelefone() {
        System.out.println("getTelefone");
        Pessoas instance = new Pessoas();
        String expResult = "";
        String result = instance.getTelefone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTelefone method, of class Pessoas.
     */
    @Test
    public void testSetTelefone() {
        System.out.println("setTelefone");
        String telefone = "";
        Pessoas instance = new Pessoas();
        instance.setTelefone(telefone);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataCad method, of class Pessoas.
     */
    @Test
    public void testGetDataCad() {
        System.out.println("getDataCad");
        Pessoas instance = new Pessoas();
        Date expResult = null;
        Date result = instance.getDataCad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataCad method, of class Pessoas.
     */
    @Test
    public void testSetDataCad() {
        System.out.println("setDataCad");
        Date dataCad = null;
        Pessoas instance = new Pessoas();
        instance.setDataCad(dataCad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNascimento method, of class Pessoas.
     */
    @Test
    public void testGetNascimento() {
        System.out.println("getNascimento");
        Pessoas instance = new Pessoas();
        Date expResult = null;
        Date result = instance.getNascimento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNascimento method, of class Pessoas.
     */
    @Test
    public void testSetNascimento() {
        System.out.println("setNascimento");
        Date nascimento = null;
        Pessoas instance = new Pessoas();
        instance.setNascimento(nascimento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProfissao method, of class Pessoas.
     */
    @Test
    public void testGetProfissao() {
        System.out.println("getProfissao");
        Pessoas instance = new Pessoas();
        String expResult = "";
        String result = instance.getProfissao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProfissao method, of class Pessoas.
     */
    @Test
    public void testSetProfissao() {
        System.out.println("setProfissao");
        String profissao = "";
        Pessoas instance = new Pessoas();
        instance.setProfissao(profissao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Pessoas.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Pessoas instance = new Pessoas();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Pessoas.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Pessoas instance = new Pessoas();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMensal method, of class Pessoas.
     */
    @Test
    public void testGetMensal() {
        System.out.println("getMensal");
        Pessoas instance = new Pessoas();
        Boolean expResult = null;
        Boolean result = instance.getMensal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMensal method, of class Pessoas.
     */
    @Test
    public void testSetMensal() {
        System.out.println("setMensal");
        Boolean mensal = null;
        Pessoas instance = new Pessoas();
        instance.setMensal(mensal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValor method, of class Pessoas.
     */
    @Test
    public void testGetValor() {
        System.out.println("getValor");
        Pessoas instance = new Pessoas();
        Double expResult = null;
        Double result = instance.getValor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValor method, of class Pessoas.
     */
    @Test
    public void testSetValor() {
        System.out.println("setValor");
        Double valor = null;
        Pessoas instance = new Pessoas();
        instance.setValor(valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCont method, of class Pessoas.
     */
    @Test
    public void testGetCont() {
        System.out.println("getCont");
        Pessoas instance = new Pessoas();
        Integer expResult = null;
        Integer result = instance.getCont();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCont method, of class Pessoas.
     */
    @Test
    public void testSetCont() {
        System.out.println("setCont");
        Integer cont = null;
        Pessoas instance = new Pessoas();
        instance.setCont(cont);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCep method, of class Pessoas.
     */
    @Test
    public void testGetCep() {
        System.out.println("getCep");
        Pessoas instance = new Pessoas();
        String expResult = "";
        String result = instance.getCep();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCep method, of class Pessoas.
     */
    @Test
    public void testSetCep() {
        System.out.println("setCep");
        String cep = "";
        Pessoas instance = new Pessoas();
        instance.setCep(cep);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLogradouro method, of class Pessoas.
     */
    @Test
    public void testGetLogradouro() {
        System.out.println("getLogradouro");
        Pessoas instance = new Pessoas();
        String expResult = "";
        String result = instance.getLogradouro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLogradouro method, of class Pessoas.
     */
    @Test
    public void testSetLogradouro() {
        System.out.println("setLogradouro");
        String logradouro = "";
        Pessoas instance = new Pessoas();
        instance.setLogradouro(logradouro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumero method, of class Pessoas.
     */
    @Test
    public void testGetNumero() {
        System.out.println("getNumero");
        Pessoas instance = new Pessoas();
        String expResult = "";
        String result = instance.getNumero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumero method, of class Pessoas.
     */
    @Test
    public void testSetNumero() {
        System.out.println("setNumero");
        String numero = "";
        Pessoas instance = new Pessoas();
        instance.setNumero(numero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBairro method, of class Pessoas.
     */
    @Test
    public void testGetBairro() {
        System.out.println("getBairro");
        Pessoas instance = new Pessoas();
        String expResult = "";
        String result = instance.getBairro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBairro method, of class Pessoas.
     */
    @Test
    public void testSetBairro() {
        System.out.println("setBairro");
        String bairro = "";
        Pessoas instance = new Pessoas();
        instance.setBairro(bairro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCidade method, of class Pessoas.
     */
    @Test
    public void testGetCidade() {
        System.out.println("getCidade");
        Pessoas instance = new Pessoas();
        String expResult = "";
        String result = instance.getCidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCidade method, of class Pessoas.
     */
    @Test
    public void testSetCidade() {
        System.out.println("setCidade");
        String cidade = "";
        Pessoas instance = new Pessoas();
        instance.setCidade(cidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUf method, of class Pessoas.
     */
    @Test
    public void testGetUf() {
        System.out.println("getUf");
        Pessoas instance = new Pessoas();
        String expResult = "";
        String result = instance.getUf();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUf method, of class Pessoas.
     */
    @Test
    public void testSetUf() {
        System.out.println("setUf");
        String uf = "";
        Pessoas instance = new Pessoas();
        instance.setUf(uf);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExpectativa method, of class Pessoas.
     */
    @Test
    public void testGetExpectativa() {
        System.out.println("getExpectativa");
        Pessoas instance = new Pessoas();
        String expResult = "";
        String result = instance.getExpectativa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setExpectativa method, of class Pessoas.
     */
    @Test
    public void testSetExpectativa() {
        System.out.println("setExpectativa");
        String expectativa = "";
        Pessoas instance = new Pessoas();
        instance.setExpectativa(expectativa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Pessoas.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Pessoas instance = new Pessoas();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Pessoas.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Pessoas instance = new Pessoas();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Pessoas.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Pessoas instance = new Pessoas();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPagamento method, of class Pessoas.
     */
    @Test
    public void testGetPagamento() {
        System.out.println("getPagamento");
        Pessoas instance = new Pessoas();
        Pagamento expResult = null;
        Pagamento result = instance.getPagamento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPagamento method, of class Pessoas.
     */
    @Test
    public void testSetPagamento() {
        System.out.println("setPagamento");
        Pagamento pagamento = null;
        Pessoas instance = new Pessoas();
        instance.setPagamento(pagamento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
