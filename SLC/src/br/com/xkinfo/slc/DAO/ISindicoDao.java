package br.com.xkinfo.slc.DAO;

import br.com.xkinfo.slc.Model.Sindicos;
import java.util.ArrayList;

public interface ISindicoDao {

    public void inserirSindico(Sindicos sindico)throws Exception;

    public void alterarSindico(Sindicos sindico)throws Exception;

    public void deletarSindico(Sindicos sindico)throws Exception;

    public Sindicos getSindico(int id)throws Exception;

    public Sindicos getSindico(String nome)throws Exception;

    public ArrayList<Sindicos> getSindicos()throws Exception;
}
