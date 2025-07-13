package aula4;

public class Rectangulo extends Figura{
	private int larg;
	
	public Rectangulo(int comp, int larg) {
		super(0,0,comp);
		this.larg = larg;
		if(larg <= 0) {
			throw new IllegalArgumentException("Medida inv�lida");
		}
	}
			
	public Rectangulo(int x, int y, int comp, int larg) {
		super(x,y,comp);
		this.larg = larg;
		if(larg <= 0) {
			throw new IllegalArgumentException("Medida inv�lida");
		}
	}
	
	public Rectangulo(Rectangulo a) {
		super((int)a.centro().getx(),(int)a.centro().gety(),a.getcomp());
		this.larg = a.getlarg();
	}
	
	public int getcomp() {
		return super.raio();
	}
	
	public int getlarg() {
		return this.larg;
	}	
	
	public double perimetro() {
		return 2*(getcomp()) + 2*(this.larg);
	}
	
	public double area() {
		return (getcomp())*(this.larg);
	}
	
	@Override public String toString() {
		return String.format("Retangulo de comprimento %d e largura %d e centro(%d,%d).",super.raio(),this.larg,(int)this.centro().getx(),(int)this.centro().gety());
	}
	
	public boolean equals(Rectangulo b) {
		if(b.centro().getx() == this.centro().getx() && b.centro().gety() == this.centro().gety()) {
			if(b.getcomp() == this.getcomp() && b.getlarg() == this.getlarg()){
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
