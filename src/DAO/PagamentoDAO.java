/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidades.Pagamento;
import Util.JPAUtil;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Klaillton
 */
public class PagamentoDAO extends GenericDAO{

    private EntityManager entity = new JPAUtil().getEntityManager();

    public PagamentoDAO(EntityManager manager) {
        this.entity = manager;
    }

    public Pagamento salvarJoin(Pagamento entidade) {
        begin(entity);
        try {
            if (entidade != null ) {
                entidade = saveOrUpdatePojo(entity, entidade);
                return entidade;
            } else {
                _mensagem = "Dados inválidos, verifique os campos e tente novamente.";
                return null;
            }
        } catch (Exception e) {
            _mensagem = "Ocorreu um erro ao tentar salvar dados de Pagamento. Erro: " + e;
            return null;
        }
    }

    public Pagamento salvar(Pagamento entidade) {
        entidade = salvarJoin(entidade);
        if (entidade != null) {
            commit(entity);
        } else {
            rolback(entity);
        }
        return entidade;
    }


    public Pagamento busca(Integer codigo) {
        return this.entity.find(Pagamento.class, codigo);
    }

    public List<Pagamento> lista() {
        return this.entity.createQuery("select p from Pagamento p").getResultList();
    }

}
