package br.com.xkinfo.slc.Service;

import br.com.xkinfo.slc.Model.Usuario;
import java.util.ArrayList;

public interface IUsuarioService {

    public void inserirUsuario(Usuario usuario);

    public void alterarUsuario(Usuario usuario);

    public void deletarUsuario(Usuario usuario);

    public Usuario getUsuario(int id);

    public Usuario getUsuario(String nome);

    public ArrayList<Usuario> getUsuarios();

}
