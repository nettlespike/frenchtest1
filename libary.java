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

