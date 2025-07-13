package aula10;

import java.util.*;

import aula4.*;
import aula9.Data;
import aula9.Pessoa;

public abstract class TestGeneric{
	public static void main(String[] args) {
		
		VetorGeneric<Pessoa> vp = new VetorGeneric<Pessoa>();
		for (int i=0; i<10; i++)
			vp.addElem(new Pessoa("Bebé no Vector "+i,1000+i,Data.now()));
		Iterator<Pessoa> vec = vp.iterator();
		
		printSet(vp.iterator());
		
		ListaGeneric<Pessoa> lp = new ListaGeneric<Pessoa>();
		while ( vec.hasNext() )
			lp.addElem( vec.next() );
		
		Iterator<Pessoa> lista = lp.iterator();
		while ( lista.hasNext() )
			System.out.println( lista.next() );
		
		ListaGeneric<Figura> figList = new ListaGeneric<>();
		figList.addElem(new Circulo (1,3, 1));
		figList.addElem(new Quadrado(3,4, 2));
		figList.addElem(new Rectangulo(1,2, 2,5));
		
		printSet(figList.iterator());
		
		System.out.println("Soma da Area de Lista de Figuras: " + sumArea(figList));
		
		ListaGeneric< Rectangulo > quadList = new ListaGeneric<>();
		quadList.addElem(new Quadrado(3,4, 2));
		quadList.addElem(new Rectangulo(1,2, 2,5));
		System.out.println("Soma da Area de Lista de Quadrados: " + sumArea(quadList));
	}
				
	
	private static double sumArea(ListaGeneric<? extends Figura> f){
		double area=0;
		Iterator<? extends Figura> i = f.iterator();
		
		while(i.hasNext()){
			area+=(i.next()).area();
		}
		
		return area;
	}
	
	private static <T> void printSet(Iterator<T> i){
		while (i.hasNext()){
			System.out.println(i.next());
		}
	}
	
}