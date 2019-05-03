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

	public abstract void executeUC(Scanner scanner, IPizzaDao dao) throws StockageException;
}
