package model.dao;

import java.util.List;

import model.entidadades.Vendedor;

public interface VendedorDao {

	void insert(VendedorDao obj);

	void update(VendedorDao obj);

	void deleteById(VendedorDao id);

	Vendedor findById(Integer id);

	List<VendedorDao> findall();

}
