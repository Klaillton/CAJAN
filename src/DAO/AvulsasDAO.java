/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidades.Avulsas;
import Util.JPAUtil;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Klaillton
 */
public class AvulsasDAO extends GenericDAO {

    private EntityManager entity = new JPAUtil().getEntityManager();

    public AvulsasDAO(EntityManager manager) {
        this.entity = manager;
    }

    public Avulsas salvarJoin(Avulsas entidade) {
        begin(entity);
        try {
            if (entidade != null) {
                entidade = saveOrUpdatePojo(entity, entidade);
                return entidade;
            } else {
                _mensagem = "Dados inválidos, verifique os campos e tente novamente.";
                return null;
            }
        } catch (Exception e) {
            _mensagem = "Ocorreu um erro ao tentar salvar dados de Avulsas. Erro: " + e;
            return null;
        }
    }

    public Avulsas salvar(Avulsas entidade) {
        entidade = salvarJoin(entidade);
        if (entidade != null) {
            commit(entity);
        } else {
            rolback(entity);
        }
        return entidade;
    }

    public Avulsas busca(Integer codigo) {
        return this.entity.find(Avulsas.class, codigo);
    }

    public List<Avulsas> lista() {
        return this.entity.createQuery("select p from Avulsas p").getResultList();
    }

}
