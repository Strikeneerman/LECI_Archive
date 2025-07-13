package aula9;

import java.util.*;
import java.io.*;

public class ScannerAbeirense implements Iterator<String>, Closeable{
	
	Scanner sc;
	
	public ScannerAbeirense(InputStream i) {
		
		sc = new Scanner(i);
		
	}
	
	public ScannerAbeirense(File f) throws FileNotFoundException {
		
		sc = new Scanner(f);
		
	}
	
	@Override
	public void close() throws IOException{
		
		sc.close();
	}
	
	@Override
	public boolean hasNext(){
		
		return sc.hasNext();
	} 
	
	public boolean hasNextLine() {
		
		return sc.hasNextLine();
	}
	
	@Override
	public String next() {
		String line=sc.next();
		line= line.replace("v", "b");
		line= line.replace("V", "B");
		return line;
	}
	
	public String nextLine() {
		String line=sc.nextLine();
		line= line.replace("v", "b");
		line= line.replace("V", "B");
		return line;
	}
	
	

}
