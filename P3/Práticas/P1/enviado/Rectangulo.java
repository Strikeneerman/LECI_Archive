package aula1;

public class Rectangulo {
	
	private int comp,larg;
	
	public Rectangulo(int comp, int larg) {
		this.comp = comp;
		if(comp <= 0) {
			throw new IllegalArgumentException("Medida invalida");
		}
		this.larg = larg;
		if(larg <= 0) {
			throw new IllegalArgumentException("Medida invalida");
		}
	}	
	
	public int peri_rect() {
		return 2*this.comp + 2*this.larg;
	}
	
	public int area_rect() {
		return this.comp*this.larg;
	}
	
	public String toString() {
		return String.format("Retangulo de comprimento %d, largura %d, perimetro %d e area %d.",this.comp,this.larg,this.peri_rect(),this.area_rect());
	}

}
