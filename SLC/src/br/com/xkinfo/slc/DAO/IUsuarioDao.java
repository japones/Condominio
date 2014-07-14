package br.com.xkinfo.slc.DAO;

import br.com.xkinfo.slc.Model.Usuario;
import java.util.ArrayList;

public interface IUsuarioDao {

<<<<<<< HEAD
    public void inserirUsuario(Usuario usuario) throws Exception;

    public void alterarUsuario(Usuario usuario) throws Exception;

    public void deletarUsuario(Usuario usuario) throws Exception;

    public Usuario getUsuario(int id) throws Exception;

    public Usuario getUsuario(String nome) throws Exception;

    public ArrayList<Usuario> getUsuarios() throws Exception;
=======
    public void inserirUsuario(Usuario usuario);

    public void alterarUsuario(Usuario usuario);

    public void deletarUsuario(Usuario usuario);

    public Usuario getUsuario(int id);

    public Usuario getUsuario(String nome);

    public ArrayList<Usuario> getUsuarios();
>>>>>>> FETCH_HEAD
}
