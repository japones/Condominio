package br.com.xkinfo.slc.DAO;

import br.com.xkinfo.slc.Model.Tipomedidor;
import java.util.ArrayList;

public interface ITipoMedidorDao {

    public void inserirTipoMedidor(Tipomedidor tipoMedidor)throws Exception;

    public void alterarTipoMedidor(Tipomedidor tipoMedidor)throws Exception;

    public void deletarTipoMedidor(Tipomedidor tipoMedidor)throws Exception;

    public Tipomedidor getTipoMedidor(int id)throws Exception;

    public Tipomedidor getTipoMedidor(String nome)throws Exception;

    public ArrayList<Tipomedidor> getTipoMedidores()throws Exception;
}
