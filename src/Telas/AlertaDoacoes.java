/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import DAO.PagamentoDAO;
import Entidades.Pagamento;
import Entidades.Pessoas;
import Util.JPAUtil;
import Util.ModeloTabela;
import Util.Util;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Klaillton
 */
public class AlertaDoacoes extends javax.swing.JFrame {

    private EntityManager manager = new JPAUtil().getEntityManager();
    private PagamentoDAO pdao = new PagamentoDAO(manager);

    /**
     * Creates new form AlertaDoacoes
     */
    public AlertaDoacoes() {
        initComponents();
        preencherTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabelaDoacoesAtrasadas = new javax.swing.JTable();

        setTitle("Doações Não Realizadas");

        jLabel1.setText("Sócios com Doações não realizadas há mais de 3 meses:");

        jTabelaDoacoesAtrasadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTabelaDoacoesAtrasadas.setToolTipText("Doações não realizadas");
        jScrollPane1.setViewportView(jTabelaDoacoesAtrasadas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(165, 165, 165))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void preencherTabela() {
        GregorianCalendar datanaopag = new GregorianCalendar();
        GregorianCalendar datacad = new GregorianCalendar();
        datanaopag.add(GregorianCalendar.MONTH, -3);
        datacad.add(GregorianCalendar.MONTH, -3);
//        System.out.println("Preencher tabela invocado!");
        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"Cod.", "Nome", "Telefone", /*"Data_Cadastro",*/
            "Aniversário"/*, "Profissao", "E-Mail", "Mensal", "Valor", "CEP", "Logradouro",
            "Numero", "Bairro", "Cidade", "UF","Expectativa"*/
        };


        try {

            List<Pagamento> pesList = pdao.getPureList(manager, Pagamento.class,
                    " select e from Pagamento e "
                    + " where e.pessoas.dataCad <= ?2 "
                    + " and e.dataPag <= ?1 ", datanaopag.getTime(), datacad.getTime());

            for (Pagamento p : pesList) {
                dados.add(new Object[]{
                    p.getPessoas().getCodigo(), p.getPessoas().getNome(), p.getPessoas().getTelefone(), /*p.getPessoas().getDataCad(),*/ Util.getDate(p.getPessoas().getNascimento()).substring(0, 5),
                    p.getPessoas().getProfissao(), p.getPessoas().getEmail(),
                    p.getPessoas().getMensal(), p.getPessoas().getValor(), p.getPessoas().getCep(), p.getPessoas().getLogradouro(), p.getPessoas().getNumero(), p.getPessoas().getBairro(), p.getPessoas().getCidade(), p.getPessoas().getUf(),
                    p.getPessoas().getExpectativa()

                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        jTabelaDoacoesAtrasadas.setModel(modelo);
        jTabelaDoacoesAtrasadas.getColumnModel().getColumn(0).setPreferredWidth(50); //Codigo       
        jTabelaDoacoesAtrasadas.getColumnModel().getColumn(1).setPreferredWidth(200); //Nome
        jTabelaDoacoesAtrasadas.getColumnModel().getColumn(2).setPreferredWidth(140); //Telefone
//        jTabelaAniversariantes.getColumnModel().getColumn(3).setPreferredWidth(150); //Data Cadastro
        jTabelaDoacoesAtrasadas.getColumnModel().getColumn(3).setPreferredWidth(120); //Data Nascimento
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

        jTabelaDoacoesAtrasadas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jTabelaDoacoesAtrasadas.getTableHeader().setReorderingAllowed(false);
        
        jTabelaDoacoesAtrasadas.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabelaDoacoesAtrasadas;
    // End of variables declaration//GEN-END:variables
}
