package br.com.xkinfo.slc.Service.Impl;

import br.com.xkinfo.slc.DAO.ServiceFactoryDAO;
import br.com.xkinfo.slc.Model.TipoMedidor;
import br.com.xkinfo.slc.Model.Usuario;
import br.com.xkinfo.slc.Service.ITipoMedidorService;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class TipoMedidorServiceImpl implements ITipoMedidorService {

    @Override
    public void inserirTipoMedidor(String descricao, Usuario usuarioinclusao) throws Exception {
        Date dataInclusao = new Date();
        TipoMedidor tipoMedidor = new TipoMedidor();
        tipoMedidor.setDescricao(descricao);
        tipoMedidor.setUsuarioinclusao(usuarioinclusao);
        tipoMedidor.setDatainclusao(dataInclusao);
        
        if (descricao.isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "Favor preencher a descrição.");
            
        } else {
            
            ServiceFactoryDAO.getTipoMedidorDAO().inserirTipoMedidor(tipoMedidor);
            JOptionPane.showMessageDialog(null, "Registro incluído com sucesso");
            
        }
        
    }

    @Override
    public void alterarTipoMedidor(int id, String descricao, Usuario usuarioAlteracao) throws Exception {
        Date dataAlteracao = new Date();
        TipoMedidor tipoMedidor = new TipoMedidor();
        tipoMedidor.setId(id);
        tipoMedidor.setDescricao(descricao);
        tipoMedidor.setUsuarioalteracao(usuarioAlteracao);
        tipoMedidor.setDataalteracao(dataAlteracao);
        
        if (descricao.isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "Favor preencher a descrição.");
            
        } else {
            
            ServiceFactoryDAO.getTipoMedidorDAO().alterarTipoMedidor(tipoMedidor);
            JOptionPane.showMessageDialog(null, "Registro incluído com sucesso");
            
        }
        
    }

    @Override
    public void deletarTipoMedidor(int id) throws Exception {
        TipoMedidor tipoMedidor = new TipoMedidor();
        tipoMedidor.setId(id);
        int escolha;

        escolha = JOptionPane.showConfirmDialog(null, "Deseja apagar o registro?");

        if (escolha == 1) {

            ServiceFactoryDAO.getTipoMedidorDAO().deletarTipoMedidor(tipoMedidor);
            JOptionPane.showMessageDialog(null, "Registro excluído com sucesso!");

        }
        
    }

    @Override
    public TipoMedidor getTipoMedidor(int id) throws Exception {
        TipoMedidor tipoMedidor;
        
        tipoMedidor = ServiceFactoryDAO.getTipoMedidorDAO().getTipoMedidor(id);
        
        return tipoMedidor;
        
    }

    @Override
    public TipoMedidor getTipoMedidor(String nome) throws Exception {
        TipoMedidor tipoMedidor;
        
        tipoMedidor = ServiceFactoryDAO.getTipoMedidorDAO().getTipoMedidor(nome);
        
        return tipoMedidor;
        
    }

    @Override
    public ArrayList<TipoMedidor> getTipoMedidores() throws Exception {
        ArrayList<TipoMedidor> lista;
        
        lista = ServiceFactoryDAO.getTipoMedidorDAO().getTipoMedidores();
        
        return lista;
        
    }

}
