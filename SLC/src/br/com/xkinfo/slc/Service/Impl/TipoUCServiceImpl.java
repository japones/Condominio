package br.com.xkinfo.slc.Service.Impl;

import br.com.xkinfo.slc.DAO.ServiceFactoryDAO;
import br.com.xkinfo.slc.Model.Tipouc;
import br.com.xkinfo.slc.Model.Usuario;
import br.com.xkinfo.slc.Service.ITipoUCService;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class TipoUCServiceImpl implements ITipoUCService {

    @Override
    public void inserirTipoUC(String nome, Usuario usuarioinclusao) throws Exception{
        Date dataInclusao = new Date();
        Tipouc tipoUc = new Tipouc();
        tipoUc.setNome(nome);
        tipoUc.setUsuarioinclusao(usuarioinclusao);
        tipoUc.setDatainclusao(dataInclusao);

        if (nome.isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "Favor preencher o nome!");
            
        } else{
            
            ServiceFactoryDAO.getTipoUcDAO().inserirTipoUC(tipoUc);
            
        }
        
    }

    @Override
    public void alterarTipoUC(int id, String nome, Usuario usuarioalteracao) throws Exception {
        Date dataAlteracao = new Date();
        Tipouc tipoUc = new Tipouc();
        tipoUc.setId(id);
        tipoUc.setNome(nome);
        tipoUc.setUsuarioalteracao(usuarioalteracao);
        tipoUc.setDataalteracao(dataAlteracao);
        
        if (nome.isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "Favor preencher o nome!");
            
        } else{
            
            ServiceFactoryDAO.getTipoUcDAO().alterarTipoUC(tipoUc);
            
        }
        
    }

    @Override
    public void deletarTipoUC(int id) throws Exception {
        Tipouc tipoUc = new Tipouc();
        tipoUc.setId(id);
        int escolha;

        escolha = JOptionPane.showConfirmDialog(null, "Deseja apagar o registro?");

        if (escolha == 1) {

            ServiceFactoryDAO.getTipoUcDAO().deletarTipoUC(tipoUc);
            JOptionPane.showMessageDialog(null, "Registro excluído com sucesso!");

        }
        
    }

    @Override
    public Tipouc getTipoUC(int id) throws Exception {
        Tipouc tipoUc;
        
        tipoUc = ServiceFactoryDAO.getTipoUcDAO().getTipoUC(id);
        
        return tipoUc;
        
    }

    @Override
    public Tipouc getTipoUC(String nome) throws Exception {
        Tipouc tipoUc;
        
        tipoUc = ServiceFactoryDAO.getTipoUcDAO().getTipoUC(nome);
        
        return tipoUc;
        
    }

    @Override
    public ArrayList<Tipouc> getTiposUC() throws Exception {
        ArrayList<Tipouc> lista;
        
        lista = ServiceFactoryDAO.getTipoUcDAO().getTiposUC();
        
        return lista;
        
    }

}
