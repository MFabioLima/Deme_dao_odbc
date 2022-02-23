package model.dao;

import java.util.List;

import model.entidadades.Departamento;
import model.entidadades.Vendedor;

public interface VendedorDao {

	void insert(Vendedor obj);

	void update(Vendedor obj);

	void deleteById(Integer id);

	Vendedor findById(Integer id);

	List<Vendedor> findall();
	
	List<Vendedor> findByDepartamento(Departamento departamento);

}
