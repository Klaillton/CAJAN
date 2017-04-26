/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidades.Pessoas;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Klaillton
 */
public class PrincipalDAO extends GenericDAO{
    
    public List<Pessoas> busca(EntityManager session, Calendar c){     
        System.out.println("c.getTime(): "+c.getTime());
        System.out.println("new Date(): "+new Date());
        return super.getPureListNamed(session, Pessoas.class, Pessoas.FIND_SEMANA, 
                new Date(), c.getTime());
    }
    
}
