public class rapide{
    public static void quicksort(Suite suite, int debut, int fin) {
        if (debut < fin) {
            int indicePivot = partition(suite, debut, fin);
            quicksort(suite, debut, indicePivot-1);
            quicksort(suite, indicePivot+1, fin);
        }
    }
    
    public static int partition (Suite suite, int debut, int fin) {
        int valeurPivot = suite.get(debut);
        int d = debut+1;
        int f = fin;
        while (d < f) {
            while(d < f && suite.get(f) >= valeurPivot) f--;
            while(d < f && suite.get(d) <= valeurPivot) d++;
            suite.permute(f, d);
        }
        if (suite.get(d) > valeurPivot) d--;
        suite.permute(debut, d);
        return d;
    }
}
