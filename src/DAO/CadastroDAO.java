/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidades.Pessoas;
import Util.JPAUtil;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Klaillton
 */
public class CadastroDAO extends GenericDAO{
    
    private EntityManager entity = new JPAUtil().getEntityManager();
    
    public CadastroDAO(EntityManager manager){
        this.entity = manager;
    }
    
//    public void adiciona(Pessoas cad){
//        cad = this.manager.merge(cad);
//        this.manager.persist(cad);
//    }
    
    public Pessoas salvarJoin(Pessoas entidade){
        begin(entity);
        try{
            if(entidade!=null && entidade.getNome().trim().length()>0            
            ){
                entidade=saveOrUpdatePojo(entity, entidade);
                return entidade;
            }else{
                _mensagem="Dados inválidos, verifique os campos e tente novamente.";
                return null;
            }
        }catch(Exception e){
            _mensagem="Ocorreu um erro ao tentar salvar dados de Pessoas. Erro: "+e;
            return null;
        }        
    }
    
    public Pessoas salvar(Pessoas entidade){        
        entidade=salvarJoin(entidade);
        if(entidade!=null){
            commit(entity);
        }else{
            rolback(entity);
        }
        return entidade;
    }
    
//    public void remove(Pessoas cad){
//        this.entity.remove(cad);
//    }
    
    public boolean deleteJoin(Pessoas entidade){
        begin(entity);
        try{            
            deletePojo(entity, entidade);
            return true;
        }catch(Exception e){
            _mensagem="Ocorreu um erro ao tentar excluir dados de Pessoas. Erro: "+e;
            return false;
        }        
    }
    public boolean delete(Pessoas entidade){        
        boolean FvaRetorno=deleteJoin(entidade);        
        if(FvaRetorno){
            commit(entity);
        }else{
            rolback(entity);
        }
        return FvaRetorno;
    }
    
    public Pessoas busca(Integer codigo){
        return this.entity.find(Pessoas.class, codigo);
    }
    
    public Pessoas buscaNome(String nome){
        return super.getPurePojoUniqueNamed(entity, Pessoas.class, Pessoas.FIND_NOME, "%"+nome+"%");
    }
    
    public List<Pessoas> lista(){
        return this.entity.createQuery("select p from Pessoas p").getResultList();
    }
    
    public List<Pessoas> getListNamed(EntityManager session, String query, Object... parametros) throws Exception {
        return super.getPureListNamed(session, Pessoas.class, query, parametros);
    }
    
}
