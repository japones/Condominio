package br.com.xkinfo.slc.DAO;

import br.com.xkinfo.slc.DAO.Impl.AbastecimentoDaoImpl;
import br.com.xkinfo.slc.DAO.Impl.CompetenciaDaoImpl;
import br.com.xkinfo.slc.DAO.Impl.CondominioDaoImpl;
import br.com.xkinfo.slc.DAO.Impl.UsuarioDaoImpl;

public class ServiceFactoryDAO {

    private static IAbastecimentoDao abastecimentoDAO;
    private static ICondominioDao condominioDAO;
    private static ICompetenciaDao competenciaDAO;
    private static IUsuarioDao usuarioDAO;

    public static IAbastecimentoDao getAbastecimentoDAO() {
        if (abastecimentoDAO == null) {
            abastecimentoDAO = new AbastecimentoDaoImpl();
        }
        return abastecimentoDAO;
    }

    public static ICondominioDao getCondominioDAO() {
        if (condominioDAO == null) {
            condominioDAO = new CondominioDaoImpl();
        }
        return condominioDAO;
    }
    
    public static ICompetenciaDao getCompetenciaDAO() {
        if (competenciaDAO == null) {
            competenciaDAO = new CompetenciaDaoImpl();
        } 
        return competenciaDAO;
    }

    public static IUsuarioDao getUsuarioDAO() {
        if (usuarioDAO == null) {
            usuarioDAO = new UsuarioDaoImpl();
        }
        return usuarioDAO;
    }

}
