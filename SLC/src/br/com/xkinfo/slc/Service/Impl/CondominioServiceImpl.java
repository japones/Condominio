package br.com.xkinfo.slc.Service.Impl;

import br.com.xkinfo.slc.DAO.ServiceFactoryDAO;
import br.com.xkinfo.slc.Model.Condominio;
import br.com.xkinfo.slc.Model.Usuario;
import br.com.xkinfo.slc.Service.ICondominioService;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class CondominioServiceImpl implements ICondominioService {

   
    @Override
    public void inserirCondominio(String nome, String cnpj, String endereco, String email, Usuario usuarioinclusao) throws Exception {
        Date dataInclusao = new Date();  // obtem a data do sistema
        Condominio condominio = new Condominio(); // cria uma instância Condominio e popula
        condominio.setNome(nome);
        condominio.setCnpj(cnpj);
        condominio.setEndereco(endereco);
        condominio.setEmail(email);
        //condominio.setUsuarioinclusao(usuarioinclusao);
        condominio.setDatainclusao(dataInclusao);
        
        if (nome.equals(null) || nome == ""){   // valida se o campo nome está preenchido;
            
            JOptionPane.showMessageDialog(null, "Favor preencher o nome do Condomínio.");
        
        }else{                                  // se campo preenchido, vai gravar no banco;
            
            ServiceFactoryDAO.getCondominioDAO().inserirCondominio(condominio);
            JOptionPane.showMessageDialog(null, "Condominio incluído com sucesso!");
            
        }
    }

    @Override
    public void alterarCondominio(int id, String nome, String cnpj, String endereco, String email, Usuario usuarioalteracao) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletarCondominio(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Condominio getCondominio(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Condominio getCondominio(String nome) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Condominio> getCondominios() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
