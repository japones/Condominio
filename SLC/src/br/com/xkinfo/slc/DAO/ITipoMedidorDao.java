package br.com.xkinfo.slc.DAO;

import br.com.xkinfo.slc.Model.Tipomedidores;
import java.util.ArrayList;

public interface ITipoMedidorDao {

    public void inserirTipoMedidor(Tipomedidores tipoMedidor)throws Exception;

    public void alterarTipoMedidor(Tipomedidores tipoMedidor)throws Exception;

    public void deletarTipoMedidor(Tipomedidores tipoMedidor)throws Exception;

    public Tipomedidores getTipoMedidor(int id)throws Exception;

    public Tipomedidores getTipoMedidor(String nome)throws Exception;

    public ArrayList<Tipomedidores> getTipoMedidores()throws Exception;
}
