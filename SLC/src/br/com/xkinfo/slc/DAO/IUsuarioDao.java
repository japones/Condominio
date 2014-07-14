package br.com.xkinfo.slc.DAO;

import br.com.xkinfo.slc.Model.Usuarios;
import java.util.ArrayList;

public interface IUsuarioDao {

    public void inserirUsuario(Usuarios usuario)throws Exception;

    public void alterarUsuario(Usuarios usuario)throws Exception;

    public void deletarUsuario(Usuarios usuario)throws Exception;

    public Usuarios getUsuario(int id)throws Exception;

    public Usuarios getUsuario(String nome)throws Exception;

    public ArrayList<Usuarios> getUsuarios()throws Exception;
}
