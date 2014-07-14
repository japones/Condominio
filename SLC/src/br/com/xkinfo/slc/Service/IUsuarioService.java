package br.com.xkinfo.slc.Service;

import br.com.xkinfo.slc.Model.Usuarios;
import java.util.ArrayList;

public interface IUsuarioService {

    public void inserirUsuario(Usuarios usuario);

    public void alterarUsuario(Usuarios usuario);

    public void deletarUsuario(Usuarios usuario);

    public Usuarios getUsuario(int id);

    public Usuarios getUsuario(String nome);

    public ArrayList<Usuarios> getUsuarios();

}
