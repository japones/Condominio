package br.com.xkinfo.slc.DAO.Impl;

import br.com.xkinfo.slc.DAO.IMandatoDao;
import br.com.xkinfo.slc.Model.Mandato;
import br.com.xkinfo.slc.Util.EntityManagerUtil;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class MandatoDaoImpl implements IMandatoDao {

    private final EntityManager entityManager = EntityManagerUtil.getEntityManager();

    @Override
    public void inserirMandato(Mandato mandato) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.persist(mandato);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public void alterarMandato(Mandato mandato) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.merge(mandato);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public void deletarMandato(Mandato mandato) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.remove(mandato);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public Mandato getMandato(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Mandato getMandato(String nome) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Mandato> getMandatos() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
