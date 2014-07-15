package br.com.xkinfo.slc.DAO;

import br.com.xkinfo.slc.Model.Ocorrencia;
import java.util.ArrayList;

public interface IOcorrenciaDao {

    public void inserirOcorrencia(Ocorrencia ocorrencia)throws Exception;

    public void alterarOcorrencia(Ocorrencia ocorrencia)throws Exception;

    public void deletarOcorrencia(Ocorrencia ocorrencia)throws Exception;

    public Ocorrencia getOcorrencia(int id)throws Exception;

    public Ocorrencia getOcorrencia(String nome)throws Exception;

    public ArrayList<Ocorrencia> getOcorrencias()throws Exception;
}
