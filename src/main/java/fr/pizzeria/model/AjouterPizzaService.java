/**
 * 
 */
package fr.pizzeria.model;

import java.util.Scanner;

import org.apache.commons.lang3.math.NumberUtils;

import fr.pizzeria.exception.SavePizzaException;

/**
 * Exécute le cas d'utilsiation 2 : ajouter une nouvelle pizza
 * 
 * @author KHARBECHE Bilel
 *
 */
public class AjouterPizzaService extends MenuService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.pizzeria.model.MenuService#executeUC(java.util.Scanner)
	 */
	@Override
	public void executeUC(Scanner scanner, IPizzaDao dao) throws SavePizzaException {
		// TODO Auto-generated method stub
		System.out.println("Veuillez saisir le code : \n");
		String codeNew = scanner.nextLine();

		if (codeNew.isEmpty()) {
			throw new SavePizzaException("Aucune valeur saisie");
		} else {
			System.out.println("Veuillez saisir le nom (sans espace) : \n");
		}

		String nomNew = scanner.nextLine();

		if (nomNew.isEmpty()) {
			throw new SavePizzaException("Aucune valeur saisie");
		} else {
			System.out.println("Veuillez saisir le prix : \n");
		}

		String prixNew = scanner.nextLine();

		if (!NumberUtils.isCreatable(prixNew)) {
			throw new SavePizzaException("Valeur interdite");
		} else {
			System.out.println("Veuillez saisin une catégorie");
		}

		double prixDoubleNew = Double.parseDouble(prixNew);
		String catNew = scanner.nextLine();

		if (!CategoriePizza.CategExists(catNew)) {
			throw new SavePizzaException("Aucune catégorie saisie");
		} else {
			CategoriePizza cat = CategoriePizza.valueOf(catNew);
			Pizza pizzaAdd = new Pizza(codeNew, nomNew, prixDoubleNew, catNew);
			dao.saveNewPizza(pizzaAdd);
		}
	}

}
