package Aula10.Ex102;

import java.util.Map;
import java.util.TreeMap;
import java.util.LinkedList;
import java.util.Set;
import java.util.Map.Entry;

public class Ex102 {
    public static void main(String[]args){
        
        Map<String, LinkedList> conj = new TreeMap<>();
        
        LinkedList<String> br =  new LinkedList<>();
        LinkedList<String> pt = new LinkedList<>();
        LinkedList<String> stp = new LinkedList<>();
        LinkedList<String> ag = new LinkedList<>();
        LinkedList<String> cv = new LinkedList<>();
        br.add("Que tem a cor do Meu Senhor");
        br.add("Que tem a cor da neve");
        br.add("Descorado, Palido");
        br.add("Cor de leite");

        pt.add("Que tem a cor das ilhas do equador");
        pt.add("Luto");
        pt.add("Autoridade");
        pt.add("Sofistição");

        stp.add("Meu amor");
        stp.add("Meu coração");
        stp.add("Eu te Amo");
        stp.add("A minha razão de viver");

        ag.add("Negociar");
        ag.add("Ato de trocar");
        ag.add("permuta");
        ag.add("trapacear");

        cv.add("A ressureicao");
        cv.add("Sem maldade nem malícia");
        cv.add("Demonstração de castidade");
        cv.add("inocência");
        
        conj.put("Branco", br);
        conj.put("Preto", pt );
        conj.put("Codo clocon mom", stp );
        conj.put("Barganhar", ag );
        conj.put("Pureza", cv );

        System.out.println(conj.containsKey("Codo clocon mom"));
        System.out.println(conj.containsValue("O mundo"));
        System.out.println(conj);
        System.out.println(conj.remove("Barganhar"));
        System.out.println(conj);
        System.out.println();
        System.out.println("Os termos:");
        Set<Entry<String, LinkedList>> val = conj.entrySet(); 
        for(Entry<String, LinkedList> aux: val){
            System.out.println(aux.getKey());
        }
        System.out.println();
        System.out.println("Os significados:");
        for(Entry<String, LinkedList> aux: val){
            System.out.println(aux.getValue());
        }
        System.out.println("O significado = " + returnSignificado(conj, "Preto"));



    }
    private static String returnSignificado(Map<String, LinkedList> conj, String k){
        String s = "";
        int i =(int) (Math.random() * 4);
        LinkedList<String> br =  new LinkedList<>();
        if(conj.containsKey(k)){
            br = conj.get(k);
            s = br.get(i);
        }
        return s;
    }
    
}
