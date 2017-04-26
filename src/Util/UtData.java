/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
/**
 *
 * @author Administrador
 */
public class UtData {
    private static String formato = "yyyy-MM-dd";
    
    public static String getDate(Date data){
        String FvaDataRetorno="";
        try{
            SimpleDateFormat df = new SimpleDateFormat(formato);
            df.setLenient(false);
            //df.setTimeZone(TimeZone.getTimeZone("GMT -03:00"));
            FvaDataRetorno=df.format(data);
        }catch(Exception e){
            System.out.println("Ocorreu um erro na função getDate(java.sql.Date data). Erro: "+e);
        }
        return FvaDataRetorno;
    }
    /**Retorna a data de vencimento, baseado nas configurações
     Se for passado uma data como <br>
     * (10/03/1523, false e 20)  retorna 20/04/1523<br>
     * (10/03/1523, true e 20)  retorna 31/03/1523<br>
     */
    public static Date getDataVencto(Date data, boolean ultDiaMes, int dia){
        Calendar c = Calendar.getInstance();
        c.setTime(data);
        
        if(ultDiaMes){
            c.set(Calendar.DAY_OF_MONTH, getUltimoDiaDoMes(c.get(Calendar.MONTH), c.get(Calendar.YEAR)));
        }else{
            if(c.get(Calendar.MONTH) == Calendar.DECEMBER){
                c.roll(Calendar.YEAR, true);
            }
            c.roll(Calendar.MONTH, true);
            c.set(Calendar.DAY_OF_MONTH, dia);
            
            
        }
        return c.getTime();
    }
    
    
    /*Usar mes de Calendar, começando com 0-Janeiro, 1-Fevereiro, 2-Março *** */
    private static int getUltimoDiaDoMes(int mes, int ano){
        if(mes == Calendar.FEBRUARY){
            if(new GregorianCalendar().isLeapYear(ano))
                return 29;
            return 28;
        }
        
        if(mes == Calendar.APRIL || 
                mes == Calendar.JUNE || 
                mes == Calendar.SEPTEMBER || 
                mes == Calendar.NOVEMBER
                )
            return 30;
        return 31;
    }
    
    public static int getDiffEmDias (Date dtInicial, Date dtFinal){ 
        if(dtInicial == null || dtFinal == null)
            return 0;
        return (int)
                ((dtFinal.getTime() - dtInicial.getTime() + 3600000L) / 86400000L);  
    }     
    
    public static int getDiffEmMes (Date dtInicial, Date dtFinal){  
        return getDiffEmDias(dtInicial, dtFinal) / 30;
      

//             (dtFinal.getTime() - dtInicial.getTime() + 3600000L) / 86400000L;  
    }     
    
    public static Date getDateAdd(Date data, int dia){
    
//        Date dt = data;
//        dt.setDate(dt.getDate()+dia);
        
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(data);
        cal.add(Calendar.DAY_OF_MONTH, dia);
        
        //return dt;
        return cal.getTime();
//        Calendar limite = Calendar.getInstance();
//        limite.setTime(data);
//        
//        int d1, d2;
//        d1 = limite.get(Calendar.DAY_OF_MONTH);
//        limite.roll(Calendar.DAY_OF_MONTH, dia);
//        d2 = limite.get(Calendar.DAY_OF_MONTH);
//        
//        if(d2 < d1){
//            int m1, m2;
//
//            m1 = limite.get(Calendar.MONTH);
//            limite.roll(Calendar.MONTH, 1);
//            m2 = limite.get(Calendar.MONTH);            
//            
//            if(m2 < m1){
//                int a1, a2;
//
//                a1 = limite.get(Calendar.YEAR);
//                limite.roll(Calendar.YEAR, 1);
//                a2 = limite.get(Calendar.YEAR);            
//                
//            }
//        }
//     
//        return limite.getTime();
    }
}
