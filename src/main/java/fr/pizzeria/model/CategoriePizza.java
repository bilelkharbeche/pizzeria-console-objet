/**
 * 
 */
package fr.pizzeria.model;

/**
 * @author KHARBECHE Bilel
 *
 */
public enum CategoriePizza {

	VIANDE("Viande"), POISSON("Poisson"), SANS_VIANDE("Sans Viande");

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
