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
public class UsuarioTest {
    
    public UsuarioTest() {
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
     * Test of getAvulsas method, of class Usuario.
     */
    @Test
    public void testGetAvulsas() {
        System.out.println("getAvulsas");
        Usuario instance = new Usuario();
        Avulsas expResult = null;
        Avulsas result = instance.getAvulsas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAvulsas method, of class Usuario.
     */
    @Test
    public void testSetAvulsas() {
        System.out.println("setAvulsas");
        Avulsas avulsas = null;
        Usuario instance = new Usuario();
        instance.setAvulsas(avulsas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCodigo method, of class Usuario.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        Usuario instance = new Usuario();
        Integer expResult = null;
        Integer result = instance.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigo method, of class Usuario.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        Integer codigo = null;
        Usuario instance = new Usuario();
        instance.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLogin method, of class Usuario.
     */
    @Test
    public void testGetLogin() {
        System.out.println("getLogin");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getLogin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLogin method, of class Usuario.
     */
    @Test
    public void testSetLogin() {
        System.out.println("setLogin");
        String login = "";
        Usuario instance = new Usuario();
        instance.setLogin(login);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBairro method, of class Usuario.
     */
    @Test
    public void testGetBairro() {
        System.out.println("getBairro");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getBairro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBairro method, of class Usuario.
     */
    @Test
    public void testSetBairro() {
        System.out.println("setBairro");
        String bairro = "";
        Usuario instance = new Usuario();
        instance.setBairro(bairro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCep method, of class Usuario.
     */
    @Test
    public void testGetCep() {
        System.out.println("getCep");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getCep();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCep method, of class Usuario.
     */
    @Test
    public void testSetCep() {
        System.out.println("setCep");
        String cep = "";
        Usuario instance = new Usuario();
        instance.setCep(cep);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCidade method, of class Usuario.
     */
    @Test
    public void testGetCidade() {
        System.out.println("getCidade");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getCidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCidade method, of class Usuario.
     */
    @Test
    public void testSetCidade() {
        System.out.println("setCidade");
        String cidade = "";
        Usuario instance = new Usuario();
        instance.setCidade(cidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCnpj method, of class Usuario.
     */
    @Test
    public void testGetCnpj() {
        System.out.println("getCnpj");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getCnpj();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCnpj method, of class Usuario.
     */
    @Test
    public void testSetCnpj() {
        System.out.println("setCnpj");
        String cnpj = "";
        Usuario instance = new Usuario();
        instance.setCnpj(cnpj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataCad method, of class Usuario.
     */
    @Test
    public void testGetDataCad() {
        System.out.println("getDataCad");
        Usuario instance = new Usuario();
        Date expResult = null;
        Date result = instance.getDataCad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataCad method, of class Usuario.
     */
    @Test
    public void testSetDataCad() {
        System.out.println("setDataCad");
        Date dataCad = null;
        Usuario instance = new Usuario();
        instance.setDataCad(dataCad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Usuario.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Usuario.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Usuario instance = new Usuario();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLogradouro method, of class Usuario.
     */
    @Test
    public void testGetLogradouro() {
        System.out.println("getLogradouro");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getLogradouro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLogradouro method, of class Usuario.
     */
    @Test
    public void testSetLogradouro() {
        System.out.println("setLogradouro");
        String logradouro = "";
        Usuario instance = new Usuario();
        instance.setLogradouro(logradouro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNascimento method, of class Usuario.
     */
    @Test
    public void testGetNascimento() {
        System.out.println("getNascimento");
        Usuario instance = new Usuario();
        Date expResult = null;
        Date result = instance.getNascimento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNascimento method, of class Usuario.
     */
    @Test
    public void testSetNascimento() {
        System.out.println("setNascimento");
        Date nascimento = null;
        Usuario instance = new Usuario();
        instance.setNascimento(nascimento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumero method, of class Usuario.
     */
    @Test
    public void testGetNumero() {
        System.out.println("getNumero");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getNumero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumero method, of class Usuario.
     */
    @Test
    public void testSetNumero() {
        System.out.println("setNumero");
        String numero = "";
        Usuario instance = new Usuario();
        instance.setNumero(numero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Usuario.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Usuario.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Usuario instance = new Usuario();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProfissao method, of class Usuario.
     */
    @Test
    public void testGetProfissao() {
        System.out.println("getProfissao");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getProfissao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProfissao method, of class Usuario.
     */
    @Test
    public void testSetProfissao() {
        System.out.println("setProfissao");
        String profissao = "";
        Usuario instance = new Usuario();
        instance.setProfissao(profissao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUf method, of class Usuario.
     */
    @Test
    public void testGetUf() {
        System.out.println("getUf");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getUf();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUf method, of class Usuario.
     */
    @Test
    public void testSetUf() {
        System.out.println("setUf");
        String uf = "";
        Usuario instance = new Usuario();
        instance.setUf(uf);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAtivo method, of class Usuario.
     */
    @Test
    public void testIsAtivo() {
        System.out.println("isAtivo");
        Usuario instance = new Usuario();
        boolean expResult = false;
        boolean result = instance.isAtivo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAtivo method, of class Usuario.
     */
    @Test
    public void testSetAtivo() {
        System.out.println("setAtivo");
        boolean ativo = false;
        Usuario instance = new Usuario();
        instance.setAtivo(ativo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSenha method, of class Usuario.
     */
    @Test
    public void testGetSenha() {
        System.out.println("getSenha");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getSenha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSenha method, of class Usuario.
     */
    @Test
    public void testSetSenha() {
        System.out.println("setSenha");
        String senha = "";
        Usuario instance = new Usuario();
        instance.setSenha(senha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTelefone method, of class Usuario.
     */
    @Test
    public void testGetTelefone() {
        System.out.println("getTelefone");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getTelefone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTelefone method, of class Usuario.
     */
    @Test
    public void testSetTelefone() {
        System.out.println("setTelefone");
        String telefone = "";
        Usuario instance = new Usuario();
        instance.setTelefone(telefone);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCelular method, of class Usuario.
     */
    @Test
    public void testGetCelular() {
        System.out.println("getCelular");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getCelular();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCelular method, of class Usuario.
     */
    @Test
    public void testSetCelular() {
        System.out.println("setCelular");
        String celular = "";
        Usuario instance = new Usuario();
        instance.setCelular(celular);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Usuario.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Usuario instance = new Usuario();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Usuario.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Usuario instance = new Usuario();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Usuario.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
