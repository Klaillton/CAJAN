/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author Klaillton
 */
public class Util implements Serializable{

    public static final String FORMAT_DATA_BR = "dd/MM/yyyy";

    public static java.sql.Date getDateSQL(String dateStr) {
        java.sql.Date FvaRetorno = null;
        dateStr = dateStr + "";
        if (dateStr.equalsIgnoreCase("null") || dateStr.length() == 0) {
            return null;
        }
        try {
            java.util.Date newDate;
            DateFormat df = new SimpleDateFormat(FORMAT_DATA_BR);
            df.setLenient(false);
            newDate = df.parse(dateStr);

            FvaRetorno = new java.sql.Date(newDate.getTime());
        } catch (Exception e) {
            System.out.println(
                    "Ocorreu no método getDateSQL(String dateStr) "
                    + "ao tentar formatar a data informada. Erro: " + e);

        }
        return FvaRetorno;
    }

    public static String getDate(java.util.Date date) {
        String FvaRetorno = "";
        if (date == null) {
            return "";
        }
        try {
            DateFormat df = new SimpleDateFormat(FORMAT_DATA_BR);
            df.setLenient(false);
            FvaRetorno = df.format(date);
        } catch (Exception e) {
            System.out.println("Ocorreu no m�todo getDate(java.sql.date) ao tentar formatar a data informada. Erro: " + e);
        }
        return FvaRetorno;
    }

    public static java.util.Date getDateUtil(String dataStr) {
        java.util.Date FvaDataRetorno = null;
        try {
            SimpleDateFormat df = new SimpleDateFormat(FORMAT_DATA_BR);
            df.setLenient(false);
            FvaDataRetorno = df.parse(dataStr);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro na fun��o getDateParse(String dataStr). Erro: " + e);
        }
        return FvaDataRetorno;
    }
    
    public static java.util.Date getDateUtilUS(String dataStr) {
        java.util.Date FvaDataRetorno = null;
        try {
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            df.setLenient(false);
            FvaDataRetorno = df.parse(dataStr);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro na fun��o getDateParse(String dataStr). Erro: " + e);
        }
        return FvaDataRetorno;
    }
    
    public static String getDateUtilUSUnformat(String dataStr) {        
        try {
            String data[] = dataStr.split("/");
            return data[2]+data[1]+data[0];
        } catch (Exception e) {
            System.out.println("Ocorreu um erro na fun��o getDateParse(String dataStr). Erro: " + e);
        }
        return dataStr;
    }
  

}
