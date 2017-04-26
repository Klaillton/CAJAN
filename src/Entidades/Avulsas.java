/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "avulsas")
@NamedQueries({
    @NamedQuery(name = "Avulsas.findAll", query = "SELECT a FROM Avulsas a"),
    @NamedQuery(name = "Avulsas.findByCodigo", query = "SELECT a FROM Avulsas a WHERE a.codigo = :codigo"),
    @NamedQuery(name = "Avulsas.findByNome", query = "SELECT a FROM Avulsas a WHERE a.nome like ?1"),
    @NamedQuery(name = "Avulsas.findByDataCad", query = "SELECT a FROM Avulsas a WHERE a.dataCad = :dataCad"),
    @NamedQuery(name = "Avulsas.findByValor", query = "SELECT a FROM Avulsas a WHERE a.valor = :valor"),
    @NamedQuery(name = "Avulsas.findByUsuario", query = "SELECT a FROM Avulsas a WHERE a.usuario.codigo = :valor"),
    @NamedQuery(name = "Avulsas.findByUsuarioNome", query = "SELECT a FROM Avulsas a WHERE a.usuario.nome like ?1")
})
public class Avulsas implements Serializable {
    
    public static String FIND_ALL="Avulsas.findAll";
    public static String FIND_UCODIGO="Avulsas.findUsuario";
    public static String FIND_UNOME="Avulsas.findUsuarioNome";

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_av")
    private Integer codigo;
    @Column(name = "nome")
    private String nome;
    @Column(name = "dataCad")
    @Temporal(TemporalType.DATE)
    private Date dataCad;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valor")
    private Double valor;
    
    @JoinColumn(name = "CODIGO")
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private Usuario usuario;

    public Avulsas() {
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    

    public Avulsas(Integer codigo) {
        this.codigo = codigo;
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

    public Date getDataCad() {
        return dataCad;
    }

    public void setDataCad(Date dataCad) {
        this.dataCad = dataCad;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
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
        if (!(object instanceof Avulsas)) {
            return false;
        }
        Avulsas other = (Avulsas) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Avulsas[ codigo=" + codigo + " ]";
    }
    
}
