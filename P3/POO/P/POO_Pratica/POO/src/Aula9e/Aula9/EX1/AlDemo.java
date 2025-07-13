package Aula9e.Aula9.EX1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class AlDemo {
    public static void main(String[] args) {
        ArrayList<Integer> c1= new ArrayList<>();
        
        for(int i= 10; i <= 100; i+=10) 
           c1.add(i);
        System.out.println("Size: "+ c1.size());
        
        for(int i= 0; i< c1.size(); i++) 
           System.out.println("Elemento: "+ c1.get(i));
        System.out.println(c1.indexOf(5));
        System.out.println(c1.lastIndexOf(100));
        
        ArrayList<String> c2= new ArrayList<>();
        c2.add("Vento");
        c2.add("Calor");
        c2.add("Frio");
        c2.add("Chuva");
        System.out.println(c2);
        //ArrayList<String> c2b= new ArrayList<>();
         System.out.println(c2.subList(0, 2));
        System.out.println("New: " + c2.contains("Neve"));
        if(!c2.contains("Neve"))
           c2.add("Neve");
        c2.set(2, "Graniso");
        Collections.sort(c2);
        System.out.println(c2);
        c2.remove("Frio"); 
        c2.remove(0);
        System.out.println(c2);
        Set<Pessoa> c3 = new HashSet<>();
        Pessoa p1 = new Pessoa("Adalberto", 123456, new Aula5.Date(13, 05, 2001));
        Pessoa p2 = new Pessoa("Adomizete", 125634, new Aula5.Date(28, 01, 1999));
        Pessoa p3 = new Pessoa("Alda", 341256, new Aula5.Date(26, 02, 2003));
        Pessoa p4 = new Pessoa("Diana", 345612, new Aula5.Date(11, 06, 2005));
        Pessoa p5 = new Pessoa("Aldazira", 132546, new Aula5.Date(01, 10, 2009));
        c3.add(p1);
        c3.add(p2);
        c3.add(p3);
        c3.add(p4);
        c3.add(p5);
        System.out.print("\n");
        c3.add(p1);
        Iterator <Pessoa> i = c3.iterator();
        while(i.hasNext()){
           System.out.println(i.next());
        }
        Set<Date> c4= new TreeSet<>();
         Date d1 = new DateYMD();
         Date d2 = new DateYMD(13,05,2001);
         Date d3 = new DateYMD();
        d3.increment();
        Date d4 = new DateYMD(14,6,2000);
        Date d5 = new DateYMD();
        d5.decrement();
        c4.add(d1);
        c4.add(d2);
        c4.add(d3);
        c4.add(d4);
        c4.add(d5);
        System.out.println(c4);
        /*
        Iterator <Date> j = c4.iterator();
        while(i.hasNext()){
           System.out.println(i.next());
        }
        */
        
        
        
       
    }
}
