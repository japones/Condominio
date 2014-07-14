package br.com.xkinfo.slc.Service;

import br.com.xkinfo.slc.Model.Retorno;
import java.util.ArrayList;

public interface IRetornoService {

    public void inserirRetorno(Retorno retorno);

    public void alterarRetorno(Retorno retorno);

    public void deletarRetorno(Retorno retorno);

    public Retorno getRetorno(int id);

    public Retorno getRetorno(String nome);

    public ArrayList<Retorno> getRetornos();

}
