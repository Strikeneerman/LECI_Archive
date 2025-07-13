package Aula9;
import Aula6.Pessoa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import Aula5.Date;

public class EX1 {
    public static void main(String[] args) {
        ArrayList<Integer> c1 = new ArrayList<>();
        for (int i = 10; i <= 100; i+=10) 
            c1.add(i);
        System.out.println("Size: " + c1.size());
        for (int i = 0; i < c1.size(); i++) 
            System.out.println("Elemento: " + c1.get(i));

        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Vento");
        c2.add("Calor");
        c2.add("Frio");
        c2.add("Chuva");
        System.out.println(c2);
        Collections.sort(c2);
        System.out.println(c2);
        c2.remove("Frio"); 
        c2.remove(0);
        System.out.println(c2);
        c2.indexOf("Vento");
        c2.indexOf("Neve");
        c2.lastIndexOf("Vento");
        c2.add("Vento");
        c2.lastIndexOf("Vento");
        System.out.println(c2.contains("Vento"));
        System.out.println(c2.contains("Neve"));
        c2.add("Neve");
        System.out.println(c2.contains("Neve"));
        c2.indexOf("Neve");
        c2.set(0, "Trovoada");
        System.out.println(c2);
        Collections.sort(c2);
        System.out.println(c2);
        System.out.println(c2.subList(0, 3));
        Set<Pessoa> c3 = new HashSet<>();
        
        Pessoa p1 = new Pessoa("Joao", 9993999, new Date(13, 6, 2013));
        Pessoa p2 = new Pessoa("Maria", 9993499, new Date(1, 3, 2017));
        Pessoa p3 = new Pessoa("Jose", 9993599, new Date(23, 7, 2003));
        Pessoa p4 = new Pessoa("Joana", 9993699, new Date(30, 1, 2010));
        Pessoa p5 = new Pessoa("Jonh", 9993799, new Date(12, 9, 2012));
        
        c3.add(p1);
        c3.add(p2);
        c3.add(p3);
        c3.add(p4);
        c3.add(p5);

        Iterator<Pessoa> iterator = c3.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
