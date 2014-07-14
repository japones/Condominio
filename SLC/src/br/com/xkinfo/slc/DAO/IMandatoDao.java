package br.com.xkinfo.slc.DAO;

import br.com.xkinfo.slc.Model.Mandatos;
import java.util.ArrayList;

public interface IMandatoDao {

    public void inserirMandato(Mandatos mandato)throws Exception;

    public void alterarMandato(Mandatos mandato)throws Exception;

    public void deletarMandato(Mandatos mandato)throws Exception;

    public Mandatos getMandato(int id)throws Exception;

    public Mandatos getMandato(String nome)throws Exception;

    public ArrayList<Mandatos> getMandatos()throws Exception;
}
