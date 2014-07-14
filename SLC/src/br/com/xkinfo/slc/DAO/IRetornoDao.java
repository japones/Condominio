package br.com.xkinfo.slc.DAO;

import br.com.xkinfo.slc.Model.Retorno;
import java.util.ArrayList;

public interface IRetornoDao {

    public void inserirRetorno(Retorno retorno)throws Exception;

    public void alterarRetorno(Retorno retorno)throws Exception;

    public void deletarRetorno(Retorno retorno)throws Exception;

    public Retorno getRetorno(int id)throws Exception;

    public Retorno getRetorno(String nome)throws Exception;

    public ArrayList<Retorno> getRetornos()throws Exception;
}
