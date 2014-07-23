package br.com.xkinfo.slc.Service.Impl;

import br.com.xkinfo.slc.DAO.ServiceFactoryDAO;
import br.com.xkinfo.slc.Model.Competencia;
import br.com.xkinfo.slc.Model.Condominio;
import br.com.xkinfo.slc.Model.Usuario;
import br.com.xkinfo.slc.Service.ICompetenciaService;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class CompetenciaServiceImpl implements ICompetenciaService {

    @Override
    public void inserirCompetencia(Condominio condominio, Date competencia, boolean situacao, Usuario usuarioinclusao) throws Exception  {
        Date dataInclusao = new Date();
        Competencia comp = new Competencia();
        comp.setCondominio(condominio);
        comp.setCompetencia(competencia);
        comp.setSituacao(situacao);
        comp.setUsuarioinclusao(usuarioinclusao);
        comp.setDatainclusao(dataInclusao);
        
        if (competencia.equals(null)){   // valida se o campo nome está preenchido;
            
            JOptionPane.showMessageDialog(null, "Favor preencher o campo Competência.");
        
        }else{                                  // se o campo preenchido, vai gravar no banco;
            
            ServiceFactoryDAO.getCompetenciaDAO().inserirCompetencia(comp);
            JOptionPane.showMessageDialog(null, "Registro incluído com sucesso!");
            
        }
        
    }

    @Override
    public void alterarCompetencia(int id, Condominio condominio, Date competencia, boolean situacao, Usuario usuarioalteracao) throws Exception  {
        Date dataAlteracao = new Date();  // obtem a data do sistema
        Competencia comp = new Competencia(); // cria uma instância Condominio e popula
        comp.setId(id);
        comp.setCondominio(condominio);
        comp.setCompetencia(competencia);
        comp.setSituacao(situacao);
        comp.setUsuarioalteracao(usuarioalteracao);
        comp.setDataalteracao(dataAlteracao);
        
        if (competencia.equals(null)) {   // valida se o campo nome está preenchido;
            
            JOptionPane.showMessageDialog(null, "Favor preencher o campo Competência.");
            
        }else{                                  // se o campo estiver preenchido, vai gravar no banco;
            
            ServiceFactoryDAO.getCondominioDAO().alterarCondominio(condominio);
            JOptionPane.showMessageDialog(null, "Registro alterado com sucesso!");
            
        }
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletarCompetencia(int id) throws Exception  {
        Competencia comp = new Competencia();
        comp.setId(id);
        int escolha;
        
        escolha = JOptionPane.showConfirmDialog(null, "Deseja apagar o registro?");
        
        if (escolha == 1) {
        
        ServiceFactoryDAO.getCompetenciaDAO().deletarCompetencia(comp);
        
        }
        
    }

    @Override
    public Competencia getCompetencia(int id) throws Exception  {
        Competencia comp;
        
        comp = ServiceFactoryDAO.getCompetenciaDAO().getCompetencia(id);
        
        return comp;
        
    }

    @Override
    public Competencia getCompetencia(String nome) throws Exception  {
        Competencia comp = null;
        
        if (nome.length() < 3 ) {
            
            JOptionPane.showMessageDialog(null, "Favor preencher a pesquisa com 3 caracteres.");
            
        } else {
            
            comp = ServiceFactoryDAO.getCompetenciaDAO().getCompetencia(nome);
            
        }
        
        return comp;
        
    }

    @Override
    public ArrayList<Competencia> getCompetencias() throws Exception  {
        ArrayList<Competencia> lista;
        
        lista = ServiceFactoryDAO.getCompetenciaDAO().getCompetencias();
        
        return lista;
                
    }

}
