package aula9;

public class Cone extends DecoratorGelado{
	
	Cone(Gelado g){
		super(g);
	}

	@Override
	public void base(int i) {
		g.base(i);
		System.out.print(" num cone");
	}
}
