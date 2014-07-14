package br.com.xkinfo.slc.DAO;

import br.com.xkinfo.slc.Model.Remessas;
import java.util.ArrayList;

public interface IRemessaDao {

    public void inserirRemessa(Remessas remessa);

    public void alterarRemessa(Remessas remessa);

    public void deletarRemessa(Remessas remessa);

    public Remessas getRemessa(int id);

    public Remessas getRemessa(String nome);

    public ArrayList<Remessas> getRemessas();
}
