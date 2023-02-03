public class trifusion{
    public static void triFusion(Suite suite){
		if (suite.size()>0){
			triFusion(suite,0,suite.size()-1);
		}
	}

	private static void triFusion(Suite suite,int debut,int fin){
		if (debut!=fin){
			int milieu=(fin+debut)/2;
			triFusion(suite,debut,milieu);
			triFusion(suite,milieu+1,fin);
			fusion(suite,debut,milieu,fin);
		}
	}

	private static void fusion(Suite suite,int debut1,int fin1,int fin2){
		int debut2=fin1+1;
		Suite table1=new Suite(fin1-debut1+1);
		for(int i=debut1;i<=fin1;i++){
			table1.set(i-debut1, suite.get(i));
		}
		int compteur1=debut1;
		int compteur2=debut2;
		for(int i=debut1;i<=fin2;i++){        
			if (compteur1==debut2){
				break;
			}
			else if (compteur2==(fin2+1)){
				suite.set(i, table1.get(compteur1-debut1));
				compteur1++;
			}
			else if (table1.get(compteur1-debut1)<suite.get(compteur2)){
				suite.set(i, table1.get(compteur1-debut1));
				compteur1++;
			}
			else{
				suite.set(i, suite.get(compteur2));
				compteur2++;
			}
		}
	}
}