package br.com.xkinfo.slc.Service;

import br.com.xkinfo.slc.Model.Condominio;
import br.com.xkinfo.slc.Model.Usuario;
import java.util.ArrayList;
import java.util.Date;

public interface ICondominioService {

    public void inserirCondominio(String nome, String cnpj, String endereco, String email, Usuario usuarioinclusao) throws Exception;

    public void alterarCondominio(int id, String nome, String cnpj, String endereco, String email, Usuario usuarioalteracao) throws Exception;

    public void deletarCondominio(int id) throws Exception;

    public Condominio getCondominio(int id) throws Exception;

    public Condominio getCondominio(String nome) throws Exception;

    public ArrayList<Condominio> getCondominios() throws Exception;

}
