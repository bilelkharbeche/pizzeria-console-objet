/**
 * 
 */
package fr.diginamic.pizzeria_console_objet;

import java.util.Scanner;

/**
 * @author KHARBECHE Bilel
 *
 */
public class PizzeriaAdminConsoleApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String menu = "***** Pizzeria Administration *****\n\n1. Lister les pizzas \n2. Ajouter une nouvelle pizza \n3. Mettre à jour une pizza \n4. Supprimer une pizza \n99. Sortir";

		System.out.println(menu);

		String choix = sc.nextLine();

		while (choix != "99") {
			switch (choix) {
			case "1":
				System.out.println("Liste des pizzas");
				System.out.println(menu);
				break;
			case "2":
				System.out.println("Ajout d'une nouvelle pizza");
				System.out.println(menu);
				break;
			case "3":
				System.out.println("Mise à jour d'une pizza");
				System.out.println(menu);
				break;
			case "4":
				System.out.println("Suppression d'une pizza");
				System.out.println(menu);
				break;
			default:
				System.out.println("Aucun numéro correspondant");
				System.out.println(menu);
			}
			choix = sc.nextLine();
		}

		if (choix == "99") {
			System.out.println("Au revoir");
		}
	}

}
