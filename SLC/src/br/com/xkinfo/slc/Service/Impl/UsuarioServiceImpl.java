package br.com.xkinfo.slc.Service.Impl;

import br.com.xkinfo.slc.DAO.ServiceFactoryDAO;
import br.com.xkinfo.slc.Model.Usuario;
import br.com.xkinfo.slc.Service.IUsuarioService;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class UsuarioServiceImpl implements IUsuarioService{

    @Override
    public void inserirUsuario(String nome, String usuario, String senha, Usuario usuarioinclusao) throws Exception {
        Date dataInclusao = new Date();
        Usuario usu = new Usuario();
        usu.setNome(nome);
        usu.setUsuario(usuario);
        usu.setSenha(senha);
        usu.setUsuarioinclusao(usuarioinclusao);
        usu.setDatainclusao(dataInclusao);
        
        if (nome.isEmpty()) {   // valida se o campo nome está preenchido;

            JOptionPane.showMessageDialog(null, "Favor preencher o nome.");

        } else if (usuario.isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Favor preencher o usuário.");
            
        } else if (senha.isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "Favor preencher a senha.");
            
        } else if (senha.length() < 3) {
            
            JOptionPane.showMessageDialog(null, "Favor preencher a senha com mais de 3 caracteres.");
            
        } else {                                  // se o campo preenchido, vai gravar no banco;

            ServiceFactoryDAO.getUsuarioDAO().inserirUsuario(usu);
            JOptionPane.showMessageDialog(null, "Registro inserido com sucesso!");

        }
        
    }

    @Override
    public void alterarUsuario(int id, String nome, String usuario, String senha, Usuario usuarioalteracao) throws Exception {
        Date dataAlteracao = new Date();
        Usuario usu = new Usuario();
        usu.setNome(nome);
        usu.setUsuario(usuario);
        usu.setSenha(senha);
        usu.setUsuarioinclusao(usuarioalteracao);
        usu.setDatainclusao(dataAlteracao);
        usu.setId(id);
        
        if (nome.isEmpty()) {   // valida se o campo nome está preenchido;

            JOptionPane.showMessageDialog(null, "Favor preencher o nome.");

        } else if (usuario.isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Favor preencher o usuário.");
            
        } else if (senha.isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "Favor preencher a senha.");
            
        } else if (senha.length() < 3) {
            
            JOptionPane.showMessageDialog(null, "Favor preencher a senha com mais de 3 caracteres.");
            
        } else {                                  // se o campo preenchido, vai gravar no banco;

            ServiceFactoryDAO.getUsuarioDAO().alterarUsuario(usu);
            JOptionPane.showMessageDialog(null, "Registro alterado com sucesso!");

        }
        
    }

    @Override
    public void deletarUsuario(int id) throws Exception {
        Usuario usu = new Usuario();
        usu.setId(id);
        int escolha;

        escolha = JOptionPane.showConfirmDialog(null, "Deseja apagar o registro?");

        if (escolha == 1) {

            ServiceFactoryDAO.getUsuarioDAO().deletarUsuario(usu);
            JOptionPane.showMessageDialog(null, "Registro excluído com sucesso!");

        }
        
    }

    @Override
    public Usuario getUsuario(int id) throws Exception {
        Usuario usu = new Usuario();

        usu = ServiceFactoryDAO.getUsuarioDAO().getUsuario(id);
        
        return usu;
        
    }

    @Override
    public Usuario getUsuario(String nome) throws Exception {
        Usuario usu = new Usuario();
        
        usu = ServiceFactoryDAO.getUsuarioDAO().getUsuario(nome);
        
        return usu;
        
    }

    @Override
    public ArrayList<Usuario> getUsuarios() throws Exception {
        ArrayList<Usuario> lista;
        
        lista = ServiceFactoryDAO.getUsuarioDAO().getUsuarios();
        
        return lista;
        
    }
    
}
