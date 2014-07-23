package br.com.xkinfo.slc.Service;

import br.com.xkinfo.slc.Model.TipoMedidor;
import br.com.xkinfo.slc.Model.Usuario;
import java.util.ArrayList;

public interface ITipoMedidorService {

    public void inserirTipoMedidor(String descricao, Usuario usuarioinclusao) throws Exception;

    public void alterarTipoMedidor(int id, String descricao, Usuario usuarioAlteracao) throws Exception;

    public void deletarTipoMedidor(int id) throws Exception;

    public TipoMedidor getTipoMedidor(int id) throws Exception;

    public TipoMedidor getTipoMedidor(String nome) throws Exception;

    public ArrayList<TipoMedidor> getTipoMedidores() throws Exception;

}
