package br.com.xkinfo.slc.DAO;

import br.com.xkinfo.slc.Model.Ocorrencias;
import java.util.ArrayList;

public interface IOcorrenciaDao {

    public void inserirOcorrencia(Ocorrencias ocorrencia);

    public void alterarOcorrencia(Ocorrencias ocorrencia);

    public void deletarOcorrencia(Ocorrencias ocorrencia);

    public Ocorrencias getOcorrencia(int id);

    public Ocorrencias getOcorrencia(String nome);

    public ArrayList<Ocorrencias> getOcorrencias();
}
