package aula9;

public abstract class DecoratorGelado implements Gelado{
	
	protected Gelado g;
	
	DecoratorGelado(Gelado g){
		this.g=g;
	}
	
	@Override
	public void base(int i) {
		
		g.base(i);
	}

}
