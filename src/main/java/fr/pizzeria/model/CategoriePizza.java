/**
 * 
 */
package fr.pizzeria.model;

/**
 * @author KHARBECHE Bilel
 *
 */
public enum CategoriePizza {

	/** VIANDE : Categorie pour les pizzas contenant de la viande */
	VIANDE("Viande"),
	/** POISSON : Categorie pour les pizzas contenant du poisson */
	POISSON("Poisson"),
	/** SANS_VIANDE : Categorie pour les pizzas sans viandes */
	SANS_VIANDE("Sans Viande");

	/** categorie : String */
	private String categorie;

	private CategoriePizza(String categorie) {
		this.categorie = categorie;
	}

	static boolean CategExists(String str) {
		CategoriePizza[] cat = CategoriePizza.values();
		for (CategoriePizza c : cat) {
			if (c.name().equals(str)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Getter
	 * 
	 * @return the categorie
	 */
	public String getCategorie() {
		return categorie;
	}

	/**
	 * Setter
	 * 
	 * @param categorie
	 *            the categorie to set
	 */
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

}
