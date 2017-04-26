/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Relatorio;

//import com.mysql.jdbc.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Klaillton
 */
public class RelatorioUtil {
    private Map<String, Object> parametros = new HashMap<String, Object>();
    
    public void addParametro(String chave, Object objeto){
        parametros.put(chave, objeto);
    }

//    private EntityManager con = new JPAUtil().getEntityManager();
    public RelatorioUtil() {

    }

    private Connection getConnection() {
        Connection con = null;
        try {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/cajan";
            String user = "root";
            String password = "root";
            Class.forName(driver);
            con = (Connection) DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException cnf) {
            JOptionPane.showMessageDialog(null, "Erro ao se conectar");
        }
        return con;
    }

    public void gerarRelatorio(String relatorio, String query) throws JRException{
        ResultSet rs = null;
        PreparedStatement stm = null;

        System.out.println("relatorio: " + relatorio);
        System.out.println("query: " + query);

        try {
            
            stm = getConnection().prepareStatement(query);
            rs = stm.executeQuery();

        } catch (SQLException ex) {
            Logger.getLogger(RelatorioUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        JRResultSetDataSource jrRS = new JRResultSetDataSource(rs);

        JasperPrint relat = null;

        relat = JasperFillManager.fillReport(relatorio, parametros, jrRS);          
            
       
        if(relat == null){
            JOptionPane.showMessageDialog(null, "Relatório Vazio!");
        } else {
            JasperViewer.viewReport(relat, false);
        }
        
    }

}
