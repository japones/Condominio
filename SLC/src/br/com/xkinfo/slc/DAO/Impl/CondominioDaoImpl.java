package br.com.xkinfo.slc.DAO.Impl;

import br.com.xkinfo.slc.DAO.ICondominioDao;
import br.com.xkinfo.slc.Model.Competencias;
import br.com.xkinfo.slc.Model.Condominios;
import br.com.xkinfo.slc.Util.EntityManagerUtil;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class CondominioDaoImpl implements ICondominioDao {

    private final EntityManager entityManager = EntityManagerUtil.getEntityManager();

    @Override
    public void inserirCondominio(Condominios condominio) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.persist(condominio);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public void alterarCondominio(Condominios condominio) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.merge(condominio);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public void deletarCondominio(Condominios condominio) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.remove(condominio);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public Condominios getCondominio(int id) throws Exception {
        Condominios condominio = null;
        try {
            condominio = entityManager.find(Condominios.class, id);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return condominio;
    }

    @Override
    public Condominios getCondominio(String nome) throws Exception {
        Condominios condominio = null;
        try {
            condominio = entityManager.find(Condominios.class, nome);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return condominio;
    }

    @Override
    public ArrayList<Condominios> getCondominios() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
