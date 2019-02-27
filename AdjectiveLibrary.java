package French;
import java.util.ArrayList;
public class AdjectiveLibrary {
	ArrayList<p> list;
	ArrayList<x> pronoun;
	public AdjectiveLibrary() {
		list = new ArrayList<p>();
		pronoun = new ArrayList<x>();
		init();
		init2();
	}
	public String getType(int index) {
		return pronoun.get(index).mf;
	}
	public String getPronoun(int index) {
		return pronoun.get(index).pronoun;
	}
	public void init2() {
		pronoun.add(new x("Il est", "masculin"));
		pronoun.add(new x("Elle est", "feminin"));
		pronoun.add(new x("Ils sont", "masculin pluriel"));
		pronoun.add(new x("Elles sont", "feminin pluriel"));
	}
	public void clean() {
		for(int i = 0; i < list.size(); i++) {
			p cur = list.get(i);
			if(cur.a == 0 && cur.b == 0 && cur.c == 0 && cur.d == 0)
				list.remove(i);
		}
	}
	public void init() {
		list.add(new p("grand grande grands grandes"));
		list.add(new p("intelligent intelligente intelligents intelligentes"));
		list.add(new p("content contente contents contentes"));
		list.add(new p("bleu bleue bleus bleues"));
		list.add(new p("petit petite petits petites"));
		list.add(new p("determine determinee determines determinees"));
		
		// "e" --> "e"
		list.add(new p("agile agile agiles agiles"));
		list.add(new p("drole drole droles droles"));
		list.add(new p("raisonnable raisonnable raisonnables raisonnables"));
		
		// "if" --> "ive"
		list.add(new p("creatif creative creatifs creatives"));
		list.add(new p("sportif sportive sportifs sportives"));
		
		// "eux" --> "euse"
		list.add(new p("curieux curieuse curieux curieuses"));
		list.add(new p("serieux serieuse serieux serieuses"));
		
		// "eur" --> "euse"
		list.add(new p("travailleur travailleuse travailleurs travailleuses"));
		list.add(new p("blagueur blagueuse blagueurs blagueuses"));
		
		// n or l --> double them add e
		list.add(new p("canadien canadienne canadiens canadiennes"));
		list.add(new p("ponctuel ponctuelle ponctuels ponctuelles"));
		
		// eau --> elle
		list.add(new p("beau belle beaux belles")); //  bel if theres a vowel after
		list.add(new p("nouveau nouvelle nouveaux nouvelles")); // nouvel if theres a vowel after
		
		// anc --> anche
		list.add(new p("blanc blanche blancs blanches"));
		list.add(new p("franc franche francs franches"));
		
		list.add(new p("doux douce doux douces"));
		list.add(new p("favori favorite favoris favorites"));
		list.add(new p("fou folle fous folles")); // fol if theres a vowel after
		list.add(new p("frais fraiche frais fraiches")); // accent on 'i' (tophat)
		list.add(new p("gentil gentille gentils gentilles"));
		list.add(new p("jaloux jalouse jaloux jalouses"));
		list.add(new p("long longue longs longues"));
		list.add(new p("gros grosse gros grosses"));
		list.add(new p("bon bonne bons bonnes"));
		
		list.add(new p("poli polie polis polies"));
		list.add(new p("actif active actifs actives"));
		list.add(new p("impulsif impulsive impulsifs impulsives"));
		list.add(new p("flatteur flatteuse flatteurs flatteuses"));
		list.add(new p("trompeur trompeuse trompeurs trompeuses"));
		list.add(new p("dangereux dangereuse dangereux dangereuses"));
		list.add(new p("complique compliquee compliques compliquees"));
		list.add(new p("difficile difficile difficiles difficiles"));
		list.add(new p("merveilleux merveilleuse merveilleux merveilleuses"));
		list.add(new p("nerveux nerveuse nerveux nerveuses"));
		list.add(new p("cruel cruelle cruels cruelles"));
		list.add(new p("gris grise gris grises"));
		
		list.add(new p("joli jolie jolis jolies"));
		list.add(new p("jeune jeune jeunes jeunes"));
		list.add(new p("vieux vielle vieils vieilles")); // could be vieil for masc sing and vieils for masc plur
		list.add(new p("premier premiere premiers premieres"));
		list.add(new p("autre autre autres autres"));
		
		
		
		
		
	}
	static class p{
		String masculine, masculine_pluriel, feminin, feminin_pluriel;
		int a, b, c, d;
		//String masculine, String masculine_pluriel, String feminin, String feminin_pluriel
		public p(String x) {
			String array[] = x.split(" ");
			this.masculine = array[0];
			this.feminin = array[1];
			this.masculine_pluriel = array[2];
			this.feminin_pluriel = array[3];
			this.a = 1;
			this.b = 1;
			this.c = 1;
			this.d = 1;
		}
	}
	static class x{
		String pronoun, mf;
		public x(String pronoun, String mf) {
			this.pronoun = pronoun;
			this.mf = mf;
		}
	}
}
