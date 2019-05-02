/**
 * 
 */
package fr.diginamic.pizzeria_console_objet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import fr.pizzeria.model.Pizza;

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
		ArrayList<Pizza> listePizza = new ArrayList();

		Pizza pep = new Pizza("PEP", "Pépéroni", 12.50);
		Pizza mar = new Pizza("MAR", "Margherita", 14.00);
		Pizza rein = new Pizza("REIN", "La Reine", 11.00);
		Pizza fro = new Pizza("FRO", "La 4 fromages", 12.00);
		Pizza can = new Pizza("CAN", "La cannibale", 12.50);
		Pizza sav = new Pizza("SAV", "La savoyarde", 13.00);
		Pizza ori = new Pizza("ORI", "L’orientale", 13.50);
		Pizza ind = new Pizza("IND", "L’indienne", 14.00);

		listePizza.add(pep);
		listePizza.add(mar);
		listePizza.add(rein);
		listePizza.add(fro);
		listePizza.add(can);
		listePizza.add(sav);
		listePizza.add(ori);
		listePizza.add(ind);

		System.out.println(menu);

		String choix = sc.nextLine();

		while (choix != "99") {
			switch (choix) {
			case "1":
				for (Pizza liste : listePizza) {
					System.out.println(liste.getCode() + " -> " + liste.getLibelle() + " (" + liste.getPrix() + "€)");
				}

				System.out.println("\n" + menu);
				break;
			case "2":
				System.out.println("Veuillez saisir le code : \n");
				String codeNew = sc.nextLine();
				System.out.println("Veuillez saisir le nom (sans espace) : \n");
				String nomNew = sc.nextLine();
				System.out.println("Veuillez saisir le prix : \n");
				String prixNew = sc.nextLine();
				double prixDoubleNew = Double.parseDouble(prixNew);

				Pizza pizzaAdd = new Pizza(codeNew, nomNew, prixDoubleNew);
				listePizza.add(pizzaAdd);

				System.out.println("\n" + menu);
				break;
			case "3":
				for (Pizza liste : listePizza) {
					System.out.println(liste.getCode() + " -> " + liste.getLibelle() + " (" + liste.getPrix() + "€)");
				}

				System.out.println("\nVeuillez choisir le code de la pizza à modifier");
				String codeAModifier = sc.nextLine();

				for (int i = 0; i < listePizza.size(); i++) {
					Pizza codeRecup = listePizza.get(i);
					if (codeAModifier.equals(codeRecup.getCode())) {
						System.out.println("Veuillez saisir le nouveau code : \n");
						String modifCode = sc.nextLine();
						System.out.println("Veuillez saisir le nouveau nom (sans espace) : \n");
						String modifNom = sc.nextLine();
						System.out.println("Veuillez saisir le nouveau prix : \n");
						String modifPrix = sc.nextLine();
						double modifDoublePrix = Double.parseDouble(modifPrix);

						codeRecup.setCode(modifCode);
						codeRecup.setLibelle(modifNom);
						codeRecup.setPrix(modifDoublePrix);
					}
				}
				System.out.println(menu);
				break;
			case "4":
				for (Pizza liste : listePizza) {
					System.out.println(liste.getCode() + " -> " + liste.getLibelle() + " (" + liste.getPrix() + "€)");
				}

				System.out.println("Veuillez choisir le code de la pizza à supprimer : \n");
				String pizzaSuppr = sc.nextLine();
				Iterator<Pizza> iter = listePizza.iterator();

				while (iter.hasNext()) {
					if (pizzaSuppr.equals(iter.next().getCode())) {
						iter.remove();
					}
				}
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
