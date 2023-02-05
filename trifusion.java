import java.util.LinkedList;

public class trifusion {

	public static LinkedList<Integer> trifusion(LinkedList<Integer> list) {
		int size = list.size();//defini la size de list
		
		if (size <= 1) {  //si il y a seul element dans la liste, pas de trifusion, retourner list
			return list;
		}
		
		LinkedList<Integer> gauche = new LinkedList<Integer>();
		LinkedList<Integer> droite = new LinkedList<Integer>();

		for (int i = 0; i < size/2; i++) {//prendre toute le element dans un interval de 0 a size/2-1
			gauche.add(list.remove());//ajouter dans la liste gauche
			
		}
		for (int i = size/2; i < size; i++) {//prendre toute le element dans un interval de size a la fin
			droite.add(list.remove());//ajouter dans la liste droite
		}
		return fusioner(trifusion(gauche), trifusion(droite)); //compose 2 list

	}

	public static LinkedList<Integer> fusioner(LinkedList<Integer> gauche, LinkedList<Integer> droite) {
		LinkedList<Integer> total = new LinkedList<Integer>();

		while (!gauche.isEmpty() && !droite.isEmpty()) {//verifie la condition des liste  and compare deux premier elements entre deux listes
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
