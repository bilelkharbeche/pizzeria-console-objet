/**
 * 
 */
package fr.pizzeria.model;

import java.util.Scanner;

/**
 * @author KHARBECHE Bilel
 *
 */
public class SupprimerPizzaService extends MenuService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.pizzeria.model.MenuService#executeUC(java.util.Scanner)
	 */
	@Override
	public void executeUC(Scanner scanner, PizzaMemDao dao) {
		// TODO Auto-generated method stub
		for (Pizza pizza : dao.findAllPizzas()) {
			System.out.println(pizza);
		}

		System.out.println("Veuillez choisir le code de la pizza à supprimer : \n");
		String pizzaSuppr = scanner.nextLine();
		dao.deletePizza(pizzaSuppr);
	}

}
