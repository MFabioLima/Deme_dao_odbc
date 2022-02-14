package model.dao;

import db.DB;
import model.dao.Impl.vendedorDaoJdbc;

public class DaoFactory {
	public static VendedorDao createDao() {
		return new vendedorDaoJdbc(DB.getConnection());
	}

}
