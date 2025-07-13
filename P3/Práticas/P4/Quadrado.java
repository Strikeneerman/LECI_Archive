package aula4;

public class Quadrado extends Figura {
	
	public Quadrado(int x, int y, int lado) {
		super(x,y,lado);
		if(lado <= 0) {
			throw new IllegalArgumentException("Medida inv�lida");
		}
	}
	
	public Quadrado(int lado) {
		super(0,0,lado);
	}
	
	public Quadrado(Quadrado a) {
		super((int)a.centro().getx(),(int)a.centro().gety(),a.getlado());
	}
	
	public int getlado() {
		return super.raio();
	}
	
	public double perimetro() {
		return 4*(getlado());
	}
	
	public double area() {
		return (super.raio())*(super.raio());
	}
	
	@Override public String toString() {
		return String.format("Quadrado de lado %d e centro(%d,%d).",super.raio(),(int)this.centro().getx(),(int)this.centro().gety());
	}
	
	public boolean equals(Quadrado b) {
		if(b.centro().getx() == this.centro().getx() && b.centro().gety() == this.centro().gety()) {
			if(b.getlado() == this.getlado()){
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
}
