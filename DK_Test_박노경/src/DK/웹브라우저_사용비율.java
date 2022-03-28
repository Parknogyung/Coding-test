package DK;
import java.io.*;
class 웹브라우저_사용비율 extends main{

	public void a() throws IOException  {
		reader = new FileReader(infile);
		br = new BufferedReader(reader);

	String line = "";
	int cnt = 0;
	int IEcnt = 0;
	int chromcnt = 0;
	int Operacnt = 0;
	int Safaricnt = 0;
	int Firefoxcnt =0;
	
	while((line = br.readLine()) != null) {
	if(line.contains("[200]"))                              
	if(line.contains("http://apis.daum.net/search")) {		
		cnt++;
	if(line.contains("[IE]")) {
		IEcnt++;
	}
	else if(line.contains("[Chrome]")) {
		chromcnt++;
	}
	else if(line.contains("[Opera]")) {
		Operacnt++;
	}
	else if(line.contains("[Safari]")) {
		Safaricnt++;
	}
	else if(line.contains("[Firefox]")) {
		Firefoxcnt++;
	}
	}
	
	}
	br.close();

	System.out.println("웹브라우저_사용비율");
	System.out.printf("IE: %.0f%%\nChrome: %.0f%%\nOpera: %.0f%%\nSafari: %.0f%%\nFirefox: %.0f%%\n", (double)IEcnt/cnt *100, (double)chromcnt/cnt *100, (double)Operacnt/cnt*100, (double)Safaricnt/cnt*100, (double)Firefoxcnt/cnt*100);
	System.out.println("\n\n\n");
	
	}


	}
