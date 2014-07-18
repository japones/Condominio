package br.com.xkinfo.slc.Service.Impl;

import br.com.xkinfo.slc.DAO.ServiceFactoryDAO;
import br.com.xkinfo.slc.Model.Abastecimento;
import br.com.xkinfo.slc.Model.Competencia;
import br.com.xkinfo.slc.Model.Usuario;
import br.com.xkinfo.slc.Service.IAbastecimentoService;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class AbastecimentoServiceImpl implements IAbastecimentoService {

    @Override
    public void inserirAbastecimento(Competencia competencia, Date dataabastecimento, float quantidade, Usuario usuarioinclusao) throws Exception {
        Date dataInclusao = new Date();
        Abastecimento abastecimento = new Abastecimento();
        abastecimento.setCompetencia(competencia);
        abastecimento.setDataabastecimento(dataabastecimento);
        abastecimento.setQuantidade(quantidade);
        abastecimento.setUsuarioinclusao(usuarioinclusao);
        abastecimento.setDatainclusao(dataInclusao);

        if (quantidade == 0.00 || quantidade < 0.00) {   // valida se o campo nome está preenchido;

            JOptionPane.showMessageDialog(null, "Favor preencher a quantidade.");

        } else {                                  // se o campo preenchido, vai gravar no banco;

            ServiceFactoryDAO.getAbastecimentoDAO().inserirAbastecimento(abastecimento);
            JOptionPane.showMessageDialog(null, "Registro incluído com sucesso!");

        }

    }

    @Override
    public void alterarAbastecimento(int id, Competencia competencia, Date dataabastecimento, float quantidade, Usuario usuarioalteracao) throws Exception {
        Date dataAlteracao = new Date();
        Abastecimento abastecimento = new Abastecimento();
        abastecimento.setCompetencia(competencia);
        abastecimento.setDataabastecimento(dataabastecimento);
        abastecimento.setQuantidade(quantidade);
        abastecimento.setUsuarioalteracao(usuarioalteracao);
        abastecimento.setDataalteracao(dataAlteracao);
        abastecimento.setId(id);

        if (quantidade == 0.00 || quantidade < 0.00) {   // valida se o campo nome está preenchido;

            JOptionPane.showMessageDialog(null, "Favor preencher a quantidade.");

        } else {                                  // se o campo preenchido, vai gravar no banco;

            ServiceFactoryDAO.getAbastecimentoDAO().alterarAbastecimento(abastecimento);
            JOptionPane.showMessageDialog(null, "Registro alterado com sucesso!");

        }

    }

    @Override
    public void deletarAbastecimento(int id) throws Exception {
        Abastecimento abastecimento = new Abastecimento();
        abastecimento.setId(id);

        int escolha;

        escolha = JOptionPane.showConfirmDialog(null, "Deseja apagar o registro?");

        if (escolha == 1) {

            ServiceFactoryDAO.getAbastecimentoDAO().deletarAbastecimento(abastecimento);
            JOptionPane.showMessageDialog(null, "Registro excluído com sucesso!");

        }

    }

    @Override
    public Abastecimento getAbastecimento(int id) throws Exception {
        Abastecimento abastecimento;

        abastecimento = ServiceFactoryDAO.getAbastecimentoDAO().getAbastecimento(id);

        return abastecimento;

    }

    @Override
    public Abastecimento getAbastecimento(String nome) throws Exception {
        Abastecimento abastecimento = null;

        if (nome.isEmpty() || nome.length() < 3) {
            
            JOptionPane.showMessageDialog(null, "Favor inserir 3 caracteres para pesquisa!");
            
        } else{

            abastecimento = ServiceFactoryDAO.getAbastecimentoDAO().getAbastecimento(nome);

        }

        return abastecimento;

    }

    @Override
    public ArrayList<Abastecimento> getAbastecimentos() throws Exception {
        ArrayList<Abastecimento> lista;
        
        lista = ServiceFactoryDAO.getAbastecimentoDAO().getAbastecimentos();
        
        return lista;
        
    }

}
