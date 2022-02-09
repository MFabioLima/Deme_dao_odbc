package aplicacao;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.VendedorDao;
import model.entidadades.Departamento;
import model.entidadades.Vendedor;

public class Programa {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Departamento obj = new Departamento(1, "Books");
        
        Vendedor vendedor = new Vendedor(21,"Jose","jose@bol.com.br",new Date(),300.00,obj);
        
        VendedorDao vendedorDao =DaoFactory.createDao();
        
        System.out.println(vendedor);
	}

}
