package br.com.xkinfo.slc.DAO;

import br.com.xkinfo.slc.Model.Leitura;
import java.util.ArrayList;

public interface ILeituraDao {

    public void inserirLeitura(Leitura leitura)throws Exception;

    public void alterarLeitura(Leitura leitura)throws Exception;

    public void deletarLeitura(Leitura leitura)throws Exception;

    public Leitura getLeitura(int id)throws Exception;

    public Leitura getLeitura(String nome)throws Exception;

    public ArrayList<Leitura> getLeituras()throws Exception;
}
