package aula1;

public class Ponto {

	private double x;
	private double y;
	
	public Ponto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getx() {
		return this.x;
	}
	public double gety() {
		return this.y;
	}
	
	public String toString() {
		return "("+this.x +";" + this.y+")";
	}
	
	public boolean equals(Ponto i) {
		if (this.x == i.x && this.y == y) {
			return true;
		}
		else {
			return false;
		}
	}

}
