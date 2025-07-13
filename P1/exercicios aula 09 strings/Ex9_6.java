import java.util.Scanner;
import static java.lang.System.*;
import java.io.*;
public class Ex9_6{
	static Scanner sc = new Scanner(System.in); 
	public static void main (String[] args) {
		String frase,traduzido;
		System.out.print("Insira uma frase: ");
		frase = sc.nextLine();
		traduzido= trad(frase);
		System.out.println(traduzido);
		
	}
	public static String trad(String a){
		
		String new_a="";
		for (int i=0;i<a.length();i++)
			{char tra= a.charAt(i);
				if(tra=='l') new_a = new_a + 'u';
				else if (tra=='L') new_a = new_a + 'U';
				else if (tra=='r' || tra=='R') {}
				else{ new_a=new_a+tra;}
			
			}
		return new_a;
		}
}

