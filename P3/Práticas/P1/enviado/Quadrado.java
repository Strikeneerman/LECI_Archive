package aula1;

public class Quadrado {

private int lado;
	
	public Quadrado(int lado) {
		this.lado = lado;
		if(lado <= 0) {
			throw new IllegalArgumentException("Medida invalida");
		}
	}
	
	public int peri_quad() {
		return 4*this.lado;
	}
	
	public int area_quad() {
		return this.lado*this.lado;
	}
	
	public String toString() {
		return String.format("Quadrado de lado %d, perimetro %d e area %d.",this.lado,this.peri_quad(),this.area_quad());
	}

}
