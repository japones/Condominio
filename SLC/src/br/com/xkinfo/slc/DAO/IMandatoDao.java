package br.com.xkinfo.slc.DAO;

import br.com.xkinfo.slc.Model.Mandato;
import java.util.ArrayList;

public interface IMandatoDao {

    public void inserirMandato(Mandato mandato)throws Exception;

    public void alterarMandato(Mandato mandato)throws Exception;

    public void deletarMandato(Mandato mandato)throws Exception;

    public Mandato getMandato(int id)throws Exception;

    public Mandato getMandato(String nome)throws Exception;

    public ArrayList<Mandato> getMandatos()throws Exception;
}
