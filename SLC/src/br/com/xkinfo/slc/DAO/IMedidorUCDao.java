package br.com.xkinfo.slc.DAO;

import br.com.xkinfo.slc.Model.Medidoruc;
import java.util.ArrayList;

public interface IMedidorUCDao {

    public void inserirMedidorUC(Medidoruc medidorUC)throws Exception;

    public void alterarMedidorUC(Medidoruc medidorUC)throws Exception;

    public void deletarMedidorUC(Medidoruc medidorUC)throws Exception;

    public Medidoruc getMedidorUC(int id)throws Exception;

    public Medidoruc getMedidorUC(String nome)throws Exception;

    public ArrayList<Medidoruc> getMedidoresUC()throws Exception;
}
