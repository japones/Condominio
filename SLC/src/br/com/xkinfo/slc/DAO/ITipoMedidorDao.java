package br.com.xkinfo.slc.DAO;

import br.com.xkinfo.slc.Model.Tipomedidores;
import java.util.ArrayList;

public interface ITipoMedidorDao {

    public void inserirTipoMedidor(Tipomedidores tipoMedidor);

    public void alterarTipoMedidor(Tipomedidores tipoMedidor);

    public void deletarTipoMedidor(Tipomedidores tipoMedidor);

    public Tipomedidores getTipoMedidor(int id);

    public Tipomedidores getTipoMedidor(String nome);

    public ArrayList<Tipomedidores> getTipoMedidores();
}
