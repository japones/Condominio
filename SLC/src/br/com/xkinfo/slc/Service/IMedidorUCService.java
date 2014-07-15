package br.com.xkinfo.slc.Service;

import br.com.xkinfo.slc.Model.Medidoruc;
import java.util.ArrayList;

public interface IMedidorUCService {

    public void inserirMedidorUC(Medidoruc medidorUC);

    public void alterarMedidorUC(Medidoruc medidorUC);

    public void deletarMedidorUC(Medidoruc medidorUC);

    public Medidoruc getMedidorUC(int id);

    public Medidoruc getMedidorUC(String nome);

    public ArrayList<Medidoruc> getMedidoresUC();

}
