package br.com.xkinfo.slc.DAO;

import br.com.xkinfo.slc.Model.Competencia;
import java.util.ArrayList;

public interface ICompetenciaDao {

    public void inserirCompetencia(Competencia competencia)throws Exception;

    public void alterarCompetencia(Competencia competencia)throws Exception;

    public void deletarCompetencia(Competencia competencia)throws Exception;

    public Competencia getCompetencia(int id)throws Exception;

    public Competencia getCompetencia(String nome)throws Exception;

    public ArrayList<Competencia> getCompetencias()throws Exception;
}
