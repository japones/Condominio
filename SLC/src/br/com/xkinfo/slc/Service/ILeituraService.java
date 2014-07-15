package br.com.xkinfo.slc.Service;

import br.com.xkinfo.slc.Model.Leitura;
import java.util.ArrayList;

public interface ILeituraService {

    public void inserirLeitura(Leitura leitura);

    public void alterarLeitura(Leitura leitura);

    public void deletarLeitura(Leitura leitura);

    public Leitura getLeitura(int id);

    public Leitura getLeitura(String nome);

    public ArrayList<Leitura> getLeituras();

}
