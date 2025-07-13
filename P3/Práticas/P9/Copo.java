package aula9;

public class Copo extends DecoratorGelado{
	
	Copo(Gelado g){
		super(g);
	}

	@Override
	public void base(int i) {
		g.base(i);
		System.out.print(" num copo");
	}
}
