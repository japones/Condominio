package br.com.xkinfo.slc.Service;

import br.com.xkinfo.slc.Model.Tipomedidor;
import java.util.ArrayList;

public interface ITipoMedidorService {

    public void inserirTipoMedidor(Tipomedidor tipoMedidor);

    public void alterarTipoMedidor(Tipomedidor tipoMedidor);

    public void deletarTipoMedidor(Tipomedidor tipoMedidor);

    public Tipomedidor getTipoMedidor(int id);

    public Tipomedidor getTipoMedidor(String nome);

    public ArrayList<Tipomedidor> getTipoMedidores();

}
