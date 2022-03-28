package DK;

import java.io.*;
import java.util.*;

class 최다호출_API_KEY extends main {

	public void b() throws IOException {
		reader = new FileReader(infile);
		br = new BufferedReader(reader);
		String line = "";
		String index = "";
		int max = 0;
		String maxkey = "";
		int cnt = 0;
		key = new HashMap<String, Integer>();
		
		while((line=br.readLine())!=null) {
			if(line.contains("[200]")) {
				cnt++;
			index = line.substring(line.indexOf("=")+1, line.indexOf("&"));
			if(key.containsKey(index)) {
				key.put(index, key.get(index)+1);
				
				if(max<key.get(index)) {
					max = key.get(index);
					maxkey = index;
					
				}
			}
			else {
			key.put(index, 1);
			
			}
			}
		}
		System.out.println("최다호출 API KEY");
		System.out.println(maxkey);
		System.out.println("\n\n\n");
		
		
	}

}
