package br.com.xkinfo.slc.DAO;

import br.com.xkinfo.slc.Model.Medidor;
import java.util.ArrayList;

public interface IMedidorDao {

    public void inserirMedidor(Medidor medidor)throws Exception;

    public void alterarMedidor(Medidor medidor)throws Exception;

    public void deletarMedidor(Medidor medidor)throws Exception;

    public Medidor getMedidor(int id)throws Exception;

    public Medidor getMedidor(String nome)throws Exception;

    public ArrayList<Medidor> getMedidores()throws Exception;
}
