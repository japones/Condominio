package br.com.xkinfo.slc.Service;

import br.com.xkinfo.slc.Model.TipoMedidor;
import java.util.ArrayList;

public interface ITipoMedidorService {

    public void inserirTipoMedidor(TipoMedidor tipoMedidor);

    public void alterarTipoMedidor(TipoMedidor tipoMedidor);

    public void deletarTipoMedidor(TipoMedidor tipoMedidor);

    public TipoMedidor getTipoMedidor(int id);

    public TipoMedidor getTipoMedidor(String nome);

    public ArrayList<TipoMedidor> getTipoMedidores();

}
