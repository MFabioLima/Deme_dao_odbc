package model.dao;

import model.dao.Impl.vendedorDaoImplJdbc;

public class DaoFactory {
	public static VendedorDao createDao() {
		return new vendedorDaoImplJdbc();
	}

}
