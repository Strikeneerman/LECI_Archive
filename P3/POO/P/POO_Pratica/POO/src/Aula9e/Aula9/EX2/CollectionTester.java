package Aula9e.Aula9.EX2;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
//import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class CollectionTester {
    public static void main(String[] args) {
        opArrayList();
        opLinkedList();
        
    }
    private static double[] checkPerformance (Collection<Integer> col, int DIM) {
        double add[] = new double[3]; //Ou criar uma map e adicionar talvez um treeMaps seja melhor.
        double start, stop, delta;
        // Add
        start= System.nanoTime(); // clock snapshot before
        for(int i=0; i < DIM; i++ )
           col.add( i);

        stop= System.nanoTime();  // clock snapshot after
        delta= (stop-start)/1e6; // convert to milliseconds
        add[0] = delta;

        // Search
        start= System.nanoTime(); // clock snapshot before
        for(int i=0; i < DIM; i++ ) {
            int n= (int) (Math.random()*DIM);
            if(!col.contains(n)) 
              System.out.println("Not found???"+n);
        }
        stop= System.nanoTime();  // clock snapshot after
        delta= (stop-start)/1e6; // convert nanoseconds to milliseconds
        add[1] = delta;

        // Remove
        start= System.nanoTime(); // clock snapshot before
        Iterator<Integer> iterator= col.iterator();
        while(iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        stop= System.nanoTime();  // clock snapshot after
        delta= (stop-start)/1e6; // convert nanoseconds to milliseconds
        add[2] = delta;

        return add;
    }
    
    private static void opArrayList(){
        int DIM= 1000;
        double temp[] = new double[3];
        ArrayList<Double> adder= new ArrayList<>();
        ArrayList<Double> search= new ArrayList<>();
        ArrayList<Double> remove= new ArrayList<>();
        
        Collection<Integer> col= new ArrayList<>();
        for(int i = 1; i  < 7; i++){
            if(i == 2)
              DIM = 5000;
            if(i == 6)
              DIM = 100000;
            temp = checkPerformance(col, DIM);
            adder.add(temp[0]);
            search.add(temp[1]);
            remove.add(temp[2]);
            DIM *=2; 
        }
        Map<String, ArrayList> star = new LinkedHashMap<>();
        star.put("add", adder);
        star.put("search", search);
        star.put("remove", remove);
        //System.out.println(star);
        System.out.print("\t\t1000\t5000\t10000\t20000\t40000\t100000\n");
        System.out.println("ArraList");
        Set<Entry<String, ArrayList>> set= star.entrySet();
        for(Entry<String, ArrayList> ele: set){
            System.out.print(ele.getKey() + "\t\t");
            for(int i = 0; i < 6; i++)
                System.out.printf( "%.1f\t", ele.getValue().get(i));
            System.out.print("\n");
        }

    }

    private static void opLinkedList(){
        int DIM= 1000;
        double temp[] = new double[3];
        LinkedList<Double> adder =  new LinkedList<>();
        //List<Double> search = new LinkedList<>();
        LinkedList<Double> search = new LinkedList<>();
        LinkedList<Double> remove = new LinkedList<>();
        
        Collection<Integer> col= new LinkedList<>();

        for(int i = 1; i  < 7; i++){
            if(i == 2)
              DIM = 5000;
            if(i == 6)
              DIM = 100000;
            temp = checkPerformance(col, DIM);
            adder.add(temp[0]);
            search.add(temp[1]);
            remove.add(temp[2]);
            DIM *=2; 
        }
        Map<String, LinkedList> star = new LinkedHashMap<>();
        star.put("add", adder);
        star.put("search", search);
        star.put("remove", remove);
        //System.out.println(star);
        //System.out.print("\t\t1000\t5000\t10000\t20000\t40000\t100000\n");
        System.out.println("LinkedList");
        Set<Entry<String, LinkedList>> set= star.entrySet();
        for(Entry<String, LinkedList> ele: set){
            System.out.print(ele.getKey() + "\t\t");
            for(int i = 0; i < 6; i++)
                System.out.printf( "%.1f\t", ele.getValue().get(i));
            System.out.print("\n");
        }
        
    }
}
