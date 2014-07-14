package br.com.xkinfo.slc.Service;

import br.com.xkinfo.slc.Model.Medidoresucs;
import java.util.ArrayList;

public interface IMedidorUCService {

    public void inserirMedidorUC(Medidoresucs medidorUC);

    public void alterarMedidorUC(Medidoresucs medidorUC);

    public void deletarMedidorUC(Medidoresucs medidorUC);

    public Medidoresucs getMedidorUC(int id);

    public Medidoresucs getMedidorUC(String nome);

    public ArrayList<Medidoresucs> getMedidoresUC();

}
