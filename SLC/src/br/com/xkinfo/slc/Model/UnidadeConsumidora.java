/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.xkinfo.slc.Model;

import java.util.Date;

/**
 *
 * @author Alexandre
 */
public class UnidadeConsumidora implements java.io.Serializable {

    private Integer id;
     private Condominio condominio;
     private int tipouc;
     private boolean ultimonovel;
     private Integer nivelsuperior;
     private int numero;
     private Date dataultimaleitura;
     private Usuario usuarioinclusao;
     private Date datainclusao;
     private Usuario usuarioalteracao;
     private Date dataalteracao;

    public UnidadeConsumidora() {
    }
	
    public UnidadeConsumidora(Condominio condominio, int tipouc, boolean ultimonovel, int numero, Usuario usuarioinclusao, Date datainclusao) {
        this.condominio = condominio;
        this.tipouc = tipouc;
        this.ultimonovel = ultimonovel;
        this.numero = numero;
        this.usuarioinclusao = usuarioinclusao;
    }
        
    public UnidadeConsumidora(Condominio condominio, int tipouc, boolean ultimonovel, Integer nivelsuperior, int numero, Date dataultimaleitura, Usuario usuarioinclusao, Date datainclusao, Usuario usuarioalteracao, Date dataalteracao) {
       this.condominio = condominio;
       this.tipouc = tipouc;
       this.ultimonovel = ultimonovel;
       this.nivelsuperior = nivelsuperior;
       this.numero = numero;
       this.dataultimaleitura = dataultimaleitura;
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
    
    public Condominio getCondominio() {
        return this.condominio;
    }
    
    public void setCondominio(Condominio condominio) {
        this.condominio = condominio;
    }
    
    public int getTipouc() {
        return this.tipouc;
    }
    
    public void setTipouc(int tipouc) {
        this.tipouc = tipouc;
    }
    
    public boolean isUltimonovel() {
        return this.ultimonovel;
    }
    
    public void setUltimonovel(boolean ultimonovel) {
        this.ultimonovel = ultimonovel;
    }
    
    public Integer getNivelsuperior() {
        return this.nivelsuperior;
    }
    
    public void setNivelsuperior(Integer nivelsuperior) {
        this.nivelsuperior = nivelsuperior;
    }
    
    public int getNumero() {
        return this.numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public Date getDataultimaleitura() {
        return this.dataultimaleitura;
    }
    
    public void setDataultimaleitura(Date dataultimaleitura) {
        this.dataultimaleitura = dataultimaleitura;
    }
    
    public Usuario getUsuarioinclusao() {
        return this.usuarioinclusao;
    }
    
    public void setUsuarioinclusao(Usuario usuarioinclusao) {
        this.usuarioinclusao = usuarioinclusao;
    }
    
    public Date getDatainclusao() {
        return this.datainclusao;
    }
    
    public void setDatainclusao(Date datainclusao) {
        this.datainclusao = datainclusao;
    }
    
    public Usuario getUsuarioalteracao() {
        return this.usuarioalteracao;
    }
    
    public void setUsuarioalteracao(Usuario usuarioalteracao) {
        this.usuarioalteracao = usuarioalteracao;
    }
    
    public Date getDataalteracao() {
        return this.dataalteracao;
    }
    
    public void setDataalteracao(Date dataalteracao) {
        this.dataalteracao = dataalteracao;
    }

}
