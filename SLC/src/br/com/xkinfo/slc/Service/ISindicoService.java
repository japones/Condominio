package br.com.xkinfo.slc.Service;

import br.com.xkinfo.slc.Model.Sindico;
import java.util.ArrayList;

public interface ISindicoService {

    public void inserirSindico(Sindico sindico);

    public void alterarSindico(Sindico sindico);

    public void deletarSindico(Sindico sindico);

    public Sindico getSindico(int id);

    public Sindico getSindico(String nome);

    public ArrayList<Sindico> getSindicos();

}
