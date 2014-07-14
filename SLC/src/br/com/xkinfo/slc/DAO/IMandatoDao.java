package br.com.xkinfo.slc.DAO;

import br.com.xkinfo.slc.Model.Mandatos;
import java.util.ArrayList;

public interface IMandatoDao {

    public void inserirMandato(Mandatos mandato);

    public void alterarMandato(Mandatos mandato);

    public void deletarMandato(Mandatos mandato);

    public Mandatos getMandato(int id);

    public Mandatos getMandato(String nome);

    public ArrayList<Mandatos> getMandatos();
}
