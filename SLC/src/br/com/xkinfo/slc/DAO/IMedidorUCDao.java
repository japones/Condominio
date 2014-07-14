package br.com.xkinfo.slc.DAO;

import br.com.xkinfo.slc.Model.Medidoresucs;
import java.util.ArrayList;

public interface IMedidorUCDao {

    public void inserirMedidorUC(Medidoresucs medidorUC);

    public void alterarMedidorUC(Medidoresucs medidorUC);

    public void deletarMedidorUC(Medidoresucs medidorUC);

    public Medidoresucs getMedidorUC(int id);

    public Medidoresucs getMedidorUC(String nome);

    public ArrayList<Medidoresucs> getMedidoresUC();
}
