package br.com.xkinfo.slc.Service;

import br.com.xkinfo.slc.Model.Abastecimento;
import java.util.ArrayList;

public interface IAbastecimentoService {

    public void inserirAbastecimento(Abastecimento abastecimento);

    public void alterarAbastecimento(Abastecimento abastecimento);

    public void deletarAbastecimento(Abastecimento abastecimento);

    public Abastecimento getAbastecimento(int id);

    public Abastecimento getAbastecimento(String nome);

    public ArrayList<Abastecimento> getAbastecimentos();
}
