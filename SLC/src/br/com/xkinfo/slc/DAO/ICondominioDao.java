package br.com.xkinfo.slc.DAO;

import br.com.xkinfo.slc.Model.Condominio;
import java.util.ArrayList;

public interface ICondominioDao {
<<<<<<< HEAD

    public void inserirCondominio(Condominio condominio)throws Exception;

    public void alterarCondominio(Condominio condominio)throws Exception;

    public void deletarCondominio(Condominio condominio)throws Exception;

    public Condominio getCondominio(int id)throws Exception;

    public Condominio getCondominio(String nome)throws Exception;

    public ArrayList<Condominio> getCondominios()throws Exception;
=======
    public void inserirCondominio(Condominio condominio);

    public void alterarCondominio(Condominio condominio);

    public void deletarCondominio(Condominio condominio);

    public Condominio getCondominio(int id);

    public Condominio getCondominio(String nome);

    public ArrayList<Condominio> getCondominios();
>>>>>>> FETCH_HEAD
}
