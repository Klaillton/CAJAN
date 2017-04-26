/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import DAO.EventosDAO;
import DAO.PrincipalDAO;
import Entidades.Eventos;
import Entidades.Pessoas;
import Relatorio.RelatorioUtil;
import Util.JPAUtil;
import Util.ModeloTabela;
import Util.UtData;
import Util.Util;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import net.sf.jasperreports.engine.JRException;

/**
 *
 * @author Klaillton
 */
public class Principal extends javax.swing.JFrame {

    private EntityManager manager = new JPAUtil().getEntityManager();
    private PrincipalDAO pdao = new PrincipalDAO();
    private EventosDAO edao = new EventosDAO(manager);

    private RelatorioUtil rel = new RelatorioUtil();

    /**
     * Creates new form principal
     */
    public Principal() {
        initComponents();

        Preenche_Status();
        preencherTabelaEventos();

    }

    public void preencheEventos() {
        preencherTabelaEventos();
    }

    public void preencheStatus() {
        Preenche_Status();
    }

    private void Preenche_Status() {
        preencherTabela();
    }

    private void preencherTabela() {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(UtData.getDataVencto(new Date(), true, 7));
//        System.out.println("Preencher tabela invocado!");
        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"Cod.", "Nome", "Telefone", /*"Data_Cadastro",*/
            "Aniversário"/*, "Profissao", "E-Mail", "Mensal", "Valor", "CEP", "Logradouro",
            "Numero", "Bairro", "Cidade", "UF","Expectativa"*/
        };

//        System.out.println("arrayList");
//        System.out.println(SQL);
        try {

            List<Pessoas> pesList = pdao.busca(manager, calendar);
//            ResultSet pesList = (ResultSet) dao.lista();
//            pesList.first();
            for (Pessoas p : pesList) {
                dados.add(new Object[]{
                    p.getCodigo(), p.getNome(), p.getTelefone(), /*p.getDataCad(),*/ Util.getDate(p.getNascimento()).substring(0, 5),
                    p.getProfissao(), p.getEmail(),
                    p.getMensal(), p.getValor(), p.getCep(), p.getLogradouro(), p.getNumero(), p.getBairro(), p.getCidade(), p.getUf(),
                    p.getExpectativa()

                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        jTabelaAniversariantes.setModel(modelo);
        jTabelaAniversariantes.getColumnModel().getColumn(0).setPreferredWidth(50); //Codigo       
        jTabelaAniversariantes.getColumnModel().getColumn(1).setPreferredWidth(200); //Nome
        jTabelaAniversariantes.getColumnModel().getColumn(2).setPreferredWidth(140); //Telefone
//        jTabelaAniversariantes.getColumnModel().getColumn(3).setPreferredWidth(150); //Data Cadastro
        jTabelaAniversariantes.getColumnModel().getColumn(3).setPreferredWidth(120); //Data Nascimento
        //jTabelaAniversariantes.getColumnModel().getColumn(5).setPreferredWidth(480); //Profissão
        //jTabelaAniversariantes.getColumnModel().getColumn(6).setPreferredWidth(480); //Email
//        jTabelaAniversariantes.getColumnModel().getColumn(7).setPreferredWidth(480); //CEP
//        jTabelaAniversariantes.getColumnModel().getColumn(8).setPreferredWidth(480); //Logradouro
//        jTabelaAniversariantes.getColumnModel().getColumn(9).setPreferredWidth(480); //Numero da casa
//        jTabelaAniversariantes.getColumnModel().getColumn(10).setPreferredWidth(480); //Bairro
//        jTabelaAniversariantes.getColumnModel().getColumn(11).setPreferredWidth(480); //Cidade
//        jTabelaAniversariantes.getColumnModel().getColumn(12).setPreferredWidth(480); //UF
//        jTabelaAniversariantes.getColumnModel().getColumn(13).setPreferredWidth(480); //Cidade
//        jTabelaAniversariantes.getColumnModel().getColumn(14).setPreferredWidth(480); //Mensalista
//        jTabelaAniversariantes.getColumnModel().getColumn(15).setPreferredWidth(480); //Valores Padrao
//        jTabelaAniversariantes.getColumnModel().getColumn(16).setPreferredWidth(480); //Valor não padrão
//        jTabelaAniversariantes.getColumnModel().getColumn(17).setPreferredWidth(480); //Expectativa

        jTabelaAniversariantes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jTabelaAniversariantes.getTableHeader().setReorderingAllowed(false);
        jTabelaAniversariantes.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabelaAniversariantes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTabelaEventos = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        status = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        sair = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        Cadastro = new javax.swing.JMenuItem();
        eventosPromocoes = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        Pagamento = new javax.swing.JMenuItem();
        arreEventosEPromocoes = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        soc_contribuintes = new javax.swing.JMenuItem();
        contr_mensais = new javax.swing.JMenuItem();
        exp_recebimento = new javax.swing.JMenuItem();
        rec_efetivo = new javax.swing.JMenuItem();
        eventos = new javax.swing.JMenuItem();
        avulsas = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        alertaDoacoes = new javax.swing.JMenuItem();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");

        jScrollPane1.setToolTipText("Aniversariantes da Semana");

        jTabelaAniversariantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTabelaAniversariantes);

        jLabel1.setText("Aniversariantes");

        jLabel2.setText("Promoções e Eventos Ativos");

        jTabelaEventos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTabelaEventos);

        status.setColumns(20);
        status.setRows(5);
        jScrollPane4.setViewportView(status);

        jLabel3.setText("Status");

        jMenu5.setText("Menu");

        jMenuItem2.setText("Usuário");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem2);
        jMenu5.add(jSeparator2);

        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        jMenu5.add(sair);

        jMenuBar1.add(jMenu5);

        jMenu1.setText("Cadastros");

        Cadastro.setText("Associados");
        Cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroActionPerformed(evt);
            }
        });
        jMenu1.add(Cadastro);

        eventosPromocoes.setText("Eventos/Promoções");
        eventosPromocoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventosPromocoesActionPerformed(evt);
            }
        });
        jMenu1.add(eventosPromocoes);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Baixas");

        Pagamento.setText("Doações");
        Pagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagamentoActionPerformed(evt);
            }
        });
        jMenu4.add(Pagamento);

        arreEventosEPromocoes.setText("Eventos/Promoções");
        arreEventosEPromocoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arreEventosEPromocoesActionPerformed(evt);
            }
        });
        jMenu4.add(arreEventosEPromocoes);

        jMenuItem1.setText("Doações Avulsas/Anônima");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuBar1.add(jMenu4);

        jMenu2.setText("Relatórios");

        soc_contribuintes.setText("Sócios Contribuintes");
        soc_contribuintes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soc_contribuintesActionPerformed(evt);
            }
        });
        jMenu2.add(soc_contribuintes);

        contr_mensais.setText("Contribuições Mensais");
        contr_mensais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contr_mensaisActionPerformed(evt);
            }
        });
        jMenu2.add(contr_mensais);

        exp_recebimento.setText("Expectativa de Recebimento");
        exp_recebimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exp_recebimentoActionPerformed(evt);
            }
        });
        jMenu2.add(exp_recebimento);

        rec_efetivo.setText("Recebimento Efetivo");
        rec_efetivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rec_efetivoActionPerformed(evt);
            }
        });
        jMenu2.add(rec_efetivo);

        eventos.setText("Eventos");
        eventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventosActionPerformed(evt);
            }
        });
        jMenu2.add(eventos);

        avulsas.setText("Doações Avulsas");
        avulsas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avulsasActionPerformed(evt);
            }
        });
        jMenu2.add(avulsas);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Extras");

        alertaDoacoes.setText("Doações em aberto");
        alertaDoacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alertaDoacoesActionPerformed(evt);
            }
        });
        jMenu3.add(alertaDoacoes);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane4)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroActionPerformed
        // TODO add your handling code here:
        Cadastro cad = new Cadastro();
        cad.setVisible(true);
    }//GEN-LAST:event_CadastroActionPerformed

    private void PagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagamentoActionPerformed
        // TODO add your handling code here:
        PagamentoTela pag = new PagamentoTela();
        pag.setVisible(true);
    }//GEN-LAST:event_PagamentoActionPerformed

    private void soc_contribuintesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soc_contribuintesActionPerformed
        // TODO add your handling code here:
        try {

//            List pesList = pdao.getPureList(manager, Pessoas.class, "select p, p.codigo as CODIGO from Pessoas p");
//
//            File arquivo = new File(".\\Relatorios" + File.separator + "soc_contribuintes");
//            //File arquivo = new File(File.separator + "Relatorios" + File.separator + "soc_contribuintes");
//
//            System.out.println("arquivo: " + arquivo.getAbsolutePath());
//            System.out.println("arquivo2: " + arquivo.toString());
//
//            rel.gerarRelatorio(arquivo.toString(), pesList);
            String query = "select * from Pessoas p";

            String caminho = new File("C:\\cajan\\relatorios\\soc_contribuintes.jasper").getCanonicalPath();

            rel.gerarRelatorio(caminho, /*pesList*/ query);

        } catch (JRException | IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_soc_contribuintesActionPerformed


    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_sairActionPerformed

    private void contr_mensaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contr_mensaisActionPerformed
        // TODO add your handling code here:
        
        ContribuicoesMensaisRel cm = new ContribuicoesMensaisRel();
        cm.setVisible(true);
        
//        try {
////            List pesList = pdao.getPureList(manager, Pessoas.class, "SELECT p FROM Pagamento p "
////                    + "WHERE p.identificador <> '' ");
////
//////            rel.gerarRelatorio(".\\Relatorios" + File.separator + "contribuicoes_mensais", pesList);
////            rel.gerarRelatorio("C:\\cajan\\relatorios" + File.separator + "contribuicoes_mensais", pesList);
//            String query = "SELECT * FROM Pagamento p  "
//                    + " LEFT JOIN Pessoas pe "
//                    + " ON p.codigo = pe.codigo"
//                    + " WHERE p.identificador <> '' ";
//
//            String caminho = new File("C:\\cajan\\relatorios\\contribuicoes_mensais.jasper").getCanonicalPath();
//
//            rel.gerarRelatorio(caminho, /*pesList*/ query);
//        } catch (JRException | IOException ex) {
//            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
//            status.setText(ex.getMessage());
//        }
    }//GEN-LAST:event_contr_mensaisActionPerformed

    private void exp_recebimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exp_recebimentoActionPerformed
        // TODO add your handling code here:
        try {
//            List pesList = pdao.getPureList(manager, Pessoas.class, "select "
//                    + "sum(case when e.cont = 0 then 10 "
//                    + "else case when e.cont = 1 then 20 "
//                    + "else case when e.cont = 2 then 30 "
//                    + "else case when e.cont = 3 then 50 "
//                    + "else e.valor "
//                    + "end end end end) as Total from Pessoas e");

//            rel.gerarRelatorio(".\\Relatorios" + File.separator + "exp_recebimento", pesList);
//            rel.gerarRelatorio("C:\\cajan\\relatorios" + File.separator + "exp_recebimento", pesList);
            String query = "select  "
                    + " sum(case when e.cont = 0 then 10  "
                    + " else case when e.cont = 1 then 20 "
                    + " else case when e.cont = 2 then 30  "
                    + " else case when e.cont = 3 then 50 "
                    + " else e.valor  "
                    + " end end end end) as Total from Pessoas e";

            String caminho = new File("C:\\cajan\\relatorios\\exp_recebimento.jasper").getCanonicalPath();

            rel.gerarRelatorio(caminho, /*pesList*/ query);
        } catch (JRException | IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            status.setText(ex.getMessage());
        }
    }//GEN-LAST:event_exp_recebimentoActionPerformed

    private void rec_efetivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rec_efetivoActionPerformed
        // TODO add your handling code here:
//        try {
//
//            String query = "select  "
//                    + " sum(case when p.cont = 0 then 10  "
//                    + " else case when p.cont = 1 then 20  "
//                    + " else case when p.cont = 2 then 30  "
//                    + " else case when p.cont = 3 then 50  "
//                    + " else p.valor  "
//                    + " end end end end) as Total from Pagamento p";
//
//            String caminho = new File("C:\\cajan\\relatorios\\rec_efetivo.jasper").getCanonicalPath();
//
//            rel.gerarRelatorio(caminho, /*pesList*/ query);
//        } catch (JRException | IOException ex) {
//            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
//            status.setText(ex.getMessage());
//        }
          RecebimentoEfetivoRel rer = new RecebimentoEfetivoRel();
          rer.setVisible(true);
    }//GEN-LAST:event_rec_efetivoActionPerformed

    private void eventosPromocoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventosPromocoesActionPerformed
        // TODO add your handling code here:
        EventosEPromocoes e = new EventosEPromocoes();
        e.setVisible(true);
    }//GEN-LAST:event_eventosPromocoesActionPerformed

    private void alertaDoacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alertaDoacoesActionPerformed
        // TODO add your handling code here:        
        AlertaDoacoes ad = new AlertaDoacoes();
        ad.setVisible(true);
    }//GEN-LAST:event_alertaDoacoesActionPerformed

    private void arreEventosEPromocoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arreEventosEPromocoesActionPerformed
        // TODO add your handling code here:
        ArreEventosEPromocoes aep = new ArreEventosEPromocoes();
        aep.setVisible(true);
    }//GEN-LAST:event_arreEventosEPromocoesActionPerformed

    private void eventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventosActionPerformed
        EventosRel er = new EventosRel();
        er.setVisible(true);
    }//GEN-LAST:event_eventosActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        DoacoesAvulsas av = new DoacoesAvulsas();
        av.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        User u = new User();
        u.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void avulsasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avulsasActionPerformed
       DoacoesRel dr = new DoacoesRel();
       dr.setVisible(true);
    }//GEN-LAST:event_avulsasActionPerformed

    private void preencherTabelaEventos() {
//        System.out.println("Preencher tabela invocado!");
        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"Codigo", "Tipo", "Nome", "Inicio", "Fim", "Expectativa", "Arrecadação"
        };

//        System.out.println("arrayList");
//        System.out.println(SQL);
        try {

            List<Eventos> pesList = edao.getListNamed(manager, Eventos.FIND_DATEFIM, new Date());
//            ResultSet pesList = (ResultSet) dao.lista();
//            pesList.first();
            for (Eventos p : pesList) {
                dados.add(new Object[]{
                    p.getCodigo(), p.getCont() == 0 ? "Evento" : "Promoção", p.getNome(),
                    Util.getDate(p.getDataInicio()), Util.getDate(p.getDataFim()),
                    "R$ " + p.getExpectativa(), "R$ " + p.getArrecadacao()

                });
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        jTabelaEventos.setModel(modelo);

        jTabelaEventos.getColumnModel().getColumn(0).setPreferredWidth(50); //Codigo       
        jTabelaEventos.getColumnModel().getColumn(1).setPreferredWidth(70); //Tipo do Evento
        jTabelaEventos.getColumnModel().getColumn(2).setPreferredWidth(200); //Nome
        jTabelaEventos.getColumnModel().getColumn(3).setPreferredWidth(150); //Data Inicio
        jTabelaEventos.getColumnModel().getColumn(4).setPreferredWidth(150); //Data Fim
        jTabelaEventos.getColumnModel().getColumn(5).setPreferredWidth(70); //Expectativa
        jTabelaEventos.getColumnModel().getColumn(6).setPreferredWidth(70); //Expectativa

        jTabelaEventos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jTabelaEventos.getTableHeader().setReorderingAllowed(false);
        jTabelaEventos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Cadastro;
    private javax.swing.JMenuItem Pagamento;
    private javax.swing.JMenuItem alertaDoacoes;
    private javax.swing.JMenuItem arreEventosEPromocoes;
    private javax.swing.JMenuItem avulsas;
    private javax.swing.JMenuItem contr_mensais;
    private javax.swing.JMenuItem eventos;
    private javax.swing.JMenuItem eventosPromocoes;
    private javax.swing.JMenuItem exp_recebimento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTable jTabelaAniversariantes;
    private javax.swing.JTable jTabelaEventos;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JMenuItem rec_efetivo;
    private javax.swing.JMenuItem sair;
    private javax.swing.JMenuItem soc_contribuintes;
    private javax.swing.JTextArea status;
    // End of variables declaration//GEN-END:variables
}
