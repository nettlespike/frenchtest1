package French;

import java.util.*;
public class Library {
	public ArrayList<p> list;
	public Library() {
		list = new ArrayList<p>();
	}
	
	void init() {
		// avoir
		list.add(new p("j", "ai", "avoir"));
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

