package br.com.xkinfo.slc.DAO;

import br.com.xkinfo.slc.Model.Condominio;
import java.util.ArrayList;

public interface ICondominioDao {

    public void inserirCondominio(Condominio condominio)throws Exception;

    public void alterarCondominio(Condominio condominio)throws Exception;

    public void deletarCondominio(Condominio condominio)throws Exception;

    public Condominio getCondominio(int id)throws Exception;

    public Condominio getCondominio(String nome)throws Exception;

    public ArrayList<Condominio> getCondominios()throws Exception;
}
