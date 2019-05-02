/**
 * 
 */
package fr.pizzeria.model;

import java.util.Scanner;

/**
 * @author KHARBECHE Bilel
 *
 */
public class ModifierPizzaService extends MenuService {

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

		System.out.println("\nVeuillez choisir le code de la pizza à modifier");
		String codeAModifier = scanner.nextLine();

		System.out.println("Veuillez saisir le nouveau code : \n");
		String modifCode = scanner.nextLine();
		System.out.println("Veuillez saisir le nouveau nom (sans espace) : \n");
		String modifNom = scanner.nextLine();
		System.out.println("Veuillez saisir le nouveau prix : \n");
		String modifPrix = scanner.nextLine();
		double modifDoublePrix = Double.parseDouble(modifPrix);

		dao.updatePizza(codeAModifier, new Pizza(modifCode, modifNom, modifDoublePrix));

	}

}
