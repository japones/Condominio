package br.com.xkinfo.slc.DAO;

import br.com.xkinfo.slc.Model.Sindico;
import java.util.ArrayList;

public interface ISindicoDao {

    public void inserirSindico(Sindico sindico)throws Exception;

    public void alterarSindico(Sindico sindico)throws Exception;

    public void deletarSindico(Sindico sindico)throws Exception;

    public Sindico getSindico(int id)throws Exception;

    public Sindico getSindico(String nome)throws Exception;

    public ArrayList<Sindico> getSindicos()throws Exception;
}
