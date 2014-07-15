package br.com.xkinfo.slc.DAO.Impl;

import br.com.xkinfo.slc.DAO.ICompetenciaDao;
import br.com.xkinfo.slc.Model.Competencia;
import br.com.xkinfo.slc.Util.EntityManagerUtil;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class CompetenciaDaoImpl implements ICompetenciaDao {

    private final EntityManager entityManager = EntityManagerUtil.getEntityManager();

    @Override
    public void inserirCompetencia(Competencia competencia) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.persist(competencia);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public void alterarCompetencia(Competencia competencia) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.merge(competencia);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public void deletarCompetencia(Competencia competencia) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.remove(competencia);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public Competencia getCompetencia(int id) throws Exception {
        Competencia competencia = null;
        try {
            competencia = entityManager.find(Competencia.class, id);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return competencia;
    }

    @Override
    public Competencia getCompetencia(String nome) throws Exception {
        Competencia competencia = null;
        try {
            competencia = entityManager.find(Competencia.class, nome);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return competencia;
    }

    @Override
    public ArrayList<Competencia> getCompetencias() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
