package br.com.xkinfo.slc.Service;

import br.com.xkinfo.slc.Model.Mandatos;
import java.util.ArrayList;

public interface IMandatoService {

    public void inserirMandato(Mandatos mandato);

    public void alterarMandato(Mandatos mandato);

    public void deletarMandato(Mandatos mandato);

    public Mandatos getMandato(int id);

    public Mandatos getMandato(String nome);

    public ArrayList<Mandatos> getMandatos();

}
