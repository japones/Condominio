package br.com.xkinfo.slc.DAO;

import br.com.xkinfo.slc.Model.Remessas;
import java.util.ArrayList;

public interface IRemessaDao {

    public void inserirRemessa(Remessas remessa)throws Exception;

    public void alterarRemessa(Remessas remessa)throws Exception;

    public void deletarRemessa(Remessas remessa)throws Exception;

    public Remessas getRemessa(int id)throws Exception;

    public Remessas getRemessa(String nome)throws Exception;

    public ArrayList<Remessas> getRemessas()throws Exception;
}
