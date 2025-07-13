import java.util.*;
import static java.lang.System.*;

public class P11 {
	public static void main(String[] args) {
		out.print("Input:");

		Scanner sc = new Scanner(in);
		String strin = sc.nextLine();
		String[] words = strin.split(" ");
		sc.close();

		System.out.printf("Number of numeric characters: %d \n",countNumb(strin));
		System.out.printf("Is Upper Case: %B\n",onlyUpper(strin));
		System.out.printf("Is Lower Case: %B\n",onlyLower(strin));
		System.out.printf("Number of words: %d\n",nwords(words));
		String newStr = null;
		for(String word : words) {
			newStr = "";
			System.out.printf("\nOriginal word: \"%s\"\n",word);
			for(int i = 0; i < word.length()-1; i+=2) {
				newStr += String.valueOf(word.charAt(i+1))+String.valueOf(word.charAt(i));
			}
			if(word.length() % 2 != 0) newStr += word.charAt(word.length()-1);
			System.out.printf("Modified word: \"%s\"\n",newStr);
		}
	}
	
	static int countNumb(String str) {
		int nNumbers = 0;
		for(int i = 0; i < str.length();i++) {
			if(Character.isDigit(str.charAt(i))) 
				nNumbers++;
		}
		return nNumbers;
	}
	static boolean onlyUpper(String str) {
		
		return str.toUpperCase().equals(str);
	}
	static boolean onlyLower(String str) {
		
		return str.toLowerCase().equals(str);
	}
	static int nwords(String[] Warray) {
		
		return Warray.length;
	}

	

}