
public class Circulo {
	private double raio;
	private Ponto centro;
	
	public Circulo(double raio, Ponto centro) {
		this.raio = raio;
		if(raio <= 0) {
			throw new IllegalArgumentException("Medida de raio inv�lida");
		}	
		this.centro = centro;
	}
	
	public Circulo(double x, double y, double r) {
		Ponto a = new Ponto(x,y);
		this.centro = a;
		this.raio = r;
		if(raio <= 0) {
			throw new IllegalArgumentException("Medida de raio inv�lida");
		}	
		
	}
	
	public double peri_circ() {
		return 2*this.raio*Math.PI;
	}
	
	public double area_circ() {
		return this.raio*this.raio*Math.PI;
	}
	
	public String toString() {
		return "Circulo de raio "+ this.raio + " ,centro " + this.centro.toString() + " ,per�metro " + this.peri_circ() +" e �rea " +this.area_circ();
	}
	public boolean equals(Circulo a) {
		if(this.centro.equals(a.centro) && this.raio == a.raio) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean inters(Circulo b) {
		double c1c2 = Math.sqrt((this.centro.getx() - b.centro.getx())*(this.centro.getx() - b.centro.getx()) + (this.centro.gety() - b.centro.gety())*(this.centro.gety() - b.centro.gety())); 
		double r1r2 = this.raio + b.raio;
		
		if(c1c2 <= r1r2 ) {
			return true;
		}
		else {
			return false;
		}
	}
		
}



