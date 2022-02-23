package aplicacao;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.VendedorDao;
import model.entidadades.Departamento;
import model.entidadades.Vendedor;

public class Programa {

	public static void main(String[] args) {
       
		Scanner sc= new  Scanner(System.in);
		
		VendedorDao vendedorDao = DaoFactory.createDao();

		System.out.println("=== teste 1 : vendedor findbyID  =====");
		Vendedor vendedor = vendedorDao.findById(3);
		System.out.println(vendedor);

		System.out.println("\n=== teste 1 : vendedor findbyDepartamento  =====");
		Departamento departamento = new Departamento(2, null);

		List<Vendedor> list = vendedorDao.findByDepartamento(departamento);

		for (Vendedor obj : list) {
			System.out.println(obj);
		}

		System.out.println("\n=== teste 4 : vendedor findbyDepartamento  =====");
		Vendedor newVendedor = new Vendedor(null, "fabio", "ddddddddddd", new Date(), 4444.44, departamento);
		vendedorDao.insert(newVendedor);
		System.out.println("inserta vendedeor ID= " + newVendedor.getId());
	
		System.out.println("\n=== teste 5 : vendedor updaet  =====");

	
		vendedor= vendedorDao.findById(1);
		vendedor.setNoome("MARIA ALGUSTA ");
		vendedorDao.update(vendedor);
		System.out.println("Update completed");
		
		System.out.println("\n=== teste 6 : vendedor delete  =====");
		System.out.println("Entre com ID do vendedor para deletid  ");
		int id = sc.nextInt();
		vendedorDao.deleteById(id);
		System.out.println("Delete completed");
		sc.close();
	}

}
