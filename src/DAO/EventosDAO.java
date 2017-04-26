/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidades.Eventos;
import Util.JPAUtil;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Klaillton
 */
public class EventosDAO extends GenericDAO {

    private EntityManager entity = new JPAUtil().getEntityManager();

    public EventosDAO(EntityManager manager) {
        this.entity = manager;
    }
    
    public Eventos salvarJoin(Eventos entidade){
        begin(entity);
        try{
            if(entidade!=null && entidade.getNome().trim().length()>0 ){
                entidade=saveOrUpdatePojo(entity, entidade);
                return entidade;
            }else{
                _mensagem="Dados inválidos, verifique os campos e tente novamente.";
                return null;
            }
        }catch(Exception e){
            _mensagem="Ocorreu um erro ao tentar salvar dados de Eventos. Erro: "+e;
            return null;
        }        
    }
    
    public Eventos salvar(Eventos entidade){        
        entidade=salvarJoin(entidade);
        if(entidade!=null){
            commit(entity);
        }else{
            rolback(entity);
        }
        return entidade;
    }
    
    public boolean deleteJoin(Eventos entidade){
        begin(entity);
        try{            
            deletePojo(entity, entidade);
            return true;
        }catch(Exception e){
            _mensagem="Ocorreu um erro ao tentar excluir dados de Eventos. Erro: "+e;
            return false;
        }        
    }
    public boolean delete(Eventos entidade){        
        boolean FvaRetorno=deleteJoin(entidade);        
        if(FvaRetorno){
            commit(entity);
        }else{
            rolback(entity);
        }
        return FvaRetorno;
    }
    
    public Eventos busca(Integer codigo){
        return this.entity.find(Eventos.class, codigo);
    }
    
    public Eventos buscaNome(String nome){
        return super.getPurePojoUniqueNamed(entity, Eventos.class, Eventos.FIND_NOME, "%"+nome+"%");
    }
    
    public List<Eventos> lista(){
        return this.entity.createQuery("select p from Eventos p").getResultList();
    }
    
    public List<Eventos> getListNamed(EntityManager session, String query, Object... parametros) throws Exception {
        return super.getPureListNamed(session, Eventos.class, query, parametros);
    }

}
