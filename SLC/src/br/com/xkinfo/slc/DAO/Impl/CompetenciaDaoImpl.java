package br.com.xkinfo.slc.DAO.Impl;

import br.com.xkinfo.slc.DAO.ICompetenciaDao;
import br.com.xkinfo.slc.Model.Competencias;
import br.com.xkinfo.slc.Util.EntityManagerUtil;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class CompetenciaDaoImpl implements ICompetenciaDao {

    private final EntityManager entityManager = EntityManagerUtil.getEntityManager();

    @Override
    public void inserirCompetencia(Competencias competencia) throws Exception {
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
    public void alterarCompetencia(Competencias competencia) throws Exception {
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
    public void deletarCompetencia(Competencias competencia) throws Exception {
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
    public Competencias getCompetencia(int id) throws Exception {
        Competencias competencia = null;
        try {
            competencia = entityManager.find(Competencias.class, id);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return competencia;
    }

    @Override
    public Competencias getCompetencia(String nome) throws Exception {
        Competencias competencia = null;
        try {
            competencia = entityManager.find(Competencias.class, nome);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return competencia;
    }

    @Override
    public ArrayList<Competencias> getCompetencias() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
