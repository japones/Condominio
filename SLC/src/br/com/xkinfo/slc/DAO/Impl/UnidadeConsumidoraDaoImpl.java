package br.com.xkinfo.slc.DAO.Impl;

import br.com.xkinfo.slc.DAO.IUnidadeConsumidoraDao;
import br.com.xkinfo.slc.Model.Unidadeconsumidora;
import br.com.xkinfo.slc.Util.EntityManagerUtil;
import java.util.ArrayList;
import javax.persistence.EntityManager;

public class UnidadeConsumidoraDaoImpl implements IUnidadeConsumidoraDao {

    private final EntityManager entityManager = EntityManagerUtil.getEntityManager();

    @Override
    public void inserirUnidadeConsumidora(Unidadeconsumidora unidadeConsumidora) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterarUnidadeConsumidora(Unidadeconsumidora unidadeConsumidora) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletarUnidadeConsumidora(Unidadeconsumidora unidadeConsumidora) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Unidadeconsumidora getUnidadeConsumidora(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Unidadeconsumidora getUnidadeConsumidora(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Unidadeconsumidora> getUnidadesConsumidoras() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
