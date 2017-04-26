/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Util;

import java.util.Date;


public class UtCodigo {

    private String tab = "";
    
    
    
    
//    public static String getCodigoVerificacao(String cnpj, String numeroNota){
//        //Recebe o numero e o cnpj
//         // Converte para outro codigo
//        String sc = cnpj.trim().replace("-", "").replace("/", "").replace(".", "");
//        
//        if(sc.length() <12)
//            sc = "0" + sc;
//        
//        String c = sc.substring(0, 12);
//        
//        String sn = numeroNota.trim();
//        String n = complete(sn, 6);
//        
//        String value = c + n;
//        
//        String ret = converteDecimalParaBase36(value);
//        
//        ret = complete(ret, 8, ""+Calendar.getInstance().get(Calendar.YEAR)+""+Calendar.getInstance().get(Calendar.YEAR));
//        
//        ret = ret.substring(ret.length()-8);
//        
//        ret = ret.toUpperCase();
//        
//        return ret;
//    }
    
    private static String complete(String str, int tam){
        int tam2 = str.length();
        int tam3 = tam-tam2;
        String s = str;
        
        for (int i = 0; i < tam3; i++) {
            
            s = "0" + s;
            
        }
        
        return s;
    }
//    private static String complete(String str, int tam, String compl){
//        int tam2 = str.length();
//        if(tam2 > tam)
//            return str;
//        
//        int tam3 = tam-tam2;
//        
//        String s = str;
//        
//        String s2 = compl.substring(0,tam3);
//        
//        s = s2 + s;
//        
//        return s;
//    }
    
//    private static String converteDecimalParaBase36(String sValor) {
//////    char[] base = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f',
//////                  'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
//////                  'w', 'x', 'y', 'z'};
//   int resto = -1;
//   StringBuilder sb = new StringBuilder();
// 
//   if (sValor.equals("0")) {
//      return "0";
//   }
// 
//    long valor = new Long(sValor);
//    
//    valor = (valor - soma(valor));
//   
//   // enquanto o resultado da divisão por 16 for maior que 0 adiciona o resto ao início da String de retorno
//   while (valor > 0) {
//      resto = (int) (valor % 36);
//      valor = valor / 36;
//      sb.insert(0, base[resto]);
//   }
// 
//   return sb.toString();
//}    

private static long soma(long valor){
    String vr;
        vr = ""+valor;
    long ret;
        ret = 0l;
    
    for (int i = 0; i < vr.length(); i++) {
        int v;
        v = vr.charAt(i);
        ret = ret + v;
    }
    
    ret = ret * vr.length();
    
    System.out.print(ret);
    return ret;
    
}    
    


private static String converteDecimalParaBase35(String sValor) {
    char[] base = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f',
                  'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
                  'w', 'x', 'y'};
   int resto = -1;
   StringBuilder sb = new StringBuilder();
 
   if (sValor.equals("0")) {
      return "0";
   }
 
    long valor = Long.valueOf(sValor);
    
  //  valor = (valor - soma(valor));
   
   // enquanto o resultado da divisão por 16 for maior que 0 adiciona o resto ao início da String de retorno
   while (valor > 0) {
      resto = (int) (valor % 35);
      valor = valor / 35;
      sb.insert(0, base[resto]);
   }
 
   return sb.toString();
}  

        private static String complete(String str, int tam, String compl){
        int tam2 = str.length();
        if(tam2 > tam)
            return str;
        
        int tam3 = tam-tam2;
        
        String s = str;
        
        String s2 = compl.length()>tam3?compl.substring(0,tam3):compl;
        for (int i = 0; i < tam3; i++) {
             s = s2 + s;
        }
        
        return s;
    }

    public static String getCodigoVerificacao(String codigo, String nome){
        //Recebe o numero e o cnpj
         // Converte para outro codigo
        String sc = codigo+/*nome.toLowerCase().replaceAll(" ", "").replaceAll(",", "")+*/new Date().getTime();
        System.out.println("Gerando identificador");
        System.out.println("=====================");
        System.out.println("sc: "+sc);
        //if(sc.length() <14)
          //  sc = "0" + sc;
        String c = complete(sc, 9);
        System.out.println("c1: "+c);
        c = c.substring(0, 9);
        System.out.println("c2: "+c);
        
        
        //String sn = Util.getDate(data).trim().replace("/", "");
        String sn = sc;
        String n = complete(sn, 6);
        System.out.println("n: "+n);
        
        String value = c + n;
        System.out.println("value: "+value);
        
        String ret = converteDecimalParaBase35(value);
        System.out.println("ret1: "+ret);
        
        ret = complete(ret, 12, "z");
        System.out.println("ret2: "+ret);
        
        //ret = ret.substring(ret.length()-8);
        
        ret = ret.toUpperCase();
        System.out.println("ret3: "+ret);
        
        return ret;
    }
            
}
