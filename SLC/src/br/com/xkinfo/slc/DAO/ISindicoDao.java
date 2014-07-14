package br.com.xkinfo.slc.DAO;

import br.com.xkinfo.slc.Model.Sindicos;
import java.util.ArrayList;

public interface ISindicoDao {

    public void inserirSindico(Sindicos sindico);

    public void alterarSindico(Sindicos sindico);

    public void deletarSindico(Sindicos sindico);

    public Sindicos getSindico(int id);

    public Sindicos getSindico(String nome);

    public ArrayList<Sindicos> getSindicos();
}
