/*
 * JAM, 19-jan-2018
 * Exame final
 */
import java.util.Scanner;
import java.io.*;

 public class ExameFinalB {

	public static void main(String[] args) throws IOException{
		Pais[] paises;
		paises = lerFichHum("PaisesHumid.txt");
		procurarListar(paises," "); // espaço lista tudo
		procurarListar(paises,"56"); // lista paises onde apareca "56"
		int [] mins = humMin(paises);
		for(int i=0; i<mins.length; i++)
 			System.out.printf("Minimo = %5d %3d %s%n", paises[mins[i]].dia,
								paises[mins[i]].humidade, paises[mins[i]].nome);

		int[] freq = freqHum(paises);
		printFreq(freq);
		// exame final
		// verifica se dia e pais existe
		System.out.println(diaPaisExiste(paises,paises.length,24,"Marrocos"));
		// calcula array sem dia e paises repetidos
		paises=removerRepetidos(paises);

		// ordena por ordem crescente do dia
		bubbleSort(paises);
		// guarda num ficheiro
		gravarPais(paises, "PaisesHumidOrd.txt");
	}
	// Pergunta 1) - função para ler as humidades do ficheiro
	static Pais[] lerFichHum(String nomeF) throws IOException{
		File f = new File(nomeF);
		Scanner lerF = new Scanner(f);
		int nPaises = lerF.nextInt(); // 1ª linha, nº de humidades
		Pais[] p = new Pais[nPaises];
		int n=0;
		while (lerF.hasNextLine() && n < nPaises) {
			p[n] = new Pais();
			p[n].dia = lerF.nextInt();
			p[n].humidade = lerF.nextInt();
			p[n].nome = lerF.nextLine().trim(); // trim() tira espaços no início e fim
			n++;
		}
		lerF.close();
		return p;
	}
	// Pergunta 2) função para procurar uma frase e listar
	static void procurarListar(Pais[] p,String frase) {
		System.out.printf("Dia Hum Pais%n");
		for (int i=0; i<p.length; i++) {
			String linha = p[i].dia + " " +p[i].humidade+" "+p[i].nome;
			if (linha.indexOf(frase) >=0) {
				System.out.printf("%5d %3d %s%n", p[i].dia, p[i].humidade,
				p[i].nome);
			}
		}
	}
	// Pergunta 3) função para calcular as humidades minimas.
	// devolve um array com os indices dos dias e paises onde ocorreu a humidade minima.
	static int [] humMin(Pais [] p) {
		int [] mm;
		int min = 0;
		int cont = 1;
		for (int i=1; i<p.length; i++)
			if(p[i].humidade < p[min].humidade) {
				min = i;
				cont = 1;
			}
		else if(p[i].humidade == p[min].humidade)
			cont++;
		mm = new int[cont];
		int n=0;
		for(int i=0; i<p.length; i++)
			if(p[i].humidade == p[min].humidade)
				mm[n++] = i;
		return mm;
	}

	// Pergunta 4) função para gravar humidades
	static void gravarPais(Pais[] p, String nome) throws IOException{
		File f = new File(nome);
		PrintWriter pf = new PrintWriter(f);
		pf.println(p.length);
		for (int i=0; i<p.length; i++) {
			pf.printf("%5d %3d %s%n", p[i].dia, p[i].humidade, p[i].nome);
		}
		pf.close();
	}
	// Pergunta 5) função para calcular frequência das humidades
	// humidade entre 10 e 100 - array de freq entre 0 (10) e 90 (100)
	static int[] freqHum(Pais[] p) {
		int[] f = new int[91];
		for (int i=0; i<p.length; i++) {
			if (p[i].humidade >= 10 && p[i].humidade <= 100)
				f[p[i].humidade-10]++;
		}
		return f;
	}
	// Pergunta 6) função para imprimir as frequências > 0
	static void printFreq(int[] f) {
		System.out.printf("Hum. Freq%n");
		for (int i=0; i<f.length; i++) {
			if (f[i]>0)System.out.printf("%4d %4d%n", i+10, f[i]);
		}
	}
	// exame final
	// Pergunta 7) função para verificar se um dia e pais existe. false não existe; true existe
	static boolean diaPaisExiste(Pais[] p,int comp, int dia,String pais) {
		boolean indice = false;
		for (int i=0; i<comp; i++) {
			if (p[i].dia == dia && p[i].nome.indexOf(pais) >= 0) {
				indice = true;
			}
		}
		return indice;
	}
	// Pergunta 8) função para criar array de paises sem dia e pais repetidos
	// devolve array com o numero de elementos não repetidos
	static Pais[] removerRepetidos(Pais [] p) {
		Pais[] r = new Pais[p.length];
		int n=0;
		for (int i=0; i<p.length; i++) {
			if(!diaPaisExiste(r,n,p[i].dia,p[i].nome)) {
				r[n]=p[i];
				n++;
			}
		}
	// devolve array com o comprimento exato
	Pais[] u = new Pais[n];
	System.arraycopy(r,0,u,0,n);
	return u;
	}
	// Pergunta 9) ordena por ordem crescente do dia
	static void bubbleSort(Pais a[]) {
		boolean troca;
		int n=0; //nº de valores ordenados
		do {
			troca=false;
			for(int i = 0 ; i <= a.length - 2 -n; i++) {
				if(a[i].dia > a[i+1].dia) {
				swap(a, i, i+1);
				troca=true;
				}
			}
			n++;
		} while(troca);
	}

	static void swap(Pais a[], int i, int j) {
		Pais tmp = new Pais();
		tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

 }
 class Pais {
	int dia;
	int humidade;
	String nome;
 }
