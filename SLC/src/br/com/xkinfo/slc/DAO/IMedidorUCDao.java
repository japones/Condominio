package br.com.xkinfo.slc.DAO;

import br.com.xkinfo.slc.Model.Medidoresucs;
import java.util.ArrayList;

public interface IMedidorUCDao {

    public void inserirMedidorUC(Medidoresucs medidorUC)throws Exception;

    public void alterarMedidorUC(Medidoresucs medidorUC)throws Exception;

    public void deletarMedidorUC(Medidoresucs medidorUC)throws Exception;

    public Medidoresucs getMedidorUC(int id)throws Exception;

    public Medidoresucs getMedidorUC(String nome)throws Exception;

    public ArrayList<Medidoresucs> getMedidoresUC()throws Exception;
}
