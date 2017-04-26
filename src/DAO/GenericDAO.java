/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Klaillton
 */
public class GenericDAO {
    
    protected String _mensagem="";
    
    public GenericDAO(){

    }    
    protected void begin(EntityManager session){
        if(session!=null){
            if(!session.getTransaction().isActive()){
                session.getTransaction().begin();
            }
        }
    }
     protected void commit(EntityManager session){
         try{
             if(session!=null){
                if(session.getTransaction().isActive()){
                    session.getTransaction().commit();
                }
            }
         }catch(Exception e){
             System.out.println("Ocorreu um erro ao tentar finalizar transação. Erro: "+e);
             e.printStackTrace();
             rolback(session);
         }        
    }
    
     protected void rolback(EntityManager session){
         try{
             if(session!=null){
                if(session.getTransaction().isActive()){
                    session.getTransaction().rollback();
                }
            }
         }catch(Exception e){
             System.out.println("Ocorreu um erro ao tentar finalizar transação. Erro: "+e);
             e.printStackTrace();
         }          
    }
     
    protected <T extends Serializable> T saveOrUpdatePojo(EntityManager session, Serializable pojo) throws Exception{                      
        pojo=session.merge(pojo);
        session.persist(pojo);        
        return (T) pojo;        
    }    
    
    protected void deletePojo(EntityManager session,Serializable pojo) throws Exception{   
        session.remove(session.contains(pojo)?pojo:session.merge(pojo));        
    }
    
    protected <T extends Serializable> T getPojo(EntityManager session,Class<T> classToSearchPojo, Serializable key){        
        try{
             Serializable pojo=(Serializable)session.find(classToSearchPojo, key);
             return (T) pojo;
        }catch(Exception e){            
            System.out.println("Erro em getPojo. Erro: "+e);
            e.printStackTrace();            
        }
        return null;
    }
    
    public <T extends Serializable> List<T> getPureList(EntityManager session,Class<T> classToSearch, String query, Object... parametros){                
        try{
            Query qr=session.createQuery(query);
            for (int i = 0; i < parametros.length; i++) {
                qr.setParameter(i+1, parametros[i]);
            }
            
            @SuppressWarnings("unchecked")
            List<T> toList=qr.getResultList();
            return toList;            
        }catch(Exception e){            
            System.out.println("Ocorre um erro ao tentar buscar lista de entidades. Erro: "+e);
            e.printStackTrace();
        }
        return null;
    }
    
    public <T extends Serializable> List<T> getPureListNamed(EntityManager session,Class<T> classToSearch, String query, Object... parametros){                
        try{
            Query qr=session.createNamedQuery(query);
            for (int i = 0; i < parametros.length; i++) {
                qr.setParameter(i+1, parametros[i]);
            }
            
            @SuppressWarnings("unchecked")
            List<T> toList=qr.getResultList();
            return toList;            
        }catch(Exception e){            
            System.out.println("Ocorre um erro ao tentar buscar lista de entidades. Erro: "+e);
            e.printStackTrace();
        }
        return null;
    }
    
    public <T extends Serializable> List<T> getPureList(EntityManager session,int registroInicial, int qtdeRegistro,Class<T> classToSearch, String query, Object... parametros){        
        try{
            Query qr=session.createQuery(query).setMaxResults(qtdeRegistro).setFirstResult(registroInicial);
            for (int i = 0; i < parametros.length; i++) {
                qr.setParameter(i+1, parametros[i]);
            }
            @SuppressWarnings("unchecked")
            List<T> toList=qr.getResultList();
            return toList;
        }catch(Exception e){
            System.out.println("Ocorre um erro ao tentar buscar lista de entidades. Erro: "+e);
            e.printStackTrace();
        }
        return null;
    }
    
    public <T extends Serializable> List<T> getPureListNamed(EntityManager session,int registroInicial, int qtdeRegistro,Class<T> classToSearch, String query, Object... parametros){        
        try{
            Query qr=session.createNamedQuery(query).setMaxResults(qtdeRegistro).setFirstResult(registroInicial);
            for (int i = 0; i < parametros.length; i++) {
                qr.setParameter(i+1, parametros[i]);
            }
            @SuppressWarnings("unchecked")
            List<T> toList=qr.getResultList();
            return toList;
        }catch(Exception e){
            System.out.println("Ocorre um erro ao tentar buscar lista de entidades. Erro: "+e);
            e.printStackTrace();
        }
        return null;
    }
       
    public <T extends Serializable> T getPurePojoUnique(EntityManager session,Class<T> classToSearch, String query, Object...parametros){        
        try{
            Query qr=session.createQuery(query).setMaxResults(1).setFirstResult(0);
            for (int i = 0; i < parametros.length; i++) {
                qr.setParameter(i+1, parametros[i]);
            }
            Serializable pojo=(Serializable)qr.getSingleResult();
            return (T) pojo;
        }catch(Exception e){
            System.out.println("Ocorreu um erro ao tentar realizar pesquisa. Erro: "+e);
            e.printStackTrace();
        }
        return  null;
    }   
    public <T extends Serializable> T getPurePojoUniqueNamed(EntityManager session,Class<T> classToSearch, String query, Object...parametros){        
        try{    
            Query qr=session.createNamedQuery(query).setMaxResults(1).setFirstResult(0);
            for (int i = 0; i < parametros.length; i++) {
                qr.setParameter(i+1, parametros[i]);
            }
            Serializable pojo=(Serializable)qr.getSingleResult(); // Dispara exceção(javax.persistence.NoResultException: getSingleResult() did not retrieve any entities)
//            Serializable pojo=(Serializable)qr.getResultList();
            return (T) pojo;
        }catch(Exception e){
            System.out.println("Ocorreu um erro ao tentar realizar pesquisa. Erro: "+e);
            e.printStackTrace();
        }
        return  null;
    }   

    public Double getSUMDouble(EntityManager session,String query, Object... parametros){
        Double FvaRetorno=0.0;
        try{            
            Query qr=session.createQuery(query);
            if(parametros.length>0){
                for (int i = 0; i < parametros.length; i++) {
                    qr.setParameter(i+1, parametros[i]);
                }
            }
            FvaRetorno=(Double)qr.getSingleResult();           
        }catch(Exception e){
            FvaRetorno=0.0;
            System.out.println("Ocorreu um erro ao tentar realizar pesquisa. Erro: "+e);
            e.printStackTrace();            
        }       
        return FvaRetorno;
    }
    
    public int getResultado(EntityManager session,String query, Object... parametros){
        Integer FvaRetorno=0;
        try{            
            Query qr=session.createQuery(query);
            if(parametros.length>0){
                for (int i = 0; i < parametros.length; i++) {
                    qr.setParameter(i+1, parametros[i]);
                }
            }
            FvaRetorno=((Long)qr.getSingleResult()).intValue();
        }catch(Exception e){
            FvaRetorno=0;
            System.out.println("Ocorreu um erro ao tentar realizar pesquisa em getResultado. Erro: "+e);
            e.printStackTrace();            
        }
        return FvaRetorno;
    }
    
     public int getResultadoInt(EntityManager session,String query, Object... parametros){
        Integer FvaRetorno=0;
        try{            
            Query qr=session.createQuery(query);
            if(parametros.length>0){
                for (int i = 0; i < parametros.length; i++) {
                    qr.setParameter(i+1, parametros[i]);
                }
            }
            if(qr.getSingleResult() instanceof Long){
                FvaRetorno=((Long)qr.getSingleResult()).intValue();
            }else if(qr.getSingleResult() instanceof Integer){
                FvaRetorno=((Integer)qr.getSingleResult()).intValue();
            }            
        }catch(Exception e){
            FvaRetorno=0;
            System.out.println("Ocorreu um erro ao tentar realizar pesquisa em getResultadoInt. Erro: "+e);
            e.printStackTrace();            
        }
        return FvaRetorno;
    }

     public int getResultadoIntNamed(EntityManager session,String query, Object... parametros){
        Integer FvaRetorno=0;
        try{            
            Query qr=session.createNamedQuery(query);
            if(parametros.length>0){
                for (int i = 0; i < parametros.length; i++) {
                    qr.setParameter(i+1, parametros[i]);
                }
            }
            if(qr.getSingleResult() instanceof Long){
                FvaRetorno=((Long)qr.getSingleResult()).intValue();
            }else if(qr.getSingleResult() instanceof Integer){
                FvaRetorno=((Integer)qr.getSingleResult()).intValue();
            }            
        }catch(Exception e){
            FvaRetorno=0;
            System.out.println("Ocorreu um erro ao tentar realizar pesquisa em getResultadoInt. Erro: "+e);
            e.printStackTrace();            
        }
        return FvaRetorno;
    }
     
    public List executeNativeQuery(EntityManager session,String SQL, Object... parametros){
        List FvaRetorno=null;    
        try{
            Query qr=session.createNativeQuery(SQL);
            for (int i = 0; i < parametros.length; i++) {
                qr.setParameter(i+1, parametros[i]);
            }
            FvaRetorno=qr.getResultList();
        }catch(Exception e){
            System.out.println("Ocorreu um erro ao tentar executar a query: " +SQL+". Erro: "+e);
            e.printStackTrace();
        }        
        return FvaRetorno;
    }    
    
    public <T extends Serializable> List<T> executeNativeQuery(EntityManager session,Class<T> classe,String SQL, Object... parametros){
        try{            
            Query qr=session.createNativeQuery(SQL);
            for (int i = 0; i < parametros.length; i++) {
                qr.setParameter(i+1, parametros[i]);
            }
            List<T> pojo=qr.getResultList();            
            return pojo;            
        }catch(Exception e){
            System.out.println("Ocorreu um erro ao tentar executar a query: " +SQL+". Erro: "+e);
            e.printStackTrace();
        }
        return null;
    }
    
    public boolean executeQuery(EntityManager session,String SQL, Object ... parametros){
        boolean FvaRetorno=false;
        try{            
            Query qr=session.createQuery(SQL);
            for (int i = 0; i < parametros.length; i++) {
                qr.setParameter(i+1, parametros[i]);
            }
            qr.executeUpdate();
            FvaRetorno=true;            
        }catch(Exception e){   
            System.out.println("Ocorreu um erro ao tentar executar a query: " +SQL+". Erro: "+e);
            e.printStackTrace();
        }
        return FvaRetorno;
    }    
    public String getLog(){
        return _mensagem;
    }
    
}
