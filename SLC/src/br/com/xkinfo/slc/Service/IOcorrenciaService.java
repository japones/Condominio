package br.com.xkinfo.slc.Service;

import br.com.xkinfo.slc.Model.Ocorrencias;
import java.util.ArrayList;

public interface IOcorrenciaService {

    public void inserirOcorrencia(Ocorrencias ocorrencia);

    public void alterarOcorrencia(Ocorrencias ocorrencia);

    public void deletarOcorrencia(Ocorrencias ocorrencia);

    public Ocorrencias getOcorrencia(int id);

    public Ocorrencias getOcorrencia(String nome);

    public ArrayList<Ocorrencias> getOcorrencias();

}
