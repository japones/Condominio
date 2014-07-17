package br.com.xkinfo.slc.Service;

import br.com.xkinfo.slc.Model.Competencia;
import br.com.xkinfo.slc.Model.Condominio;
import br.com.xkinfo.slc.Model.Usuario;
import java.util.ArrayList;
import java.util.Date;

public interface ICompetenciaService {

    public void inserirCompetencia(Condominio condominio, Date competencia, boolean situacao, Usuario usuarioinclusao) throws Exception ;

    public void alterarCompetencia(int id, Condominio condominio, Date competencia, boolean situacao, Usuario usuarioalteracao) throws Exception ;

    public void deletarCompetencia(int id) throws Exception ;

    public Competencia getCompetencia(int id) throws Exception ;

    public Competencia getCompetencia(String nome) throws Exception ;

    public ArrayList<Competencia> getCompetencias() throws Exception ;

}
