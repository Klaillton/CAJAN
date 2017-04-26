/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Klaillton
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({Telas.ArreEventosEPromocoesTest.class, Telas.EventosEPromocoesTest.class, Telas.AlertaDoacoesTest.class, Telas.CadastroTest.class, Telas.PrincipalTest.class, Telas.PagamentoTelaTest.class})
public class TelasSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
