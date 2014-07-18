package br.com.xkinfo.slc.Service;

import br.com.xkinfo.slc.Model.Usuario;
import java.util.ArrayList;

public interface IUsuarioService {

    public void inserirUsuario(String nome, String usuario, String senha, Usuario usuarioinclusao) throws Exception;

    public void alterarUsuario(int id, String nome, String usuario, String senha, Usuario usuarioalteracao) throws Exception;

    public void deletarUsuario(int id) throws Exception;

    public Usuario getUsuario(int id) throws Exception;

    public Usuario getUsuario(String nome) throws Exception;

    public ArrayList<Usuario> getUsuarios() throws Exception;

}
