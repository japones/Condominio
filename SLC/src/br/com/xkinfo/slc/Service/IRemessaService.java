package br.com.xkinfo.slc.Service;

import br.com.xkinfo.slc.Model.Remessa;
import java.util.ArrayList;

public interface IRemessaService {

    public void inserirRemessa(Remessa remessa);

    public void alterarRemessa(Remessa remessa);

    public void deletarRemessa(Remessa remessa);

    public Remessa getRemessa(int id);

    public Remessa getRemessa(String nome);

    public ArrayList<Remessa> getRemessas();

}
