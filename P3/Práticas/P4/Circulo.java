package aula4;

public class Circulo extends Figura {
	
	public Circulo(int x, int y, int raio) {
		super(x,y,raio);
		if(raio <= 0) {
			throw new IllegalArgumentException("Medida de raio inv�lida");
		}	
	}
	
	public Circulo(int r) {
		super(0,0,r);
	}
	
	public Circulo(Circulo a) {
		super((int)a.centro().getx(),(int)a.centro().gety(),a.getraio());
	}
	
	public int getraio() {
		return super.raio();
	}
	
	public double perimetro() {
		return 2*(super.raio())*Math.PI;
	}
	
	public double area() {
		return super.raio()*super.raio()*Math.PI;
	}
	
	@Override public String toString() {
		return "Circulo de raio "+ super.raio() + " e Centro " + super.centro().toString();
	}
	public boolean equals(Circulo a) {
		if(super.centro().equals(a.centro()) && super.raio() == a.raio()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean inters(Circulo b) {
		double c1c2 = Math.sqrt((super.centro().getx() - b.centro().getx())*(super.centro().getx() - b.centro().getx()) + (super.centro().gety() - b.centro().gety())*(super.centro().gety() - b.centro().gety())); 
		double r1r2 = super.raio() + b.raio();
		
		if(c1c2 <= r1r2 ) {
			return true;
		}
		else {
			return false;
		}
	}
		
}