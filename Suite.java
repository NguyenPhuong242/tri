
import java.util.Random;
import java.util.ArrayList;

public class Suite {
    private ArrayList<Integer> suite;
    private int taille;

    public Suite(int taille){
        Random random = new Random();
        suite = new ArrayList<Integer>();
        for(int i = 0; i < taille; i++){
            suite.add(random.nextInt(20));
        }
        this.taille = taille;
        // suite = new ArrayList<>(taille);
    }

    public int size() {
        return this.taille;
    }

    public int get(int a){
        return suite.get(a);
    }

    public void set(int index, int value){
        suite.set(index, value);
    }

    public Object clone(){
        return new ArrayList<>(suite);
    }

    public String toString(){
        return String.valueOf(suite);
    }

    
    public void permute(int i, int j) {
        int x = suite.get(i);
        suite.set(i, suite.get(j));
        suite.set(j,x);
    }
}
