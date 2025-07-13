package aula12;

import java.util.*;
import aula4.*;

public class p122 {

	public static void main(String[] args) {
		List<Quadrado> quad=new ArrayList<>();
		
		quad.add(new Quadrado(5,5,2));
		quad.add(new Quadrado(2,7,5));;
		System.out.println(maiorFiguraJ8(quad).get());
		System.out.println(maiorFiguraPerJ8(quad).get());
		System.out.println(areaTotalJ8(quad));
		System.out.println(areaTotalJ8(quad, "Quadrado"));
		System.out.println(areaTotalJ8(quad, "Circulo"));
	}
	
	private static Optional<? extends Figura> maiorFiguraJ8(List<? extends Figura> figs){
		return figs.stream().max((a,b) -> a.compareTo(b));
	}
	
	private static Optional<? extends Figura> maiorFiguraPerJ8(List<? extends Figura> figs){
		return figs.stream().max((a,b) -> Double.compare(a.perimetro(), b.perimetro()));
	}
	
	private static double areaTotalJ8(List<? extends Figura> figs){
		double areaTotal=figs.stream()
						.mapToDouble(Figura::area)
						.sum();
		
		return areaTotal;
	}
	
	
	private static double areaTotalJ8(List<? extends Figura> figs, String subt){
		double areaTotal=figs.stream()
						.filter(p -> p.getClass().getSimpleName().equals(subt))
						.mapToDouble(Figura::area)
						.sum();
		
		return areaTotal;
	}
	
}
