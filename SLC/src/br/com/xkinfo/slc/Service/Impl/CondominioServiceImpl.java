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
        condominio.setUsuarioinclusao(usuarioinclusao);
        condominio.setDatainclusao(dataInclusao);
        condominio.setDatainclusao(dataInclusao);
        
        if (nome.equals(null) || nome == ""){   // valida se o campo nome está preenchido;
            
            JOptionPane.showMessageDialog(null, "Favor preencher o nome do Condomínio.");
        
        }else{                                  // se o campo preenchido, vai gravar no banco;
            
            ServiceFactoryDAO.getCondominioDAO().inserirCondominio(condominio);
            JOptionPane.showMessageDialog(null, "Registro incluído com sucesso!");
            
        }
    }

    @Override
    public void alterarCondominio(int id, String nome, String cnpj, String endereco, String email, Usuario usuarioAlteracao) throws Exception {
        Date dataAlteracao = new Date();  // obtem a data do sistema
        Condominio condominio = new Condominio(); // cria uma instância Condominio e popula
        condominio.setNome(nome);
        condominio.setCnpj(cnpj);
        condominio.setEndereco(endereco);
        condominio.setEmail(email);
        condominio.setUsuarioalteracao(usuarioAlteracao);
        condominio.setDataalteracao(dataAlteracao);
        condominio.setId(id);
        
        if (nome.equals(null) || nome == "") {   // valida se o campo nome está preenchido;
            
            JOptionPane.showMessageDialog(null, "Favor preencher o nome do Condomínio.");
            
        }else{                                  // se o campo estiver preenchido, vai gravar no banco;
            
            ServiceFactoryDAO.getCondominioDAO().alterarCondominio(condominio);
            JOptionPane.showMessageDialog(null, "Registro alterado com sucesso!");
            
        }
        
    }

    @Override
    public void deletarCondominio(int id) throws Exception {
        Condominio condominio = new Condominio();
        condominio.setId(id);
        int escolha;
        
        escolha = JOptionPane.showConfirmDialog(null, "Deseja apagar o registro?");
        
        if (escolha == 1) {

            ServiceFactoryDAO.getCondominioDAO().deletarCondominio(condominio);
            JOptionPane.showMessageDialog(null, "Registro excluído com sucesso!");
            
        }
        
    }

    @Override
    public Condominio getCondominio(int id) throws Exception {
        Condominio condominio;
        
        condominio = ServiceFactoryDAO.getCondominioDAO().getCondominio(id);
        
        return condominio;
        
    }

    @Override
    public Condominio getCondominio(String nome) throws Exception {
        Condominio condominio = null;
        
        if (nome.isEmpty() || nome.length() < 3) {
            
            JOptionPane.showMessageDialog(null, "Favor inserir 3 caracteres para pesquisa!");
            
        } else{
            
            condominio = ServiceFactoryDAO.getCondominioDAO().getCondominio(nome);
            
        }
        
        return condominio;
        
    }

    @Override
    public ArrayList<Condominio> getCondominios() throws Exception {
        ArrayList<Condominio> lista;
        
        lista = ServiceFactoryDAO.getCondominioDAO().getCondominios();
        
        return lista;
        
    }

}
