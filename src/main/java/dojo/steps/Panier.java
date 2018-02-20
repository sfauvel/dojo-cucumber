package dojo.steps;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Panier {

	private final Map<String, Integer> produits = new HashMap<>();
	private final Map<String, Integer> referentielPrix = new HashMap<>();
	
	public int total() {
		Stream<Integer> map = produits.entrySet().stream()
				.map(e -> referentielPrix.get(e.getKey()) * e.getValue());
		
		return map.reduce(0, (a, b) -> a + b);		
	}

	public void setPrix(String produit, int prix) {
		referentielPrix.put(produit, prix);		
	}

	public void ajouterProduit(String produit, int quantite) {
		int quantiteActuelle = produits.getOrDefault(produit, 0);
		produits.put(produit, quantite + quantiteActuelle);
	}

}
