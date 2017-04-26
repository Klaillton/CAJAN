/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidades.Usuario;
import Util.JPAUtil;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Klaillton
 */
public class UsuarioDAO extends GenericDAO{
    
    private EntityManager entity = new JPAUtil().getEntityManager();
    
    public UsuarioDAO(EntityManager manager){
        this.entity = manager;
    }
    
     public Usuario salvarJoin(Usuario entidade){
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
            _mensagem="Ocorreu um erro ao tentar salvar dados de Usuario. Erro: "+e;
            return null;
        }        
    }
    
    public Usuario salvar(Usuario entidade){        
        entidade=salvarJoin(entidade);
        if(entidade!=null){
            commit(entity);
        }else{
            rolback(entity);
        }
        return entidade;
    }
    
//    public void remove(Usuario cad){
//        this.entity.remove(cad);
//    }
    
    public boolean deleteJoin(Usuario entidade){
        begin(entity);
        try{            
            deletePojo(entity, entidade);
            return true;
        }catch(Exception e){
            _mensagem="Ocorreu um erro ao tentar excluir dados de Usuario. Erro: "+e;
            return false;
        }        
    }
    public boolean delete(Usuario entidade){        
        boolean FvaRetorno=deleteJoin(entidade);        
        if(FvaRetorno){
            commit(entity);
        }else{
            rolback(entity);
        }
        return FvaRetorno;
    }
    
    public Usuario busca(Integer codigo){
        return this.entity.find(Usuario.class, codigo);
    }
    
    public Usuario buscaNome(String nome){
        return super.getPurePojoUniqueNamed(entity, Usuario.class, Usuario.FIND_NOME, "%"+nome+"%");
    }
    
    public Usuario buscaUsuario(String user){
        return super.getPurePojoUniqueNamed(entity, Usuario.class, Usuario.FIND_LOGIN, user);
    }
    
    public List<Usuario> lista(){
        return this.entity.createQuery("select p from Usuario p").getResultList();
    }
    
    public List<Usuario> getListNamed(EntityManager session, String query, Object... parametros) throws Exception {
        return super.getPureListNamed(session, Usuario.class, query, parametros);
    }
    
}
