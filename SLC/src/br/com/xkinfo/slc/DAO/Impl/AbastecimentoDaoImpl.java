package br.com.xkinfo.slc.DAO.Impl;

import br.com.xkinfo.slc.DAO.IAbastecimentoDao;
import br.com.xkinfo.slc.Model.Abastecimentos;
import br.com.xkinfo.slc.Util.EntityManagerUtil;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class AbastecimentoDaoImpl implements IAbastecimentoDao {

    private final EntityManager entityManager = EntityManagerUtil.getEntityManager();

    @Override
    public void inserirAbastecimento(Abastecimentos abastecimento) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.persist(abastecimento);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public void alterarAbastecimento(Abastecimentos abastecimento) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.merge(abastecimento);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public void deletarAbastecimento(Abastecimentos abastecimento) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.remove(abastecimento);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public Abastecimentos getAbastecimento(int id) throws Exception {
        Abastecimentos abastecimento = null;
        try {
            abastecimento = entityManager.find(Abastecimentos.class, id);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return abastecimento;
    }

    @Override
    public Abastecimentos getAbastecimento(String nome) throws Exception {
        Abastecimentos abastecimento = null;
        try {
            abastecimento = entityManager.find(Abastecimentos.class, nome);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return abastecimento;
    }

    @Override
    public ArrayList<Abastecimentos> getAbastecimentos() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
