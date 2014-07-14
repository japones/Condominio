package br.com.xkinfo.slc.DAO;

import br.com.xkinfo.slc.Model.Competencias;
import java.util.ArrayList;

public interface ICompetenciaDao {

    public void inserirCompetencia(Competencias competencia)throws Exception;

    public void alterarCompetencia(Competencias competencia)throws Exception;

    public void deletarCompetencia(Competencias competencia)throws Exception;

    public Competencias getCompetencia(int id)throws Exception;

    public Competencias getCompetencia(String nome)throws Exception;

    public ArrayList<Competencias> getCompetencias()throws Exception;
}
