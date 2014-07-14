package br.com.xkinfo.slc.DAO;

import br.com.xkinfo.slc.Model.Condominios;
import java.util.ArrayList;

public interface ICondominioDao {
    public void inserirCondominio(Condominios condominio);

    public void alterarCondominio(Condominios condominio);

    public void deletarCondominio(Condominios condominio);

    public Condominios getCondominio(int id);

    public Condominios getCondominio(String nome);

    public ArrayList<Condominios> getCondominios();
}
