import java.util.Scanner;
public class Pitagoras
{
	public static void main (String[] args) 
	{
		int a,b,c;
		double hip;
		for(a=1;a<100;a++){
			for(b=1;b<100;b++){
				if(a<b){
					hip=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
					if(hip>=100)break;
					if(hip%1==0){
						c= (int)hip;
						
						System.out.printf("%d %d %d \n",a,b,c);
						}
					}
				}
			}
	}
}

