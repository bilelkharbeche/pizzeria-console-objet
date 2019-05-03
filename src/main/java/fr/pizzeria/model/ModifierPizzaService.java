/**
 * 
 */
package fr.pizzeria.model;

import java.util.Scanner;

import org.apache.commons.lang3.math.NumberUtils;

import fr.pizzeria.exception.UpdatePizzaException;

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
	public void executeUC(Scanner scanner, IPizzaDao dao) throws UpdatePizzaException {
		// TODO Auto-generated method stub
		for (Pizza pizza : dao.findAllPizzas()) {
			System.out.println(pizza);
		}

		System.out.println("\nVeuillez choisir le code de la pizza à modifier");
		String codeAModifier = scanner.nextLine();

		if (!dao.pizzaExists(codeAModifier)) {
			throw new UpdatePizzaException("Le code saisi n'existe pas");
		} else {
			System.out.println("Veuillez saisir le nouveau code : \n");
		}

		String modifCode = scanner.nextLine();

		if (modifCode.isEmpty()) {
			throw new UpdatePizzaException("Aucun code saisi");
		} else {
			System.out.println("Veuillez saisir le nouveau nom (sans espace) : \n");
		}

		String modifNom = scanner.nextLine();

		if (modifNom.isEmpty()) {
			throw new UpdatePizzaException("Aucun nom saisi");
		} else {
			System.out.println("Veuillez saisir le nouveau prix : \n");
		}

		String modifPrix = scanner.nextLine();

		if (!NumberUtils.isCreatable(modifPrix)) {
			throw new UpdatePizzaException("Valeur interdite");
		} else {
			double modifDoublePrix = Double.parseDouble(modifPrix);
			dao.updatePizza(codeAModifier, new Pizza(modifCode, modifNom, modifDoublePrix));
		}
	}

}
