import java.util.LinkedList;

public class trifusion {

	public static LinkedList<Integer> trifusion(LinkedList<Integer> list) {
		int size = list.size();
		
		if (size <= 1) {
			return list;
		}
		
		LinkedList<Integer> gauche = new LinkedList<Integer>();
		LinkedList<Integer> droite = new LinkedList<Integer>();

		for (int i = 0; i < size/2; i++) {
			gauche.add(list.remove());
			
		}
		for (int i = size/2; i < size; i++) {
			droite.add(list.remove());
		}
		return fusioner(trifusion(gauche), trifusion(droite));

	}

	public static LinkedList<Integer> fusioner(LinkedList<Integer> gauche, LinkedList<Integer> droite) {
		LinkedList<Integer> total = new LinkedList<Integer>();

		while (!gauche.isEmpty() && !droite.isEmpty()) {
			int g1 = gauche.remove();
			int d1 = droite.remove();
			if (d1 < g1) {
				total.add(d1);
				gauche.addFirst(g1);
			} 
			else {
				total.add(g1);
				droite.addFirst(d1);
			}
		}
		while (!gauche.isEmpty()) {
			total.add(gauche.remove());
		}
		while (!droite.isEmpty()) {
			total.add(droite.remove());
		}
		return total;
	}
}
