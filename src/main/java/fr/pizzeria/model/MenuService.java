/**
 * 
 */
package fr.pizzeria.model;

import java.util.Scanner;

import fr.pizzeria.exception.StockageException;

/**
 * @author KHARBECHE Bilel
 *
 */
public abstract class MenuService {

	/**
	 * @param scanner
	 *            scanner qui permet d'interagir avec l'utilisateur
	 * @param dao
	 *            gère la persistence des pizzas
	 * @throws StockageException
	 *             ss l'utilisateur saisit une information inccorecte lors de
	 *             l'éxecution d'un cas d'utilisation
	 */
	public abstract void executeUC(Scanner scanner, IPizzaDao dao) throws StockageException;
}
