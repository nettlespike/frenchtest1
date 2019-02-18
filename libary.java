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

