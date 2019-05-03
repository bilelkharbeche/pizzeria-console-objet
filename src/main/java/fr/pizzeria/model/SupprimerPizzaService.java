/**
 * 
 */
package fr.pizzeria.model;

import java.util.Scanner;

import fr.pizzeria.exception.DeletePizzaException;

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
	public void executeUC(Scanner scanner, IPizzaDao dao) throws DeletePizzaException {
		// TODO Auto-generated method stub
		for (Pizza pizza : dao.findAllPizzas()) {
			System.out.println(pizza);
		}

		System.out.println("Veuillez choisir le code de la pizza à supprimer : \n");
		String pizzaSuppr = scanner.nextLine();

		if (!dao.pizzaExists(pizzaSuppr)) {
			throw new DeletePizzaException("Le code saisi n'existe pas");
		} else {
			dao.deletePizza(pizzaSuppr);
		}
	}

}
