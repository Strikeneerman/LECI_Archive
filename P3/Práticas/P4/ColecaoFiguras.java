package aula4;

public class ColecaoFiguras {

	final double maxArea;
	Figura[] fig = new Figura[0];
	
	public ColecaoFiguras(double maxArea){
		assert maxArea>0;
		this.maxArea = maxArea;
	}
	
	public boolean addFigura(Figura f){
		if(search(f)!=-1) return false;
		
		if (f.area()>maxArea) return false;
		
		fig=addF(f);
		
		return true;
	}
	
	public boolean delFigura(Figura f){
		
		int p=search(f);
		if(p==-1) return false;
		
		Figura[] c = new Figura[fig.length-1];
		fig[p]=null;
		for(int i=0;i<fig.length;i++){
			if(i<p)
				c[i]=fig[i];
			else if(i>p)
				c[i-1]=fig[i];
		}
		fig=c;
		return true;
	}
	
	public double areaTotal(){
		double max=0;
		
		for(Figura f: fig)
			max+=f.area();
		return max;
	}
	
	public boolean exists(Figura f){
		return search(f)!=-1;
	}
	
	public String toString(){
		return "Coleção de"+fig.length+"figuras com círculos, retângulos e quadrados.";
	}
	
	public Figura[] getFiguras(){
		return fig;
	}
	
	public Ponto[] getCentros(){
		Ponto[] centro=new Ponto[fig.length];
		
		for(int i=0;i<centro.length;i++){
			centro[i]=fig[i].centro();
		}
		
		return centro;
	}
	
	private Figura[] addF(Figura f){
		Figura[] c = new Figura[fig.length+1];
		
		for(int i=0;i<fig.length;i++){
			c[i]=fig[i];
		}
		c[fig.length]=f;
		return c;
		
	}
	
	private int search(Figura f){
		for(int i=0;i<fig.length;i++){
			if(fig[i].equals(f)) return i;
		}
		
		return -1;
	}
	
	
}
