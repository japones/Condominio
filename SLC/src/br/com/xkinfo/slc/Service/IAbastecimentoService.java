package br.com.xkinfo.slc.Service;

import br.com.xkinfo.slc.Model.Abastecimentos;
import java.util.ArrayList;

public interface IAbastecimentoService {

    public void inserirAbastecimento(Abastecimentos abastecimento);

    public void alterarAbastecimento(Abastecimentos abastecimento);

    public void deletarAbastecimento(Abastecimentos abastecimento);

    public Abastecimentos getAbastecimento(int id);

    public Abastecimentos getAbastecimento(String nome);

    public ArrayList<Abastecimentos> getAbastecimentos();
}
