package br.com.xkinfo.slc.DAO.Impl;

import br.com.xkinfo.slc.DAO.ILeituraDao;
import br.com.xkinfo.slc.Model.Leitura;
import br.com.xkinfo.slc.Util.EntityManagerUtil;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class LeituraDaoImpl implements ILeituraDao {

    private final EntityManager entityManager = EntityManagerUtil.getEntityManager();

    @Override
    public void inserirLeitura(Leitura leitura) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.persist(leitura);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public void alterarLeitura(Leitura leitura) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.merge(leitura);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public void deletarLeitura(Leitura leitura) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.remove(leitura);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public Leitura getLeitura(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Leitura getLeitura(String nome) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Leitura> getLeituras() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
