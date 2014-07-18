package br.com.xkinfo.slc.Service;

import br.com.xkinfo.slc.Model.Abastecimento;
import br.com.xkinfo.slc.Model.Competencia;
import br.com.xkinfo.slc.Model.Usuario;
import java.util.ArrayList;
import java.util.Date;

public interface IAbastecimentoService {

    public void inserirAbastecimento(Competencia competencia, Date dataabastecimento, float quantidade, Usuario usuarioinclusao) throws Exception;

    public void alterarAbastecimento(int id, Competencia competencia, Date dataabastecimento, float quantidade, Usuario usuarioalteracao) throws Exception;

    public void deletarAbastecimento(int id) throws Exception;

    public Abastecimento getAbastecimento(int id) throws Exception;

    public Abastecimento getAbastecimento(String nome) throws Exception;

    public ArrayList<Abastecimento> getAbastecimentos() throws Exception;
}
