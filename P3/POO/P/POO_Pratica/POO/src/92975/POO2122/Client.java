
public class Client {
    private String nome;
    private String localidade;

    public Client (String nome, String localidade){
        this.setCliente(nome,localidade);
    }

    public void setCliente(String nome, String localidade){
        
        this.nome = nome;
        this.localidade = localidade;
        
    }

    public String getNome(){
        return this.nome;
    }

    public String getLocalidade(){
        return this.localidade;
    }
}
