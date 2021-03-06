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
public class TipoMedidor implements java.io.Serializable {
    
    private Integer id;
     private String descricao;
     private Usuario usuarioinclusao;
     private Date datainclusao;
     private Usuario usuarioalteracao;
     private Date dataalteracao;

    public TipoMedidor() {
    }
	
    public TipoMedidor(String descricao, Usuario usuarioinclusao, Date datainclusao) {
        this.descricao = descricao;
        this.usuarioinclusao = usuarioinclusao;
        this.datainclusao = datainclusao;
    }
    
    public TipoMedidor(String descricao, Usuario usuarioinclusao, Date datainclusao, Usuario usuarioalteracao, Date dataalteracao) {
       this.descricao = descricao;
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
    
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
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