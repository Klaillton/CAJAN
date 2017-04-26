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
import javax.persistence.ManyToMany;
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
@Table(name = "PESSOAS")
@NamedQueries({
    @NamedQuery(name = "Pessoas.findAll", query = "SELECT p FROM Pessoas p"),
    @NamedQuery(name = "Pessoas.findByCodigo", query = "SELECT p FROM Pessoas p WHERE p.codigo = :codigo"),
    @NamedQuery(name = "Pessoas.findByCnpj", query = "SELECT p FROM Pessoas p WHERE p.cnpj = :cnpj"),
    @NamedQuery(name = "Pessoas.findByNome", query = "SELECT p FROM Pessoas p WHERE p.nome like ?1"),
    @NamedQuery(name = "Pessoas.findByTelefone", query = "SELECT p FROM Pessoas p WHERE p.telefone = :telefone"),
    @NamedQuery(name = "Pessoas.findByDataCad", query = "SELECT p FROM Pessoas p WHERE p.dataCad = :dataCad"),
    @NamedQuery(name = "Pessoas.findByNascimento", query = "SELECT p FROM Pessoas p WHERE p.nascimento = :nascimento"),
    @NamedQuery(name = "Pessoas.findBySemana", query = "SELECT p FROM Pessoas p "
            + "WHERE p.nascimento BETWEEN ?1 and ?2"),
    @NamedQuery(name = "Pessoas.findByProfissao", query = "SELECT p FROM Pessoas p WHERE p.profissao = :profissao"),
    @NamedQuery(name = "Pessoas.findByEmail", query = "SELECT p FROM Pessoas p WHERE p.email = :email"),
    @NamedQuery(name = "Pessoas.findByMensal", query = "SELECT p FROM Pessoas p WHERE p.mensal = :mensal"),
    @NamedQuery(name = "Pessoas.findByValor", query = "SELECT p FROM Pessoas p WHERE p.valor = :valor"),
    @NamedQuery(name = "Pessoas.findByCont", query = "SELECT p FROM Pessoas p WHERE p.cont = :cont"),
    @NamedQuery(name = "Pessoas.findByCep", query = "SELECT p FROM Pessoas p WHERE p.cep = :cep"),
    @NamedQuery(name = "Pessoas.findByLogradouro", query = "SELECT p FROM Pessoas p WHERE p.logradouro = :logradouro"),
    @NamedQuery(name = "Pessoas.findByNumero", query = "SELECT p FROM Pessoas p WHERE p.numero = :numero"),
    @NamedQuery(name = "Pessoas.findByBairro", query = "SELECT p FROM Pessoas p WHERE p.bairro = :bairro"),
    @NamedQuery(name = "Pessoas.findByCidade", query = "SELECT p FROM Pessoas p WHERE p.cidade = :cidade"),
    @NamedQuery(name = "Pessoas.findByUf", query = "SELECT p FROM Pessoas p WHERE p.uf = :uf"),
    @NamedQuery(name = "Pessoas.findByExpectativa", query = "SELECT p FROM Pessoas p WHERE p.expectativa = :expectativa")})
public class Pessoas implements Serializable {

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "pessoas")
    private Pagamento pagamento;
    
    public static String FIND_CODIGO = "Pessoas.findByCodigo";
    public static String FIND_ALL = "Pessoas.findAll";
    public static String FIND_SEMANA = "Pessoas.findBySemana";
    public static String FIND_NOME = "Pessoas.findByNome";

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Basic(optional = false)
    @Column(name = "CNPJ")
    private int cnpj;
    @Column(name = "NOME")
    private String nome;
    @Column(name="ATIVO")
    private Boolean ativo = true;
    @Column(name = "TELEFONE")
    private String telefone;
    @Column(name = "DATA_CAD")
    @Temporal(TemporalType.DATE)
    private Date dataCad;
    @Column(name = "NASCIMENTO")
    @Temporal(TemporalType.DATE)
    private Date nascimento;
    @Column(name = "PROFISSAO")
    private String profissao;
    @Column(name = "EMAIL")
    private String email;
    @Basic(optional = false)
    @Column(name = "MENSAL")
    private Boolean mensal;
    // @Max(value=?)  @Min(value=?)
//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR")
    private Double valor;
    @Column(name = "CONT")
    private Integer cont;
    @Column(name = "CEP")
    private String cep;
    @Column(name = "LOGRADOURO")
    private String logradouro;
    @Column(name = "NUMERO")
    private String numero;
    @Column(name = "BAIRRO")
    private String bairro;
    @Column(name = "CIDADE")
    private String cidade;
    @Column(name = "UF")
    private String uf;
    @Column(name = "EXPECTATIVA")
    private String expectativa;

    public Pessoas() {
    }

    public Pessoas(Integer codigo) {
        this.codigo = codigo;
    }

    public Pessoas(Integer codigo, int cnpj, Boolean mensal) {
        this.codigo = codigo;
        this.cnpj = cnpj;
        this.mensal = mensal;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
    
    

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDataCad() {
        return dataCad;
    }

    public void setDataCad(Date dataCad) {
        this.dataCad = dataCad;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getMensal() {
        return mensal;
    }

    public void setMensal(Boolean mensal) {
        this.mensal = mensal;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getCont() {
        return cont;
    }

    public void setCont(Integer cont) {
        this.cont = cont;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getExpectativa() {
        return expectativa;
    }

    public void setExpectativa(String expectativa) {
        this.expectativa = expectativa;
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
        if (!(object instanceof Pessoas)) {
            return false;
        }
        Pessoas other = (Pessoas) object;
        if ((this.codigo == null && other.codigo != null) || 
                (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cajam2.Pessoas[ codigo=" + codigo + " ]";
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }
    
}
