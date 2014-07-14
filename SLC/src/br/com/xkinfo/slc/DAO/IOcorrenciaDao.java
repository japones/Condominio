package br.com.xkinfo.slc.DAO;

import br.com.xkinfo.slc.Model.Ocorrencias;
import java.util.ArrayList;

public interface IOcorrenciaDao {

    public void inserirOcorrencia(Ocorrencias ocorrencia)throws Exception;

    public void alterarOcorrencia(Ocorrencias ocorrencia)throws Exception;

    public void deletarOcorrencia(Ocorrencias ocorrencia)throws Exception;

    public Ocorrencias getOcorrencia(int id)throws Exception;

    public Ocorrencias getOcorrencia(String nome)throws Exception;

    public ArrayList<Ocorrencias> getOcorrencias()throws Exception;
}
