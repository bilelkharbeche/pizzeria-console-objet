/**
 * 
 */
package fr.diginamic.pizzeria_console_objet;

import java.util.Scanner;

import fr.pizzeria.exception.DeletePizzaException;
import fr.pizzeria.exception.SavePizzaException;
import fr.pizzeria.exception.UpdatePizzaException;
import fr.pizzeria.model.AjouterPizzaService;
import fr.pizzeria.model.IPizzaDao;
import fr.pizzeria.model.ListerPizzasService;
import fr.pizzeria.model.ModifierPizzaService;
import fr.pizzeria.model.PizzaMemDao;
import fr.pizzeria.model.SupprimerPizzaService;

/**
 * @author KHARBECHE Bilel
 *
 */
public class PizzeriaAdminConsoleApp {

	/**
	 * @param args
	 * @throws UpdatePizzaException
	 */
	public static void main(String[] args) {

		String menu = "***** Pizzeria Administration *****\n\n1. Lister les pizzas \n2. Ajouter une nouvelle pizza \n3. Mettre à jour une pizza \n4. Supprimer une pizza \n99. Sortir";
		String choix = "";
		Scanner sc = new Scanner(System.in);
		IPizzaDao dao = new PizzaMemDao();
		ListerPizzasService listeP = new ListerPizzasService();
		AjouterPizzaService addP = new AjouterPizzaService();
		ModifierPizzaService modifP = new ModifierPizzaService();
		SupprimerPizzaService suppP = new SupprimerPizzaService();

		while (!choix.equals("99")) {

			System.out.println(menu);
			System.out.println("Veuillez choisir une option:");
			choix = sc.nextLine();

			switch (choix) {
			case "1":
				listeP.executeUC(sc, dao);
				// System.out.println("\n" + menu);
				break;

			case "2":
				try {
					addP.executeUC(sc, dao);
				} catch (SavePizzaException e) {
					System.out.println(e.getMessage());
				}
				// System.out.println("\n" + menu);
				break;

			case "3":
				try {
					modifP.executeUC(sc, dao);
				} catch (UpdatePizzaException e) {
					System.out.println(e.getMessage());
				}

				// System.out.println(menu);
				break;

			case "4":
				try {
					suppP.executeUC(sc, dao);
				} catch (DeletePizzaException e) {
					System.out.println(e.getMessage());
				}

				// System.out.println(menu);
				break;

			case "99":
				System.out.println("A+");
				break;

			default:
				System.out.println("Aucun numéro correspondant");
				System.out.println(menu);
				break;
			}
		}
	}

}
