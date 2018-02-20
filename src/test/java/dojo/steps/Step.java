package dojo.steps;

import org.junit.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.fr.Alors;
import cucumber.api.java.fr.Etantdonné;
import cucumber.api.java.fr.Quand;

public class Step {

	private Panier panier;

	@Etantdonné("^un panier vide$")
	public void un_panier_vide() throws Throwable {
		panier = new Panier();
	}

	@Alors("^la valeur du panier est (\\d+)$")
	public void la_valeur_du_panier_est(int arg1) throws Throwable {
		Assert.assertEquals(arg1, panier.total());
	}
	
	@Etantdonné("^le prix du \"([^\"]*)\" étant (\\d+)$")
	public void le_prix_du_étant(String produit, int prix) throws Throwable {
		panier.setPrix(produit, prix);
	}

	@Quand("^on ajoute (\\d+) \"([^\"]*)\"$")
	public void on_ajoute(int nombre, String produit) throws Throwable {
		panier.ajouterProduit(produit, nombre);
	}
	
	@Etantdonné("^le prix d'une \"([^\"]*)\" étant (\\d+)$")
	public void le_prix_d_une_étant(String produit, int prix) throws Throwable {
	    le_prix_du_étant(produit, prix);
	}
}
