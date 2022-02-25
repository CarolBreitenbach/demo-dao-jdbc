package model.dao;

import db.DB;
import model.dao.IMPL.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDaoJDBC createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
}
