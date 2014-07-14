package br.com.xkinfo.slc.DAO.Impl;

import br.com.xkinfo.slc.DAO.IUnidadeConsumidoraDao;
import br.com.xkinfo.slc.Model.Unidadeconsumidora;
import br.com.xkinfo.slc.Util.EntityManagerUtil;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class UnidadeConsumidoraDaoImpl implements IUnidadeConsumidoraDao {

    private final EntityManager entityManager = EntityManagerUtil.getEntityManager();

    @Override
    public void inserirUnidadeConsumidora(Unidadeconsumidora unidadeConsumidora) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.persist(unidadeConsumidora);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }

    }

    @Override
    public void alterarUnidadeConsumidora(Unidadeconsumidora unidadeConsumidora) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.merge(unidadeConsumidora);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public void deletarUnidadeConsumidora(Unidadeconsumidora unidadeConsumidora) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.remove(unidadeConsumidora);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public Unidadeconsumidora getUnidadeConsumidora(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Unidadeconsumidora getUnidadeConsumidora(String nome) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Unidadeconsumidora> getUnidadesConsumidoras() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
