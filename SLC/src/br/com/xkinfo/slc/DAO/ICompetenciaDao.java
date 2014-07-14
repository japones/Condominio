package br.com.xkinfo.slc.DAO;

import br.com.xkinfo.slc.Model.Competencias;
import java.util.ArrayList;

public interface ICompetenciaDao {

    public void inserirCompetencia(Competencias competencia);

    public void alterarCompetencia(Competencias competencia);

    public void deletarCompetencia(Competencias competencia);

    public Competencias getCompetencia(int id);

    public Competencias getCompetencia(String nome);

    public ArrayList<Competencias> getCompetencias();
}
