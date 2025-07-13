package pt.ua.prog2;
public class Contacto {
  private String nome;
  private String telefone;
  private String eMail;
  
  public Contacto(String Nome, String tele)
  {
	  nome=Nome;
	  telefone=tele;
  }
  public Contacto(String Nome, String tele, String mail)
  {
	 nome = Nome;
	 telefone = tele;
	 eMail = mail;
  }
  public String nome(){
	  return nome.toUpperCase();
  }
  public String telefone(){
	  return telefone;
  }
  public String eMail(){
	  return eMail;
  }
}
