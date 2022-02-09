package model.dao;

import java.util.List;

public interface Vendedor {

	void insert(Vendedor obj);

	void update(Vendedor obj);

	void deleteById(Vendedor id);

	Vendedor findById(Integer id);

	List<Vendedor> findall();

}
