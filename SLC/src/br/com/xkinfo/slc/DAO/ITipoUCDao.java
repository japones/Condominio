package br.com.xkinfo.slc.DAO;

import br.com.xkinfo.slc.Model.Tiposuc;
import java.util.ArrayList;

public interface ITipoUCDao {

    public void inserirTipoUC(Tiposuc tipoUC)throws Exception;

    public void alterarTipoUC(Tiposuc tipoUC)throws Exception;

    public void deletarTipoUC(Tiposuc tipoUC)throws Exception;

    public Tiposuc getTipoUC(int id)throws Exception;

    public Tiposuc getTipoUC(String nome)throws Exception;

    public ArrayList<Tiposuc> getTiposUC()throws Exception;
}
