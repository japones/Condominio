package br.com.xkinfo.slc.DAO.Impl;

import br.com.xkinfo.slc.DAO.IMedidorDao;
import br.com.xkinfo.slc.Model.Medidor;
import br.com.xkinfo.slc.Util.EntityManagerUtil;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class MedidorDaoImpl implements IMedidorDao {

    private final EntityManager entityManager = EntityManagerUtil.getEntityManager();

    @Override
    public void inserirMedidor(Medidor medidor) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.persist(medidor);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public void alterarMedidor(Medidor medidor) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.merge(medidor);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public void deletarMedidor(Medidor medidor) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.remove(medidor);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public Medidor getMedidor(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Medidor getMedidor(String nome) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Medidor> getMedidores() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
