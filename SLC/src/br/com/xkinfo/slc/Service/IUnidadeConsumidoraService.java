package br.com.xkinfo.slc.Service;

import br.com.xkinfo.slc.Model.UnidadeConsumidora;
import java.util.ArrayList;

public interface IUnidadeConsumidoraService {

    public void inserirUnidadeConsumidora(UnidadeConsumidora unidadeConsumidora);

    public void alterarUnidadeConsumidora(UnidadeConsumidora unidadeConsumidora);

    public void deletarUnidadeConsumidora(UnidadeConsumidora unidadeConsumidora);

    public UnidadeConsumidora getUnidadeConsumidora(int id);

    public UnidadeConsumidora getUnidadeConsumidora(String nome);

    public ArrayList<UnidadeConsumidora> getUnidadesConsumidoras();

}
