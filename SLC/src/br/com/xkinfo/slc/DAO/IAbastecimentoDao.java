package br.com.xkinfo.slc.DAO;

import br.com.xkinfo.slc.Model.Abastecimentos;
import java.util.ArrayList;

public interface IAbastecimentoDao {

    public void inserirAbastecimento(Abastecimentos abastecimento) throws Exception;

    public void alterarAbastecimento(Abastecimentos abastecimento)throws Exception;

    public void deletarAbastecimento(Abastecimentos abastecimento)throws Exception;

    public Abastecimentos getAbastecimento(int id)throws Exception;

    public Abastecimentos getAbastecimento(String nome)throws Exception;

    public ArrayList<Abastecimentos> getAbastecimentos()throws Exception;
}
