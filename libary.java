package French;

import java.util.*;
public class Library {
	public ArrayList<p> list;
	public Library() {
		list = new ArrayList<p>();
		init();
	}
	
	void init() {
		// avoir
		list.add(new p("j'", "ai", "avoir"));
		list.add(new p("tu", "as", "avoir"));
		list.add(new p("il" , "a", "avoir"));
		list.add(new p("elle", "a", "avoir"));
		list.add(new p("nous", "avons", "avoir"));
		list.add(new p("vous", "avez", "avoir"));
		list.add(new p("ils", "ont", "avoir"));
		list.add(new p("elles", "ont", "avoir"));
		
		list.add(new p("je", "suis", "etre"));
		list.add(new p("tu", "es", "etre"));
		list.add(new p("il" , "est", "etre"));
		list.add(new p("elle", "est", "etre"));
		list.add(new p("nous", "sommes", "etre"));
		list.add(new p("vous", "etes", "etre"));
		list.add(new p("ils", "sont", "etre"));
		list.add(new p("elles", "sont", "etre"));
		
		list.add(new p("je", "vais", "aller"));
		list.add(new p("tu", "vas", "aller"));
		list.add(new p("il" , "va", "aller"));
		list.add(new p("elle", "va", "aller"));
		list.add(new p("nous", "allons", "aller"));
		list.add(new p("vous", "allez", "aller"));
		list.add(new p("ils", "vont", "aller"));
		list.add(new p("elles", "vont", "aller"));
		
		list.add(new p("je", "fais", "faire"));
		list.add(new p("tu", "fais", "faire"));
		list.add(new p("il" , "fait", "faire"));
		list.add(new p("elle", "fait", "faire"));
		list.add(new p("nous", "faisons", "faire"));
		list.add(new p("vous", "faites", "faire"));
		list.add(new p("ils", "font", "faire"));
		list.add(new p("elles", "font", "faire"));
		
		list.add(new p("je", "sors", "sortir"));
		list.add(new p("tu", "sors", "sortir"));
		list.add(new p("il" , "sort", "sortir"));
		list.add(new p("elle", "sort", "sortir"));
		list.add(new p("nous", "sortons", "sortir"));
		list.add(new p("vous", "sortez", "sortir"));
		list.add(new p("ils", "sontent", "sortir"));
		list.add(new p("elles", "sontent", "sortir"));
		
		list.add(new p("je", "pars", "partir"));
		list.add(new p("tu", "pars", "partir"));
		list.add(new p("il" , "part", "partir"));
		list.add(new p("elle", "part", "partir"));
		list.add(new p("nous", "partons", "partir"));
		list.add(new p("vous", "partez", "partir"));
		list.add(new p("ils", "partent", "partir"));
		list.add(new p("elles", "partent", "partir"));
		
		list.add(new p("j'", "ouvre", "ouvrir"));
		list.add(new p("tu", "ouvres", "ouvrir"));
		list.add(new p("il" , "ouvre", "ouvrir"));
		list.add(new p("elle", "ouvre", "ouvrir"));
		list.add(new p("nous", "ouvrons", "ouvrir"));
		list.add(new p("vous", "ouvrez", "ouvrir"));
		list.add(new p("ils", "ouvrent", "ouvrir"));
		list.add(new p("elles", "ouvrent", "ouvrir"));
		
		list.add(new p("je", "dis", "dire"));
		list.add(new p("tu", "dis", "dire"));
		list.add(new p("il" , "dit", "dire"));
		list.add(new p("elle", "dit", "dire"));
		list.add(new p("nous", "disons", "dire"));
		list.add(new p("vous", "dites", "dire"));
		list.add(new p("ils", "disent", "dire"));
		list.add(new p("elles", "disent", "dire"));
		
		list.add(new p("je", "veux", "vouloir"));
		list.add(new p("tu", "veux", "vouloir"));
		list.add(new p("il" , "veut", "vouloir"));
		list.add(new p("elle", "veut", "vouloir"));
		list.add(new p("nous", "voulons", "vouloir"));
		list.add(new p("vous", "voulez", "vouloir"));
		list.add(new p("ils", "voulent", "vouloir"));
		list.add(new p("elles", "veulent", "vouloir"));
		

		list.add(new p("je", "peux", "pouvoir"));
		list.add(new p("tu", "peux", "pouvoir"));
		list.add(new p("il" , "peut", "pouvoir"));
		list.add(new p("elle", "peut", "pouvoir"));
		list.add(new p("nous", "pouvons", "pouvoir"));
		list.add(new p("vous", "pouvez", "pouvoir"));
		list.add(new p("ils", "pouvent", "pouvoir"));
		list.add(new p("elles", "peuvent", "pouvoir"));
		
		list.add(new p("je", "dois", "devoir"));
		list.add(new p("tu", "dois", "devoir"));
		list.add(new p("il" , "doit", "devoir"));
		list.add(new p("elle", "doit", "devoir"));
		list.add(new p("nous", "devons", "devoir"));
		list.add(new p("vous", "devez", "devoir"));
		list.add(new p("ils", "doivent", "devoir"));
		list.add(new p("elles", "doivent", "devoir"));
		
		list.add(new p("j'", "ecris", "ecrire"));
		list.add(new p("tu", "ecris", "ecrire"));
		list.add(new p("il" , "ecrit", "ecrire"));
		list.add(new p("elle", "ecrit", "ecrire"));
		list.add(new p("nous", "ecrivons", "ecrire"));
		list.add(new p("vous", "ecrivez", "ecrire"));
		list.add(new p("ils", "ecrivent", "ecrire"));
		list.add(new p("elles", "ecrivent", "ecrire"));
		
		list.add(new p("je", "lis", "lire"));
		list.add(new p("tu", "lis", "lire"));
		list.add(new p("il" , "lit", "lire"));
		list.add(new p("elle", "lit", "lire"));
		list.add(new p("nous", "lisons", "lire"));
		list.add(new p("vous", "lisez", "lire"));
		list.add(new p("ils", "lisent", "lire"));
		list.add(new p("elles", "lisent", "lire"));
		
		
		list.add(new p("je", "vois", "voir"));
		list.add(new p("tu", "vois", "voir"));
		list.add(new p("il" , "voit", "voir"));
		list.add(new p("elle", "voit", "voir"));
		list.add(new p("nous", "voyons", "voir"));
		list.add(new p("vous", "voyez", "voir"));
		list.add(new p("ils", "voient", "voir"));
		list.add(new p("elles", "voient", "voir"));
		
		list.add(new p("je", "mets", "mettre"));
		list.add(new p("tu", "mets", "mettre"));
		list.add(new p("il" , "met", "mettre"));
		list.add(new p("elle", "met", "mettre"));
		list.add(new p("nous", "mettons", "mettre"));
		list.add(new p("vous", "mettez", "mettre"));
		list.add(new p("ils", "mettent", "mettre"));
		list.add(new p("elles", "metten", "mettre"));
		
		
		list.add(new p("je", "viens", "venir"));
		list.add(new p("tu", "viens", "venir"));
		list.add(new p("il" , "vient", "venir"));
		list.add(new p("elle", "vient", "venir"));
		list.add(new p("nous", "venons", "venir"));
		list.add(new p("vous", "venez", "venir"));
		list.add(new p("ils", "viennent", "venir"));
		list.add(new p("elles", "viennent", "venir"));
		
		list.add(new p("je", "prends", "prendre"));
		list.add(new p("tu", "prends", "prendre"));
		list.add(new p("il" , "prend", "prendre"));
		list.add(new p("elle", "prends", "prendre"));
		list.add(new p("nous", "prenons", "prendre"));
		list.add(new p("vous", "prenez", "prendre"));
		list.add(new p("ils", "prennent", "prendre"));
		list.add(new p("elles", "prennent", "prendre"));
		
		list.add(new p("je", "bois", "boire"));
		list.add(new p("tu", "bois", "boire"));
		list.add(new p("il" , "boit", "boire"));
		list.add(new p("elle", "boit", "boire"));
		list.add(new p("nous", "buvons", "boire"));
		list.add(new p("vous", "buvez", "boire"));
		list.add(new p("ils", "boivent", "boire"));
		list.add(new p("elles", "boivent", "boire"));
		
		list.add(new p("j'", "achete", "acheter"));
		list.add(new p("tu", "achetes", "acheter"));
		list.add(new p("il" , "achete", "acheter"));
		list.add(new p("elle", "achete", "acheter"));
		list.add(new p("nous", "achetons", "acheter"));
		list.add(new p("vous", "achetez", "acheter"));
		list.add(new p("ils", "achetent", "acheter"));
		list.add(new p("elles", "achetent", "acheter"));
		
		list.add(new p("je", "prefere", "prefere"));
		list.add(new p("tu", "preferes", "prefere"));
		list.add(new p("il" , "prefere", "prefere"));
		list.add(new p("elle", "prefere", "prefere"));
		list.add(new p("nous", "preferons", "prefere"));
		list.add(new p("vous", "preferez", "prefere"));
		list.add(new p("ils", "preferent", "prefere"));
		list.add(new p("elles", "preferent", "prefere"));
		
		
	}
	
	int findVerbIndex(String verb) {
		for(int i = 0; i < list.size(); i++)
			if(list.get(i).verb.equals(verb))
				return i;
		return -1;
	}
	
	String findConjugation(String verb, String pronoun) {
		for(int i = 0; i < list.size(); i++)
			if(list.get(i).verb.equals(verb) && list.get(i).pronoun.equals(pronoun))
				return list.get(i).conjugate;
		return "NOTFOUND";
	}
	
	int generateRandomIndex(int size) {
		return (int)(Math.random() * size);
	}
	

	static class p{
		String pronoun, verb, conjugate;
		public p(String pronoun, String conjugate, String verb) {
			this.pronoun = pronoun;
			this.conjugate = conjugate;
			this.verb = verb;
		}
	}
	
}

