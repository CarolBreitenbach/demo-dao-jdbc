package model.dao;

import model.dao.IMPL.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDaoJDBC createSellerDao() {
		return new SellerDaoJDBC();
	}
}
