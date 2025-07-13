package Aula5;

public class Livro {
    private int id=99;
    private String titulo;
    private String tipoEmprestimo;
    
    public Livro(String titulo,String tipoEmprestimo){
        this.titulo = titulo;
        this.tipoEmprestimo = tipoEmprestimo;
        this.id++;
    }
    public Livro(String titulo){
        this.titulo = titulo;
        tipoEmprestimo = "NORMAL";
        this.id++;
    }

    public int getId(){
        return this.id;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTipoEmprestimo(String tipoEmprestimo){
        this.tipoEmprestimo = tipoEmprestimo;
    }

    public String toString(){
        return "Livro: "+id+"; "+titulo+"; "+tipoEmprestimo;
    }
}
