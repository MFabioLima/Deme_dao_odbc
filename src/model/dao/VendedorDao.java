package model.dao;

import java.util.List;

public interface VendedorDao {

	void insert(VendedorDao obj);

	void update(VendedorDao obj);

	void deleteById(VendedorDao id);

	VendedorDao findById(Integer id);

	List<VendedorDao> findall();

}
