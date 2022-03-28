package DK;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class main {
	static File infile; 
	static File outfile;
	static FileReader reader;
	static FileOutputStream writer;
	static PrintStream ps;
	static BufferedReader br;
	static FileWriter fw; 
	static HashMap<String, Integer> key;
	static HashMap<String, Integer> rank;
	
	public static void main(String[] args) throws IOException {
		infile = new File("input.log");
		outfile = new File("output.log");
		reader = new FileReader(infile);
		writer = new FileOutputStream(outfile);
		ps = new PrintStream(writer);
		System.setOut(ps);
		br = new BufferedReader(reader);
		fw = new FileWriter(outfile);
		
		APIservice B = new APIservice();
		웹브라우저_사용비율 C = new 웹브라우저_사용비율();
		최다호출_API_KEY A = new 최다호출_API_KEY();
		A.b();
		B.c();
		C.a();
		
		
		
	}

}
