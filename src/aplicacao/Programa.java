package aplicacao;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.VendedorDao;
import model.entidadades.Departamento;
import model.entidadades.Vendedor;

public class Programa {
 
	public static void main(String[] args) {
		
		
        VendedorDao vendedorDao =DaoFactory.createDao();
       
        System.out.println("=== teste 1 : vendedor findbyID  =====");
        Vendedor vendedor =  vendedorDao.findById(3);
        System.out.println(vendedor);
        
        System.out.println("\n=== teste 1 : vendedor findbyDepartamento  =====");
        Departamento departamento =new Departamento(2, null);
 
        List<Vendedor> list = vendedorDao.findByDepartamento(departamento);

        for(Vendedor obj : list) {
        	System.out.println(obj);
        }
	}

}
