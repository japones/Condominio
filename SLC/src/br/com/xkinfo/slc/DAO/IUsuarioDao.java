package br.com.xkinfo.slc.DAO;

import br.com.xkinfo.slc.Model.Usuario;
import java.util.ArrayList;

public interface IUsuarioDao {

    public void inserirUsuario(Usuario usuario);

    public void alterarUsuario(Usuario usuario);

    public void deletarUsuario(Usuario usuario);

    public Usuario getUsuario(int id);

    public Usuario getUsuario(String nome);

    public ArrayList<Usuario> getUsuarios();
}
