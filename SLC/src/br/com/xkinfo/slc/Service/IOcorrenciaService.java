package br.com.xkinfo.slc.Service;

import br.com.xkinfo.slc.Model.Ocorrencia;
import java.util.ArrayList;

public interface IOcorrenciaService {

    public void inserirOcorrencia(Ocorrencia ocorrencia);

    public void alterarOcorrencia(Ocorrencia ocorrencia);

    public void deletarOcorrencia(Ocorrencia ocorrencia);

    public Ocorrencia getOcorrencia(int id);

    public Ocorrencia getOcorrencia(String nome);

    public ArrayList<Ocorrencia> getOcorrencias();

}
