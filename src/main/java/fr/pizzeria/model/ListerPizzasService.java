/**
 * 
 */
package fr.pizzeria.model;

import java.util.Scanner;

/**
 * @author KHARBECHE Bilel
 *
 */
public class ListerPizzasService extends MenuService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.pizzeria.model.MenuService#executeUC(java.util.Scanner)
	 */
	@Override
	public void executeUC(Scanner scanner, PizzaMemDao dao) {
		// TODO Auto-generated method stub
		for (Pizza listePizza : dao.findAllPizzas()) {
			System.out.println(listePizza);
		}

	}

}
