package br.com.xkinfo.slc.DAO;

import br.com.xkinfo.slc.DAO.Impl.AbastecimentoDaoImpl;
import br.com.xkinfo.slc.DAO.Impl.CondominioDaoImpl;

public class ServiceFactoryDAO {
    private static IAbastecimentoDao abastecimentoDAO;

    public static IAbastecimentoDao getAbastecimentoDAO() {
        if (abastecimentoDAO == null) {
            abastecimentoDAO = new AbastecimentoDaoImpl();
        }
        return abastecimentoDAO;
    }
    private static ICondominioDao condominioDAO;

    public static ICondominioDao getCondominioDAO() {
        if (condominioDAO == null) {
            condominioDAO = new CondominioDaoImpl();
        }
        return condominioDAO;
    }
}
