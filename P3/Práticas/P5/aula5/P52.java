package aula5;

public class P52 {
		
public static void main(String args[]){
		
		Veiculo[] v = new Veiculo[4];
		v[0] = new Bicicleta("Vermelho",1,"Orbita",1999,45,"Orbita",4);
		v[1] = new Automovel("Branco",5,"Mercedes",2006,220,20,2,23,6);
		v[2] = new Moto("Preto", 2, "Yamaha", 2010,160, 250, 5, 20, "NEXX");
		v[3] = new CarroPolicia("Verde",2,"Opel",2011,300,40,2,23, 6,"GNR","25");
		
		UtilCompare.sortArray(v);
		for(Veiculo veic: v){
			System.out.println(veic);
		}
	}
}
