package br.com.xkinfo.slc.Service;

import br.com.xkinfo.slc.Model.Sindicos;
import java.util.ArrayList;

public interface ISindicoService {

    public void inserirSindico(Sindicos sindico);

    public void alterarSindico(Sindicos sindico);

    public void deletarSindico(Sindicos sindico);

    public Sindicos getSindico(int id);

    public Sindicos getSindico(String nome);

    public ArrayList<Sindicos> getSindicos();

}
