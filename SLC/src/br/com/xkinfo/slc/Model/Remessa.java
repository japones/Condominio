package br.com.xkinfo.slc.Model;
// Generated 13/07/2014 22:14:15 by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * Remessas generated by hbm2java
 */
public class Remessa  implements java.io.Serializable {


     private Integer id;
     private UnidadeConsumidora unidadeconsumidora;
     private float remessasanterior;
     private Date dataleituraanterior;
     private int consumo;
     private Usuario usuarioinclusao;
     private Date datainclusao;
     private Usuario usuarioalteracao;
     private Date dataalteracao;

    public Remessa() {
    }
	
    public Remessa(UnidadeConsumidora unidadeconsumidora, float remessasanterior, Date dataleituraanterior, int consumo, Usuario usuarioinclusao, Date datainclusao) {
        this.unidadeconsumidora = unidadeconsumidora;
        this.remessasanterior = remessasanterior;
        this.dataleituraanterior = dataleituraanterior;
        this.consumo = consumo;
        this.usuarioinclusao = usuarioinclusao;
        this.datainclusao = datainclusao;
    }
    
    public Remessa(UnidadeConsumidora unidadeconsumidora, float remessasanterior, Date dataleituraanterior, int consumo, Usuario usuarioinclusao, Date datainclusao, Usuario usuarioalteracao, Date dataalteracao) {
       this.unidadeconsumidora = unidadeconsumidora;
       this.remessasanterior = remessasanterior;
       this.dataleituraanterior = dataleituraanterior;
       this.consumo = consumo;
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
    
    public UnidadeConsumidora getUnidadeconsumidora() {
        return this.unidadeconsumidora;
    }
    
    public void setUnidadeconsumidora(UnidadeConsumidora unidadeconsumidora) {
        this.unidadeconsumidora = unidadeconsumidora;
    }
    
    public float getRemessasanterior() {
        return this.remessasanterior;
    }
    
    public void setRemessasanterior(float remessasanterior) {
        this.remessasanterior = remessasanterior;
    }
    
    public Date getDataleituraanterior() {
        return this.dataleituraanterior;
    }
    
    public void setDataleituraanterior(Date dataleituraanterior) {
        this.dataleituraanterior = dataleituraanterior;
    }
    
    public int getConsumo() {
        return this.consumo;
    }
    
    public void setConsumo(int consumo) {
        this.consumo = consumo;
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


