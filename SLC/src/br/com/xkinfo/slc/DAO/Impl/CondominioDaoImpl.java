package br.com.xkinfo.slc.DAO.Impl;

import br.com.xkinfo.slc.DAO.ICondominioDao;
import br.com.xkinfo.slc.Model.Condominio;
import br.com.xkinfo.slc.Util.EntityManagerUtil;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class CondominioDaoImpl implements ICondominioDao {

    private final EntityManager entityManager = EntityManagerUtil.getEntityManager();

    @Override
<<<<<<< HEAD
    public void inserirCondominio(Condominio condominio) throws Exception {
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
    public void alterarCondominio(Condominio condominio) throws Exception {
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
    public void deletarCondominio(Condominio condominio) throws Exception {
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
=======
    public void inserirCondominio(Condominio condominio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterarCondominio(Condominio condominio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletarCondominio(Condominio condominio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
>>>>>>> FETCH_HEAD
    }
    @Override
<<<<<<< HEAD
    public Condominio getCondominio(int id) throws Exception {
         Condominio condominio = null;
        try {
            condominio = entityManager.find(Condominio.class, id);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return condominio;
    }

    @Override
    public Condominio getCondominio(String nome) throws Exception {
        Condominio condominio = null;
        try {
            condominio = entityManager.find(Condominio.class, nome);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return condominio;
    }

    @Override
    public ArrayList<Condominio> getCondominios() throws Exception {
=======
    public Condominio getCondominio(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Condominio getCondominio(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Condominio> getCondominios() {
>>>>>>> FETCH_HEAD
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
