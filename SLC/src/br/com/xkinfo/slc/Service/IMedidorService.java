package br.com.xkinfo.slc.Service;

import br.com.xkinfo.slc.Model.Medidor;
import java.util.ArrayList;

public interface IMedidorService {

    public void inserirMedidor(Medidor medidor);

    public void alterarMedidor(Medidor medidor);

    public void deletarMedidor(Medidor medidor);

    public Medidor getMedidor(int id);

    public Medidor getMedidor(String nome);

    public ArrayList<Medidor> getMedidores();

}
