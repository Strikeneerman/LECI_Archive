package aula4;

public abstract class Figura implements Comparable<Figura>{
	private Ponto centro;
	private int raio;
	
	public Figura(int x,int y, int raio) {
		this.centro = new Ponto(x,y);
		this.raio = raio;
	}
	
	public abstract double area();
	public abstract String toString();
	public abstract double perimetro();
	
	public int raio() {
		return this.raio;
	}
	
	public Ponto centro() {
		return this.centro;
	}
	
	public int compareTo(Figura f) {
		if(this.area() < f.area()) return -1; 
		else if(this.area() > f.area()) return 1; 
		else return 0;
	}

}