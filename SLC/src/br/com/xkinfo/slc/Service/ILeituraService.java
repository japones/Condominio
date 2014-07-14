package br.com.xkinfo.slc.Service;

import br.com.xkinfo.slc.Model.Leituras;
import java.util.ArrayList;

public interface ILeituraService {

    public void inserirLeitura(Leituras leitura);

    public void alterarLeitura(Leituras leitura);

    public void deletarLeitura(Leituras leitura);

    public Leituras getLeitura(int id);

    public Leituras getLeitura(String nome);

    public ArrayList<Leituras> getLeituras();

}
