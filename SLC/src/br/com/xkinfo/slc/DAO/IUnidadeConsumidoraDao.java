package br.com.xkinfo.slc.DAO;

import br.com.xkinfo.slc.Model.Unidadeconsumidora;
import java.util.ArrayList;

public interface IUnidadeConsumidoraDao {

    public void inserirUnidadeConsumidora(Unidadeconsumidora unidadeConsumidora)throws Exception;

    public void alterarUnidadeConsumidora(Unidadeconsumidora unidadeConsumidora)throws Exception;

    public void deletarUnidadeConsumidora(Unidadeconsumidora unidadeConsumidora)throws Exception;

    public Unidadeconsumidora getUnidadeConsumidora(int id)throws Exception;

    public Unidadeconsumidora getUnidadeConsumidora(String nome)throws Exception;

    public ArrayList<Unidadeconsumidora> getUnidadesConsumidoras()throws Exception;

}
