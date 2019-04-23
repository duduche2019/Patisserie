package model;

public class Patisserie {
	
	public String nom;
	public int prix;
	
	
	public Patisserie(String nom, int prix) {
		
		this.nom = nom;
		this.prix = prix;
	}


	public String getNom() {
		return nom;
	}


	public int getPrix() {
		return prix;
	}


	@Override
	public String toString() {
		return "Patisserie [nom=" + nom + ", prix=" + prix + "]";
	}
	
	

	
	
}
