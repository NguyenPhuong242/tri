public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        
        Suite a = new Suite(300);
        // System.out.println(a.clone().toString());
        // Tribull.tri_bulle(a);
        // trifusion.triFusion(a);
        // rapide.quicksort(a, 0, a.size()-1);
        // tritas.heapSort(a);

        System.out.println(a.toString());

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Temps d'exécution total en millisecondes : " + totalTime);
    }   
}
