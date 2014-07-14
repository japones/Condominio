package br.com.xkinfo.slc.DAO;

import br.com.xkinfo.slc.Model.Unidadeconsumidora;
import java.util.ArrayList;

public interface IUnidadeConsumidoraDao {

    public void inserirUnidadeConsumidora(Unidadeconsumidora unidadeConsumidora);

    public void alterarUnidadeConsumidora(Unidadeconsumidora unidadeConsumidora);

    public void deletarUnidadeConsumidora(Unidadeconsumidora unidadeConsumidora);

    public Unidadeconsumidora getUnidadeConsumidora(int id);

    public Unidadeconsumidora getUnidadeConsumidora(String nome);

    public ArrayList<Unidadeconsumidora> getUnidadesConsumidoras();

}
