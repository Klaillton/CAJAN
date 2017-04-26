/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Klaillton
 */
@Entity
@Table(name = "eventos")
@NamedQueries({
    @NamedQuery(name = "Eventos.findAll", query = "SELECT e FROM Eventos e"),
    @NamedQuery(name = "Eventos.findByCodigo", query = "SELECT e FROM Eventos e WHERE e.codigo = :codigo"),
    @NamedQuery(name = "Eventos.findByNome", query = "SELECT e FROM Eventos e WHERE e.nome like ?1"),
    @NamedQuery(name = "Eventos.findByDataInicio", query = "SELECT e FROM Eventos e WHERE e.dataInicio = :dataInicio"),
    @NamedQuery(name = "Eventos.findByDataFim", query = "SELECT e FROM Eventos e WHERE e.dataFim = :dataFim"),
    @NamedQuery(name = "Eventos.findByDataFim2", query = "SELECT e FROM Eventos e WHERE e.dataFim >= ?1"),
    @NamedQuery(name = "Eventos.findByExpectativa", query = "SELECT e FROM Eventos e WHERE e.expectativa = :expectativa"),
    @NamedQuery(name = "Eventos.findByArrecadacao", query = "SELECT e FROM Eventos e WHERE e.arrecadacao = :arrecadacao"),
    @NamedQuery(name = "Eventos.findByCont", query = "SELECT e FROM Eventos e WHERE e.cont = :cont"),
    @NamedQuery(name = "Eventos.findByDate", query = "SELECT e FROM Eventos e "
            + "WHERE e.dataInicio = ?1 AND e.dataFim = ?2")})
public class Eventos implements Serializable {
    
    public static String FIND_DATE = "Eventos.findByDate";
    public static String FIND_ALL = "Eventos.findAll";
    public static String FIND_NOME = "Eventos.findByNome";
    public static String FIND_DATEFIM = "Eventos.findByDataFim2";

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "dataInicio")
    @Temporal(TemporalType.DATE)
    private Date dataInicio;
    @Basic(optional = false)
    @Column(name = "dataFim")
    @Temporal(TemporalType.DATE)
    private Date dataFim;
    // @Max(value=?)  @Min(value=?)
//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "expectativa")
    private Double expectativa;
    @Column(name = "arrecadacao")
    private Double arrecadacao;
    @Basic(optional = false)
    @Column(name = "cont")
    private int cont;

    public Eventos() {
    }

    public Eventos(Integer codigo) {
        this.codigo = codigo;
    }

    public Eventos(Integer codigo, String nome, Date dataInicio, Date dataFim, int cont) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.cont = cont;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public Double getExpectativa() {
        return expectativa;
    }

    public void setExpectativa(Double expectativa) {
        this.expectativa = expectativa;
    }

    public Double getArrecadacao() {
        return arrecadacao;
    }

    public void setArrecadacao(Double arrecadacao) {
        this.arrecadacao = arrecadacao;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Eventos)) {
            return false;
        }
        Eventos other = (Eventos) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Eventos[ codigo=" + codigo + " ]";
    }

}
