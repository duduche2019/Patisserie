package web;

import java.util.ArrayList;

public class Magasin {
	
	public ArrayList<Patisserie> mespatisseries;
	
	
	public Magasin(ArrayList<Patisserie> mespatisseries) {
		
		this.mespatisseries = mespatisseries;
	}


	public ArrayList<Patisserie> getMespatisseries() {
		return mespatisseries;
	}


	@Override
	public String toString() {
		return "Magasin [mespatisseries=" + mespatisseries + "]";
	}
	
	
	
	

}
