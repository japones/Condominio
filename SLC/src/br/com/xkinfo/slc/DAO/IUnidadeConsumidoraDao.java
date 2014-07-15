package br.com.xkinfo.slc.DAO;

import br.com.xkinfo.slc.Model.UnidadeConsumidora;
import java.util.ArrayList;

public interface IUnidadeConsumidoraDao {

    public void inserirUnidadeConsumidora(UnidadeConsumidora unidadeConsumidora)throws Exception;

    public void alterarUnidadeConsumidora(UnidadeConsumidora unidadeConsumidora)throws Exception;

    public void deletarUnidadeConsumidora(UnidadeConsumidora unidadeConsumidora)throws Exception;

    public UnidadeConsumidora getUnidadeConsumidora(int id)throws Exception;

    public UnidadeConsumidora getUnidadeConsumidora(String nome)throws Exception;

    public ArrayList<UnidadeConsumidora> getUnidadesConsumidoras()throws Exception;

}
