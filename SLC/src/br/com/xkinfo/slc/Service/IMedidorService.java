package br.com.xkinfo.slc.Service;

import br.com.xkinfo.slc.Model.Medidores;
import java.util.ArrayList;

public interface IMedidorService {

    public void inserirMedidor(Medidores medidor);

    public void alterarMedidor(Medidores medidor);

    public void deletarMedidor(Medidores medidor);

    public Medidores getMedidor(int id);

    public Medidores getMedidor(String nome);

    public ArrayList<Medidores> getMedidores();

}
