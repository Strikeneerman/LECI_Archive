package aula9;

import java.io.*;

public class P91 {
	
	public static void main(String[] args) throws IOException{
		ScannerAbeirense sc = new ScannerAbeirense(System.in);
		
		System.out.println(sc.hasNextLine());	
		System.out.println(sc.next());
		
		File f = new File("C:\\Users\\leand\\eclipse-workspace\\p3\\src\\aula9\\testevb.txt");
		ScannerAbeirense sc2 = new ScannerAbeirense(f);
		sc.close();
		
		while(sc2.hasNextLine()) {
			
			System.out.println(sc2.nextLine());
		}
		
		
		sc2.close();
		
	}

}
