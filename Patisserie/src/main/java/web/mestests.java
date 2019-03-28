package web;

import java.util.ArrayList;

public class mestests {
	
	public static void main(String[] args ) {
		
		Patisserie p1= new Patisserie("pain",5);
		Patisserie p2= new Patisserie("croissant",4);
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		ArrayList<Patisserie> lp= new ArrayList<Patisserie>();
		lp.add(p1);
		lp.add(p2);
		lp.add(new Patisserie("Brioche",10));
		
		
	}
}
