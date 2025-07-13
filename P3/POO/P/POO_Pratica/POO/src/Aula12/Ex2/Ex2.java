package Aula12.Ex2;
import java.util.Scanner;
import java.io.*;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.HashMap;
//import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Ex2 {
    public static void main(String[]args){

        try(Scanner input = new Scanner(new File("movies.txt"), "UTF-8")) {
            Movie cinema[] = new Movie[100];
            int index = 0;
            Set<Movie> set = new TreeSet<>();
            Map<String, String> map = new HashMap<>();
            //Set<Movie> ordemDecScore = new TreeSet<>(Comparator.comparing(Movie::getScore).reversed());
            //Set<Movie> ordemCresRunTime = new TreeSet<>(Comparator.comparing(Movie::getRunningTime));
             
            Set<Movie> ordemDecScore = new TreeSet<>((Movie s1, Movie s2) -> { 
              if(s1.getScore() > s2.getScore())
                return -1;
              else if(s1.getScore() < s2.getScore())
                return 1;
              else
                return 0; });
            
            Set<Movie> ordemCresRunTime = new TreeSet<>((Movie s1, Movie s2) -> { 
              if(s1.getRunningTime() > s2.getRunningTime())
                return 1;
              else if(s1.getRunningTime() < s2.getRunningTime())
                return -1;
              else 
                 return 0; });

                
            while(input.hasNextLine()){
                String word = input.nextLine();
                String filme[] = word.split("\t");
                if(!filme[0].equals("name") && !filme[1].equals("score") && !filme[2].equals("rating") && !filme[3].equals("genre") && !filme[4].equals("running time")){
                    double score = Double.parseDouble(filme[1]);
                    int runningTime = Integer.parseInt(filme[4]);
                    cinema[index] = new Movie(filme[0], score, filme[2], filme[3], runningTime);
                    index++;
                }
            }
            for(Movie u: cinema){
                if(u != null){
                    set.add(u);
                    ordemDecScore.add(u);
                    ordemCresRunTime.add(u);
                    map.put(u.getGenre(), "Diferente:");
                }
            }

            Iterator<Movie> i = set.iterator();
            System.out.println("Ordenado por nome do Filme:");
            while (i.hasNext()) {
                System.out.println(i.next());
            }

            System.out.println();

            Iterator<Movie> j = ordemDecScore.iterator();
            System.out.println("Ordenado por Ordem decrescente de Score: ");
            while (j.hasNext()) {
                System.out.println(j.next());
            }

            System.out.println();

            Iterator<Movie> k =  ordemCresRunTime.iterator();
            System.out.println("Ordenado por Ordem crescente de Running Time: ");
            while (k.hasNext()) {
                System.out.println(k.next());
            }

            Set<Entry<String, String>> mapset = map.entrySet();
            System.out.println("Genero distindo:");
            for(Entry<String, String> aux : mapset){
                System.out.println(aux.getKey()+ ";");
            }
            File nf = new File("myselection.txt");
            if(!nf.exists())
              nf.createNewFile();
            if(!nf.canWrite())
              System.out.println("O ficheiro não pode ser editado!");
            FileWriter fw = new FileWriter(nf, false);
            PrintWriter pw = new PrintWriter(fw);
           
            for(int x = 0; x < cinema.length; x++){
                if(cinema[x] != null ){
                    if(cinema[x].getScore() > 60 && cinema[x].getGenre().equals("comedy"))
                     pw.println(cinema[x]);
                }
            }
            pw.close(); 

           //Desafio: 
           Map<String, List<Movie>> mapMovie = new HashMap<>();
           for(Movie u: cinema){
              if(u != null){
                List<Movie> list = new ArrayList<>();
                 if(!mapMovie.containsKey(u.getGenre())){  
                    list.add(u);
                    mapMovie.put(u.getGenre(), list);
                 }
                 else{
                    List<Movie> listMovie = mapMovie.get(u.getGenre());
                    listMovie.add(u);
                    mapMovie.put(u.getGenre(), listMovie);
                 }
              }  
           }
           Set<Entry<String, List<Movie>>> mapEnty = mapMovie.entrySet();
           System.out.println("Os Generos e os livros associados ao mesmos:");
           for(Entry<String, List<Movie>> aux: mapEnty){
            System.out.println(aux.getKey() + ": " + aux.getValue());
           }   
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }

    }
    
}
