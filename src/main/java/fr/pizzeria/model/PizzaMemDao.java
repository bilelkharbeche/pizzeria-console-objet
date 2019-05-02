/**
 * 
 */
package fr.pizzeria.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author KHARBECHE Bilel
 *
 */
public class PizzaMemDao implements IPizzaDao {

	/** listePizza : ArrayList<Pizza> */
	private ArrayList<Pizza> listePizza = new ArrayList();

	public PizzaMemDao() {
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
	}

	@Override
	public List<Pizza> findAllPizzas() {
		return listePizza;
	}

	@Override
	public void saveNewPizza(Pizza pizza) {
		// TODO Auto-generated method stub
		listePizza.add(pizza);
	}

	@Override
	public void updatePizza(String codePizza, Pizza pizza) {
		// TODO Auto-generated method stub
		Pizza update = findPizzaByCode(codePizza);
		update.setCode(pizza.getCode());
		update.setLibelle(pizza.getLibelle());
		update.setPrix(pizza.getPrix());
	}

	@Override
	public void deletePizza(String codePizza) {
		// TODO Auto-generated method stub
		Pizza delete = findPizzaByCode(codePizza);
		listePizza.remove(delete);
	}

	@Override
	public Pizza findPizzaByCode(String codePizza) {
		// TODO Auto-generated method stub
		Pizza pizzaFound = null;

		for (Pizza pizza : listePizza) {
			if (pizza.getCode().equals(codePizza)) {
				pizzaFound = pizza;
			}
		}
		return pizzaFound;
	}

	@Override
	public boolean pizzaExists(String codePizza) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Getter
	 * 
	 * @return the listePizza
	 */
	public ArrayList<Pizza> getListePizza() {
		return listePizza;
	}

	/**
	 * Setter
	 * 
	 * @param listePizza
	 *            the listePizza to set
	 */
	public void setListePizza(ArrayList<Pizza> listePizza) {
		this.listePizza = listePizza;
	}
}
