/**
 * 
 */
package fr.pizzeria.model;

import java.util.Scanner;

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
	public void executeUC(Scanner scanner, PizzaMemDao dao) {
		// TODO Auto-generated method stub
		System.out.println("Veuillez saisir le code : \n");
		String codeNew = scanner.nextLine();
		System.out.println("Veuillez saisir le nom (sans espace) : \n");
		String nomNew = scanner.nextLine();
		System.out.println("Veuillez saisir le prix : \n");
		String prixNew = scanner.nextLine();
		double prixDoubleNew = Double.parseDouble(prixNew);

		Pizza pizzaAdd = new Pizza(codeNew, nomNew, prixDoubleNew);
		dao.saveNewPizza(pizzaAdd);
	}

}
