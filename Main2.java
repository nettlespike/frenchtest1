package French;
import java.util.*;
public class Main2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		AdjectiveLibrary lib = new AdjectiveLibrary();
		while(!lib.list.isEmpty()) {
			System.out.println(lib.list.size());
			int rand2 = (int)(Math.random() * lib.list.size());
			int n = lib.list.get(rand2).a + lib.list.get(rand2).b + lib.list.get(rand2).c + lib.list.get(rand2).d;
			int rand = (int)(Math.random() * n);
			String op = lib.getType(rand);
			if(op.equals("masculin") && lib.list.get(rand2).a != 0) {
				System.out.println(lib.getPronoun(rand) + " " + lib.list.get(rand2).masculine);
				String ans = sc.next();
				if(ans.equals(lib.list.get(rand2).masculine)) {
					System.out.println("correct!");
					lib.list.get(rand2).a = 0;
				}
				else System.out.println("Incorrect, its " + lib.list.get(rand2).masculine);
			}
			
			if(op.equals("feminin") && lib.list.get(rand2).b != 0) {
				System.out.println(lib.getPronoun(rand) + " " + lib.list.get(rand2).masculine);
				String ans = sc.next();
				if(ans.equals(lib.list.get(rand2).feminin)) {
					System.out.println("correct!");
					lib.list.get(rand2).b = 0;
				}
				else System.out.println("Incorrect, its " + lib.list.get(rand2).feminin);
			}
			
			if(op.equals("masculin pluriel") && lib.list.get(rand2).c != 0) {
				System.out.println(lib.getPronoun(rand) + " " + lib.list.get(rand2).masculine);
				String ans = sc.next();
				if(ans.equals(lib.list.get(rand2).masculine_pluriel)) {
					System.out.println("correct!");
					lib.list.get(rand2).c = 0;
				}
				else System.out.println("Incorrect, its " + lib.list.get(rand2).masculine_pluriel);
			}
			
			if(op.equals("feminin pluriel") && lib.list.get(rand2).d != 0) {
				System.out.println(lib.getPronoun(rand) + " " + lib.list.get(rand2).masculine);
				String ans = sc.next();
				if(ans.equals(lib.list.get(rand2).feminin_pluriel)) {
					System.out.println("correct!");
					lib.list.get(rand2).d = 0;
				}
				else System.out.println("Incorrect, its " + lib.list.get(rand2).feminin_pluriel);
			}
			lib.clean();
		}
		sc.close();
	}
}
