package French;
import java.util.*;
import java.io.*;
public class check{
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
static StringTokenizer st;
static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	
  public static void main(String[] args)throws IOException{	
	out.println("Hello, welcome to THE FRENCH QUIZ!");	
	out.println("Please enter the number of questions");
	check2 S = new check2(0, readInt());
	out.println("You may exit at any time by typing STOP");
	
	out.println("Please conjugate the following verbs");
	for(int times = 0; times < S.q; times++) {
		System.out.println();
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
}
