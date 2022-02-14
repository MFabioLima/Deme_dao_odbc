package model.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import db.DB;
import db.DbException;
import model.dao.VendedorDao;
import model.entidadades.Departamento;
import model.entidadades.Vendedor;

public class vendedorDaoJdbc implements VendedorDao {

	private Connection conn;

	public vendedorDaoJdbc(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(VendedorDao obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(VendedorDao obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(VendedorDao id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Vendedor findById(Integer id) {
	
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement("SELECT seller.*,department.Name as DepName "
									   + "FROM seller INNER JOIN department "
									   + "ON seller.DepartmentId = department.Id "
									   + " WHERE seller.Id = ?");
			st.setInt(1, id);
		    rs = st.executeQuery();
		    
		    
			if(rs.next()) {
				Departamento dep = instantiateDepartamento(rs)		;		
				
			    Vendedor obj = instantiateVendedor(rs, dep);
			    
				return obj; 
				
			}
			return null;
			
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
		
	}

	private Vendedor instantiateVendedor(ResultSet rs, Departamento dep) throws SQLException {

	   Vendedor obj = new Vendedor();
		
		obj.setId(rs.getInt("Id"));
		obj.setNoome(rs.getString("Name"));
		obj.setEmail(rs.getString("Email"));
		obj.setBirthData(rs.getDate("BirthDate"));
		obj.setSalario(rs.getDouble("BaseSalary"));
		obj.setDepartamento(dep);
	    return obj;
	}

	private Departamento instantiateDepartamento(ResultSet rs) throws SQLException {
		Departamento dep = new Departamento();
		dep.setId(rs.getInt("DepartmentId"));
		dep.setNome(rs.getString("DepName"));
        return dep;
	}

	@Override
	public List<VendedorDao> findall() {
		// TODO Auto-generated method stub
		return null;
	}

}
