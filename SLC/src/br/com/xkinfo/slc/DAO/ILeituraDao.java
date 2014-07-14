package br.com.xkinfo.slc.DAO;

import br.com.xkinfo.slc.Model.Leituras;
import java.util.ArrayList;

public interface ILeituraDao {

    public void inserirLeitura(Leituras leitura)throws Exception;

    public void alterarLeitura(Leituras leitura)throws Exception;

    public void deletarLeitura(Leituras leitura)throws Exception;

    public Leituras getLeitura(int id)throws Exception;

    public Leituras getLeitura(String nome)throws Exception;

    public ArrayList<Leituras> getLeituras()throws Exception;
}
