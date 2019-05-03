/**
 * 
 */
package fr.pizzeria.model;

import java.util.Scanner;

import org.apache.commons.lang3.math.NumberUtils;

import fr.pizzeria.exception.SavePizzaException;

/**
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
			double prixDoubleNew = Double.parseDouble(prixNew);
			Pizza pizzaAdd = new Pizza(codeNew, nomNew, prixDoubleNew);
			dao.saveNewPizza(pizzaAdd);
		}
	}

}
