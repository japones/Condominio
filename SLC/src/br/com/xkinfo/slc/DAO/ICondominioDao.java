package br.com.xkinfo.slc.DAO;

import br.com.xkinfo.slc.Model.Condominios;
import java.util.ArrayList;

public interface ICondominioDao {
    public void inserirCondominio(Condominios condominio)throws Exception;

    public void alterarCondominio(Condominios condominio)throws Exception;

    public void deletarCondominio(Condominios condominio)throws Exception;

    public Condominios getCondominio(int id)throws Exception;

    public Condominios getCondominio(String nome)throws Exception;

    public ArrayList<Condominios> getCondominios()throws Exception;
}
