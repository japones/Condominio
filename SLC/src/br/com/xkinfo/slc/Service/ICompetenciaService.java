package br.com.xkinfo.slc.Service;

import br.com.xkinfo.slc.Model.Competencias;
import java.util.ArrayList;

public interface ICompetenciaService {

    public void inserirCompetencia(Competencias competencia);

    public void alterarCompetencia(Competencias competencia);

    public void deletarCompetencia(Competencias competencia);

    public Competencias getCompetencia(int id);

    public Competencias getCompetencia(String nome);

    public ArrayList<Competencias> getCompetencias();

}
