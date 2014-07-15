package br.com.xkinfo.slc.Service;

import br.com.xkinfo.slc.Model.Mandato;
import java.util.ArrayList;

public interface IMandatoService {

    public void inserirMandato(Mandato mandato);

    public void alterarMandato(Mandato mandato);

    public void deletarMandato(Mandato mandato);

    public Mandato getMandato(int id);

    public Mandato getMandato(String nome);

    public ArrayList<Mandato> getMandatos();

}
