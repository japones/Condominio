package br.com.xkinfo.slc.DAO;

import br.com.xkinfo.slc.Model.TipoMedidor;
import java.util.ArrayList;

public interface ITipoMedidorDao {

    public void inserirTipoMedidor(TipoMedidor tipoMedidor)throws Exception;

    public void alterarTipoMedidor(TipoMedidor tipoMedidor)throws Exception;

    public void deletarTipoMedidor(TipoMedidor tipoMedidor)throws Exception;

    public TipoMedidor getTipoMedidor(int id)throws Exception;

    public TipoMedidor getTipoMedidor(String nome)throws Exception;

    public ArrayList<TipoMedidor> getTipoMedidores()throws Exception;
}
