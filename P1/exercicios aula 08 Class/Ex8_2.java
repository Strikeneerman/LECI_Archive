import java.util.Scanner;
public class Ex8_2 {
	static final Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		Ponto2D origem=new Ponto2D();
		origem.x=0;
		origem.y=0;
		int i=0;
		double somaDist=0;
		double d=0, maior_d=0;
		Ponto2D maior_p=new Ponto2D();
		
		Ponto2D pontos = new Ponto2D();
		
		do{
			pontos= lerPonto();
			printPonto(pontos);
			d = distancia(pontos,origem);
			if(pontos.x==0 && pontos.y==0){}
			else {i++;} 
			if(d>maior_d){maior_d=d;maior_p=pontos;}
			somaDist+=d;
				
			}while (pontos.x!=0 || pontos.y!=0);
		System.out.println("A soma das distâncias dos "+ i + " pontos à origem é "+somaDist);
		System.out.printf("O ponto mais afastado da origem foi :(%f;%f)",maior_p.x,maior_p.y);
	}
	
	
	
	public static Ponto2D lerPonto()
	{
		Ponto2D p = new Ponto2D();
		
		System.out.print("Introduza um ponto: \n");
		System.out.print("Coordenada x: ");
		p.x= sc.nextDouble();
		System.out.print("Coordenada y: ");
		p.y= sc.nextDouble();
		return p;
	}
	
	
	
	public static void printPonto(Ponto2D a){
		System.out.printf("(%2.1f;%2.1f)\n",a.x,a.y);
		}
		
		
	public static double distancia(Ponto2D a,Ponto2D b){
		double d;
		d = Math.sqrt(Math.pow(b.x-a.x,2)+Math.pow(b.y-a.y,2));
		return d;
		}
		
		
}
	class Ponto2D{
		double x,y;
	} 

