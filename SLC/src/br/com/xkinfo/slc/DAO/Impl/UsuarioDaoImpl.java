package br.com.xkinfo.slc.DAO.Impl;

import br.com.xkinfo.slc.DAO.IUsuarioDao;
import br.com.xkinfo.slc.Model.Usuario;
import br.com.xkinfo.slc.Util.EntityManagerUtil;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class UsuarioDaoImpl implements IUsuarioDao {

    private final EntityManager entityManager = EntityManagerUtil.getEntityManager();

    @Override
<<<<<<< HEAD
    public void inserirUsuario(Usuario usuario) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.persist(usuario);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public void alterarUsuario(Usuario usuario) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.merge(usuario);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public void deletarUsuario(Usuario usuario) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.remove(usuario);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public Usuario getUsuario(int id) throws Exception {
=======
    public void inserirUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterarUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletarUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario getUsuario(int id) {
>>>>>>> FETCH_HEAD
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
<<<<<<< HEAD
    public Usuario getUsuario(String nome) throws Exception {
=======
    public Usuario getUsuario(String nome) {
>>>>>>> FETCH_HEAD
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
<<<<<<< HEAD
    public ArrayList<Usuario> getUsuarios() throws Exception {
=======
    public ArrayList<Usuario> getUsuarios() {
>>>>>>> FETCH_HEAD
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
