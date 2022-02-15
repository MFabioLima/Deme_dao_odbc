package aplicacao;

import model.dao.DaoFactory;
import model.dao.VendedorDao;
import model.entidadades.Vendedor;

public class Programa {
 
	public static void main(String[] args) {
		
		
        VendedorDao vendedorDao =DaoFactory.createDao();
       
        System.out.println("=== teste 1 : vendedor findbyID  =====");
        Vendedor vendedor =  vendedorDao.findById(3);
        System.out.println(vendedor);
        
	}

}
