package br.com.xkinfo.slc.DAO;

import br.com.xkinfo.slc.Model.Abastecimento;
import java.util.ArrayList;

public interface IAbastecimentoDao {

    public void inserirAbastecimento(Abastecimento abastecimento) throws Exception;

    public void alterarAbastecimento(Abastecimento abastecimento)throws Exception;

    public void deletarAbastecimento(Abastecimento abastecimento)throws Exception;

    public Abastecimento getAbastecimento(int id)throws Exception;

    public Abastecimento getAbastecimento(String nome)throws Exception;

    public ArrayList<Abastecimento> getAbastecimentos()throws Exception;
}
