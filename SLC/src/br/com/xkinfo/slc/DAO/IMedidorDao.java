package br.com.xkinfo.slc.DAO;

import br.com.xkinfo.slc.Model.Medidores;
import java.util.ArrayList;

public interface IMedidorDao {

    public void inserirMedidor(Medidores medidor)throws Exception;

    public void alterarMedidor(Medidores medidor)throws Exception;

    public void deletarMedidor(Medidores medidor)throws Exception;

    public Medidores getMedidor(int id)throws Exception;

    public Medidores getMedidor(String nome)throws Exception;

    public ArrayList<Medidores> getMedidores()throws Exception;
}
