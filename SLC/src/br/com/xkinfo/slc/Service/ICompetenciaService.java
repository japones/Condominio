package br.com.xkinfo.slc.Service;

import br.com.xkinfo.slc.Model.Competencia;
import java.util.ArrayList;

public interface ICompetenciaService {

    public void inserirCompetencia(Competencia competencia);

    public void alterarCompetencia(Competencia competencia);

    public void deletarCompetencia(Competencia competencia);

    public Competencia getCompetencia(int id);

    public Competencia getCompetencia(String nome);

    public ArrayList<Competencia> getCompetencias();

}
