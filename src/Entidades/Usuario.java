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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Klaillton
 */
@Entity
@Table(name = "usuario")
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findById", query = "SELECT u FROM Usuario u WHERE u.codigo = :codigo"),
    @NamedQuery(name = "Usuario.findByBairro", query = "SELECT u FROM Usuario u WHERE u.bairro = :bairro"),
    @NamedQuery(name = "Usuario.findByCep", query = "SELECT u FROM Usuario u WHERE u.cep = :cep"),
    @NamedQuery(name = "Usuario.findByCidade", query = "SELECT u FROM Usuario u WHERE u.cidade = :cidade"),
    @NamedQuery(name = "Usuario.findByCnpj", query = "SELECT u FROM Usuario u WHERE u.cnpj = :cnpj"),
    @NamedQuery(name = "Usuario.findByDataCad", query = "SELECT u FROM Usuario u WHERE u.dataCad = :dataCad"),
    @NamedQuery(name = "Usuario.findByEmail", query = "SELECT u FROM Usuario u WHERE u.email = :email"),
    @NamedQuery(name = "Usuario.findByLogradouro", query = "SELECT u FROM Usuario u WHERE u.logradouro = :logradouro"),
    @NamedQuery(name = "Usuario.findByNascimento", query = "SELECT u FROM Usuario u WHERE u.nascimento = :nascimento"),
    @NamedQuery(name = "Usuario.findByNumero", query = "SELECT u FROM Usuario u WHERE u.numero = :numero"),
    @NamedQuery(name = "Usuario.findByNome", query = "SELECT u FROM Usuario u WHERE u.nome like ?1"),
    @NamedQuery(name = "Usuario.findByProfissao", query = "SELECT u FROM Usuario u WHERE u.profissao = :profissao"),
    @NamedQuery(name = "Usuario.findByUf", query = "SELECT u FROM Usuario u WHERE u.uf = :uf"),
    @NamedQuery(name = "Usuario.findByAtivo", query = "SELECT u FROM Usuario u WHERE u.ativo = :ativo"),
    @NamedQuery(name = "Usuario.findBySenha", query = "SELECT u FROM Usuario u WHERE u.senha = :senha"),
    @NamedQuery(name = "Usuario.findByLogin", query = "SELECT u FROM Usuario u WHERE u.login like ?1")})
public class Usuario implements Serializable {
    
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "usuario")
    private Avulsas avulsas;
    
    public static String FIND_ALL="Usuario.findAll";
    public static String FIND_NOME="Usuario.findByNome";
    public static String FIND_LOGIN="Usuario.findByLogin";

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Column(name = "bairro")
    private String bairro;
    @Column(name = "cep")
    private String cep;
    @Column(name = "cidade")
    private String cidade;
    @Column(name = "cnpj")
    private String cnpj;
    @Column(name = "data_cad")
    @Temporal(TemporalType.DATE)
    private Date dataCad;
    @Column(name = "email")
    private String email;
    @Column(name = "logradouro")
    private String logradouro;
    @Column(name = "nascimento")
    @Temporal(TemporalType.DATE)
    private Date nascimento;
    @Column(name = "numero")
    private String numero;
    @Column(name = "nome")
    private String nome;
    @Column(name = "Telefone")
    private String telefone;
    @Column(name = "celular")
    private String celular;
    @Column(name = "profissao")
    private String profissao;
    @Column(name = "uf")
    private String uf;
    @Basic(optional = false)
    @Column(name = "ativo")
    private boolean ativo;
    @Basic(optional = false)
    @Column(name = "senha")
    private String senha;
    @Column(name = "login")
    private String login;

    public Usuario() {
    }

    public Avulsas getAvulsas() {
        return avulsas;
    }

    public void setAvulsas(Avulsas avulsas) {
        this.avulsas = avulsas;
    }
    
    

    public Usuario(Integer codigo) {
        this.codigo = codigo;
    }

    public Usuario(Integer codigo, boolean ativo, String senha) {
        this.codigo = codigo;
        this.ativo = ativo;
        this.senha = senha;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    
    

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Date getDataCad() {
        return dataCad;
    }

    public void setDataCad(Date dataCad) {
        this.dataCad = dataCad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }    

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
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
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.codigo == null && other.codigo != null) || 
                (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Usuario[ codigo=" + codigo + " ]";
    }
    
}
