package number;

/**
 * Tipo de dados representando uma fracção.
 * Nesta versão pretende-se garantir um invariante (interno) mais forte:
 * as frações armazenadas devem ter sempre denominador positivo.
 * Isto permite simplificar alguns métodos.
 *
 * AVISO: Vários métodos podem dar erros devidos a overflow.
 * (Não deve haver problemas com numeradores e denominadores até 46430.)
 *
 * @author João Manuel Rodrigues
 * 2007--2018
 */

public class Fraction implements Comparable <Fraction>
{
  private int num;
  private int den;
  public static double Zero;
  public static double ONE;

  /** Cria uma nova fracção a partir de um par (numerador, denominador).
   *  @param num numerador da nova fracção.
   *  @param den denominador da nova fracção.
   *  <b>Exige (pré-condição):</b> den != 0.
   */
  public Fraction(int num, int den) {
    assert den != 0; // check precondition
    this.num = num;
    this.den = den;
    assert invariant(); // check object invariant
  }

  /* Testa o invariante do objeto.
   * Ou seja, a propriedade que define a validade de uma fração.
   * É para testar em asserções nos métodos.
   */
  public boolean invariant() {
	 boolean n = true; // O denominador não pode ser nulo!
	 if(den != 0){
		 if (den < 0){
			 num = -num;
			 den = -den;
		 }
		 else{
			n = true; 
		 }
	 }
	 else{
	 n = false;}
	 return n;
     }

  /** Converte uma string numa fracção.
   *  @param str String no formato {@code "inteiro/inteiro"}
   *             representando uma fracção válida.
   *  @return fracção correspondente a {@code str}.
   */
  public static Fraction parseFraction(String str) {
    String[] p = str.split("/", 2);  // divide a string em até 2 partes
    int n = Integer.parseInt(p[0]);  // extrai numerador
    int d = (p.length==2)? Integer.parseInt(p[1]) : 1;
        // se tem 2 partes, extrai denominador, senão fica d=1
    if (d == 0) return null;
    return new Fraction(n, d);
  }

  /** Converte a fracção numa string.
   *  @return string com a representação desta fracção.
   */
  public String toString() {
    // Com um invariante mais forte, podemos simplificar este método!
    String s;
    s = num + "/" + den;
    return s;
  }

  /** Devolve o numerador da fracção.
   *  @return numerador desta fração.
   */
  public int num() { return num; }

  /** Devolve o denominador da fracção.
   *  @return denominador desta fração.
   */
  public int den() { return den; }

  /** Multiplica esta fracção por outra (this * b).
   *  @param b multiplicando.
   *  @return fracção produto de this * b.
   */
  public Fraction multiply(Fraction b) {
    int n = num*b.num;
    int d = den*b.den;
    Fraction p = new Fraction(n, d); // product
    return p;
  }

  /** Adiciona esta fracção com outra (this + b).
   *  @param b fracção a adicionar a esta.
   *  @return fracção soma de this + b.
   */
  public Fraction add(Fraction b) {
    int n = num*b.den + den*b.num;
    int d = den*b.den;
    Fraction s = new Fraction(n, d); // sum
    return s;
  }

  public Fraction divide(Fraction b) {
    int n = num/b.num;
    int d = den/b.den;
    int m = n/d;
    int t = m*d;
    assert t==n :"Div Invalida";
    Fraction q = new Fraction(n, d); // div
    return q;
    
  }

  public Fraction subtract(Fraction b) {
    int n = num*b.den - den*b.num;
    int d = den*b.den;
    int m = n-d;
    int t = m+d;
    assert t==n :"Sub Invalida";
    Fraction r = new Fraction(n, d); //sub
    return r;
  }

  public boolean equals(Fraction b) {
    boolean m = true;
    if(num*b.den == den*b.num)
		 {m = true;}
    else{m = false;}
    return m;
  }
  public int compareTo(Fraction b) {
	  int d=0;
	  int a=num-b.num;
	if(num*b.den == den*b.num){d=0;}
    else if(a!=0)
    {
		d=a;
	}
    else{
		int t=b.den-den;
		if(t!=0){
			d=t;
			}
		else{
			d=0;
			}
	}
    return d;
  }
  
  

}
