package br.com.xkinfo.slc.DAO;

import br.com.xkinfo.slc.Model.Retorno;
import java.util.ArrayList;

public interface IRetornoDao {

    public void inserirRetorno(Retorno retorno);

    public void alterarRetorno(Retorno retorno);

    public void deletarRetorno(Retorno retorno);

    public Retorno getRetorno(int id);

    public Retorno getRetorno(String nome);

    public ArrayList<Retorno> getRetornos();
}
