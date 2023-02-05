import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        
        Suite a = new Suite(20);
        System.out.println(a.clone().toString());
        // Tribull.tri_bulle(a);
        // trifusion.triFusion(a);
        rapide.rapide(a, 0, a.size()-1);
        // tritas.heapSort(a);

        System.out.println(a.toString());

        // LinkedList<Integer> test = new LinkedList<>();
        // Random random = new Random();
        // for(int i = 0; i < 40; i++){
        //     test.add(random.nextInt(100));
        // }
        // System.out.println(test.toString());
        // System.out.println("length: "+test.size());
        // LinkedList<Integer> sortedList = trifusion.trifusion(test);
        // System.out.println("Sorted list: " + sortedList.toString());

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Temps d'exécution total en millisecondes : " + totalTime);
    }   
}
