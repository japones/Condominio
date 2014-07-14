package br.com.xkinfo.slc.DAO;

import br.com.xkinfo.slc.Model.Condominio;
import java.util.ArrayList;

public interface ICondominioDao {
    public void inserirCondominio(Condominio condominio);

    public void alterarCondominio(Condominio condominio);

    public void deletarCondominio(Condominio condominio);

    public Condominio getCondominio(int id);

    public Condominio getCondominio(String nome);

    public ArrayList<Condominio> getCondominios();
}
