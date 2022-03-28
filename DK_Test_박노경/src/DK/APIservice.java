package DK;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class APIservice extends main {

	public static void c() throws IOException {
		reader = new FileReader(infile);
		br = new BufferedReader(reader);
		
		rank = new HashMap<String, Integer>(); 
		String line = "";
		rank.put("blog", 0);
		rank.put("book", 0);
		rank.put("image", 0);
		rank.put("knowledge", 0);
		rank.put("news", 0);
		rank.put("vclip", 0);
		
		while((line = br.readLine()) != null) {
	if(line.contains("[200]"))
			if(line.contains("blog")) {
			rank.put("blog", rank.get("blog")+1);
			}
			else if(line.contains("book")) {
				rank.put("book", rank.get("book")+1);
			}
			else if(line.contains("image")) {
				rank.put("image", rank.get("image")+1);
			}
			else if(line.contains("knowledge")) {
				rank.put("knowledge", rank.get("knowledge")+1);
			}
			else if(line.contains("news")) {
				rank.put("news", rank.get("news")+1);
			}
			else if(line.contains("vclip")){
				rank.put("vclip", rank.get("vclip")+1);
			}
			
		}
		List<Entry <String, Integer>> entryList = new ArrayList<Entry<String, Integer>>(rank.entrySet());
		
		Collections.sort(entryList, new Comparator<Entry<String, Integer>>() {
			
			public int compare(Entry<String, Integer> obj2, Entry<String, Integer> obj1) {
				return obj1.getValue().compareTo(obj2.getValue());
			}
		});
		int cnt  = 0 ;
		System.out.println("상위 3개의 API Serivice ID와 각각의 요청 수");
		for(Entry<String, Integer> entry : entryList) {
			cnt++;
			System.out.println(entry.getKey()+ " : " + entry.getValue());
			
			if(cnt == 3) {
				break;
			}
		}

		System.out.println("\n\n\n");
		
	}
}
	


