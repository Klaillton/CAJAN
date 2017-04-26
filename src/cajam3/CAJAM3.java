/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajam3;

import Telas.Principal;

/**
 *
 * @author Klaillton
 */
public class CAJAM3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

//        try {//Iniciar banco de dados derby
////Aqui você também pode utilizar um caminho relativo, porém lembre-se de que esse
////caminho inicia no mesmo diretório onde você iniciou a aplicação.
//            System.setProperty("derby.system.home", "jdbc:derby://localhost:1527/CAJAM3");
//            NetworkServerControlImpl networkServer = new NetworkServerControlImpl();
//            networkServer.start(new PrintWriter(System.out));
//            System.out.println("Conectado ao banco de dados.");
//        } catch (Exception ex) {
//            System.out.println("Não conseguiu conectar no banco de dados.");
//        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {

            new Principal().setVisible(true);
        });
    }

}
