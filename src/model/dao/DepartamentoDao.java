package model.dao;

import java.util.List;

import model.entidadades.Departamento;

public interface DepartamentoDao {
	void insert(Departamento obj);

	void update(Departamento obj);

	void deleteByid(Integer id);

	Departamento finsbyid(Integer id);

	List<Departamento> findall();

}
