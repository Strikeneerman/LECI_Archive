package Aula5;
import java.util.Scanner;
import java.util.ArrayList;

public class Ex5 {
    public static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        int choice,nMec;
        String nome,curso,titulo;
        int l=0 ;
        Livro catalogo[] = new Livro[100];
        ArrayList<Utilizador> aluno = new ArrayList<>();

    do{
        do {
            System.out.println("1 - inscrever utilizador");
            System.out.println("2 - remover utilizador");
            System.out.println("3 - imprimir lista de utilizadores");
            System.out.println("4 - registrar um novo livro");
            System.out.println("5 - imprimir lista de livros");
            System.out.println("6 - emprestar");
            System.out.println("7 - devolver");
            System.out.println("8 - sair");
            System.out.print("Input: ");
            choice = sc.nextInt();
            if(choice <1 || choice >8){
                System.out.println("Valor não é válido.");
            }
        } while (choice <1 || choice >8); 
        switch (choice){
            case 1:
                System.out.print("Nome: ");
                nome = sc.nextLine();
                System.out.print("nMec: ");
                nMec = sc.nextInt();
                System.out.print("Curso: ");
                curso = sc.nextLine();
                aluno.add(new Utilizador(nome,nMec,curso)); 
                break;
            case 2:
                //aluno.remove();
                break;
            case 3:
                
                break;
            case 4:
                System.out.print("Titulo: ");
                titulo = sc.nextLine();
                catalogo[l] = new Livro(titulo);    
                break;
            case 5:

                break;
            case 6:

                break;
            case 7:

                break;
            case 8:
                break;
         }

    }while(choice != 8);
    }
}
