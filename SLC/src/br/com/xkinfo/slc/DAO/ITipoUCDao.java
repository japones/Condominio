package br.com.xkinfo.slc.DAO;

import br.com.xkinfo.slc.Model.Tipouc;
import java.util.ArrayList;

public interface ITipoUCDao {

    public void inserirTipoUC(Tipouc tipoUC)throws Exception;

    public void alterarTipoUC(Tipouc tipoUC)throws Exception;

    public void deletarTipoUC(Tipouc tipoUC)throws Exception;

    public Tipouc getTipoUC(int id)throws Exception;

    public Tipouc getTipoUC(String nome)throws Exception;

    public ArrayList<Tipouc> getTiposUC()throws Exception;
}
