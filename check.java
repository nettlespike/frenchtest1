package French;
import java.util.*;
import java.io.*;
public class check{
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
static StringTokenizer st;
static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args)throws IOException{//4ever	
	System.out.println("Hello, welcome to THE FRENCH QUIZ!");	
	System.out.println("Please enter the number of questions");
	check2 S = new check2(0, readInt());
	System.out.println("You may exit at any time by typing STOP");
	Library lib = new Library();
	lib.init();
	
	System.out.println("Please conjugate the following verbs");
	int last = 0;
	for(int times = 0; times < S.q; times++) {
		int c = (int)(Math.random()*lib.list.size());
		if(last == c)
			c = (int)(Math.random()*lib.list.size());
		last = c;
		System.out.println(lib.list.get(c).verb+": ");
		for(int j = 0; j < 8; j++) {
			int t = (int)(Math.random()*8);
			System.out.print
		}
	
	}
	
	out.close();
	br.close();
	}

static String next() throws IOException{
	while(st==null||!st.hasMoreTokens())
		st = new StringTokenizer(br.readLine().trim());
	return st.nextToken();
}
static int readInt() throws IOException{
	return Integer.parseInt(next());
}
static String readLine() throws IOException{
	return br.readLine().trim();
}

static long readLong() throws IOException{
	return Long.parseLong(next());
}
static double readDouble() throws IOException{
	return Double.parseDouble(next());
}
static class check2 {
	int points;
	int q;
	ArrayList<String>wrong= new ArrayList<String>();
	public check2(int points, int q) {
		this.points = points;
		this.q= q;
	}
	public void score() {
		System.out.println(points+"/"+q);
	}
	void wrong(String word) {
		wrong.add(word); 
		Collections.sort(wrong);
	}
}

}
