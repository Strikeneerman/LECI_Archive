package Aula11.exercicio_aula;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class RandomBooks{

    private String titulo;
    private String autor;
    private int id;
    List<RandomBooks> book = new LinkedList<>();
   

    public RandomBooks (String titulo, String autor, int id){
        this.setRandomBooks();
    }

    public RandomBooks() {
        this.setRandomBooks();
    }

    public void setRandomBooks(){
        String str = "";
        String delimiter = ";";
        List<String> strlo = new ArrayList<>();
        HashMap<Integer,List<String>> bookmap = new HashMap<>();
        try {
            Scanner input = new Scanner(new File("books.csv"));
            while (input.hasNextLine()){
            str = input.nextLine();
            String[] temp= str.split(delimiter);
            titulo = temp[0];
            autor = temp[1];
            strlo.add(new String(titulo));
            strlo.add(new String(autor));
            id = Integer.valueOf(temp[2]);
            bookmap.put(id, strlo);
            }
            input.close();
        } catch (FileNotFoundException e) {
        System.out.println("Ficheiro não existente!");
        }
    }

    public void getRandomBook(Pessoa pessoa) {
        String str="";
        try {
            Scanner input = new Scanner(new File("books.csv"));
            while (input.hasNextLine()) 
            System.out.println(input.nextLine());
            input.close();
        } catch (FileNotFoundException e) {
        System.out.println("Ficheiro não existente!");
        }
    }

    public void listReaders() {
    }     
}
