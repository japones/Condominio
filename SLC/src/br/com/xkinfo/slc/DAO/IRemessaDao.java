package br.com.xkinfo.slc.DAO;

import br.com.xkinfo.slc.Model.Remessa;
import java.util.ArrayList;

public interface IRemessaDao {

    public void inserirRemessa(Remessa remessa)throws Exception;

    public void alterarRemessa(Remessa remessa)throws Exception;

    public void deletarRemessa(Remessa remessa)throws Exception;

    public Remessa getRemessa(int id)throws Exception;

    public Remessa getRemessa(String nome)throws Exception;

    public ArrayList<Remessa> getRemessas()throws Exception;
}
