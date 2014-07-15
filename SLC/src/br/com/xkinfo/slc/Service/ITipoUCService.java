package br.com.xkinfo.slc.Service;

import br.com.xkinfo.slc.Model.Tipouc;
import java.util.ArrayList;

public interface ITipoUCService {

    public void inserirTipoUC(Tipouc tipoUC);

    public void alterarTipoUC(Tipouc tipoUC);

    public void deletarTipoUC(Tipouc tipoUC);

    public Tipouc getTipoUC(int id);

    public Tipouc getTipoUC(String nome);

    public ArrayList<Tipouc> getTiposUC();

}
