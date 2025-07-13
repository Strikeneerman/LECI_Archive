
public class Video {
	private String title;
	private String categoria;
	private String idade;
	private int id;
	private int rating_total;
	private double rating;
	private int num_emprest;
	private static int count = 0;
	private boolean owned = false;
	
	public Video(String title, String categoria, String idade) {
		count++;
		this.id = count;
		this.title = title;
		this.categoria = categoria;
		this.idade = idade;
		if(idade == "ALL" && idade == "M6" && idade == "M12" && idade == "M16" && idade == "M18" ) {
			throw new IllegalArgumentException("IDADE INVALIDA, TENTE NOVAMENTE"); 
		}
		this.rating = 0;
		this.num_emprest = 0;
		this.rating_total = 0;
	}
	
	public int getid() {
		return this.id;
	}
	
	public String gettitle() {
		return this.title;
	}
	
	public String getcategoria() {
		return this.categoria;
	}
	
	public String getidade() {
		return this.idade;
	}
	
	public void setOwned(boolean owns) {
		this.owned = owns;
	}
	
	public boolean isOwned() {
		return this.owned;
	}
	
	public void setRating(int rat) {
		this.num_emprest++;
		this.rating_total = this.rating_total + rat;
		this.rating = this.rating_total / this.num_emprest;
	}
	
	public String toString() {
		return "filme "+ this.title + ", categoria "+this.categoria+" e idade para "+this.idade;
	}
	
	public String toStringRating() {
		return "FILME: "+this.title +"| RATING: "+this.rating;
	}
	
}
