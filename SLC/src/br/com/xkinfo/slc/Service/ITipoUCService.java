package br.com.xkinfo.slc.Service;

import br.com.xkinfo.slc.Model.Tiposuc;
import java.util.ArrayList;

public interface ITipoUCService {

    public void inserirTipoUC(Tiposuc tipoUC);

    public void alterarTipoUC(Tiposuc tipoUC);

    public void deletarTipoUC(Tiposuc tipoUC);

    public Tiposuc getTipoUC(int id);

    public Tiposuc getTipoUC(String nome);

    public ArrayList<Tiposuc> getTiposUC();

}
