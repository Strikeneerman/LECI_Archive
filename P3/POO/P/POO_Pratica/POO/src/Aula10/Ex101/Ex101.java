package Aula10.Ex101;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Ex101 {
    public static void main(String[]args){
        
        Map<String, String> conj = new HashMap<>();
        conj.put("Branco","Que tem a cor do Meu Senhor");
        conj.put("Preto", "Que tem a cor das ilhas do equador");
        conj.put("Codo clocon mom", "Meu amor");
        conj.put("Barganhar", "Negociar");
        conj.put("Pureza", "A ressureicao");

        System.out.println(conj.containsKey("Codo clocon mom"));
        System.out.println(conj.containsValue("O mundo"));
        System.out.println(conj);
        System.out.println(conj.remove("Barganhar"));
        System.out.println(conj);
        System.out.println();
        System.out.println("Os termos:");
        Set<Entry<String, String>> val = conj.entrySet(); 
        for(Entry<String, String> aux: val){
            System.out.println(aux.getKey());
        }
        System.out.println();
        System.out.println("Os significados:");
        for(Entry<String, String> aux: val){
            System.out.println(aux.getValue());
        }



    }
}
