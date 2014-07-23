package br.com.xkinfo.slc.Service;

import br.com.xkinfo.slc.Model.Tipouc;
import br.com.xkinfo.slc.Model.Usuario;
import java.util.ArrayList;

public interface ITipoUCService {

    public void inserirTipoUC(String nome, Usuario usuarioinclusao) throws Exception;

    public void alterarTipoUC(int id, String nome, Usuario usuarioalteracao) throws Exception;

    public void deletarTipoUC(int id) throws Exception;

    public Tipouc getTipoUC(int id) throws Exception;

    public Tipouc getTipoUC(String nome) throws Exception;

    public ArrayList<Tipouc> getTiposUC() throws Exception;

}
