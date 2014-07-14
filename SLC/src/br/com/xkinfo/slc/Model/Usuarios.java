package br.com.xkinfo.slc.Model;
// Generated 13/07/2014 22:14:15 by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * Usuarios generated by hbm2java
 */
public class Usuarios  implements java.io.Serializable {


     private Integer id;
     private String nome;
     private String usuario;
     private String senha;
     private int usuarioinclusao;
     private Date datainclusao;
     private Integer usuarioalteracao;
     private Date dataalteracao;

    public Usuarios() {
    }

	
    public Usuarios(String nome, String usuario, String senha, int usuarioinclusao, Date datainclusao) {
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
        this.usuarioinclusao = usuarioinclusao;
        this.datainclusao = datainclusao;
    }
    public Usuarios(String nome, String usuario, String senha, int usuarioinclusao, Date datainclusao, Integer usuarioalteracao, Date dataalteracao) {
       this.nome = nome;
       this.usuario = usuario;
       this.senha = senha;
       this.usuarioinclusao = usuarioinclusao;
       this.datainclusao = datainclusao;
       this.usuarioalteracao = usuarioalteracao;
       this.dataalteracao = dataalteracao;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getSenha() {
        return this.senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public int getUsuarioinclusao() {
        return this.usuarioinclusao;
    }
    
    public void setUsuarioinclusao(int usuarioinclusao) {
        this.usuarioinclusao = usuarioinclusao;
    }
    public Date getDatainclusao() {
        return this.datainclusao;
    }
    
    public void setDatainclusao(Date datainclusao) {
        this.datainclusao = datainclusao;
    }
    public Integer getUsuarioalteracao() {
        return this.usuarioalteracao;
    }
    
    public void setUsuarioalteracao(Integer usuarioalteracao) {
        this.usuarioalteracao = usuarioalteracao;
    }
    public Date getDataalteracao() {
        return this.dataalteracao;
    }
    
    public void setDataalteracao(Date dataalteracao) {
        this.dataalteracao = dataalteracao;
    }




}


